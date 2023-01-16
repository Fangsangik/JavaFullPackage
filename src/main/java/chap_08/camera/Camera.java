package chap_08.camera;

// 추상 클레스에서는 추상 메소드가 필요
public abstract class Camera {

    public void takePicture(){
        System.out.println("사진을 촬용합니다");
    }

    public void recordVideo(){
        System.out.println("돋영상을 촬용합니다.");
    }

    // 추상 메소드
    // 메소드를 선언만 하고 ;으로 완료
    // 부모 클레스를 상속하는 자식 클레스에서 showMainFeature을 구현하는 메소드를 형성
    public abstract void showMainFeature();
}
