SELECT 
    e.gender,
    AVG(s.salary) AS salario_total,
    MIN(s.salary) AS media_min,
    MAX(s.salary) AS media_max
FROM 
    employees e
JOIN 
    salaries s
ON 
    e.emp_no = s.emp_no
GROUP BY 
    e.gender;