package gof;

import gof.game.Game;
import gof.model.InformObtainer;
import gof.reader.GofReader;
import org.junit.Assert;
import org.junit.Test;
public class GofSimpleTest {

    @Test
    public void testAllDeadGeneration() {
        Game game = new Game();
        char[][] array = {
                {'O','O','O','O','O'},
                {'O','O','O','O','O'},
                {'O','O','O','O','O'},
                {'O','O','O','O','O'}};
        char[][] actual = game.generations(array, array.length, array[0].length, 1);
        Assert.assertArrayEquals(array,actual);
    }

    @Test
    public void testAllAliveGeneration() {
        char[][] expect = {
                {'X', 'O', 'O', 'O', 'X'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'X', 'O', 'O', 'O', 'X'}};

        GofReader gofReader = new GofReader();
        InformObtainer informObtainer = gofReader.read("allAlive.txt");
        Game game = new Game();
        char[][] actual = game.generations(informObtainer.makeGofArray(),
                informObtainer.getHeight(), informObtainer.getWidth(),
                informObtainer.getNumberOfIterations());
        Assert.assertArrayEquals(expect,actual);

    }

    @Test
    public void testAllAliveFewGeneration() {
        Game game = new Game();
        char[][] array = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'}};
        char[][] expect = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'}};
        char[][] actual = game.generations(array, array.length, array[0].length, 2);
        Assert.assertArrayEquals(expect,actual);

    }
}