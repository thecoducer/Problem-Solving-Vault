WITH cte AS (
    SELECT managerId FROM Employee
    GROUP BY managerid
    HAVING COUNT(id) >= 5
)

SELECT NAME FROM Employee
WHERE id IN (SELECT managerId FROM cte);