package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 쓰레드를 만드는 방법이 상속 하는 방법이 있고, Runnable을 만드는 방법이 있다.
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start(); // CleanRunnable에 만들어진 동작을 thread에서 실행하게 된다.

        cleanByBoss();

    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장)" + i + "번방 청소중");
        }

        System.out.println("청소 끝");

    }
}

// CleanThread에서는 Thread를 상속, CleanRunnable은 Runnable이라는 인터페이스를 구현
// 상속의 경우 오직 단일 상속만 가능 하지만 인터페이스의 경우 다중 상속의 개념이 가능 하다.