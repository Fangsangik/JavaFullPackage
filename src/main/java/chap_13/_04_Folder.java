package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더를 만드는 것

        if (folder.exists()){
            System.out.println("폴더가 존재합니다 :" + folder.getAbsolutePath());
        }

        System.out.println("--------------------------");

        folderName = "A/B/C";
        //File.separator => 각 Os에서 맞는 구분자를 적용해준다.
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다 :" + folder.getAbsolutePath());

        } else {
            System.out.println("폴더 생성 실패");
        }

        //폴더를 만들기 위해서는 폴더의 상위폴더가 있는 상태에서 지금 만들려는 폴더 하나는 만들 수 있는데
        //그 하위 폴더를 만들 수는 없다 = mkdir를 상용해서는 만들 수 없다.
    }
}
