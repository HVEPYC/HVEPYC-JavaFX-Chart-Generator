package //Add your own Package name here;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Harishankar Vinod (HVEPYC)
 */
public class JavaFXCaller {
    
    //Returns Current Working Directory of the Java Project
    private static final String CWD = System.getProperty("user.dir");
    private String pathtotxt;
    
    //Define Graph Types as:
    //1. Line Graph
    //2. Bar Chart
    //3. Pie Chart
    
    
    public JavaFXCaller(int ChartType) {
        //Creates a File which is to be read by the JavaFX Jar File later.
        if (ChartType == 1) {
            this.pathtotxt = CWD+"\\ForJavaFXLine.txt";
        }
        else if(ChartType == 2) {
            this.pathtotxt = CWD+"\\ForJavaFXBar.txt";
        }
        else if(ChartType == 3) {
            this.pathtotxt = CWD+"\\ForJavaFXPie.txt";
        }
        File JavaFXFile = new File(pathtotxt);
        try {
            JavaFXFile.createNewFile();
        } catch (IOException e) {}
    }
    
    public void JavaFXChartGen(LinkedHashMap<String, String> A) {
        try {
            PrintWriter WriteToFile = new PrintWriter(new FileOutputStream(this.pathtotxt));
            for (Map.Entry<String, String> entry : A.entrySet()) {
                String parameter = entry.getKey()+":"+entry.getValue();
                WriteToFile.println(parameter);
            }
            WriteToFile.close();
        } catch (FileNotFoundException e) {}
        
        //Runs the Command to execute the Java Jar file
        String command  = "cmd /C \"java -jar \""+CWD+"\\javaFXchartDisplay-1.0.jar\"\"";  
        
        //Issues the Command to CMD
        try {
            Runtime.getRuntime().exec(command);
        } catch (IOException ioe) {
            System.out.println("Some Big Problems");}
        
    }
}


//References used for the creation of this Java File:
//https://www.javatpoint.com/how-to-create-a-file-in-java
//https://www.geeksforgeeks.org/write-hashmap-to-a-text-file-in-java/
//https://stackoverflow.com/questions/10514473/how-to-convert-a-string-to-a-hashmap
//https://stackoverflow.com/questions/17910377/hashmap-keyset-automatically-sorted
//https://www.digitalocean.com/community/tutorials/thread-sleep-java
//https://www.javatpoint.com/how-to-delete-a-file-in-java
//https://stackoverflow.com/questions/1816673/how-do-i-check-if-a-file-exists-in-java
//https://jenkov.com/tutorials/javafx/piechart.html