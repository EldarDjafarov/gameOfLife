package gof;

import gof.game.Game;
import gof.model.InformObtainer;
import gof.reader.GofReader;
import org.junit.Assert;
import org.junit.Test;

public class GofComplexTest {

    @Test
    public void complexTest() {
        

        char[][] expect={
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'X'},
                {'O', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O', 'O'},
                {'O', 'X', 'X', 'X', 'O', 'O', 'O', 'O', 'X', 'X', 'X'},
                {'O', 'X', 'O', 'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'O', 'O', 'X', 'O', 'O', 'O', 'X', 'X', 'O', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'X', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'}};
        Game game = new Game();
        GofReader gofReader=new GofReader();
        InformObtainer informObtainer=gofReader.read("newFile2");

        char[][] actual = game.generations(informObtainer.makeGofArray(), informObtainer.getHeight(), informObtainer.getWidth(), informObtainer.getNumberOfIterations());
        Assert.assertArrayEquals(expect,actual);
    }
    @Test
    public void complexTestWithIterations() {
        Game game = new Game();
        char[][] array = {
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'X', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X'},
                {'X', 'O', 'O', 'X', 'O', 'X', 'O', 'O', 'X', 'O', 'X'},
                {'O', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'O'},
                {'O', 'X', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'X'},
                {'O', 'X', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'X', 'O'},
                {'O', 'O', 'X', 'X', 'O', 'O', 'X', 'X', 'X', 'X', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O'}};

        char[][] expect={
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'X', 'O', 'O', 'O', 'X', 'O'},
                {'O', 'O', 'X', 'O', 'O', 'O', 'O', 'X', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X', 'X', 'O', 'X'},
                {'O', 'O', 'X', 'X', 'X', 'O', 'O', 'O', 'O', 'X', 'X'},
                {'O', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'X', 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O'}};

        char[][] actual = game.generations(array, array.length, array[0].length, 4);
        Assert.assertArrayEquals(expect,actual);
    }
    @Test
    public void mediumTestWithIterations() {
        Game game = new Game();
        char[][] array = {
                {'O','O','O','O','O','O'},
                {'O','X','X','O','O','O'},
                {'O','O','X','O','O','O'},
                {'O','O','O','X','O','O'},
                {'O','O','O','O','X','O'},
                {'O','O','X','X','X','O'},
                {'O','O','O','O','O','O'},
                {'O','X','O','O','O','X'}};

        char[][] expect = {
                {'O','O','O','O','O','O'},
                {'O','X','X','O','O','O'},
                {'O','X','X','X','O','O'},
                {'O','O','O','X','O','O'},
                {'O','O','X','O','X','O'},
                {'O','O','O','X','X','O'},
                {'O','O','X','X','X','O'},
                {'O','O','O','O','O','O'}};

        char[][] actual = game.generations(array, array.length, array[0].length, 1);
        Assert.assertArrayEquals(expect,actual);
    }
}