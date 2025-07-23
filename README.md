# ☁️ Cloud Vendor REST API

A Java Spring Boot REST API application that performs full CRUD operations on cloud vendor data. Built to get hands-on experience with RESTful services and tested using Postman.

---

## 🚀 Tech Stack

- Java 24
- Spring Boot
- Spring Web
- Maven
- Postman

Spring Intializer
---

## 📌 Features

- `GET /cloudvendor/{vendorId}` – Get a cloud vendor by ID  
- `POST /cloudvendor` – Add a new cloud vendor  
- `PUT /cloudvendor` – Update an existing cloud vendor  
- `DELETE /cloudvendor/{vendorId}` – Delete a cloud vendor  

---

## 📮 Sample JSON Payload

{
  "vendorId": "c1",
  
  "vendorName": "Vendor One",
  
  "vendorAddress": "123 Main St, City",
  
  "vendorPhoneNumber": "9876543210"
}

## 🧪 Postman Test URLs

Method	Endpoint	Description

GET	/cloudvendor/c1	Get vendor by ID

POST	/cloudvendor	Add a new vendor

PUT	/cloudvendor	Update an existing one

DELETE	/cloudvendor/c1	Delete vendor by ID

