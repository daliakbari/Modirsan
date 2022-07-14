# Modirsan Example

### Goal

The purpose of this project is to demonstrate with a simple project how a software delivery pipeline can be assembled using Jenkins.

Some important steps can be seen in this project, such as unit testing, interface testing, static code analysis, and deploying Docker images.

A pipeline can contain more or less steps depending on your application scenario. The important thing is to understand the flow needed to deliver the application with confidence, and to automate this flow.

Use this project as a base for ideas for your own pipeline.

![stages-ci](media/stages-ci.png)

### How to use

Having Docker and Maven installed, execute the commands below:

```
git clone git@github.com/daliakbari/Modirsan.git

cd modirsan

mvn clean package

docker-compose up -d
```

After that some services will be available:

**App Products DSV** - http://localhost:8081

Simple app in DSV stage

**App Products UAT** - http://localhost:8085

Simple app in UAT stage

**App Products PRD** - http://localhost:8090

Simple app in PRD stage

**Docker Registry** - http://localhost:5000

A local Docker Registry to publish images

**Jenkins** - http://localhost:8080

Jenkins to run CI and CD jobs.

![jenkins](media/jenkins.png)

