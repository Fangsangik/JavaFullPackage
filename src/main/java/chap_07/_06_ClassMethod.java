package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        BlackBox b1 = new BlackBox();
//        b1.callServiceCenter();
//
//        BlackBox b2 = new BlackBox();
//        b2.callServiceCenter();

        // 객체 직접 형성 하지 않음
        BlackBox.callServiceCenter();

        // 클레스 메소드의 예시
        String s = String.valueOf(3);
    }
}
