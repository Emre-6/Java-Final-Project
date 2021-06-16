
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alper
 */
public class RandomMatrixGenerator {
    
    Random rnd;
    private int height;
    private int width;

    public RandomMatrixGenerator(int height , int width) {
        this.height = height;
        this.width = width;
        this.rnd = new Random();
    }
    
    public int[][] generate(){
        int [][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = rnd.nextInt(100);
            }
        }
        return matrix;
    }
   
}
