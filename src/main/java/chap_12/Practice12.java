package chap_12;

/*
상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성해라

조건
상품 A와 상품 B는 각각 5개씩 준비
상품 A와 상품 B는 두 사람이 독립적으로 준비
상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장시작
 포장 필요한 세트 상품은 총 5개
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println("A상품 준비 완료");
        };
        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println("B 상품 준비 완료");
        };

        Runnable runnableSet = () -> {
            System.out.println("세트 상품 포장 시작");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            }
            System.out.println("세트 상품 포장 완료");
        };


        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        Thread threadC = new Thread(runnableSet);
        threadA.start();
        threadB.start();
        threadC.start();

        //threadA.isAlive == join
        //쓰레드가 돌고 있다면 ture / 아니면 False
        //while (threadA.isAlive() || threadB.isAlive()){
        //
        //} => 쓰레드 A 또는 B가 끝나야만 다음 동작으로 넘어간다

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
