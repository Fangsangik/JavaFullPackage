package chap_08;

import chap_07.BlackBoxRefurbish;
// 다른 패키지에 있는 BlackBoxRefurbish라는 클레스를 사용 하겠다.
// import chap_07.*; -> chap_07에 있는 모든 클레스를 갔다 쓰겠다.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelname = "까망이"; // public
        //b1.resolution = "FHD"; = default
        //b1.price = 200000; -> private
        //b1.color -> protected

    }
}
