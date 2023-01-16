package chap_07;

public class _03_ClassVariable {
    public static void main(String[] args) {
        // 자동 신고 기능 추가
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        System.out.println(b1.modelname);

        BlackBox b2 = new BlackBox();
        b2.modelname = "하양이";
        System.out.println(b2.modelname);

        // 특정 범위를 초과하는 충돌감지 시 자동 신고 기능 개발 여부
        System.out.println("---개발 전---");
        System.out.println(b1.modelname + "자동 신고 기능 :" + b1.canAutoReport);
        System.out.println(b2.modelname + "자동 신고 기능 :" + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 :" + BlackBox.canAutoReport);System.out.println("모든 블랙박스 제품 자동 신고 기능 :" + BlackBox.canAutoReport);

        //기능 개발
        BlackBox.canAutoReport = true;
        System.out.println("---개발 후---");
        System.out.println(b1.modelname + "자동 신고 기능 :" + b1.canAutoReport);
        System.out.println(b2.modelname + "자동 신고 기능 :" + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 :" + BlackBox.canAutoReport);System.out.println("모든 블랙박스 제품 자동 신고 기능 :" + BlackBox.canAutoReport);

    }

}
