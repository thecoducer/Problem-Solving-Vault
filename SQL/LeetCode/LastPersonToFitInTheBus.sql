-- https://leetcode.com/problems/last-person-to-fit-in-the-bus/

WITH CTE AS(
    SELECT turn, SUM(weight) OVER(ORDER BY turn) AS total_weight
FROM Queue 
ORDER BY turn
)
SELECT q.person_name 
FROM Queue q
WHERE q.turn = 
(SELECT MAX(turn) FROM CTE WHERE total_weight <= 1000);