# Spring Boot Restful Web Services Example

- Spring Boot
- JAX-RS (Jersey)
- JPA (Hibernate)
- MySql

### How to build
```sh
$ mvn clean install
```
### Database
```sql
create database test_java_rest_api;
create table user(id MEDIUMINT NOT NULL AUTO_INCREMENT, first_name varchar(255), last_name varchar(255), primary key (id));
```
