<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function-Contains</title>
</head>
<body>
	<h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:contains(name,'JSTL')}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:startsWith(name,'This')}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:containsIgnoreCase(name,'jstl')}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:endsWith(name,'tag')}
      </h1>
      <h1>
         <c:set var="name" value="<abc>This is JSTL tag</abc>"/>
         Without escapeXml : ${name} <br>
         With escapeXml : ${fn:escapeXml(name)}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:indexOf(name,"is")}
      </h1>
      <h1>
         <c:set var="str" value="This is JSTL tag"/>
         Original string : ${str} <br>
         <c:set var="str1" value="${fn:split(str,' ')}"/>
         <c:set var="str2" value="${fn:join(str1,'-')}"/>
         String after join : ${str2}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         Length : ${fn:length(name)}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:replace(name,"s","$")}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:substring(name,8,12)}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:substringAfter(name,"is")}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:substringBefore(name,"is")}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:toLowerCase(name)}
      </h1>
      <h1>
         <c:set var="name" value="This is JSTL tag"/>
         ${fn:toUpperCase(name)}
      </h1>
      <h1>
         <c:set var="name" value="   This is JSTL tag   "/>
         !${name}! <br>
         !${fn:trim(name)}!
      </h1>
</body>
</html>