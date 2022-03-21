##Cucumber BDD based framework for Mobile application using Appium  

**To Run The Automation Suite From command line in the project folder** 

 mvn clean test </br>
 or </br>
 mvn test </br>
 
##Testng files description 
 define all the tests related to different pages across the App
####Packages Description
1. **com.Base**: Initialize drivers
2. **com.Screens**: Defines different screen page and assertions
3. **com.Utils**: Defines appium server,desired capabilities

####src/main/resources description
1.**Log4j2.properties**: It defines log4j2 file for logger information


####src/test/java file description

1. **com.Feature**: Define feature files 
2. **com.Runner**: Define glue,tags feature file in a single file for run appium
3. **com.stepDefinitions**: Define all the steps for feature files
4. **HooksFile**: Define Screenshot for failed test cases , start and stop appium server

####src/test/resources description
1. **extent-config.xml**: It contains xml file for extent report

####logs folder description
**Mylogs.log**: It contains all the logger informations

####Reports 
1. Extent report gets generated after the run under \Reports\extentreport.html</br>
2. TestNG report as "emailable-report.html" gets generated under \test-output. </br>

