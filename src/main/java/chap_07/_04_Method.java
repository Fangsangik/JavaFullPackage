package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";

        b1.autoReport(); // 지원이 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard(256);

        // 일반영상 : 1
        // 이벤트 영상 (충돌 감지) : 2
        int fileCount = b1.getVideoFileCount(1);
        // b1 객체의 getVideoFileCount 메소드를 통해서 반환 되는 값을
        // fileCount에 전달
        System.out.println("일반 영상 파일 수 :" + fileCount + "개");

        int fileCount1 = b1.getVideoFileCount(2);
        System.out.println("일반 영상 파일 수 :" + fileCount1 + "개");


    }
}
