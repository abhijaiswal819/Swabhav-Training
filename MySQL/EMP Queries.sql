#0. show details of all employee
SELECT * FROM EMP;

#1. Display all employee names in ascending order
SELECT ENAME FROM EMP ORDER BY ENAME ASC;

#2. Display all employees(all columns) in department 20 and 30
SELECT * FROM EMP WHERE DEPTNO IN (20,30);
SELECT * FROM EMP WHERE DEPTNO=20 OR DEPTNO=30;

#3. Display all the employees who are managers
SELECT * FROM EMP WHERE JOB ='MANAGER';

#4. Display all the employees whose salary is between 2000 and 5000
SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 5000;

#5. Display all the employees whose commission is null
SELECT * FROM EMP WHERE COMM IS NULL;

#6. Display emp_name,salary,comission,ctc(calculated column)
SELECT ENAME,SAL,COMM,(SAL+COMM)*12 AS CTC FROM EMP;
SELECT ENAME,SAL,COMM,COALESCE((SAL+COMM)*12,SAL,COMM) AS CTC FROM EMP;

#7. Display hire_date, current_date, tenure(calculated col) of the empl
SELECT HIREDATE,CURRENT_TIMESTAMP,DATEDIFF(CURRENT_TIMESTAMP,HIREDATE)/365 AS TENURE FROM EMP;

#8. Display all the employees whose name starts with s
SELECT * FROM EMP WHERE ENAME LIKE 'S%';

#9. Display unique department numbers from the employee table
SELECT DISTINCT DEPTNO FROM EMP;

#10. Display emp_name and job in lower case
SELECT LOWER(ENAME), LOWER(JOB) FROM EMP;

#11. Select top 3 salary earning employee
SELECT * FROM EMP ORDER BY SAL DESC LIMIT 3;

#12. Select clerks and Managers in department 10
SELECT * FROM EMP WHERE DEPTNO = 10 AND JOB IN ('CLERK','MANAGER');

#13. Display all clerks in asscending order of the department number 
SELECT * FROM EMP WHERE JOB = 'CLERK' ORDER BY DEPTNO ASC;

#16. Display All employees in the same dept of 'SCOTT' 
SELECT * FROM EMP WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME = 'SCOTT') AND ENAME <> 'SCOTT';
SELECT E1.* FROM EMP E1, EMP E2 WHERE E1.DEPTNO = E2.DEPTNO AND E2.ENAME = 'SCOTT' AND E1.ENAME <> 'SCOTT';

#17. Employees having same designation of SMITH
SELECT * FROM EMP WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME = 'SMITH') AND ENAME <> 'SMITH';

#18. Employee who are reproting under KING
SELECT * FROM EMP WHERE MGR = (SELECT EMPNO FROM EMP WHERE ENAME = 'KING');

#19. Employees who have same salary of BLAKE
SELECT * FROM EMP WHERE SAL = (SELECT SAL FROM EMP WHERE ENAME = 'BLAKE') AND ENAME <> 'BLAKE';

#20. Display departmentwise number of employees
SELECT DEPTNO, COUNT(*) FROM EMP GROUP BY DEPTNO;

#21. Display jobwise number of employees
SELECT JOB, COUNT(*) FROM EMP GROUP BY JOB;

#22. Display deptwise jobwise number of employees
SELECT DEPTNO, JOB, COUNT(*) FROM EMP GROUP BY DEPTNO, JOB order by DEPTNO ASC;

#23. Display deptwise  employees greater than  3 
SELECT DEPTNO, COUNT(*) FROM EMP GROUP BY DEPTNO HAVING COUNT(*) >3;

#24. Display designation wise employees count greater than 3 
SELECT JOB, COUNT(*) FROM EMP GROUP BY JOB HAVING COUNT(*) >3;

#25. Display Employee name,deptname and location
SELECT E.ENAME, D.DNAME, D.LOC FROM EMP E JOIN DEPT D ON E.DEPTNO = D.DEPTNO;