SELECT 
	gender, 
	COUNT(*) as quantidade
FROM 
	employees_2
GROUP BY
	gender;