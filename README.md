# 🚆 Train Ticket Reservation System

## 📖 About
This project is about the Train-Ticket-Reservation-System which is used to view Train Schedule, search trains, Seat availability, Train timings. We can also enquire about fare of different trains. We can get information about train between two stations. We can book seats online. This provides a safe and secure seat reservation system.

- View train schedules
- Search for trains
- Check seat availability
- View train timings
- Enquire about fares
- Check trains between stations
- Book seats online

---

## 🌐 Online Train Information and Reservation

### 🔹 Key Features:
- View Trains Schedule
- Search Trains
- Seat Availability
- Train Timings
- Fare Enquiry
- Trains Between Stations
- Booking Seats Online
- Login and Logout Functionality
- Password Management
- Payment Gateway Integration
- Ticket Booking History

---

## 🔐 Access Roles

### 👑 Admin Privileges:
- Login
- Add, Update, and Cancel Trains
- View Train List
- Edit Profile
- Logout

### 👤 User Privileges:
- Register and Login
- View Trains
- Search Trains
- Check Seat Availability
- Fare and Availability Enquiry
- Book Tickets
- View Booking History
- Logout

---

## 💡 Technologies Used
- **Frontend**: HTML, CSS,BOOTSTRAP
- **Backend**: Java (Spring Boot)
- **Database**: SQL PLUS OR MYSQL

---

## 💡 Software and Tools Required
- Git
- Java JDk8+
- Eclipse EE
- Apache Maven
- Tomcat v8.0+
- Oracle SQL PLUS or MYSQL

---

---

##**Dummy Database Initialization**

STEP 1: Open SQL Plus OR SQL Developer

STEP 2: Login and connect to database using administrator username and password

STEP 3 :Execute the below command first to create a new user:


ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;  
CREATE USER RESERVATION IDENTIFIED BY MANAGER;
GRANT DBA TO RESERVATION;
COMMIT;

NOTE: If the above command fails for alter session issues, try to remove first line and then execute it.

STEP 4: Now execute the below sql query in same terminal


CONNECT RESERVATION/MANAGER;
CREATE TABLE "RESERVATION"."CUSTOMER" 
(	
"MAILID" VARCHAR2(40) PRIMARY KEY, 
"PWORD" VARCHAR2(20) NOT NULL, 
"FNAME" VARCHAR2(20) NOT NULL, 
"LNAME" VARCHAR2(20), 
"ADDR" VARCHAR2(100), 
"PHNO" NUMBER(12) NOT NULL
);

CREATE TABLE "RESERVATION"."ADMIN"
(	
"MAILID" VARCHAR2(40) PRIMARY KEY, 
"PWORD" VARCHAR2(20) NOT NULL, 
"FNAME" VARCHAR2(20) NOT NULL, 
"LNAME" VARCHAR2(20), 
"ADDR" VARCHAR2(100), 
"PHNO" NUMBER(12) NOT NULL
);


CREATE TABLE "RESERVATION"."TRAIN" 
(	
"TR_NO" NUMBER(10) PRIMARY KEY, 
"TR_NAME" VARCHAR2(70) NOT NULL, 
"FROM_STN" VARCHAR2(20) NOT NULL, 
"TO_STN" VARCHAR2(20) NOT NULL, 
"SEATS" NUMBER(4) NOT NULL, 
"FARE" NUMBER(6,2) NOT NULL 
);

CREATE TABLE "RESERVATION"."HISTORY" 
(	
"TRANSID" VARCHAR2(36) PRIMARY KEY, 
"MAILID" VARCHAR2(40) REFERENCES "RESERVATION"."CUSTOMER"(MAILID), 
"TR_NO" NUMBER(10),
"DATE" DATE,
"FROM_STN" VARCHAR2(20) NOT NULL, 
"TO_STN" VARCHAR2(20) NOT NULL, 
"SEATS" NUMBER(3) NOT NULL, 
"AMOUNT" NUMBER(8,2) NOT NULL
);

COMMIT;

INSERT INTO RESERVATION.ADMIN VALUES('admin@demo.com','admin','System','Admin','Demo Address 123 colony','9874561230');
INSERT INTO RESERVATION.CUSTOMER VALUES('shashi@demo.com','shashi','Shashi','Raj','Kolkata, West Bengal',954745222);

INSERT INTO RESERVATION.TRAIN VALUES(10001,'JODHPUR EXP','HOWRAH','JODHPUR', 152, 490.50);
INSERT INTO RESERVATION.TRAIN VALUES(10002,'YAMUNA EXP','GAYA','DELHI', 52, 550.50);
INSERT INTO RESERVATION.TRAIN VALUES(10003,'NILANCHAL EXP','GAYA','HOWRAH', 92, 451);
INSERT INTO RESERVATION.TRAIN VALUES(10004,'JAN SATABDI EXP','RANCHI','PATNA', 182, 550);
INSERT INTO RESERVATION.TRAIN VALUES(10005,'GANGE EXP','MUMBAI','KERALA', 12, 945);
INSERT INTO RESERVATION.TRAIN VALUES(10006,'GARIB RATH EXP','PATNA','DELHI', 1, 1450.75);

INSERT INTO RESERVATION.HISTORY VALUES('BBC374-NSDF-4673','shashi@demo.com',10001,TO_DATE('02-FEB-2024'), 'HOWRAH', 'JODHPUR', 2, 981);
INSERT INTO RESERVATION.HISTORY VALUES('BBC375-NSDF-4675','shashi@demo.com',10004,TO_DATE('12-JAN-2024'), 'RANCHI', 'PATNA', 1, 550);
INSERT INTO RESERVATION.HISTORY VALUES('BBC373-NSDF-4674','shashi@demo.com',10006,TO_DATE('22-JULY-2024'), 'PATNA', 'DELHI', 3, 4352.25);

COMMIT;

---

---

## 🚀 How to Run the Project
1. Clone the repository
2. Set up MySQL and create the required database
3. Import the SQL schema
4. Open the project in your IDE (**Eclipse**)
5. Run the Spring Boot application
6. Access the website on `localhost:8080`

---

## 📧 Contact
For any queries, feel free to contact the project developer.

---



