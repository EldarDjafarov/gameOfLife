package gof.game;



public class Game {
    private char[][] future;

    public char[][] generations(char[][] array, int height, int width, int numberOfIterations) {


        if (numberOfIterations > 0) {
            numberOfIterations--;
            future= new char[height][width];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int aliveNeighbours = 0;
                    char currentCell = array[i][j];
                    // The cell needs to be subtracted from
                    // its neighbours
                    if (currentCell=='X') {
                        aliveNeighbours = aliveNeighbours - 1;
                    }
                    //We need l an m to check all neighbors
                    for (int l = -1; l <= 1; l++)
                        for (int m = -1; m <= 1; m++) {
                             /*values ​​along the edges will have fewer neighbors, which will cause an exception
                               if they checked by a simple method designed for 8 neighbors*/
                            if (i + l >= 0 && i + l < array.length && j + m >= 0 && j + m < array[0].length) {
                                char currentNeighbor = array[i + l][j + m];
                                if (currentNeighbor=='X')
                                    aliveNeighbours++;
                            }
                        }

                    if ((currentCell== 'X') && aliveNeighbours < 2)
                        future[i][j] = 'O';
                    else if ((currentCell== 'X')  && aliveNeighbours > 3)
                        future[i][j] = 'O';
                    else if ((currentCell== 'O')  && aliveNeighbours == 3)
                        future[i][j] = 'X';
                    else
                        future[i][j] = array[i][j];
                }

            }

            generations(future,height,width, numberOfIterations);
        }
        return future;


    }
}







