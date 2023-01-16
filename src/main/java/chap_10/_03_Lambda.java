package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        //람다식 (간결한 형태의 코드)
        // (전달값1, 전달값2, ....) -> {코드}
        //람다식은 접근 제어자 필요 없다. (public, 이름 필요 없다)
        //남는 것은 중괄호 부분 내용 + "->" 추가

    }

//    public void print(){
//        String s= "test";
//        System.out.println(s);
//    }


//     () -> {
//        String s= "test";
//        System.out.println(s);
//    }

//    public void print (String s){
//        System.out.println(s);
//    }

    //문장이 하나 있을때, 중괄호, 세미콜론 삭제 가능 , () 생략 가능
    //전달 값이 String 이라는 것을 compiler가 알 수 있기 때문에 String 또한 생략 가능
    //s-> System.out.println(s)

//    public int add(int x, int y){
//        return x + y;
//    }

    //return이 포함되는 경우에는 중괄호를 삭제 하지 못한다.
    //return을 지우면 중괄호 삭제 가능 => x + y 값 반환
    //(x,y) ->  x + y;


}
