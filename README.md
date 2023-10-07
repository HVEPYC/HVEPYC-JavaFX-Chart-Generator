# HVEPYC JavaFX Chart Generator
 This is a Chart Generator that aids in the easy creation and display of Graphs using the JavaFX library. It can display Line Charts, Bar Graphs and Pie Charts.
 
 This Chart Generator is a Jar File, which is placed in the Current Working Directory of the Application which will be used to supply the Graph data to the Chart Generator. For a Java App which is run in an IDE (Eg: Netbeans), this Jar File can be placed inside the Project folder, beside the src folder and pom.xml file.

 This chart generator uses a system of Text files to transfer information from the Application supplying the Graph data, to the Graph Generator. The Graph data can be created by any application written in any programming language, as long as it can issue a CMD command to execute the Jar file, and write the Chart data in the appropriate format.

 An example of an implementation in Java can be done by using the sample JavaFXCaller.java file included in this repository, and the steps to use it are as follows:
 - Integrate the aforementioned Java file into your project, add the appropriate package name at the beginning of the file. 
 - Initialize a JavaFXCaller object with the appropriate integer parameter, where 1 is for Line Graph, 2 is for Bar Chart, and 3 is for Pie Chart.
 - Create your data, in the form of a LinkedHashMap with the Key being of String Datatype, and Value being of Integer Datatype. Once created, convert the Integer based values into a String, so that it can be sent to the JavaFXChartGen method for chart Display. The resultant LinkedHashMap should have both Key and Value of String datatype.
 - Once completed, pass a LinkedHashMap which has both the Key:Value pairs in the String datatype as a parameter to the JavaFXChartGen Method.
 - Run the program, and if everything is done correctly, a new window with the chosen Graph with the appropriate Data will pop up
