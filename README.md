# Spring Forward Starter

### Get started
- create a bitbucket account if you don't have one
- clone project
- in IDE or on command line run mvn clean install in directory of project

### Install Spring Boot CLI
https://docs.spring.io/spring-boot/docs/2.1.4.RELEASE/reference/htmlsingle/#getting-started-installing-the-cli

### First install
install the project with maven

### Run application
mvn spring-boot:run


### Build runnable JAR file
mvn package

### Build docker image file
mvn package docker:build

#### Run in Docker
docker run -p 8085:8085 -t elstarit/spring.forward.starter

#### Stop Docker container
docker ps

#### Will give you a container id and run

docker stop <containerid>

### Run profiles
```
mvn spring-boot:run -Pprod
```
the Spring boot 2.0 way
```
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

## Push to CloudFoundry
For Cloud Foundry you need the cloud Foundry CLI, https://docs.cloudfoundry.org/cf-cli/install-go-cli.html

### Push to IBM Cloud
```
cf login --sso -a https://api.ng.bluemix.net (SSO login, will be asked for a 1 time password)
cf login -u userName -o orgName -s spaceName
cf app push spring-forward-starter
```

### Pivotal
```
cf login --sso -a api.run.pivotal.io (SSO login, will be asked for a 1 time password)
cf login -u userName -o orgName -s spaceName
cf push spring-forward-starter -f manifest.yml
```

## Swagger
http://localhost:8085/spring-starter/swagger-ui.html

## Demo page
http://localhost:8085/spring-starter/page/demo
