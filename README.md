# Spring Boot Firebase CRUD Application
A simple and robust CRUD application built with Spring Boot and Firebase as the database. This project demonstrates how to perform Create, Read, Update, and Delete operations using Spring Boot and Firebase Realtime Database.

## Table of contents

- [Features](#features)
- [My process](#my-process)
  - [Built with](#built-with)
  - [What I learned](#what-i-learned)
  - [Continued development](#continued-development)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Configuration](#configuration)
  - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [Author](#author)

  
## Features
 - Create: Add new records to Firebase.
 - Read: Retrieve and display records from Firebase.
 - Update: Modify existing records in Firebase.
 - Delete: Remove records from Firebase.

## My Process
### Built with
 - Spring Boot: A Java-based framework used to create stand-alone, production-grade Spring-based applications.
 - Firebase Realtime Database: A cloud-hosted NoSQL database that lets you store and sync data between your users in real time.

### What I learned
 - How to create a spring boot project using spring initializer
 - How to connect firebase with my spring boot project
 - How to perform simple CRUD operations on the realtime database
 - I got to learn about creating my own api
 - Difference between spring framework and spring boot

### Continued development
 - I want to focus more on api part, as this was just a simple demonstration.

## Getting Started
### Prerequisites
 - Java 8 or higher
 - Maven
 - Firebase Account
 - Setup Firebase
 - Go to the Firebase Console.
 - Create a new project.
 - avigate to the Realtime Database section and create a new database.
 - Obtain your Firebase project credentials (API key, Database URL).
   
### Configuration

1. Clone the repository:
```
git clone https://github.com/NamanG22/firebase-crud-application.git
cd firebase-crud-application
```

2. Update the application.properties file located in src/main/resources with your Firebase credentials:
```
firebase.database.url=YOUR_FIREBASE_DATABASE_URL
firebase.api.key=YOUR_FIREBASE_API_KEY
```

### Running the Application

1. Navigate to the project directory:
```
cd spring-boot-firebase-crud
```

2. Build and run the application using Maven:
```
mvn spring-boot:run
```

3. The application will start on http://localhost:8080.

## API Endpoints
 - Create: POST /create
 - Read: GET /get?{RequestParam}={id}
 - Update: PUT /update
 - Delete: DELETE /delete?{RequestParam}={id}

## Contributing
 - Fork the repository.
 - Create a new branch (git checkout -b feature-branch).
 - Make your changes and commit them (git commit -m 'Add new feature').
 - Push to the branch (git push origin feature-branch).
 - Create a new Pull Request.

## Author

- Linkedin - [@Naman Garg](https://www.linkedin.com/in/naman-garg-90356a197/)
- Github - [@NamanG22](https://github.com/NamanG22/)
