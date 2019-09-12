package gof.model;

public class InformObtainer {
    private int numberOfIterations;
    private int height;
    private int width;
    private StringBuilder lineWithArray;

    public String[][] makeGofArray() {


        String[] array = lineWithArray.toString().split(" ");

        String[][] gofArray = new String[height][width];
        int k = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                gofArray[i][j] = array[k];
                k++;
            }

        }
        return gofArray;
    }


    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public void setNumberOfIterations(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public StringBuilder getLine() {
        return lineWithArray;
    }

    public void setLine(StringBuilder line) {
        this.lineWithArray = line;
    }
}
