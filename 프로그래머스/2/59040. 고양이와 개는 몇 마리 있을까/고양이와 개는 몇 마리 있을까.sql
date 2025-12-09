SELECT
    ANIMAL_TYPE,
    COUNT(*) AS COUNT
FROM
    ANIMAL_INS
WHERE
    ANIMAL_TYPE IN ('Cat', 'Dog')
GROUP BY
    ANIMAL_TYPE
ORDER BY
    -- 고양이를 먼저 출력하기 위해 'Cat'이 1, 'Dog'이 2가 되도록 순서 지정
    CASE
        WHEN ANIMAL_TYPE = 'Cat' THEN 1
        WHEN ANIMAL_TYPE = 'Dog' THEN 2
    END;