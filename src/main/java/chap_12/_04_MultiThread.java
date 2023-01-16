package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        //쓰레드가 여러개 인것
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(" 직원1 청소 시작 ");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(직원1)" + i + "번방 청소중");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("청소 끝");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println(" 직원2 청소 시작 ");
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("(직원2)" + i + "번방 청소중");
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
