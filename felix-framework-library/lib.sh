#!/bin/bash
rm -rf felix-cache

cp ../NetBeansProjects/mvn-osgi-lib-2016/model/target/model-1.0-SNAPSHOT.jar modules

java -jar bin/felix.jar
