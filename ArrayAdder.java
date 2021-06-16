
public class ArrayAdder extends Thread{

	private long startTime;
    private long endTime;
    private double duration;
    private int[] matrix1;
    private int[] matrix2;
    private int threadID;
    
    private int[][] matrixResult;

    private boolean executed;

    public ArrayAdder(int[] matrix1Row, int[] matrix2Row, int threadID) {
        this.executed = false;
        this.matrix1 = matrix1Row;
        this.threadID = threadID;
        
        
    }
    
    @Override
    public void run() {
            for (int i = 0; i < matrix1.length; i++) {
                    this.matrixResult[threadID][i] = matrix1[i] + matrix2[i];
                }
            }

}

