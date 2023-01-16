package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            //try Catch도 중첩 if문 처럼 내부에 들어갈 수 있다.
        }

        System.out.println("-------------");

        //close 선언하지 않고 자동으로 호출하기
        //try구문 내에서 사용할 어떤 리소스를 괄호 속에서 정의
        //자동으로 try catch 구문을 빠져 나올때 close를 호출
        //단 조건은 Autocloseable 이라는 인터페이스를 구현해주어야 한다.
        try (MyFileWriter writer2 = new MyFileWriter()) {
            //소괄호 내에서 객체를 선언
            writer2.write("빵이 먹고 싶어요");
        }catch (Exception e){
            e.printStackTrace();
        }

        //파일을 쓰기 위해서 사용하는 것 (try 내에서 사용 가능) & Autocloseable 이라는 인터페이스를 상속
        BufferedWriter bw = null;
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일 내용을 입력합니다");
        System.out.println("입력내용 :" + line);
    }
}
