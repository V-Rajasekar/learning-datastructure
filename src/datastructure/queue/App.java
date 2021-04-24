package datastructure.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.view();

        queue.insert(4);
        queue.insert(5);
        queue.view();

        System.out.println(queue.remove());
        queue.view();

        queue.insert(6);
        queue.view();
        queue.insert(0);
        queue.view();

    }
}
