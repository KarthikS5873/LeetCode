# Write your MySQL query statement below
select distinct e.email as Email
from Person e
join Person m
on e.email=m.email and m.id!=e.id;