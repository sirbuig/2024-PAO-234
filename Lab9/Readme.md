# Instructions for lab 9

## Database setup using Docker

First, download the latest MySQL image from Docker Hub:

`docker pull mysql`

This will download the image on your local machine. 
With this image, you will need to create a container, in which your actual database will be run.
You can set here the root user, password of the database, or you can change the port to which you will connect

`docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:latest`

Connect to the database, with the root credentials, in an SQL editor:
 - username: *root*
 - password: *the one you set in run command*
 - port: *3306* (if not changed when creating the container)
 - host: *localhost*

Verify connection: 
`select now() from dual;`

Create a new database as root user:
`create database lab9`

Create a new user, for which we will give rights only on the working database:
`create user User identified by 'MyRandomPassword';
grant all privileges on lab9.* to User;`

## Using stored procedure in database from Java app

Procedure code, stored in database: 

`DELIMITER //
CREATE PROCEDURE  insertPerson(OUT id int, IN name varchar(40), IN age double)
BEGIN
INSERT INTO person(name, age)
VALUES (name, age);
SET id = LAST_INSERT_ID();
END //
DELIMITER ;`

