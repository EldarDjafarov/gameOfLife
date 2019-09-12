package gof.game;



public class Game {
    private String[][] future;

    public String[][] generations(String[][] array, int height, int width, int numberOfIterations) {


        if (numberOfIterations > 0) {
            numberOfIterations--;
            future= new String[height][width];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int aliveNeighbours = 0;
                    String currentCell = array[i][j];
                    // The cell needs to be subtracted from
                    // its neighbours
                    if (currentCell.equals("X")) {
                        aliveNeighbours = aliveNeighbours - 1;
                    }
                    //We need l an m to check all neighbors
                    for (int l = -1; l <= 1; l++)
                        for (int m = -1; m <= 1; m++) {
                             /*values ​​along the edges will have fewer neighbors, which will cause an exception
                               if they checked by a simple method designed for 8 neighbors*/
                            if (i + l >= 0 && i + l < array.length && j + m >= 0 && j + m < array[0].length) {
                                String currentNeighbor = array[i + l][j + m];
                                if (currentNeighbor.equals("X"))
                                    aliveNeighbours++;
                            }
                        }

                    if ((currentCell.equals("X")) && aliveNeighbours < 2)
                        future[i][j] = "O";
                    else if ((currentCell.equals("X")) && aliveNeighbours > 3)
                        future[i][j] = "O";
                    else if ((currentCell.equals("O")) && aliveNeighbours == 3)
                        future[i][j] = "X";
                    else
                        future[i][j] = array[i][j];
                }

            }

            generations(future,height,width, numberOfIterations);
        }
        return future;


    }
}







