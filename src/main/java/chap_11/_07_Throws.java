package chap_11;


import java.io.FileWriter;
import java.io.IOException;


public class _07_Throws {
    //메소드를 호출한 쪽으로 예외 처리를 미루려면 throws를 활용
    public static void main(String[] args) {
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할께요");
        }
    }
    //writeFile 내에서 어떤 동작을 처리 했는데, 어떤 동작을 하다가 내부적으로 문제가 발생
    //내부적으로 자체처리 하는 것이 아닌, 발생 할 수 있는 예외를 던지는 것
    //writeFile 메소드를 호출한 메인 메소드에서 예외처리를 해주어야 한다.


    public static void writeFile() throws IOException{
//        try {
//            FileWriter fileWriter = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패 했어요");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요");


        FileWriter fileWriter = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패 했어요");
    }
}

