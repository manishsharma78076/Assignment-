/*3. SQL Query Task
Imagine a table named orders with fields: order_id, user_email, order_date, and amount.

================Query===========================*/

SELECT order_id, user_email, order_date, amount
FROM orders
WHERE user_email LIKE '%@gmail.com'
ORDER BY order_date DESC;

