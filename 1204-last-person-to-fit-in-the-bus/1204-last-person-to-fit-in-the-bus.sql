# Write your MySQL query statement below
select q.person_name
from (
    select person_name,
    sum(weight) over (order by turn) as tw
    from Queue
) q
where tw<=1000
order by tw desc
limit 1;
