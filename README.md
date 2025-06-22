# Broken-Link-Checker
A Java program using Selenium to identify broken and valid links on a webpage.
# Broken Link Checker (Java + Selenium)

This Java project uses Selenium WebDriver to identify broken and valid hyperlinks (`<a>` tags) on a webpage.

## Features
- Checks all anchor tags on the OrangeHRM demo page
- Verifies:
  - If link is empty or null
  - If domain is external
  - If response code is >= 400 (broken)

## Prerequisites
- Java JDK
- Maven or local setup
- Chrome browser
- ChromeDriver (compatible version)

## How to Run
1. Install Selenium WebDriver
2. Run `BrokenValidLinks.java`
   
✅ Run Selenium Project in Eclipse (Without Maven)
📌 Step 1: Create Project
Open Eclipse

Go to: File → New → Java Project

Name it: BrokenLinkChecker → Click Finish

📌 Step 2: Create Class
Right-click on src → New → Package → Name: training

Right-click on training → New → Class → Name: BrokenValidLinks

Check public static void main → Click Finish

Paste your Java code inside

📌 Step 3: Download Selenium JARs
Go to: https://www.selenium.dev/downloads

Download Selenium Java ZIP → Extract it

In Eclipse:

Right-click project → Build Path → Configure Build Path → Libraries tab → Add External JARs

Add all .jar files from main folder and libs/ folder

📌 Step 4: Add ChromeDriver
Download from: https://chromedriver.chromium.org/downloads

Place chromedriver.exe inside your project folder

Add this line at the top of your code:

java
Copy
Edit
System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
(Replace the path with where your chromedriver.exe is)

📌 Step 5: Run the Program
Right-click on BrokenValidLinks.java → Run As → Java Application
