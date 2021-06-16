
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alper
 */
public class SingleMatrixAdder {

    private long startTime;
    private long endTime;
    private double duration;
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] matrixResult;

    private boolean executed;

    public SingleMatrixAdder(int[][] matrix1, int[][] matrix2) {
        this.executed = false;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int[][] getResultMatrix() throws Exception {
        if (executed) {
            return this.matrixResult;
        } else {
            throw new Exception("No Operation has been done!");
        }
    }

    private boolean compareDimensions() {
        if (matrix1.length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i].length != matrix2[i].length) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public double getDuration() {
        return duration / 1000000;
    }

    public void add() {
        if (compareDimensions()) {
            this.matrixResult = new int[matrix1.length][matrix1[0].length];
            this.startTime = System.nanoTime();
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    this.matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        this.endTime = System.nanoTime();
        this.duration = endTime - startTime;
        this.executed = true;
    }


}
