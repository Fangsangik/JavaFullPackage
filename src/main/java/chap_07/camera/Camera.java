package chap_07.camera;

public class Camera { // 부모 클레스
    public String name;


    public Camera() {
        this("카메라");
       // this.name = "카메라";
    } // 생성자

    protected Camera(String name){
        this.name = name;
    }
    // 같은 패키지, 다른 패키지의 경우 자식 클래스에서 접근 가능

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name + ": 사진을 촬영 합니다");
    }

    public void recordVideo(){
        // 동영상 촬영
        System.out.println(this.name + ": 동영상을 녹화 합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 사진촬영, 동영상 녹화");
    }
}
