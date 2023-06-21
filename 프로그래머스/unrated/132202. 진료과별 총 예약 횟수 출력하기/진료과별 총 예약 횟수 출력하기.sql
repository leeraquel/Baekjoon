-- 코드를 입력하세요
SELECT MCDP_CD as 진료과코드, count(*) as "5월예약건수"
from appointment
where date_format(apnt_ymd, "%Y-%m") = "2022-05"
group by mcdp_Cd
order by 2, 1