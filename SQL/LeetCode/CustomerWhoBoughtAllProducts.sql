-- https://leetcode.com/problems/customers-who-bought-all-products/

SELECT customer_id 
FROM Customer
GROUP BY customer_id
HAVING count(distinct(product_key)) = (SELECT count(*) FROM Product);