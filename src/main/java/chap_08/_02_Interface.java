package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetecor;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetecor;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Repotable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 그냥 뼈대만 제공하는 구조
        // 상속의 경우에는 단일 상속만 가능 했지만 인테페이스를 이용하면 극복 가능
        // 인터페이스를 형성후 이들을 구현하는 클레스 생성

        // 인터페이스를 구현하는 모든 클레스를 인터페이스 자체를 통해서 참조
        // 인터페이스 내에 있는 같은 메소드는 항상 구현이 되어 있다.
        // 인터페이스 내에서 만들어지는 모든 메소드는 자동으로 public abstract가 들어간다.
        // 인터페이스 내에서 변수를 생성한다면 자동으로 public static final이 들어간다.

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();
        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Repotable normalReporter1 = new NormalReporter();
        normalReporter1.report();
        Repotable videoReporter1 = new VideoReporter();
        videoReporter1.report();

        System.out.println("_________________");

        Detectable fireDetecor = new FireDetecor();
        fireDetecor.detect();

        Detectable advancedFireDetecor = new AdvancedFireDetecor();
        advancedFireDetecor.detect();

        System.out.println("_________________");
        FactoryCam  factoryCam = new FactoryCam();

        // setter로 전달해준 fireDetecor, normalReporter 기능을 그대로 사용
        factoryCam.setDetector(fireDetecor);
        factoryCam.setReporter(normalReporter);
        factoryCam.detect();
        factoryCam.report();
    }
}
