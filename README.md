# Spring Boot CRUD Application 

![Spring Boot Project Arhitecture](https://user-images.githubusercontent.com/49694359/146692210-bbed65a8-44c4-4769-927c-2ec707b41542.JPG)

## Steps:
   1. Create Spring Boot Project        
   2. Create Packaging Structure:
       * controller
       * service
       * repository
       * model
       * exception
   3. Configure MySQL Database:
        a. Repository / DAO connect to database
            * JDBC URL
            * Username
            * Password
   4. Create JPA Entity
   5. Create Spring Data Repository
   7. Create Custome Exception
   9. Create REST API Operations
   
## New Knowledge
   **Hibernet Dialect** is a language which is used by the database for communication.
        -**org.hibernate.dialect** is the package where the dialect is available in Java class. It helps in mapping the application in Java with the Database.
  
### Annotation:
  
   1. **@Entity** annotation specifies that the class is an entity.
   2. **@Table** annotation specifies the table in the Databe with which this entity is mapped.
   3. **@GeneratedValue** annotation specifies the generation strategies for the values of primary keys. 
   4. **@RestController** is a convenient annotation that combines **@Controllor** and **@ResponseBody**, which eliminates the need to annotate every request handling method of 
 the controller class with the **@ResponseBody annotation**.
   5. **@RequestBody** annotation allows us to retrieve the request's body and automatically convert it to Java Object.
        
  **Spring Boot framework** provides us repository which is responsible to perform various operations on the object.
 
  **Controller Layer** depends on **Service Layer**
