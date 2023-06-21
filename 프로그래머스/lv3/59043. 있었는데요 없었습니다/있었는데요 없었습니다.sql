-- 코드를 입력하세요
select a.ANIMAL_ID , a.NAME
FROM ANIMAL_INS a 
left join ANIMAL_OUTs b 
ON a.ANIMAL_ID = b.ANIMAL_ID
where a.datetime > b.datetime
order by a.datetime asc
