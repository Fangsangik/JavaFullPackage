package chap_07.camera;

public final class ActionCam extends Camera{
    // 이 클레스 자체를 상속 하지 못하게 된다
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; // 생성자를 통한 초기화
    }

    public final String lens; // = "광각렌즈" -> 직접 초기화
    // final로 정의 하면 어디에서도 lens 값은 변경 불가

    public final void makeVideo(){ // makeVideo는 자식 클레스 에서는 overriding 불가능
        System.out.println(this.name + " : " + this.lens + " 로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
