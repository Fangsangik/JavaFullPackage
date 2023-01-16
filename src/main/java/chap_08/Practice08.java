package chap_08;

/*
인터페이스를 이용해서 과속 단속 카메라에 교통사고 감지 및 신고 기능을 추가

조건
과속단속 카메라인 SpeedCam 클래스에 detect(), report() 개선
교통사고를 감지하는 AccidentDetector 클래스 신규 생성
신고 기능은 기존 작성된 videoReporter 클래스 활용
모든 클래스는 적절한 위치에 정의
 */

import chap_08.camera.SpeedCam;
import chap_08.detector.SpeedDetector;
import chap_08.reporter.VideoReporter;

public class Practice08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setSpeedDetector(new SpeedDetector());
        speedCam.setRepotable(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
