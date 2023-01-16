package chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader -> 파일에서 내용을 읽어 올때
        // BufferedWriter -> 파일 내용을 쓸 때

        //파일 쓰기
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))){ //append 뒤에 문장을 추가 할 것인지
//            bw.write("이제 거의 끝이 보여요");
//            //bw.write("1. 이제 거의 끝이 보여요");
//            bw.newLine();
//            bw.write("끄읕");
//            //bw.write("2 .끄읕"); 원래 있던 문장 덮어쓰기 됨
//            bw.newLine();
//            bw.write("쫌만 더 힘내요");
//            bw.newLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line; // 한줄 식 불러옴
            while ((line= br.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
