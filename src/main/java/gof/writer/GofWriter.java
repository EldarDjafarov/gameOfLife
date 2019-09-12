package gof.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GofWriter {

    public void writeToFile(String fileName,String [][] arr) {

        try {
            FileWriter fileWriter =
                    new FileWriter(fileName);
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    bufferedWriter.write(String.valueOf(arr[i][j]+" "));
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");

        }
    }


}

