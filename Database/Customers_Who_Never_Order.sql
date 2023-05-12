# Write your MySQL query statement below
SELECT Customers.name as Customers
FROM Orders
RIGHT JOIN Customers ON Orders.customerId = Customers.id
WHERE Orders.customerId IS NULL;