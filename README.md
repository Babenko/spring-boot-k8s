# Spring-boot-k8s

Main purpose of this project - deploy spring boot application into kubernetes cluster.

## Build

mvn compile jib:build -Djib.to.auth.username=[docker-hub-identifier] -Djib.to.auth.password=[docker-hub-password]