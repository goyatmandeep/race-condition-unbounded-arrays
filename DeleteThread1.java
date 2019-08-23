package threads.array;

public class DeleteThread1 extends Thread {
    private UnboundedArray array;

    public DeleteThread1(String name, UnboundedArray array) {
        // TODO Auto-generated constructor stub
        super(name);
        this.array = array;
    }

    public static int generate(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public void run() {
        // Write your code to implement the job of delete thread
        while(true) {
            for(int i = 1; i<= 2; i++) {
                System.out.println("Element deleted: "+array[0]);
                array.delete();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
