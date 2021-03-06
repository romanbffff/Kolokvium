package com.vntu.akit;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            File file = new File("Date.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.println("-4");  // radius
            pw.println("30");  // width
            pw.println("30");  // height
            pw.close();
            br = new BufferedReader(new FileReader("Date.txt"));
        } catch (IOException e) {
            System.out.println("Error:" + e);
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
            Scanner scanner = new Scanner(new File("Date.txt"));
            int [] array= new int [100];
            int i = 0;
            while(scanner.hasNextInt()){
                array[i++] = scanner.nextInt();
            }
            geometricShapes geoShapes = new geometricShapes();
            geoShapes.setRadius(array[0]);
            geoShapes.setWidth(array[1]);
            geoShapes.setHeight(array[2]);

            if (array[0] > 0) {
               geoShapes.setCircle("circle");
            }
            if (array[1] == array[2]) {
                geoShapes.setFigure("square");
            }
            if (array[1] > array[2] || array[2] > array[1]) {
                geoShapes.setFigure("rectangle");
            }
            geoShapes.transformationGeo_x2();
            try {
                File file = new File("Date(update_file).txt");
                PrintWriter pw = new PrintWriter("Date(update_file).txt");
                pw.println(geoShapes.getRadius()); // radius_x2
                pw.println(geoShapes.getWidth());  // width_x2
                pw.println(geoShapes.getHeight());  // height_x2
                pw.close();
            } catch (IOException e) {
                System.out.println("Error:" + e);
            }
            geoShapes.print();
        }
    }
}
