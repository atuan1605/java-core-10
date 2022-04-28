import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<Integer> linkedList = new LinkedList<>();
//        linkedList.add(3);
//        linkedList.add(1);
//        linkedList.add(9);
//        linkedList.offer(9);
//        linkedList.offer(6);
//        linkedList.offer(4);
//
//        System.out.println(linkedList);
//        System.out.println("phần tử đầu tiên " + linkedList.element());
//        System.out.println("phần tử đầu tiên " + linkedList.peek());
//
//        linkedList.remove();//xóa phần tử đầu tiên
//        System.out.println("danh sách sau khi xóa " + linkedList);
//
//        linkedList.poll();
//        System.out.println(linkedList);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(2);

        System.out.println(priorityQueue);

        System.out.println("phần tử đầu tiên: " + priorityQueue.element());
        priorityQueue.remove();
        System.out.println("phần tử đầu tiên " + priorityQueue.element());
        System.out.println(priorityQueue);


    }
}
