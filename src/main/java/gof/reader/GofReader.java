package gof.reader;

import gof.model.InformObtainer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class GofReader {


    public InformObtainer read(String fileName){
        InformObtainer informObtainer=new InformObtainer();
        StringBuilder lineWithArray= new StringBuilder();

        String line = null;
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName))){


            while((line = bufferedReader.readLine()) != null) {
                if(line.startsWith("Iterations")){
                    String [] iterationLine=line.split(" ");
                    String numberOfIterations=iterationLine[2];
                   informObtainer.setNumberOfIterations(Integer.parseInt(numberOfIterations));
                }
                if(line.startsWith("Sizes")){
                    String [] iterationLine=line.split(" ");
                    int height=Integer.parseInt( iterationLine[2]);
                    int width=Integer.parseInt(iterationLine[3]);
                    informObtainer.setHeight( height);
                    informObtainer.setWidth(width);
                }
                if (line.contains("X") || line.contains("O")){
                    lineWithArray.append(line.trim());
                    informObtainer.setLine(lineWithArray);
                }
            }



        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");

        }

        return informObtainer;
    }

}


