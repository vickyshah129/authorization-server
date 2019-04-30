# authorization-server
authorization server including spring, spring security, oauth2, jwt, jdbc token store

Steps to setup
===========

1. check **data.sql** in resources folder and run that script in your database
 - change below properties according to your database in **application.properties** file
   - spring.datasource.url=
   - spring.datasource.username=
   - spring.datasource.password=
   - **NOTE**: Project is configured for MySQL. You can add dependecy in **pom.xml** according to your DB
2. Start your project and make sure there is no wrong configuration resisting a clean startup
3. Create a REST call in postman with parameters as below
 - **URL** = http://localhost:8080/oauth/token
 - grant_type:password
 - username:john.doe
 - password:jwtpass
 - client_id:testjwtclientid
- client_secret:XY7kmzoNzl100
