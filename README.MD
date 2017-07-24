# TodoS (Server)
> S means Simple.

Simple TODO application. The project is divided into two parts:
* TodoS Server 
* [TodoS Andoid Client](https://github.com/lapek/TodoS-AndroidClient)

This repository is dedicated to the application Spring server.

## Installing / Getting started

Create new directory for MongoDB database. Run MongoDB:
```sh
mongod --dbpath <path-to-your-direcotry>\data\db
```
Then run a Spring Boot app:
```sh
mvn spring-boot:run
```

## Developing

### Built With
* Spring Boot 1.5.4 with Spring Boot Data MongoDB Starter
* MongoDB 3.4.5

### Setting up Dev

To start developing the project:

```shell
git clone https://github.com/lapek/TodoS-Server.git
cd path-to-project/
mvn clean install
```
