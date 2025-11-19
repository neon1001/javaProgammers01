package programmers.lv0;

public class ChangeListToString {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        return answer;
    }
}
