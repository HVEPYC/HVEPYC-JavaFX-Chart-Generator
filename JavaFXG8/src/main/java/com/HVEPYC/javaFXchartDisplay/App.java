package com.HVEPYC.javaFXchartDisplay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.BarChart;
import javafx.scene.layout.VBox;

import java.util.Scanner;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Harishankar Vinod (HVEPYC)
 */

//JavaFX App
public class App extends Application {
    
    @Override
    public void start(Stage stage){
        //Defines title of the JavaFX Window
        stage.setTitle("JavaFX Chart Generator by HVEPYC");
        
        //Obtains Current Working Directory
        String CWD = System.getProperty("user.dir");
        //Define location of JavaFXLine.txt/JavaFXBar.txt file
        String JavaFXTXTLine = CWD+"\\ForJavaFXLine.txt";
        String JavaFXTXTBar = CWD+"\\ForJavaFXBar.txt";
        String JavaFXTXTPie = CWD+"\\ForJavaFXPie.txt";
        String JavaFXTXT = "";
        
        try {
            
            File Check1 = new File(JavaFXTXTLine);
            boolean LineCheck = (Check1.exists() && !Check1.isDirectory());
            File Check2 = new File(JavaFXTXTBar);
            boolean BarCheck = (Check2.exists() && !Check2.isDirectory());
            File Check3 = new File(JavaFXTXTPie);
            boolean PieCheck = (Check3.exists() && !Check3.isDirectory());
            
            if (LineCheck) {
                JavaFXTXT = JavaFXTXTLine;
            }
            if (BarCheck) {
                JavaFXTXT = JavaFXTXTBar;
            }
            if (PieCheck) {
                JavaFXTXT = JavaFXTXTPie;
            }
            
            Scanner inputStream = new Scanner(new FileInputStream(JavaFXTXT));
            LinkedHashMap<String, String> graphdata = new LinkedHashMap<String, String>();
            while (inputStream.hasNextLine()) {
                String temp2 = inputStream.nextLine();
                String[] sections = temp2.split(":");
                String key = sections[0].trim();
                String value = sections[1].trim();
                graphdata.put(key,value);
            }
            inputStream.close();
            
            if (LineCheck) {   //Shows LineChart Details
                
                final CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                final LineChart<String,Number> lineChart = new LineChart<String,Number>(xAxis,yAxis); 
                lineChart.setTitle("Graph of Metric Chosen");                      
                XYChart.Series series = new XYChart.Series();
                series.setName("Amount");
                
                for(Map.Entry<String, String> entry : graphdata.entrySet()) {
                    String xData = entry.getKey();
                    int yData = Integer.parseInt(entry.getValue());
                    series.getData().add(new XYChart.Data(xData,yData));
                }
                
                File FileToDelete = new File(JavaFXTXT);
                FileToDelete.delete();
                Scene scene  = new Scene(lineChart,800,600);
                lineChart.getData().add(series);
                stage.setScene(scene);
                stage.show();
            }
            if (BarCheck) {   //Shows BarChart Details
                
                final CategoryAxis xAxis = new CategoryAxis();
                final NumberAxis yAxis = new NumberAxis();
                final BarChart<String,Number> barChart = new BarChart<String, Number>(xAxis,yAxis);
                barChart.setTitle("Graph of Metric Chosen");
                XYChart.Series series = new XYChart.Series();
                series.setName("Amount");
                
                for(Map.Entry<String, String> entry : graphdata.entrySet()) {
                    String xData = entry.getKey();
                    int yData = Integer.parseInt(entry.getValue());
                    series.getData().add(new XYChart.Data(xData,yData));
                }
                
                File FileToDelete = new File(JavaFXTXT);
                FileToDelete.delete();
                
                Scene scene  = new Scene(barChart,800,600);
                barChart.getData().add(series);
                stage.setScene(scene);
                stage.show();
            }
            if (PieCheck) {  //Shows PieChart details
                
                PieChart pieChart = new PieChart();
                
                for(Map.Entry<String, String> entry : graphdata.entrySet()) {
                    String xData = entry.getKey();
                    int yData = Integer.parseInt(entry.getValue());
                    PieChart.Data slice = new PieChart.Data(xData,yData);
                    pieChart.getData().add(slice);
                }
                
                File FileToDelete = new File(JavaFXTXT);
                FileToDelete.delete();
                
                VBox vbox = new VBox(pieChart);
                
                Scene scene = new Scene(vbox,800,600);
                stage.setScene(scene);
                stage.show();
            }
            
        
        } catch (FileNotFoundException e) {}
            
    }

    public static void main(String[] args) {
        launch();
    }
  
}

//Bibliography for the Fixes that make the Conversion to a Jar File Possible
//https://coderanch.com/t/750502/java/JAR-Execution-Win-Netbeans-Java  