# Quartz Hipster Entities
----------------------------------------------------

#### Project health
[![Build Status](https://travis-ci.org/tomkasp/quartz-hipster-entities.svg?branch=master)]
(https://travis-ci.org/tomkasp/quartz-hipster-entities) 

#### Logo
![Quartz hipster Logo](/quartzhipsterentitieslogo.png)

## Big picture
Main purpose of this simple, small library is to make your life easier when it comes to work with Quartz framework. 

Main functionality can be divided into 3 sections. Let me explain each of them.
 
1. First under entities package are defined all tables which quartz framework uses. 
   You can reuse them or access through CrudRepositories from a repository package. 
   
2. Library contains pre defined quartz configuration inside QuzrtzConifg class. You just need to add jar file with 
   library and you have SchedulerFactoryBean inside your Spring context. 
   
3. Library provides simple Rest API which can be used to retrieve the data from the database and return it as a JSON

## How to

Ok, but how to use it? 

The only thing you need is to add library as a dependency. Next you need to enable it somewhere within your project with 
@EnableQuartzHipster annotation on one of your Configuration classes. When it is a dependency to your project spring will
automatically try to scan CLASSPATH and and create all entities with quartz tables and beans defined inside 
com.tomkasp.config.QuartzConfig Your project needs to have only quartz.properties file with quartz configuration and 
somewhere inside your project you also need to define a property org.quartz.scheduler.name with the name of your scheduler. 

Few more words of explanation. 

I used spring boot as a kind of template for the app. I leverage mainly spring starters from the boot project. Under package 
com.tomkasp.repository you can find repositories created for the defined entities. If you would like to now how it works 
you can read it here: http://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html


## Examples

To see how the library runs in real example you can visit examples:
https://github.com/tomkasp/quartz-hipster-entities-example

## What is next?

If you want to add something more you can play a little bit with spring data rest project and add 
@RepositoryRestResource annotation on top of the repositories. More details you can find here:
http://spring.io/guides/gs/accessing-data-rest/ 




