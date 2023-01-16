package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        // 다양한 타입의 객체를 지원하는 클레스나 인터페스 또는 메소드 정의 하는 방법
        // 만약 다른 자료형이 온다면 또 만들어 주어야 한다는 불편함

        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        // 각각의 메소드를 통해서 출력
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("------------");

        // 하나의 메소드를 통해 다른 객체를 출력
        // 제네릭스에서 지원하는 것은 객체
        // 기본 자료형은 제네릭스로 바로 사용 할 수 없다.
        // -> rapper Class를 사용 = Integer.parseInt(), String.valueOf(), Double.toString()
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    // <T>는 타입을 의미
    private static <T> void printAnyArray(T[] array){
        for (T t:
                array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String i:
             sArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double i:
                dArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i:
             iArray) {
            System.out.print(i + " "); //1,2,3,4,5
        }
        System.out.println();
    }

}
