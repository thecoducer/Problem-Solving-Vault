WITH cte AS
(SELECT *, RANK() 
OVER (PARTITION BY product_id 
      ORDER BY change_date DESC) AS r
FROM products
WHERE change_date <= '2019-08-16')

SELECT product_id, new_price AS price
FROM cte
WHERE r = 1
UNION
SELECT product_id, 10 AS price
FROM products
WHERE product_id NOT IN (SELECT product_id FROM cte);