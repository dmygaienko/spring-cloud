http://www.baeldung.com/spring-cloud-netflix-eureka

################

Merged from tutorials

http://www.baeldung.com/spring-cloud-securing-services
https://github.com/eugenp/tutorials/blob/master/spring-cloud/spring-cloud-bootstrap

https://piotrminkowski.wordpress.com/2017/02/22/microservices-security-with-oauth2/
https://github.com/piomin/sample-spring-oauth2-microservices

################

http://localhost:8761/                      spring eureka
http://localhost:8080/get-greeting          feign client page
http://localhost:8765/api/client/greeting   via api gateway (zuul)


# theory

https://cloud.spring.io/spring-cloud-netflix/single/spring-cloud-netflix.html
http://cloud.spring.io/spring-cloud-security/single/spring-cloud-security.html


oauth steps:
1. login in
2. provide auth id with redirect http://localhost:9999/uaa/oauth/authorize?response_type=token&client_id=11&redirect_uri=http://example.com&scope=openid&state=48532
