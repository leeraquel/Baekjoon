-- 코드를 입력하세요
SELECT animal_id, name
, sex_upon_intake
    
from animal_ins

where name = "Lucy" OR name = "Ella" OR name = "Pickle" OR name = "Rogan" OR name = "Sabrina" OR name = "Mitty"

order by animal_id