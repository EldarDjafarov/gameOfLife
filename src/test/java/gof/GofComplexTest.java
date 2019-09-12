package gof;

import gof.game.Game;
import org.junit.Assert;
import org.junit.Test;

public class GofComplexTest {

    @Test
    public void complexTest() {
        Game game = new Game();
       String[][] array = {
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "X"},
                {"X", "O", "O", "X", "O", "X", "O", "O", "X", "O", "X"},
                {"O", "O", "X", "O", "X", "O", "O", "O", "O", "X", "O"},
                {"O", "X", "X", "O", "O", "O", "O", "O", "O", "X", "X"},
                {"O", "X", "O", "O", "O", "X", "O", "O", "O", "X", "O"},
                {"O", "O", "X", "X", "O", "O", "X", "X", "X", "X", "O"},
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "X", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O"}};

            String[][] expect={
                    {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                    {"O", "O", "O", "O", "X", "O", "O", "O", "O", "X", "O"},
                    {"O", "X", "O", "X", "O", "X", "O", "O", "O", "O", "X"},
                    {"O", "O", "X", "O", "X", "O", "O", "O", "X", "O", "O"},
                    {"O", "X", "X", "X", "O", "O", "O", "O", "X", "X", "X"},
                    {"O", "X", "O", "X", "O", "O", "X", "X", "O", "O", "O"},
                    {"O", "O", "X", "O", "O", "O", "X", "X", "X", "X", "O"},
                    {"O", "O", "O", "X", "O", "O", "O", "X", "X", "O", "O"},
                    {"O", "O", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
                    {"X", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                    {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"}};

        String[][] actual = game.generations(array, array.length, array[0].length, 1);
        Assert.assertArrayEquals(expect,actual);
    }
    @Test
    public void complexTestWithIterations() {
        Game game = new Game();
        String[][] array = {
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"X", "O", "O", "O", "X", "O", "O", "O", "O", "O", "X"},
                {"X", "O", "O", "X", "O", "X", "O", "O", "X", "O", "X"},
                {"O", "O", "X", "O", "X", "O", "O", "O", "O", "X", "O"},
                {"O", "X", "X", "O", "O", "O", "O", "O", "O", "X", "X"},
                {"O", "X", "O", "O", "O", "X", "O", "O", "O", "X", "O"},
                {"O", "O", "X", "X", "O", "O", "X", "X", "X", "X", "O"},
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "X", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "O", "O", "X", "O", "O", "O", "O", "O"}};

        String[][] expect={
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "O", "O", "X", "X", "O", "O", "O", "O", "O", "O"},
                {"O", "O", "X", "O", "O", "X", "O", "O", "O", "X", "O"},
                {"O", "O", "X", "O", "O", "O", "O", "X", "X", "O", "X"},
                {"O", "X", "O", "O", "O", "O", "X", "X", "X", "O", "X"},
                {"O", "X", "O", "O", "O", "O", "O", "X", "X", "O", "X"},
                {"O", "O", "X", "X", "X", "O", "O", "O", "O", "X", "X"},
                {"O", "O", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "X", "X", "O", "O", "O", "O", "O", "O", "O", "O"},
                {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O", "O"}};

        String[][] actual = game.generations(array, array.length, array[0].length, 4);
        Assert.assertArrayEquals(expect,actual);
    }
    @Test
    public void mediumTestWithIterations() {
        Game game = new Game();
        String[][] array = {
                {"O","O","O","O","O","O"},
                {"O","X","X","O","O","O"},
                {"O","O","X","O","O","O"},
                {"O","O","O","X","O","O"},
                {"O","O","O","O","X","O"},
                {"O","O","X","X","X","O"},
                {"O","O","O","O","O","O"},
                {"O","X","O","O","O","X"}};

        String[][] expect = {
                {"O","O","O","O","O","O"},
                {"O","X","X","O","O","O"},
                {"O","X","X","X","O","O"},
                {"O","O","O","X","O","O"},
                {"O","O","X","O","X","O"},
                {"O","O","O","X","X","O"},
                {"O","O","X","X","X","O"},
                {"O","O","O","O","O","O"}};

        String[][] actual = game.generations(array, array.length, array[0].length, 1);
        Assert.assertArrayEquals(expect,actual);
    }
}
