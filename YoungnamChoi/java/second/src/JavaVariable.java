public class JavaVariable {
    public static void main(String[] args) {
        //java 에서 변수를 만드는 방법
        //2.변수 이름을 작성한다.
        // 3,필요하다면 =3 등을 통해서 값을 할당한다.(있어도 그만 없어도 그만)

        //데이터 타입이란?
        //정수형 int, 실수형 float, double
        //float는 4 byite, duble 8비트

        //bit 개념은?
        //컴퓨터에서 가장 자은 저장 단위로  0혹은 1을 저장할수 있으
        //1byte -8bit

        //1bit는 몇개의 숫자를 표현 할 수 있을까?
        //0,1 2대 표현

        //2bit
        //00, 01, 10, 11   -4개

        //3bit?
        //000, 001, 010, 011, 100, 101, 111 -8ro

        //4bit sms 16개

        //5bit ... 32bit(4byte)
        //2^32 = 42억 9천만

        //큰손들은 기본이 100억 단위로 움직이는데
        //뱅킹솔루션이 42억 9천만이 제한이다??
        //말도 안되니까 BigInteger
        //매우 큰 숫자를 처리 할 수 있는 별도의 데이터 타입도 존재

        //데이터 타입에 숫자 제한이 걸리는 이유는 결국 비트 시트템 때문이다.


        int num;

        num =3;

        // ln이 들어있으면 자연로그 ln이 아니고 자동 엔터(개행)
        // f가 들어가 있으면 포맷 형식을 지정할 수 있음 , 포맷 == 양식
        //%d -정수출력
        //%lf - float, double 소수점 출력
        //%s - 문자열
        //문자열은 반드시 쌍따옴표로 감싸줘야함
        // ex) "test" 는 문자열이 아님
        //     "test he hi hello dfjsk " 는 문자열임

        //\n은 개행 문자로 엔터와 같은 역할을 한다.

        System.out.println("숫자 = " + num); // ln이 들어있으면 자연로그 ln이 아니고 자동 엔터(개행)
        System.out.printf("포맷 지정 숫자 = %d\n", num); // f가 들어가 있으면 포맷 형식을 지정할 수 있음 , 포맷 == 양식

    }
}
//프로젝트 생성하는 방법
//git에 PR넣기
// git 작업시 주의할 사항들 정리해보기
//기타복습