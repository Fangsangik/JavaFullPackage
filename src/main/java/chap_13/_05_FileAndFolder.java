package chap_13;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        //파일인지 폴더인지 구분
        //String folder = "." // 상대경로
        //String folder = "C:\\Users\\hwang\\IdeaProjects\\JavaGrammarFinal\\src\\main\\java\\chap_13"; = 절대경로
        String folder = "src/chap_13";
        File fileAndFolders = new File(folder);
        System.out.println("현재 폴더 경로: " + fileAndFolders.getAbsoluteFile());

        for (File file : fileAndFolders.listFiles()) { // fileAndFolders.listFiles() -> 모든 파일들 돌면서 처리
            if (file.isFile()){
                System.out.println("파일 :" + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("폴더 :" + file.getName());
            }
            System.out.println(file.getName());
        }
    }
}
