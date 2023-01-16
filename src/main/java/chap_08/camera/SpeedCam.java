package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.detector.SpeedDetector;
import chap_08.reporter.Repotable;

public class SpeedCam extends Camera implements Detectable, Repotable {

    private SpeedDetector speedDetector;
    private Repotable repotable;


    public void setSpeedDetector(SpeedDetector speedDetector) {
        this.speedDetector = speedDetector;
    }

    public void setRepotable(Repotable repotable) {
        this.repotable = repotable;
    }
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호인식");
    }


    @Override
    public void detect() {
        this.speedDetector.detect();
    }

    @Override
    public void report() {
        this.repotable.report();
    }
}
