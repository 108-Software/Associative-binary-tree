import java.util.PriorityQueue;

public class priority_queue {

    public static void chek(PriorityQueue<Integer> pq ){
        int size = pq.size();

        if (size == 0){
            System.out.println("Очередь пуста");
        }else{System.out.println("В очереди " + size + " элемента(ов)");}

    }

    public static void add(PriorityQueue<Integer> pq, int elements){
        pq.add(elements);
    }

    public static void remove(PriorityQueue<Integer> pq, int removeer){
        pq.remove(removeer);
    }

    public static void print(PriorityQueue<Integer> pq, int numbers) {

        System.out.print("[ ");
        pq.stream().sorted().forEach(item -> System.out.print(item + " "));
        System.out.println("]");

    }
}

