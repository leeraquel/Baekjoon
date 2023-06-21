-- 코드를 입력하세요
SELECT
hour(datetime) as "hour", 
COUNT(animal_id) as "count"
FROM animal_outs
GROUP BY hour(datetime)
having hour > 8 and hour <20
ORDER BY hour ASC;