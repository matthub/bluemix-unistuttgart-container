# Overview

This microservice is one part of a solution to demonstrate how to
integrate CloudFoundry applications and (Docker) containers. It contains
a DropWizard application which has a REST service returning the current
server time.

## Setup and run

Gradle is used as build tool, do a simple

    gradle run
    
to start the DropWizard application locally, and then execute

    gradle container

to create an image, the resulting Dockerfile is in the build/ folder.
To push it to Bluemix following commands were used

    docker tag {registry_name}/dropwizard-sample:0.1 registry.eu-gb.bluemix.net/{registry_name}/unistuttgart-sample:0.1
    docker push registry.eu-gb.bluemix.net/{registry_name}/unistuttgart-sample:0.1
    cf ic run --name container-unistuttgart-sample -p 8080:8080 -m 64 -d registry.eu-gb.bluemix.net/{registry_name}/unistuttgart-sample:0.1
    cf ic ip bind {public_ip} container-unistuttgart-sample

The REST endpoint to retrieve the result of the microservice is available
at :8080/microservice

Optional: if you want to import the project into Eclipse run 

    gradle eclipse
