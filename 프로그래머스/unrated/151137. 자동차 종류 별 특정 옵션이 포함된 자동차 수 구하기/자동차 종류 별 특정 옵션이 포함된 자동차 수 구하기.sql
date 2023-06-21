-- 코드를 입력하세요
SELECT car_type, count(*) as CARS
from CAR_RENTAL_COMPANY_CAR
where find_in_set("통풍시트",options) or find_in_set("열선시트",options) or find_in_set("가죽시트",options)
group by car_type
order by car_type asc
