🏥 Hospital Management System

A full-stack Hospital Management System developed using Java, Spring Boot, MySQL, HTML, CSS, and JavaScript. This application helps manage hospital operations, including patients, doctors, appointments, and billing through a web-based dashboard.

<p align="center">   <b>Manage Hospital Operations Easily and Efficiently</b> </p>

📌 Project Overview

The Hospital Management System is designed to simplify daily hospital management activities through a centralized platform.

It provides a dashboard to monitor hospital activities and REST APIs to manage patient records, doctor information, appointments, and billing details.

✨ Features

📊 Dashboard – View patient, doctor, appointment, and invoice counts.

🧑‍⚕️ Patient Management – Add, view, update, and delete patient records.

👨‍⚕️ Doctor Management – Manage doctor information.

📅 Appointment Management – Book appointments and track appointment status.

💳 Billing Management – Maintain billing records and payment status.

📱 Responsive Interface – Web interface built with HTML, CSS, and JavaScript.

🔗 REST API Integration – Backend APIs developed using Spring Boot.

🗄️ Database Management – Store application data in MySQL.

🛠️ Technology Stack

Technology

Purpose

Java 17

Backend programming

Spring Boot 3.4.5

Backend framework

Spring Data JPA

Database operations

MySQL 8

Database

HTML5

Frontend structure

CSS3

Styling and layout

JavaScript

Frontend functionality

Maven

Dependency management

Git & GitHub

Version control

📂 Project Structure

Hospital-Management-System/
│
├── database/
│   └── hospital.sql
│
├── src/
│   └── main/
│       ├── java/com/hospital/
│       │   ├── HospitalApplication.java
│       │   │
│       │   ├── controller/
│       │   │   ├── AppointmentController.java
│       │   │   ├── BillController.java
│       │   │   ├── DashboardController.java
│       │   │   ├── DoctorController.java
│       │   │   └── PatientController.java
│       │   │
│       │   ├── entity/
│       │   │   ├── Appointment.java
│       │   │   ├── Bill.java
│       │   │   ├── Doctor.java
│       │   │   └── Patient.java
│       │   │
│       │   └── repository/
│       │       ├── AppointmentRepository.java
│       │       ├── BillRepository.java
│       │       ├── DoctorRepository.java
│       │       └── PatientRepository.java
│       │
│       └── resources/
│           ├── application.properties
│           └── static/
│               ├── index.html
│               ├── style.css
│               └── app.js
│
├── .gitignore
├── pom.xml
└── README.md

⚙️ Requirements

Before running this project, install:

Java JDK 17 or higher

Apache Maven 3.8 or higher

MySQL Server 8 or higher

VS Code or IntelliJ IDEA

Git

🚀 Installation & Setup

Step 1: Clone the Repository

git clone https://github.com/Prince841417/Hospital-Management-System.git

Step 2: Open the Project

cd Hospital-Management-System

Step 3: Configure MySQL

Start your MySQL server.

Open:

src/main/resources/application.properties

Configure your local MySQL username and password.

Important: Never upload your actual database password or other secrets to GitHub.

Step 4: Run the Application

Open the terminal in the project directory and execute:

mvn spring-boot:run

Step 5: Open in Browser

Once the application starts successfully, visit:

http://localhost:8080

🎉 Your Hospital Management System is now running!




POST http://localhost:8080/api/patients

Request Body:

{
  "name": "Aarav Sharma",
  "email": "aarav@example.com",
  "phone": "9876543210",
  "age": 28,
  "gender": "Male",
  "address": "Bhopal"
}

🎯 Future Enhancements

User Login and Registration

Spring Security Authentication

Admin and Staff Role Management

Doctor and Patient Search

Appointment Calendar

Online Payment Integration

Report Generation

Cloud Deployment

🔐 Security Notice

This is an educational project and currently does not provide production-grade authentication, authorization, audit logging, or healthcare regulatory compliance.

Do not use real patient information or sensitive medical records.



⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.

Thank you for visiting!
