package chap_05;

/*
배열을 활용하셔 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하사오

조건
신발 사이즈는 250 부터 +5 씩 295 까지 증가
신발 사이즈 총 수는 10가지

실행 결과
사이즈 250 재고 있음
사이즈 255 재고 있음
*/

public class Practice05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i);
        }
        for (int sizes: size) {
            System.out.println("사이즈" + sizes + " " + "(재고 있음)");
        }
        System.out.println();
    }

}
