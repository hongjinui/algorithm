package programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Spy {

    public static void main(String[] args){

        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            String key = clothes[i][1];
            if(!hashMap.containsKey(key)) hashMap.put(key,1);
            else hashMap.put(key,hashMap.get(key)+1);
        }

        Iterator<Integer> iterator = hashMap.values().iterator();
        while(iterator.hasNext()){
            answer = answer * iterator.next() +1;
        }

        return answer-1;
    }
}
