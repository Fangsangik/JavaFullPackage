package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);

        } catch (ArithmeticException e) { // 0으로 나누려고 하다가 발생했을때 처리가 되는 구문
            System.out.println("무언가 잘못 계산을 하셨네요");
            //Catch 구문 내에서 처리, 아래 있는 catch로 넘어가지 않음

        } catch (Exception e) {
            //Exception e는 다른 예외들의 조상 클레스라고 볼 수 있다
            //어떤 문제가 발생했을때 문제를 해결 할 수 있는게 여러가지 방법
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("-------------------");

        try {
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 잘못 설정했어요");
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("--------------");

        try {
            Object obj = "Test";
            System.out.println((int) obj);
        } catch (ClassCastException e) {
            System.out.println("형 변환의 잘못된 형 변환 입니다");
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("--------------");

        try {
            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException e) {
            System.out.println("뭔가 잘못 계산 하셨네요");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 잘못 설정했어요");
        } catch (ClassCastException e) {
            System.out.println("형 변환의 잘못된 형 변환 입니다");
        } catch (Exception e) {
            System.out.println("그 외의 모든 예외는 여기서 처리 됩니다.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");

        System.out.println("--------------");

        //만약에 ArithmeticException e, ArrayIndexOutOfBoundsException e를 동일하게 처리 하고 싶다면?
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
            //바로 구분된 모든 예외를 여기서 한번에 처리한다는 의미
            System.out.println("무언가 실수하셨네요");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("무언가 실수하셨네요");
        } catch (ClassCastException e) {
            System.out.println("형 변환의 잘못된 형 변환 입니다");
        } catch (Exception e) {
            System.out.println("그 외의 모든 예외는 여기서 처리 됩니다.");
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
