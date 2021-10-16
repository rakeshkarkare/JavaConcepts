package com.advancedjavaconcepts.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionCatching {
    public static void main(String[] args) {
        try (var reader = new FileReader("file.txt");
             var writer = new FileWriter("...");
        ){
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException | ParseException e){
            System.out.println("Could not read data.");
        }
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


    }
}
