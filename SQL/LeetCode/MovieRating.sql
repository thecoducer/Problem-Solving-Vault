(
  SELECT u.name AS results
  FROM MovieRating r LEFT JOIN Users u
  ON (r.user_id = u.user_id)
  GROUP BY r.user_id
  ORDER BY COUNT(*) DESC, u.name
  LIMIT 1
)
UNION ALL
-- When the movie title and username are the same, 
-- using UNION ALL will retain both results.
(
  SELECT m.title AS results
  FROM MovieRating r LEFT JOIN Movies m
  ON (r.movie_id = m.movie_id)
  WHERE r.created_at LIKE '2020-02%'
  GROUP BY r.movie_id
  ORDER BY AVG(r.rating) DESC, m.title
  LIMIT 1
)