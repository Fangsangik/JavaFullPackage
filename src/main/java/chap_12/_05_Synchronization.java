package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        //동기화
        //어떤 쓰레드에서 들어와 메소드에서 작업 중이라면 다른 쓰레드는 작업중인 메소드에 진입 할 수 없도록 하는 것

        //+) 두개 쓰레드 두개 이상의 쓰레드에서 작업을 하다가 하나의 쓰레드가 잘못된다면, 다른 쓰레드는 정상적으로 돌아감

        Room room = new Room();

        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" 직원1 청소 시작 ");
                for (int i = 1; i <= 5; i ++) {
                    room.clean("직원 1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i==2){
                       throw new RuntimeException("런각");
                    } // 도중에 그만 둠
                }
                System.out.println("청소 끝");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println(" 직원2 청소 시작 ");
            for (int i = 1; i <= 5; i++){
                room.clean("직원 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("청소 끝");
        };

        // 두개 쓰레드를 만들어 생성자로 형성
        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}

/*
 직원2 청소 시작
 직원1 청소 시작
직원 2:1번방 청소 중
직원 1:1번방 청소 중
직원 1:3번방 청소 중
직원 2:2번방 청소 중
직원 2:5번방 청소 중
직원 2:6번방 청소 중
직원 1:4번방 청소 중
직원 2:7번방 청소 중
청소 끝
직원 1:8번방 청소 중
직원 1:10번방 청소 중
청소 끝

결과가 발생하는 이유는 2개 또는 2개 이상의 쓰레드에서 동시에 하나의 변수에 접근해서 발생하려고 했기에 문제가 발생
=> 동기화 필요
 */