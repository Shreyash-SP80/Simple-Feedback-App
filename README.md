# Feedback App (Servlet + JSP + JDBC + Bootstrap)

The **Feedback App** is a simple web application built using **Java Servlets, JSP, Bootstrap, and JDBC**.  
It allows users to submit feedback, which is stored in a SQL database.  
This project was created as a **learning exercise** to understand the fundamentals of Java EE web development with database integration.  

---

## 🔹 Features
- 📝 Submit feedback through a web form  
- 💾 Store feedback in a **Oracle SQL database** using JDBC  
- 🎨 Responsive UI with **Bootstrap**  
- 🔄 Server-side logic handled by **Servlets**  
- 📄 Views rendered with **JSP**  
- 📦 Structured as a **Maven Project** for easy dependency management  

---

## 🔹 Tech Stack
- **Frontend:** JSP, Bootstrap (CSS)  
- **Backend:** Java Servlet  
- **Database:** MySQL (via JDBC)  
- **Server:** Apache Tomcat  
- **Build Tool:** Maven  
- **IDE:** Eclipse  

---

## 🔹 Learning Objectives
This project was developed to:  
- Understand the flow between **JSP → Servlet → JDBC → Database**  
- Learn how to use **Maven** for dependency management  
- Gain experience in integrating **Bootstrap** with JSP for UI styling  
- Practice database operations using **JDBC**  
- Use **Git & GitHub** for version control  

---

## 🔹 Project Structure
```bash
feedback_app/
├── src/main/java/feedback_app/ # Servlets
│ └── FeedbackServlet.java
├── src/main/webapp/ # JSP files
│ ├── index.jsp
│ ├── feedback.jsp
│ ├── header.jsp
│ └── WEB-INF/web.xml
├── pom.xml # Maven dependencies
└── .gitignore
```  


## 🔹 Setup Instructions

### 1️⃣ Clone Repository
```bash
git clone https://github.com/YourUsername/Simple-Feedback-App.git
cd Simple-Feedback-App
```

### 2️⃣ Import into Eclipse
- Open Eclipse IDE
- File → Import → Existing Maven Project
- Select the project folder

### 3️⃣ Configure Database
- Create a MySQL database, e.g. feedback_db
- Create a table:
```bash
CREATE TABLE feedback (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
- Update DB credentials in FeedbackServlet.java:
```bash
String jdbcURL = "jdbc:mysql://localhost:3306/feedback_db";
String dbUser = "root";
String dbPassword = "your_password";
```

### 4️⃣ Run on Tomcat
- Add project to Apache Tomcat Server in Eclipse
- Run as → Run on Server
- Access the app at:
👉 http://localhost:8080/feedback_app/  (specify proper port)

## 🔹 Maven Dependency for MySQL Connector
- Add this to your pom.xml to connect with MySQL:
```bash
  <dependency>
		    <groupId>com.oracle.database.jdbc</groupId>
		    <artifactId>ojdbc11</artifactId>
		    <version>21.9.0.0</version>
	 </dependency>
```
