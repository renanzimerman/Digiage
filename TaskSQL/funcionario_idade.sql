SELECT 
    YEAR(birth_date) AS ano,
    birth_date,
    gender,
    COUNT(DISTINCT emp_no) AS quantidade
FROM 
    employees_2
GROUP BY 
    YEAR(birth_date),
    birth_date,
    gender;
