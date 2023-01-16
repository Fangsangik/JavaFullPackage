package chap_10.converter;

@FunctionalInterface //이 인터페이스는 함수형 인터페이스로 사용할 것이다, 인터페이스 두개 작성시 Error 발생
public interface Convertible {
    void convert(int USD);
}
