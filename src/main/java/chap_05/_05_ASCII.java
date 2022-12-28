package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드

        char c = 'A';
        System.out.println(c);
        System.out.println((int) c); //A = 65

        c = 'B';
        System.out.println(c);
        System.out.println((int) c); //B = 66

        c = 'a';
        System.out.println(c);
        System.out.println((int) c); //a = 97

        c = '0';
        System.out.println(c);
        System.out.println((int) c); //0 = 48

        /*
        알파벳 대문자 A는 65 부터, 소문자 a는 97, 숫자 0은 48 부터 시작
         */

        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + "");
            }
            System.out.println();
        }
    }
}