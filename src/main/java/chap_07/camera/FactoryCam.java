package chap_07.camera;

//FactoryCam is a Camera (Is-A)
public class FactoryCam extends Camera {

    public FactoryCam() {
      //  this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    } //메소드를 새롭게 재정의

}
