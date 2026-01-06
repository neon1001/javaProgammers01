package programmers.lv0;

public class P181938 {
    public int solution(int a, int b) {
        int answer = 0;
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);

        int result_1 = (int) Integer.parseInt(aString + bString);
        int result_2 = 2 * a * b;

        return Math.max(result_1, result_2);
    }
}
