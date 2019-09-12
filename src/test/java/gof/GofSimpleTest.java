package gof;

import gof.game.Game;
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
        Game game = new Game();
        char[][] array = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'}};
        char[][] expect = {
                {'X', 'O', 'O', 'O', 'X'},
                {'O', 'O', 'O', 'O', 'O'},
                {'O', 'O', 'O', 'O', 'O'},
                {'X', 'O', 'O', 'O', 'X'}};

        char[][] actual = game.generations(array, 4, 5, 1);
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
