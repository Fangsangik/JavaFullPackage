package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림 (데이터가 흐른다)
        //많은 데이터에서 내가 원하는 조건에 따라서 1차, 2차 필터링에 따라 데이터를 고를 수 있다.
        //Collection frame work, 배열이나 파일에서도 만들 수 있다.
        //스트림은 한번 사용하고 나면 다시 사용 못하기에, 매번 새롭게 만들어야 한다.
        //스트림을 쓴다고 해서 원본 데이터가 변하거나 그러는 것은 아니고,
        //스트림을 새로 만들때마다 전체 데이터를 갖고 만들 수 있음

        //스트림 생성

        //Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javaScript", "c", "c++", "c#"};
        Stream<String> langsStream = Arrays.stream(langs);

        //Collection.stream
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javaScript", "c", "c++", "c#"); // = .add와 동일한 기능
        //System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        //Stream.of
        Stream<String> langListOfStream = Stream.of("python", "java", "javaScript", "c", "c++", "c#");


        //스트림 사용
        //중간연산 (Intermediate Operation) : 중간에 이런 저런 작업을 하는 것 -> 갯수 제한 없이 사용
        // => filter, map, sorted, distinct, skip ...

        //최종연산 (Terminal Operation) : 결과물 (한번만 사용)
        // => count, min, max, sum, forEach, anyMatch, allMatch ...

        //스트림은 filtering, mapping 등등을 하게 되면 데이터를 소진
        //한번 사용 하고 난 스트림은 다시 재사용 할 수 없다. -> 매번 처음부터 데이터를 준비해둔 상태에서 핉링

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        //Arrays.stream(scores).filter(x -> x>= 90).forEach(System.out::println);
        System.out.println("------------------");

        // 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        //long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("--------------------");

        // 90점 이상인 사람의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("--------------------");

        // 90점 이상인 점수들의 정렬
        Arrays.stream(scores).filter(x -> x >= 90)
                .sorted().forEach(System.out::println);
        System.out.println("--------------------");


        //문자열
        //"python", " java", "javaScript", "c", "c++", "c#"
        //c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c"))
                .forEach(System.out::println);
        System.out.println("--------------------");

        //java라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("java"))
                .forEach(System.out::println);
        System.out.println("--------------------");

        //글자길이가 4 이하인 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4)
                .sorted().forEach(System.out::println);
        System.out.println("--------------------");

        //4글자 중에서 c라는 언어를 포함하는 언어만 사용
        langList.stream().filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("--------------------");

        //4글자 이하의 언어중에서 c라는 글자를 포함하는 언어가 하나라도 있는지
        //(anyMatch) -> 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("--------------------");


        //4글자 이하의 언어들은 모두 c 라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("--------------------");

        //Map 사용 (우리가 사용하는 데이터를 원하는 형태로 가공하거나,
        //그 데이터 중에서 객체중에서 꺼내고 싶은 어떤 인스턴스를 지정

        //4글자 이하의 언어 중에서 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "어려워요")
                .forEach(System.out::println);
        System.out.println("--------------------");

        //c라는 글자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("--------------------");

        //c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);


    }
}
