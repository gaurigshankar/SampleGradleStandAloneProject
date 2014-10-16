SampleGradleStandAloneProject
=============================

This project is a sample Standalone java project with executable jar created with depended libraries referenced.
The referred depended files will be copied to lib folder.
The created jar file can be executed as 
java -cp <pathToCreatedJarFile>:<pathToLibDirContainingDependendJarFiles> <MainClassName>
(ex)
java -cp ./build/libs/SampleGradleStandAloneProject.jar:./build/libs/lib/* StringManipulation
