package threads.array;

public class ArrayThreadDriver {

	/**
	 * Generates a random number in the range of min to max both inclusive.
	 * 
	 * @param min
	 *            starting value for the range
	 * @param max
	 *            ending value for the range
	 * @return a value in the range of min to max
	 */
	public static int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void main(String[] args) {
		
		int initialCapacity = generate(1, 10);
		UnboundedArray array = new UnboundedArray(initialCapacity);
		
		InsertThread insertThread = new InsertThread("Insert_Thread", array);
		DeleteThread1 deleteThread1 = new DeleteThread1("Delete_Thread1", array);
		DeleteThread2 deleteThread2 = new DeleteThread2("Delete_Thread2", array);
		ModifyThread modifyThread = new ModifyThread("Modify_Thread", array);
		insertThread.start();
        deleteThread1.start();
        deleteThread2.start();
        modifyThread.start();
	}
}
