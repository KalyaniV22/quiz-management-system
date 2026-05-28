# Quiz Application

A simple and scalable Quiz Application built using **Spring Boot**.
This project serves as the backend foundation for managing quizzes, questions, and quiz-related operations.

---

##  Features

* Create and manage quizzes
* Add and manage questions
* REST API based architecture
* Spring Boot backend implementation
* Easy project setup and execution
* Maven dependency management

---

##  Tech Stack

* **Java**
* **Spring Boot**
* **Maven**

---

##  Project Structure

```bash
quiz-application/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.quiz
│   │   │       └── QuizApplication.java
│   │   └── resources/
│   └── test/
│
│── pom.xml
│── README.md
```

---

##  Getting Started

### Prerequisites

Make sure you have installed:

* Java 17+ (or compatible version)
* Maven
* IDE (IntelliJ IDEA / Eclipse / VS Code)

---

## Installation & Setup

### Clone the Repository

```bash
git clone https://github.com/your-username/quiz-application.git
```

### Navigate to Project Directory

```bash
cd quiz-application
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

Or run the main class:

```bash
QuizApplication.java
```

---

##  Main Application Class

```java
@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

}
```

---

##  API Development

This project is designed as a Spring Boot REST API application and can be extended with:

* Quiz APIs
* Question APIs
* Result calculation
* Database integration
