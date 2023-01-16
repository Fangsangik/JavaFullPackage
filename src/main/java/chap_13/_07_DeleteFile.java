package chap_13;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일 삭제 성공 :" + file.getName());
            } else {
                System.out.println("파일 삭제 실패 :" + file.getName());
            }
        }

        File folder = new File("A"); // 삭제 실패인 이유 = 폴더 A에 B,C라는 폴더가 같이 있기 때문
        if (folder.exists()){
            if (folder.delete()) {
                System.out.println("폴더 삭제 성공 :" + folder.getAbsolutePath());
            } else {
                System.out.println("폴더 삭제 실패 :" + folder.getAbsolutePath());
            }
        }

       if (deleteFolder(folder)) {
           System.out.println("*폴더 삭제 성공 :" + folder.getAbsolutePath());
       } else {
           System.out.println("*폴더 삭제 실패 :" + folder.getAbsolutePath());
       }
    }

    //deleteFolder(A)
    //  deleteFolder(B)
    //      deleteFolder(C)
    //          C.delete()삭제
    //      B.delete()
    //A.delete()

    public static boolean deleteFolder (File folder) {
        if (folder.isDirectory()){
            for (File file:folder.listFiles()){
                deleteFolder(file);
                //전달된 폴더가 디렉토리인 경우 처리
            }
        }
        System.out.println("삭제 대상 :" + folder.getAbsolutePath());
        return folder.delete();
    }
}
