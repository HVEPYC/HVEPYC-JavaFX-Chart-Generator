# HVEPYC JavaFX Chart Generator
 This is a Chart Generator that aids in the easy creation and display of Graphs using the JavaFX library. It can display Line Charts, Bar Graphs and Pie Charts.

 This Chart Generator was initially created as a Standalone Application to fulfill the requirements of a Semester 1 2022/23 Fundamentals of Programming Project, and this is the official release of the Chart Generator.

 This Chart Generator is a Jar File, which is placed in the Current Working Directory of the Application which will be used to supply the Graph data to the Chart Generator. For a Java App which is run in an IDE (Eg: Netbeans), this Jar File can be placed inside the Project folder, beside the src folder and pom.xml file.

 Steps to Generate the Jar File are as follows:
 - Make sure you are using a Windows based system, and that you have the Apache Netbeans IDE installed (Version 15 is Preferred).
 - Open the JavaFXChartGenerator Project Folder in Netbeans.
 - Right Click on the Project name in the Projects tab, and select the "Clean and Build" option.
 - Once completed, navigate to the JavaFXChartGenerator Project Folder, Open the target folder, and the Jar file named javaFXchartDisplay-1.0.jar will be present.
 - As mentioned above, copy the Jar file to any required directory for usage in any Application.

 This chart generator uses a system of Text files to transfer information from the Application supplying the Graph data, to the Graph Generator. The Graph data can be created by any application written in any programming language, as long as it can issue a CMD command to execute the Jar file, and write the Chart data in the appropriate format.

 An example of an implementation in Java can be done by using the sample JavaFXCaller.java file included in this repository, and the steps to use it are as follows:
 - Integrate the aforementioned Java file into your project, and add the appropriate package name at the beginning of the file. 
 - Initialize a JavaFXCaller object with the appropriate integer parameter, where 1 is for Line Graph, 2 is for Bar Chart, and 3 is for Pie Chart.
 - Create your data, in the form of a LinkedHashMap with the Key being of String Datatype, and Value being of Integer Datatype. Once created, convert the Integer based values into a String, so that it can be sent to the JavaFXChartGen method for chart Display. The resultant LinkedHashMap should have both Key and Value of String datatype.
 - Once completed, pass a LinkedHashMap which has both the Key:Value pairs in the String datatype as a parameter to the JavaFXChartGen Method.
 - Run the program, and if everything is done correctly, a new window with the chosen Graph with the appropriate Data will pop up.

 Future Improvements to this project are planned, which are as follows:
 - Expand OS support to Linux and MacOS.
 - Introduce deeper levels of customisation for JavaFX Charts.
 - Enable dynamic Sizing for Pie Charts, which is enabled in Bar and Line Charts.
 - Further Improvements are always welcome!

 This Project can be integrated into any Open Source project, as long as it adheres to the guidelines set by this License.

 Created by Harishankar Vinod (HVEPYC)
 
 Thank You.
