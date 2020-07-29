# Your Todo List

Designed to use my knowledge acquired in training

## Clone

Clone this repo to your local machine using

```bash
git@github.com:Zesysy/todo-list-spring.git
```

## Prerequisites

- openjdk 11.0.7
- Apache Maven 3.6.3

## Getting Started

 `mvn spring-boot:run`

![Application view](/src/main/resources/static/img/appView.png)

## Built With

- [Spring](https://spring.io/)- The web framework used
- [Thymeleaf](https://www.thymeleaf.org/) - Modern server-side Java template engine for both web and standalone environments
- [Bootstrap](https://getbootstrap.com/) - Used a template for the front end
- [Jpa Hibernate](https://hibernate.org/) - To ensure java data persistance
- [MySql](https://www.mysql.com/fr/) - To database

## Folder Hierarchy

-  `/src/main/java/com/wcs_ftm/followthemap` : 
		- `/config`: Contains the application configuration which calls the elements in application.yml to connect with database
		- `/controller`: One for the API and a TodoController
		- `/model`
		- `/repository`: Extends Jpa Repository
- `/src/main/java/com/wcs_ftm/resources`:
		- `/static`: Contains the CSS of the application and the Boostrap template
		- `/templates`: Contains our Html pages 
		- `application.yml`: Url and other elements of our database


## Standards

Java naming standards have been respected !

## Features

- Create, update, find and delete todos
- Error case management
- Login in loading...

## Author

- [Sylène](https://github.com/Zesysy) - Developer Java & Javascript