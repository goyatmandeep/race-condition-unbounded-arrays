package threads.array;

public class ModifyThread extends Thread {
    private UnboundedArray array;

    public ModifyThread(String name, UnboundedArray array) {
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
            if(s != 0) {
                int index = generate(0, s);
                array[index] = generate(1, 100);
                System.out.println("Element replaced at index " + index);
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
