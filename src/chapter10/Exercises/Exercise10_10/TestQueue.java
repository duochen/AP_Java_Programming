package chapter10.Exercises.Exercise10_10;

public class TestQueue {
	public static void main(String[] args) {
		Queue q1 = new Queue();
		int elements = 20;
		for (int i = 0; i <= elements; i++) {
			q1.enqueue(i);
		}
		for (int i = 0; i <= elements; i++) {
			System.out.print(q1.dequeue() + " ");
		}
	}
}
