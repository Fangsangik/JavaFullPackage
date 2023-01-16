package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

import javax.swing.*;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        // (클레스, 변수, 메소드 앞에 다 사용 가능)
        // 선언과 동시에 초기화를 하고, 값은 사용이 가능하나, 값 변경은 불가능

        // public class final
        // public final void
        // public > abstract > static > final > ....

        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }
}
