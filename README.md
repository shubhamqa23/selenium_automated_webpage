 Test Webpage Automation (Raju Shetty Login Flow)
This project is a basic Selenium WebDriver automation script in Java that tests the login and password recovery functionality of a demo webpage using ChromeDriver.

🔧 Technologies Used
Java

Selenium WebDriver

ChromeDriver

Maven 

🧪 What This Script Does
This automation script performs the following:

Launches Chrome and opens the test login webpage.

Enters an incorrect username and password.

Captures and prints the error message.

Clicks on "Forgot your password?".

Clicks the reset button to generate a temporary password.

Captures and extracts the password from the returned message.

Navigates back to the login page.

Logs in using the correct password.

Verifies the welcome message and checks if the logged-in username matches the expected.

Clicks Logout.

Prints success message if all actions completed without errors.

📁 File Structure
bash
Copy
Edit
.
├── src
│   └── testwebpage
│       └── Test_webpage_rajushetty.java
├── pom.xml (optional, if using Maven)
└── README.md
📷 Sample Output (Console)
bash
Copy
Edit
Incorrect username or password.
Your password is 'rahulshettyacademy'
Hello shubham,
true
Test completed successfully
✅ How to Run
Make sure ChromeDriver is set up and compatible with your Chrome version.

Following is the URL "https://rahulshettyacademy.com/locatorspractice/"

Run the program using your IDE 
