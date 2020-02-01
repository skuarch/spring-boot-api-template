#!/bin/bash

export SPRINGBOOT_PROFILE=local
rm -rf target/
mvn clean install
mvn spring-boot:run -Drun.profiles=local
