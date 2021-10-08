package basic;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap {

    public static void main(String[] args){

        //최소 힙
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(123);
        pq1.add(13);
        pq1.add(7);
        pq1.add(1232);
        System.out.println(pq1); // [7, 123, 13, 1232]

        int size1 = pq1.size();
        for(int i=0;i<size1;i++){
            System.out.print(pq1.poll() + " "); // 7 13 123 1232
        }

        System.out.println(" ");

        //최대 힙
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(222);
        pq2.add(12);
        pq2.add(7);
        pq2.add(1232);
        System.out.println(pq2); // [1232, 222, 7, 12]

        int size2 = pq2.size();
        for(int i=0;i<size2;i++){
            System.out.print(pq2.poll() + " "); //1232 222 12 7
        }
    }
}
