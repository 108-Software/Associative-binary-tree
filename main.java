import java.util.PriorityQueue;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        priority_queue son = new priority_queue();

        System.out.println("Выберите действие: ");
        System.out.println("0. Выход");
        System.out.println("1. Проверка очереди на пустоту");
        System.out.println("2. Добавление элемента в очередь");
        System.out.println("3. Удаление элемента из очереди");
        System.out.println("4. Показать всю очередь");

        String answer = "";

        int numbers=0;

        while (true) {
            answer = sc.next();

            switch (answer) {

                case ("0"):
                    System.exit(0);

                case ("1"):
                    priority_queue.chek(pq);
                    break;

                case ("2"):
                    System.out.print("Введите элемент для добавления в очередь: ");
                    int adder = sc.nextInt();
                    priority_queue.add(pq, adder);
                    numbers++;
                    break;

                case ("3"):
                    System.out.print("Введите элемент для удаления из очереди: ");
                    int removeer = sc.nextInt();
                    priority_queue.remove(pq, removeer);
                    numbers--;
                    break;

                case ("4"):
                    priority_queue.print(pq, numbers);
                    break;

            }
        }
    }
}