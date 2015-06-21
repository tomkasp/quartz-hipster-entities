# quartz-hipster-entities

----------------------------------------------------

Main purpose of this simple, small library is to make your life easier when it comes to work with Quartz framework. 

Main functionality of it can be divided into 3 different sections. Let me explain all of them.
 
1. First under entities package there are defined all tables which quartz framework uses. 
   You can reused them or access through CrudRepositories from a repository package. 
   
2. Library contains pre defined quartz configuration inside QuzrtzConifg class. You just need to add jar file with 
   library and you have SchedulerFactoryBean inside your Spring context. 
   
3. Library provides simple Rest API which can be used to retrieve the data from the database and return it as a JSON


Ok, but how to use it? 

You just need to add library as a dependency and basically that's it. When it is a dependency to your project spring will
automatically tire to scan CLASSPATH and and create all entities with quartz tables and beans defined inside 
com.tomkasp.config.QuartzConfig Your project needs to have only quartz.properties file with quartz configuration and 
somewhere inside your project you also need to define a property org.quartz.scheduler.name

