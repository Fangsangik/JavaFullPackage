package chap_07;

public class BlackBox {
    // 인스턴스 변수 (서로 다른 객체에서 서로 다른 값을 갖는 것)
    // 블랙박스라는 클레스는 4개의 인스턴스 변수를 갖는다.
    // 서로다른 인스턴스가 생성되었을 때 이 변수들은 각각 블랙박스 클래스로 부터
    //  만들어진 객체들 마다, 서로 다른 값을 갖을 수 있다.
    String modelname;
    String resolution;
    int price;
    String color;
    int serialNumber;


    // static을 붙이게 되면 = 클레스 변수
    // static을 붙이게 되면 클레스가 붙는 모든 객체에 동일하게 적용
    // 클레스 변수일 경우 -> 클레스명.변수이름
    static boolean canAutoReport = false;
    static int counter = 0; // 시리얼 번호를 생성해주는 역할(0에서 부터 연산을 통해 증가)

    // 생성자 만드는 법
    // 클레스 명 () {}
    /*
     생성자는 객체가 만들어 질때 자동으로 만들어 지는 부분
     어떤 기본 적인 동작이 되어야 한다면 생성자에 명시
     객체가 생성됨가 동시에 전달하는 값으로 초기화 하고자 할때 생성자 활용
     생성자 간에 서로 호출 -> this();
     */

    BlackBox(){
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다:" + this.serialNumber);
    }

    BlackBox(String modelname, String resolution, int price, String color){
//        this(); // b2에 serialNumber 기능 추가 = (기본 생성자 호출)
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelname = modelname;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;

    }

    // 메소드 정의
    // 클레스 내에서 어떤 기능을 정의 & 기능을 객체가 사용 할 수 있음
    // 전달값과 반환값 없는 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        } else {
            System.out.println("자동 신고 기능이 지원 되지 않습니다");
        }

    }

    // 전달 값은 있고 반환 값은 없는 메소드
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은" + capacity + "GB 입니다");
    }

    // 전달 값 반환 값 있는 메소드
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10; // 타입을 알 수 없을 때
    }

    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDataTime) {
            System.out.println("영상에 날짜 정보가 표기됩니다");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표기됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 표기 됩니다.");
    }

    //+) 매개변수, 파라미터 타입이 다르면 오버로딩이 가능
    // 비슷한 동작을 서로 다른 코드로 작성을 하게 된다면 수정을 둘다 해야 한다
    void record() {
        record(true, true, 5);
        // 위에 record문의 동작을 갖고 결과를 출력 할 수 있다.
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        //modelName = "test";
        canAutoReport = false;
        // static으로 선언한 클레스 변수는 static 메소드에서 바로 사용 가능
        // 인스턴스 변수는 객체가 만들어 져야 만들어지는 인스턴스 변수
        // 직접 접근이 불가 하다.
    }

    void appendModelName(String modelname) {
        // 인스턴스 변수와 파라미터 이름이 동일할때
        // this. 을 붙여주면 클레스의 인스턴스 변수에 직접 접근이 가능
        // this.modelname -> 클레스 변수의 인스턴스를 의미
        // modelname -> 파라미터로 전달 받은 모델 네임이 된다.
        this.modelname += modelname;

    }

    //Getter (값을 가져오는 메소드) & Setter (값을 설정하는 메소드)
    String getModelname() {
        return modelname;
    }

    void setModelname(String modelname) {
        this.modelname = modelname;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if (price < 100000){
            this.price = 100000;
        }else {
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color=color;
    }
}
