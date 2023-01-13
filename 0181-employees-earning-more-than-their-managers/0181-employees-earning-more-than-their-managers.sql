# Write your MySQL query statement below
select e.name as employee
from employee e , employee m 
where e.managerid = m.id and m.salary < e.salary;
