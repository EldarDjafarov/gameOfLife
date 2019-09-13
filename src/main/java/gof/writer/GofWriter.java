package gof.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GofWriter {

    public void writeToFile(String fileName,char[][] arr) {



                try(BufferedWriter bufferedWriter =
                            new BufferedWriter(new FileWriter(fileName));) {

                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            bufferedWriter.write((arr[i][j]));
                        }
                        bufferedWriter.newLine();
                    }
                } catch (IOException ex) {
                    System.out.println(
                            "Error writing to file '"
                                    + fileName + "'");

                }
            }


        }





