# 🎬 Filmy-Reviews

## Overview

Filmy-Reviews is a full-stack web application built for movie enthusiasts to explore, share, and evaluate movie reviews. The project demonstrates a clean, modular client–server architecture where the frontend, backend, and database evolve independently.

The application leverages **React** for the user interface, **Java with Spring Boot** for backend services, and **MongoDB** for flexible and scalable data storage.

---

## ✨ Key Features

- **Intuitive User Interface**  
  A responsive and engaging frontend built with React for a smooth user experience.

- **Scalable Backend Architecture**  
  Robust REST APIs powered by Spring Boot to handle high volumes of user interactions.

- **MongoDB Integration**  
  Efficient document-based data storage for movies, users, and reviews.

- **Dynamic Reviews System**  
  Users can add, edit, and rate movie reviews in real time.

- **Cross-Device Compatibility**  
  Fully responsive design optimized for desktop, tablet, and mobile devices.

---

## 🛠 Technology Stack

### **Frontend**
- React
- JavaScript
- HTML5
- CSS3

### **Backend**
- Java
- Spring Boot

### **Database**
- MongoDB (Atlas or Local)

---

## 🚀 Getting Started

### Prerequisites
Before setting up the project, make sure the following are installed on your system:
- **Node.js** (with `npm`)
- **Java 21** (or higher)
- **Maven**
- **MongoDB** (installed locally or configured with a cloud provider such as MongoDB Atlas)

---

## 📦 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/ChinmayR07/Filmy-Reviews.git
cd Filmy-Reviews
```

---

### 2. Frontend Setup
```bash
cd frontend
npm install
npm start
```
This will start the React application on the default React development server at **http://localhost:3000**.

For additional scripts and configurations, refer to the [frontend/README.md](./frontend/README.md).

---

### 3. Backend Setup

#### a) Configure Environment Variables
The backend uses MongoDB for data storage and requires access credentials for connection details. Create a `.env` file in the `backend` directory with the following variables:

```env
MONGO_DB=your-database-name
MONGO_DB_USER=your-username
MONGO_DB_PWD=your-password
MONGO_CLUSTER=cluster0.mongodb.net
```

Alternatively, ensure these environment variables are set in your system.

#### b) Build and Run the Backend
Use the Maven wrapper to build and run the Spring Boot application:
```bash
cd backend
./mvnw spring-boot:run
```
The backend will start on **http://localhost:8080** by default.

#### c) Testing the Backend
- Use [`Postman`](https://www.postman.com/) or `curl` to test the REST APIs exposed by the backend.
- Available API examples and routes will be added in future documentation.

---

### 4. Database Configuration
- Ensure MongoDB is installed locally or set up with a cloud provider (e.g., MongoDB Atlas).
- For local installations, MongoDB typically runs on `mongodb://localhost:27017`.
- Modify `application.properties` (if necessary):
  ```properties
  spring.data.mongodb.database=FilmyReviewsDB
  spring.data.mongodb.uri=mongodb://localhost:27017
  ```

---

## 🏗 Project Architecture

### **Frontend Layer**
- Built with React
- Handles UI rendering and client-side state management
- Communicates with backend services via REST APIs

### **Backend Layer**
- Developed using Spring Boot
- Exposes RESTful APIs for movies, users, and reviews
- Manages business logic and database interactions

### **Database Layer**
- MongoDB for flexible, schema-less data storage

---

## 🤝 Contributing

Contributions are welcome! To contribute, follow these steps:

1. Fork the repository
2. Create a new feature branch
3. Commit your changes
4. Submit a pull request

For major changes, please open an issue first to discuss your proposal. Make sure to update or add relevant tests where applicable.


