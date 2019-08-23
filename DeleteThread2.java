package threads.array;

public class DeleteThread2 extends Thread {
    private UnboundedArray array;

    public DeleteThread2(String name, UnboundedArray array) {
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
            int s = array.getSize();
            array.delete((int)s/4, (int)3*s/4);
            System.out.println("Element deleted from index "+(int)s/4 +" to "+(int)3*s/4);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
