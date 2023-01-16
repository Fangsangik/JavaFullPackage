package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Repotable;

public class FactoryCam extends Camera implements Detectable , Repotable {
    // 인스턴스 변수 생성
    private Detectable detector;
    private Repotable reporter;

    // 객체를 만들때 전달받는 detector, reporter을 통해서 아래 기능들 사용 가능
    // 외부에서 보내주는 Detectable, Repotable을 정의해서, 공장 카메라에서 화재를 감지, 신고를 할때
    // 전달 받은 detect와 report을 사용
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Repotable reporter) {
        this.reporter = reporter;
    }

    //자식 클레스에서 추상메소드를 자세하게 구현
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
