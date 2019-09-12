package gof;

import gof.game.Game;
import org.junit.Assert;
import org.junit.Test;

public class GofSimpleTest {

    @Test
    public void testAllDeadGeneration() {
        Game game = new Game();
        String[][] array = {
                {"O","O","O","O","O"},
                {"O","O","O","O","O"},
                {"O","O","O","O","O"},
                {"O","O","O","O","O"}};
        String[][] actual = game.generations(array, array.length, array[0].length, 1);
        Assert.assertArrayEquals(array,actual);
    }

    @Test
    public void testAllAliveGeneration() {
        Game game = new Game();
        String[][] array = {
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"}};
        String[][] expect = {
                {"X", "O", "O", "O", "X"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"X", "O", "O", "O", "X"}};

        String[][] actual = game.generations(array, 4, 5, 1);
        Assert.assertArrayEquals(expect,actual);

    }

    @Test
    public void testAllAliveFewGeneration() {
        Game game = new Game();
        String[][] array = {
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"}};
        String[][] expect = {
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O"}};
        String[][] actual = game.generations(array, array.length, array[0].length, 2);
        Assert.assertArrayEquals(expect,actual);

    }
}
