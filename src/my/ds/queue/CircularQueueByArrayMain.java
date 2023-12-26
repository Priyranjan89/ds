package my.ds.queue;

public class CircularQueueByArrayMain {

    public static void main(String[] args) {

        System.out.println("Creating an empty queue...");
        CircularQueueByArray queue = new CircularQueueByArray(5);

        System.out.println("\nEnqueuing 5 values in the queue...");
        for (int i = 1; i <= 5; i++) {
            queue.enQueue(i * 10);
        }
        queue.enQueue(60);

        System.out.println("Peek value from queue...");
        queue.peekOperation();

        System.out.println("Dequeue values from queue...");
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(60);
        queue.printArray();
        queue.deQueue();
        queue.printArray();
        queue.deleteStack();
    }
}
