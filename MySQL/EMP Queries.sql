//0. show details of all employee
SELECT * FROM EMP;

//1. Display all employee names in ascending order
SELECT ENAME FROM EMP ORDER BY ENAME ASC;

//2. Display all employees(all columns) in department 20 and 30
SELECT * FROM EMP WHERE DEPTNO IN (20,30);
SELECT * FROM EMP WHERE DEPTNO=20 OR DEPTNO=30;

//3. Display all the employees who are managers
SELECT * FROM EMP WHERE JOB ='MANAGER';

//4. Display all the employees whose salary is between 2000 and 5000
SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 5000;

//5. Display all the employees whose commission is null
SELECT * FROM EMP WHERE COMM IS NULL;

//6. Display emp_name,salary,comission,ctc(calculated column)
SELECT ENAME,SAL,COMM,(SAL+COMM)*12 AS CTC FROM EMP;
SELECT ENAME,SAL,COMM,COALESCE((SAL+COMM)*12,SAL,COMM) AS CTC FROM EMP;

//7. Display hire_date, current_date, tenure(calculated col) of the empl
SELECT HIREDATE,CURRENT_TIMESTAMP,DATEDIFF(CURRENT_TIMESTAMP,HIREDATE)/365 AS TENURE FROM EMP;

//8. Display all the employees whose name starts with s
SELECT * FROM EMP WHERE ENAME LIKE 'S%';

//9. Display unique department numbers from the employee table
SELECT DISTINCT DEPTNO FROM EMP;

//10. Display emp_name and job in lower case
SELECT LOWER(ENAME), LOWER(JOB) FROM EMP;