Spring Boot JWT Authentication Example
== 

This is an example Spring Boot project which shows how you can secure your (RESTful) APIs with Spring Security and JWT Tokens. The project doesn't use OAuth 
or other similar authentication protocols. The JWT Tokens follow the "Bearer" schema.  

The Documentation is coming soon. 

This project is based on [https://github.com/brahalla/Cerberus](https://github.com/brahalla/Cerberus) and 
[https://github.com/szerhusenBC/jwt-spring-security-demo](https://github.com/szerhusenBC/jwt-spring-security-demo).

It combines things and reuses code from both of these projects while also adds some additional features like a basic sign-up endpoint. 
In contrast to these two example projects, this one uses the built-in MacProvider secret key generator, which comes with the "io.jsonwebtoken" library, 
for the signing key. As a result of that, the generated JWT Tokens are more secure and also have a valid JWT Signature.  

## Requirements: 
1. Java SDK 1.8
2. Maven