package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        // List나 Set과 같은 데이터를 순회

        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        // List -> interface
        // ArrayList, LinkedList -> 클레스인데 List라는 인터페이스 구현

        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("이광수");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("지석진");
        list.add("(알 수 없음)");
        list.add("송지효");

        for (String s: list ) {
            System.out.println(s);
        }

        System.out.println("______________");
        //이터레이터 사용
        Iterator<String> iterator = list.iterator();
        // 이터레이터 라는 자료형을 받아서 처리
        // iterator는 리스트를 하나씩 받아서 처리
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //현재 커서는 처음 문장에 있다가 다음 문장인 "유재석" 으로 이동

        System.out.println("______________");
        iterator = list.iterator(); // 커서를 처음 위치로 이동
        while (iterator.hasNext()) {// 다음에 가져올 데이터가 있는지?
            System.out.println(iterator.next());
        }

        System.out.println("______________");
        iterator = list.iterator(); // 커서를 처음 위치로 이동
        while (iterator.hasNext()){
            String s= iterator.next(); // 다음 문장을 String으로 인식
            if (s.contains("알 수 없음")){
                iterator.remove(); // 삭제
            }
        }
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("________________");

        HashSet<String> set = new HashSet<>();
        set.add("박명수");
        set.add("유재석");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("________________");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석" , 10);
        map.put("박명수" , 5);

        //map.iterator(); -> map에는 iterator 사용 X
        Iterator<String> iterMapKey = map.keySet().iterator();
        while (iterMapKey.hasNext()){
            System.out.println(iterMapKey.next());
        }

        System.out.println("________________");
        Iterator<Integer> iterMapValue = map.values().iterator();
        while (iterMapValue.hasNext()){
            System.out.println(iterMapValue.next());
        }

        //Key Value 동시선언
        //map.entrySet().iterator()
        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()){
            System.out.println(itMap.next());
        }
    }
}
