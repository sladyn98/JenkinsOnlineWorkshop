# JenkinsCustomService
 A Spring Boot Server to generate a packaged custom war using a user-defined .yml file 
 It runs off the custom war packager library. 

 ** This is strictly a POC. Expect dragons ahead :dragon: ** 

# Steps to Run Locally

1) Clone the Repository.
2) cd into the repository using `cd POC_CustomService`.
3) Run `mvn clean install` inside the directory.
4) Check if the `mvn version` is pointing clearly to the Java JDK else it will throw errors.
5) Make sure you have a `tmp` folder inside the `POC_CustomService` directory.
7) Create a `sample.yml` as well to sepcify the configuration of the war.
6) Navigate to the `jre` generated inside the `target` folder.
8) Run the jre using `java -jar ${CLI_JAR} -configPath packager-config.yml`

# To-Do
1) Create a REST API on top of the war-packager-library.
2) React Home Page for the entry of various options.
3) Cloud Hostin if possible. Possible Options (Heroku)
