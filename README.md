# Signup Page Project

Welcome to the Signup Page Project! This web application is designed to provide a user registration and login system using a combination of HTML, CSS, JavaScript, Java, JSP, Servlets, JDBC, and MySQL.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Database Setup](#database-setup)
  - [Configure Database Connection](#configure-database-connection)
  - [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Signup Page Project is a web application that allows users to register and create an account using the registration page. Once registered, users can log in using their credentials to access the home page. The project demonstrates a simple user authentication system and how it integrates various technologies to achieve the desired functionality.

## Features

- User registration with a unique username and password.
- Secure password storage using MySQL.
- User login with authentication and session management.
- Home page accessible only after successful login.
- Integration of HTML, CSS, JavaScript, Java, JSP, Servlets, JDBC, and MySQL.

## Technologies Used

- HTML
- CSS
- JavaScript
- Java
- JSP (JavaServer Pages)
- Servlets
- JDBC (Java Database Connectivity)
- MySQL (Database)

## Getting Started

Follow the steps below to set up and run the Signup Page Project using Eclipse IDE.

### Prerequisites

- Eclipse IDE: Make sure you have Eclipse IDE installed on your machine.

- Java Development Kit (JDK): Ensure you have JDK installed. The project was developed using JDK 8 or higher.

- MySQL: Install and set up MySQL server on your local machine.

### Clone the Repository

1. Clone this GitHub repository to your local machine using the following command or any Git client you prefer: git clone https://github.com/Oooye-raju/singup.git


### Database Setup

1. Create a new MySQL database for the project.

2. Import the database schema and sample data by executing the SQL scripts located in the `database` directory of the project.

### Configure Database Connection

1. Open the Eclipse IDE.

2. Import the project into Eclipse: Click on `File -> Import -> Existing Projects into Workspace`, and select the cloned project directory.

3. Locate the `RegistrationServlet.java` file in the project under the `src` folder.

4. Modify the `RegistrationServlet.java` file to update the database connection details with your MySQL credentials.

### Deployment

1. Right-click on the project in Eclipse's Project Explorer.

2. Select `Run As -> Run on Server` and choose the appropriate server (e.g., Apache Tomcat).

3. Access the Signup Page application in your web browser using the server's URL.

## Contributing

Contributions are welcome! If you find any issues or have ideas to enhance the project, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this code for personal or commercial projects.

