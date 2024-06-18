-- https://leetcode.com/problems/monthly-transactions-i/

SELECT
  SUBSTR(trans_date, 1, 7) as month, 
  country, 
  count(id) as trans_count, 
  SUM(
    IF(state = 'approved', 1, 0)
  ) as approved_count, 
  SUM(amount) as trans_total_amount,
  SUM(
    IF(state = 'approved', amount, 0)
  ) as approved_total_amount 
FROM 
  Transactions 
GROUP BY 
  month, 
  country;
