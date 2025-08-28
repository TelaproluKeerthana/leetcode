SELECT distinct(email)
FROM person
WHERE email IN (
    SELECT email
    FROM person
    GROUP BY email
    HAVING COUNT(*) > 1
);

