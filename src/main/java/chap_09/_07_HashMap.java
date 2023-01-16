package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        // HashMap 또한 순서 보장안됨 ,Key값의 중복 X
        // 순서를 적용 하고 싶다면 LinkedHashMap 사용

        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가
        //map.put(key, value)
        map.put("유재석" , 10);
        map.put("이광수" , 5);
        map.put("김종국" , 3);
        map.put("서장훈" , 10);

        System.out.println("총 고객 수 :" + map.size());

        System.out.println("_________________");

        //조회
        System.out.println("유재석님의 포인트 :" + map.get("유재석"));
        System.out.println("이광수님의 포인트 :" + map.get("이광수"));
        System.out.println("_________________");

        //확인
        if (map.containsKey("서장훈")){
            int point= map.get("서장훈");
            map.put("서장훈" , ++point);
            System.out.println("서장훈님의 누적 포인트:" + map.get("서장훈"));
        }else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }

        System.out.println("_________________");
        //삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        System.out.println("_________________");
        //전체 삭제
        map.clear();
        if (map.isEmpty()){
            System.out.println("남은 고객 수:" + map.size());
            System.out.println("가게 접음");
        }

        System.out.println("_________________");
        //다시 재방문
        map.put("유재석" , 10);
        map.put("이광수" , 5);
        map.put("김종국" , 3);
        map.put("서장훈" , 10);

        //key값 확인
        for (String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("_________________");
        //Value
        for (int value : map.values()){
            System.out.println(value);
        }

        //Key, Value 동시 확인
        for (String key : map.keySet()){
            System.out.println("고객 이름:" + key + "\t포인트 :" + map.get(key));
        }

        System.out.println("_________________");
        //멥 : 중복X , 순서X
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50);
        for (String key : map.keySet()){
            System.out.println("고객 이름:" + key + "\t포인트 :" + map.get(key));
        }
        //아무 많이 넣어도 중복을 허용 하지 않음


    }
}
