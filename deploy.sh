#!/bin/bash

mvn clean package

mv target/testplugin-1.0-SNAPSHOT.jar ~/server/plugins/testplugin.jar
