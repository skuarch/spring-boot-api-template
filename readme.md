# spring-boot-api-template

This template is design to be use inside of az network (.net), this template contains findBug, PMD and checkstyle, the security is over basic http and the health check is **/health**.
**Only use for restful api**.

# How to use this template

 1. clone repository change name of the folder, example:
    **spring-boot-api-template** to **my-awesome-app**  

 2. configure logging.file on each application-*.properties example
    **logging.file=/tmp/my-awesome-app/log/api.log** 

 3. change artifactId, name and finalName on **pom.xml**, example 
    < artifactId> **my-awesome-app** </ artifactId> 
    < name>**my-awesome-app**< /name>
    < finalName>**my-awesome-app**< /finalName>

 4.  change the version that you want to use:
 < parent>
        < groupId>org.springframework.boot< /groupId>
        < artifactId>spring-boot-starter-parent< /artifactId>
        < version>**yourVersion**< /version>
    < /parent>
5. delete .git folder and include a valid one.

# Exposed ports:
port: 8090
context: /api
url: http://localhost:8090/api

# User and Password 

user: gdldev
password: passw0rd


## Note:
This template should be use only for domains inside of az net (.net) applications

# Swagger

http://localhost:8090/api/swagger-ui.html
http://localhost:8090/api/v2/api-docs

# Running server

**mvn spring-boot:run**

## Environments

 * local
 * dev
 * test
 * preprod
 * prod
 
These are the values for **SPRINGBOOT_PROFILE** var

### Run local environment:

* First set the environment with the value that you wish
> **Tip:** You can set the var SPRINGBOOT_PROFILE with this command 
> **export SPRINGBOOT_PROFILE=local** in the **console/terminal** 
 
* Next type in the root folder the command `mvn clean spring-boot:run`

Another way to run is to type the command `./bash-scripts/start.sh` inside of the root folder.

### Requirements:

* maven
* java
