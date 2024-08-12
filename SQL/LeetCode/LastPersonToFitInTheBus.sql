-- https://leetcode.com/problems/last-person-to-fit-in-the-bus/

WITH CTE AS (
    SELECT turn, SUM(weight) OVER (ORDER BY turn) AS total_weight FROM Queue
)

SELECT person_name from Queue
where turn = (SELECT MAX(turn) from CTE where total_weight <= 1000);