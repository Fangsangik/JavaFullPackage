package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스
        // 쓰레드
        //cleanMySelf();

        // 1 3 5 7 9
        // 2 4 6 8 10
        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); // 직원이 청소

        //동시에 일을 하게끔 하려고 했지만, 쓰레드는 동시에 사용하려고 할때 메소드를 직접 호출 하면 안된다.
        //직접 호출 하게 되면 run 메소드를 실행하게 되는 것 뿐이고, 런이 아닌 스타트라는 메소드를 실행

        cleanThread.start();
        //start를 하게 되면 이 과정에서 쓰레드를 만들어서 거기에서 cleanThread 내의 런 메소드 작업이 돌아간다.

        cleanByBoss();// 사장이 청소
        //메인 쓰레드 내에서 작업을 하게 된다.
    }

    public static void cleanMySelf() {
        System.out.println("혼자서 청소 시작");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자)" + i + "번방 청소중");
        }
        System.out.println("청소 끝");
    }



        public static void cleanByBoss() {
            System.out.println("사장 청소 시작");
            for (int i = 1; i <= 10; i+=2) {
                System.out.println("(사장)" + i + "번방 청소중");
            }

            System.out.println("청소 끝");
        }
    }

