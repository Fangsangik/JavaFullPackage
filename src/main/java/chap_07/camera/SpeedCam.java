package chap_07.camera;

//SpeedCam is a Camera (Is-A)
public class SpeedCam extends Camera{ // 자식 클레스

    public SpeedCam() {
        this.name = "과속 단속 카메라";
    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
    }

    public void checkSpeed(){
        // 속도롤 측정
        System.out.println("속도를 측정합니다");
    }

    //@Override -> 부모 클레스에 오버라이드 할 수 없다.
    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다");
    }

    @Override
    // annotation -> 컴파일러에게 이 메소드는 부모클레스에게 오버라이딩 하는 거야
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도측정, 번호인식");

    }
}
