-- 코드를 입력하세요
SELECT i.name, i.datetime
from animal_outs as o
right join animal_ins as i
on o.animal_id = i.animal_id
where o.animal_id is null
order by i.datetime asc
limit 3