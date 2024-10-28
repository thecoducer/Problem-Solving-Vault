SELECT score, 
DENSE_RANK() OVER (ORDER BY score DESC) AS 'rank'
FROM scores;

-- RANK() assigns the same rank to rows with equal values (ties) 
-- but leaves gaps in the ranking sequence for the next rank.
--
-- DENSE_RANK() also assigns the same rank to rows with equal values (ties), 
-- but it does not leave gaps in the ranking sequence.