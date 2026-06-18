# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e
join Department d
on d.id=e.departmentId
where e.salary=(
    select max(e1.salary) from Employee e1
    where e1.departmentId=e.departmentId
);