import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 RandomMatrixGenerator gen = new RandomMatrixGenerator(40,40);
         int[][] first = gen.generate();
         int[][] second = gen.generate();
         PrintMatrix(first);
         PrintMatrix(second);
         
         List<Thread> myThreads = new ArrayList<>();
         
         for(int i=0; i<40; i++)
         {
        	 Thread t = new Thread(new ArrayAdder(first[i], second[i],i));
        	 t.start();
        	 myThreads.add(t);
        	 
         }
         
         for (Thread t : myThreads) {
        	   t.join();
        	}
         
         

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
