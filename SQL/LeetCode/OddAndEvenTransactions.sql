SELECT transaction_date,
    Sum(CASE WHEN amount % 2 != 0 THEN amount ELSE 0 END) AS odd_sum,
    Sum(CASE WHEN amount % 2 = 0 THEN amount ELSE 0 END) AS even_sum
FROM transactions
GROUP BY transaction_date
ORDER BY transaction_date ASC;