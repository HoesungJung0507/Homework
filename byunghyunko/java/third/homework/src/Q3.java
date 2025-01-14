public class Q3 {
    public static void main(String[] args) {
        //3. 3. 1, 1, 1, 2, 3, 4, 6, 9, 13, 19, 28, 41, 60, 88, 129....
        //이와 같은 숫자의 규칙을 찾아 25번쨰 항을 구하도록 프로그램 해보자

        int first = 1;
        int second = 1;
        int third = 1;
        int result = 0, i;

        final int START = 3;
        final int END = 20;

        // 컴퓨터에서 배열의 시작이 0이기 때문에
        // 반복 시작을 0을 기준으로 맞춰주는 것이 좋습니다.
        // 그래서 START 2는 결국 3번째
        for (i = START; i < END; i++) {
            result = first + third;
            first = second;
            second = third;
            third = result;

            // 전체 뿌리기
            System.out.printf("%d번째 항 %d\n", i + 1, result);
        }

        System.out.printf("%d번째 항 %d\n", i, result);
    }
}
