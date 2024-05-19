SELECT 
    birth_date,
    gender,
    COUNT(DISTINCT emp_no) AS quantidade
FROM 
    employees_2
GROUP BY 
    birth_date,
    gender
ORDER BY 
    birth_date, 
    gender;
