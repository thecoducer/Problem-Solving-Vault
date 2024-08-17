-- We give ranks to product_id partitions ordered by change_date in descending order.
-- We have a filter for change_date. It should be less than or equal to '2019-08-16'.
WITH cte AS
(SELECT *, RANK() 
OVER (PARTITION BY product_id 
      ORDER BY change_date DESC) AS r
FROM products
WHERE change_date <= '2019-08-16')

-- The first SELECT gathers 1st rank rows from the cte.
-- They are the latest prices.
SELECT product_id, new_price AS price
FROM cte
WHERE r = 1
UNION
-- Below handles the case when we don't have any record for changed price before '2019-08-16'
SELECT product_id, 10 AS price
FROM products
WHERE product_id NOT IN (SELECT product_id FROM cte);