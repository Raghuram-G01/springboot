package com.raghu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //* */ purpose of annotation is to enable a host of features, e.g., component scanning, auto-configuration, and property support.
public class HelloApplication {
	//* */ first file to scan and run the application
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
//! Day->2

//! inversion of control (IoC) container:
    //? design pattern that helps to achieve loose coupling between classes.
	//* no need to create objects using new keyword                    objects->beans
	//* framework takes care of the object creation and management.
	//! syntax:   
//? dependency injection (DI) framework -> a design pattern that allows the removal of hard-coded dependencies and makes it possible to change them, whether at runtime or compile time.
	 //* */ way of providing dependencies to a class from outside the class.
	//* */ types: constructor injection, setter injection, field injection.
	//* */ syntax: @Autowired *//
	//* */ container initialized->

//! @RestController // to create RESTful web services using Spring MVC. It combines @Controller and @ResponseBody annotations, eliminating the need to annotate each method with @ResponseBody.
//? @RequestMapping("/hello") // to map web requests onto specific handler classes and/or handler access both 
//? @GetMapping // to handle GET requests and map them to specific handler methods.
//? @Autowired // to enable automatic dependency injection in Spring applications.
//? @SpringBootApplication // purpose of annotation is to enable a host of features, e.g., component scanning, auto-configuration, and property support.
		//?configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.
		//?component scanning-> to scan the package for components, configurations, and services.
//? @RequestParam // to extract query parameters, form parameters, and even parts of multipart files from the request.
//! why auto configuration?
//* */ automatically configures your Spring application based on the dependencies you have added to the project.
//* */ mvc-> model view controller
//* */ model-> data
//* */ view-> user interface
//* */ controller-> handles the user requests, interacts with the model, and selects the view to render 

//! What is ORM?
//* */ Object Relational Mapping
//* */ allows to map java objects to database tables automatically.
//* */ Without ORM, we have to write SQL queries to perform CRUD operations on the database.
//* */ With ORM, we can perform CRUD operations using java objects without writing SQL queries.
//* */ ORM frameworks: Hibernate, JPA, Spring Data JPA
//* */ bridge between object-oriented programming and relational databases

//! What is Entity?
//* define entity
//* create repository Interface -->crud operations->(built in functions)
//* create service &controller ->business logic &api's
// *A class that is mapped to a database table. */ 
//* */ Each instance of the class represents a row in the table.
//* */ 

//? Frontend->controller->service->repository->database

// Day->3