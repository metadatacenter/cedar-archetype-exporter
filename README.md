CEDAR Archetype Exporter
========================

[![Build Status](https://travis-ci.org/metadatacenter/cedar-archetype-exporter.svg?branch=master)](https://travis-ci.org/metadatacenter/cedar-archetype-exporter)

#### Intructions

This project provides an archetype for a CEDAR exporter. It shows how
the [JSONSchema2POJO library](http://www.jsonschema2pojo.org/) can be used to generate
Java classes that process the content of CEDAR metadata.

These instances can then be transformed into a submission format required by a particular
repoistory.  See, for example, the [CEDAR BioSample Exporter](https://github.com/metadatacenter/biosample-exporter) for an example
of an exporter that generates an XML-based BioSample submission.

This project contains a prototype CEDAR-generated template called ```NCBIBioSampleSubmissionTemplate.json```,
which is located in the ```./src/main/resources/json-schema``` directory, and a CEDAR-generated
templated instance called ```NCBIBioSampleSubmissionInstance1.json```, which is located
in the ```./src/main/resources/json``` directory.

The main class called ```org.metadatacenter.archetype.exporter.CEDARInstanceReader``` reads the JSON
instance using a Java class generated from the JSON Schema description by JSONSchema2POJO.

#### Building and Running

To build this library you must have the following items installed:

+ [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
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

