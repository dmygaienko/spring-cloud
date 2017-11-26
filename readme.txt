http://www.baeldung.com/spring-cloud-netflix-eureka

################

Merged from tutorials

http://www.baeldung.com/spring-cloud-securing-services
https://github.com/eugenp/tutorials/blob/master/spring-cloud/spring-cloud-bootstrap

https://github.com/eugenp/tutorials/blob/master/spring-security-sso

https://piotrminkowski.wordpress.com/2017/02/22/microservices-security-with-oauth2/
https://github.com/piomin/sample-spring-oauth2-microservices

https://www.youtube.com/watch?v=5q8B6lYhFvE&t=3084s
https://github.com/joshlong/cloud-native-workshop/tree/master/code-java

#theory to check
https://github.com/codependent/spring-boot-oauth2  client_credentials + authorization_code
https://github.com/dynamind/spring-boot-security-oauth2-minimal
http://www.swisspush.org/security/2016/10/17/oauth2-in-depth-introduction-for-enterprises
https://github.com/Baeldung/spring-security-oauth/tree/master/spring-security-oauth-server
https://spring.io/guides/topicals/spring-security-architecture/
https://github.com/spring-guides/tut-spring-security-and-angular-js/blob/master/oauth2/authserver/

################

http://localhost:8761/                      spring eureka
http://localhost:8080/get-greeting          feign client page
http://localhost:8765/api/client/greeting   via api gateway (zuul)

http://localhost:9999/uaa/user
    Authorization: Bearer 17740807-68c6-4af5-829d-9c88862efc6c


# theory

https://cloud.spring.io/spring-cloud-netflix/single/spring-cloud-netflix.html
http://cloud.spring.io/spring-cloud-security/single/spring-cloud-security.html
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-security-oauth2
https://projects.spring.io/spring-security-oauth/docs/oauth2.html
https://github.com/spring-cloud-samples

oauth steps:
1. login in
2. provide auth id with redirect http://localhost:9999/uaa/oauth/authorize?response_type=token&client_id=acme&client-secret=secret&redirect_uri=http://example.com&scope=openid&state=48532

http://localhost:9999/uaa/oauth/authorize?response_type=token&client_id=acme1&client-secret=secret1&redirect_uri=http://example.com&scope=openid&state=48532

scope & state should be repeated between calling endpoints

authorization_code:
1. http://localhost:9999/uaa/oauth/authorize?response_type=code&client_id=acme1&client-secret=secret1&redirect_uri=http://example.com
2. authorization_code_part2


filter order:
WebSecurityConfigurerAdapter 0
@EnableResourceServer 3


# kafka
http://www.baeldung.com/spring-cloud-data-flow-stream-processing