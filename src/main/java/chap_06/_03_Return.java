package chap_06;

public class _03_Return {
    //특정 호텔을 정보를 받는 프로그램

    //전화번호
    public static String getPhoneNumber (){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    //void -> 반환하는 형태가 없을 때 적어줌
    //호텔 전화번호라는 문자열 값을 반환
    //return 자리에 반환하려는 값 적어주면 된다.
    // 반환하려는 값과 static에 적혀 있는 값은 같은 자료형

    //호텔 주소
    public static String getAddress (){
        return "서울시 어딘가";
    }

    //호텔 엑티비티
    public static String getActivity(){
        return "볼링장 , 탁구장 , 노래방";
    }

    public static void main(String[] args) {
        //반환 값
       String contactNum = getPhoneNumber();
       //메소드를 호출 하고 나서 반환되는 값을 받아서 처리
        System.out.println("호텔 전화번호는 :" + contactNum);

        String address1 = getAddress();
        System.out.println("호텔 주소는 :" + address1);

        System.out.println("호텔 엑티비티 :" + getActivity());
    }
}
