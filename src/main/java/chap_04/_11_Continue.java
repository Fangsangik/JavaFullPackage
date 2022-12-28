package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // continue

        // 치킨 주문 손님 중 노쇼 손님이 있다고 가정

        // 1.For
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 0; i <50 ; i++) {
            System.out.println(i + "번 손님 치킨 나왔습니다");

            //손님이 없다면? (noShow)
            if (i==noShow){
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 넘어갑니다.");
                continue; // 여기 이하에 있는 모든 코드는 건너 뛰고 바로 다음 증감으로 넘어간다.
            }

            sold ++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소신되었습니다");
                break;
            }
        }
        System.out.println("영업을 종료합니다");

        System.out.println("----------");

        int index = 1;
        sold = 0;
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다");

            //손님이 없다면 (noShow)
            if (index == noShow){
                System.out.println(index + "번 손님 다음 번호로 넘어가겠습니다");
                index ++;
                continue; //그냥 바로 넘어가서 증감 확인 없이 위에 조건만 확인 하고 반복을 할지 말지 결정
            }

            sold++;
            if (sold == max){
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
