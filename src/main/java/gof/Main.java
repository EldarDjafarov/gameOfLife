package gof;

import gof.game.Game;
import gof.model.InformObtainer;
import gof.reader.GofReader;
import gof.writer.GofWriter;

public class Main {

    public static void main(String[] args) {

        GofReader gofReader = new GofReader();
        InformObtainer informObtainer = gofReader.read("allAlive.txt");
        Game game = new Game();
        char[][] array = game.generations(informObtainer.makeGofArray(), informObtainer.getHeight(), informObtainer.getWidth(), informObtainer.getNumberOfIterations());
        GofWriter gofWriter=new GofWriter();
        gofWriter.writeToFile("newFile",array);


    }
}











