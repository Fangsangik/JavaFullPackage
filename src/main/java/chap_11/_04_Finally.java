package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        //예외처리를 한다고 해서 완전히 끝난게 아닐 수도 있다.
        //문제가 발생하건 아니건 무조건 수행되어야 할 문장을 실행시켜 주는 것 = finally

        try{
            System.out.println("택시의 문을 연다");
            throw new Exception("휴무 택시");
            //System.out.println("택시에 탄다");
        }catch (Exception e){
            System.out.println("!! 문제 발생 :" + e.getMessage());
        } finally {
            //try문 내 에서 정리하던 코드를 넣으면 된다.
            //DB 관련 작업에서 Connection을 열었거나, 파일을 여는 작업을 했을때 닫아주는 작업을 하거나
            //임시 파일을 만들었다면 여러동작을 하다가 잘못 발생하거나, 정상적 종료 되었을때 임시파일 삭제 작업
            System.out.println("택시의 문을 닫는다");
        }

        //try + catch(s)
        //try + catch(s) + finally
        //try + finally

        System.out.println("------------");

        try{
            System.out.println(3/0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
