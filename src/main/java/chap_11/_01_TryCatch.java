package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외처리
        // 오류 - compile 오류 (아예 진행이 되지 않는 것)
        //     - 런타임 오류 (컴파일은 가능하지만, 실행 도중 오류가 발생하는 것)
        //런타임 오류 => error 작성하는 소스코드를 통해서 수습 할 수 X (StepOverFlow)
        //          => 예외 (Exception) 코드를 통해서 수습 할 수 있는 것
        //try {
        //       시도하려는 소스코드 작성
        //  }catch (Exception e){
        //      시도하려는 소스코드 내에서 오류가 발생
        // }

        try {
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace(); //=> java.lang.ArithmeticException: / by zero
                                //at chap_11._01_TryCatch.main(_01_TryCatch.java:17)
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("-------------------");

        try{
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (Exception e){
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("--------------");

        try{
            Object obj = "Test";
            System.out.println((int) obj);
        }catch (Exception e){
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

    }
}
