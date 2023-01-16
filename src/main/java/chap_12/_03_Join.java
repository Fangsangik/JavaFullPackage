package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500);
            //join 이라는 메소드의 역할이 쓰레드의 역할이 끝날때까지 기다렸다가 다음 쓰레드로 넘어가게
            //도와주는 역할이다.
            //시간 정보를 추가해주게 되면 주어진 시간까지는 기다려 보는데 이시간이 지나도 쓰레드가 끝나지 않으면
            //다음 줄로 넘어가게 된다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("사장 청소 시작");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장)" + i + "번방 청소중");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //.sleep() => 위에 동작을 하고 나서 sleep을 만나게 되면 지정해준 시간 동안 잠깐 멈추는 것
        }

        System.out.println("청소 끝");
    }
}
