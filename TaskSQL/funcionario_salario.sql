SELECT 
    e.gender,
    AVG(s.salary) AS media_salario,
    MIN(s.salary) AS salario_min,
    MAX(s.salary) AS salario_max
FROM 
    employees_2 e
JOIN 
    salaries s
ON 
    e.emp_no = s.emp_no
GROUP BY 
    e.gender;
