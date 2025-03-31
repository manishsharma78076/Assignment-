Q1 UI Automation:
 Setup Phase:

1.The test opens a Chrome browser using Selenium's ChromeDriver.
2.The browser window is maximized for better visibility.
3.It navigates to the login page at https://example.com/login.
4. A Login Page object is created. This object contains all the methods needed to interact with the login page (like entering username, password, and clicking the login button).

Test Execution:

1.The test uses the Login Page object to input the username (test_user) and password (Test@123).
2.It simulates clicking the login button.
3.After the login attempt, the script retrieves the title of the current page and checks whether it contains the word "Dashboard". This is a simple way to verify that the login was successful and that the user was redirected to the correct page.

Cleanup Phase:
1.Once the test is completed, the browser is closed to clean up and free resources.

LoginPage Class:

1.This class represents the login page.
2.It uses @FindBy annotations to locate the UI elements (username field, password field, login button) on the page.
3.It has methods (enterUsername, enterPassword, and clickLogin) that allow the test to interact with these elements in a clean and reusable way.

LoginTest Class:

1.This class contains the actual test using TestNG.
2.It sets up the browser, uses the LoginPage methods to perform the login, and then checks if the page title is as expected.
3.After the test, it shuts down the browser to ensure that the environment is reset.

Q2. API Testing --> Postman

Send a Request:
You send a GET request to the URL https://jsonplaceholder.typicode.com/posts/1.

Check the Response Status:
Once the server replies, the script automatically checks that the reply has a status code of 200. A status code of 200 means "everything is okay"

Extract Information:
The script picks out the "title" and "body" values, much like reading the headline and the main message of a letter.

Print to Console:
Finally, the script displays the title and body in Postman's console.


Q3 SQL Query:

Filtering by Email:
We use WHERE user_email LIKE '%@gmail.com' to look through all the orders and pick only those where the email ends with @gmail.com. It’s like saying, "Show me the orders from users who have Gmail addresses."

Sorting by Date:
With ORDER BY order_date DESC, we tell the database to organize the orders so that the newest ones come first. "DESC" means "descending order", so we’re starting
 with the latest order date and working backwards.

