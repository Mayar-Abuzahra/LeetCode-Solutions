# Write your MySQL query statement below
SELECT DISTINCT p.email AS Email
FROM Person p
JOIN Person m
ON p.email = m.email
WHERE p.id <> m.id;