WITH all_ids AS (
SELECT requester_id AS id FROM RequestAccepted
UNION ALL
SELECT accepter_id AS id FROM RequestAccepted
),
ranks AS (
SELECT id, COUNT(id) AS num,
RANK() OVER (ORDER BY COUNT(id) DESC) AS rnk
FROM all_ids
GROUP BY id
)

SELECT id, num FROM ranks
where rnk = 1;

/* all_ids: Does an union all and aggregates all the ids. requester_id + accepter_id is a combination key here.
Every occurence of a particular id in any of these columns adds up to the friends list.
The id that occured the most number of times has the most number of friends.
ranks: Orders the occurences in descending order and assigns ranks to them. 
ids that will have rank 1 are the people with most number of friends.

A follow up could be to find all people who have most number of friends.
Using this ranking method covers that as well. 

Testcase for the follow-up question:
{"headers":{"RequestAccepted":["requester_id","accepter_id","accept_date"]},"rows":{"RequestAccepted":[[1,2,"2016/06/03"],[1,3,"2016/06/08"],[2,3,"2016/06/08"],[3,4,"2016/06/09"],[1,4,"2016/06/03"]]}}

ids 1 and 3 are the people with most number of friends.
*/