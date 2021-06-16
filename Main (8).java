/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alper
 */
public class Main {
     public static void main(String[] args) throws Exception {
         RandomMatrixGenerator gen = new RandomMatrixGenerator(40,40);
         int[][] first = gen.generate();
         int[][] second = gen.generate();
         PrintMatrix(first);
         PrintMatrix(second);
         SingleMatrixAdder adder = new SingleMatrixAdder(first, second);
         adder.add();
         int result[][] = adder.getResultMatrix();
         PrintMatrix(result);
         System.out.println("Total Execution Time :"+adder.getDuration());
    }
     
     private static void PrintMatrix(int[][] matrix) {
        String res = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res += matrix[i][j] + " ";
            }
            res += "\n";
        }
        System.out.println(res);
    }
}
