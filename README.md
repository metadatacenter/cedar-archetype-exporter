CEDAR Archetype Exporter
========================

[![Build Status](https://travis-ci.com/metadatacenter/cedar-archetype-exporter.svg?branch=develop)](https://travis-ci.com/metadatacenter/cedar-archetype-exporter)
[![Dependency Status](https://www.versioneye.com/user/projects/57106488fcd19a0039f16fbf/badge.svg?style=flat)](https://www.versioneye.com/user/projects/57106488fcd19a0039f16fbf)

#### Intructions

This project provides an archetype for a CEDAR exporter. It shows how
the [JSONSchema2POJO library](http://www.jsonschema2pojo.org/) can be used to generate
Java classes that process the content of CEDAR metadata instances.

These instances can then be transformed into a submission format required by a particular repository. 

This project contains a prototype CEDAR-generated template called ```NCBIBioSampleSubmissionTemplate.json```,
which is located in the ```./src/main/resources/json-schema``` directory, and a CEDAR-generated
templated instance called ```NCBIBioSampleSubmissionInstance1.json```, which is located
in the ```./src/main/resources/json``` directory.

The main class called ```org.metadatacenter.archetype.exporter.CEDARInstanceReader``` reads the JSON
instance using a Java class generated from the JSON Schema description by JSONSchema2POJO and
then prints out its contents.

#### Building and Running

To build this library you must have the following items installed:

+ [Java 11](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ A tool for checking out a [Git](http://git-scm.com/) repository.
+ Apache's [Maven](http://maven.apache.org/index.html).

Get a copy of the latest code:

    git clone https://github.com/metadatacenter/cedar-archetype-exporter.git

Change into the cedar-archetype-exporter directory:

    cd cedar-archetype-exporter 

Then build it with Maven:

    mvn clean install

To run:

    mvn exec:java

