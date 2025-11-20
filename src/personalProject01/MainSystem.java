package personalProject01;

import java.util.Scanner;
import java.util.ArrayList;

public class MainSystem {
    public static void main(String[] args) {
        ArrayList<Post> postBox = new ArrayList<>(); // Post 객체가 저장되는 통
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("명령어를 입력해 주세요 (write, list, exit) : ");
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                break;
            }
            switch (command) {
                case "write":
                    // 글 쓰기
                    System.out.print("제목: ");
                    String title = scanner.nextLine();
                    System.out.print("내용: ");
                    String content = scanner.nextLine();
                    System.out.print("작성자: ");
                    String author = scanner.nextLine();
                    // 내용을 바탕으로 Post 객체 생성.
                    Post newPost = new Post(title, content, author);
                    postBox.add(newPost); // 통에 저장하기

                    System.out.println(count + " 번 글이 저장되었습니다.");
                    count++;
                    break;
                case "list":
                    // 글 목록 출력.
                    System.out.println("====== 게시물 목록 ======");
                    int i = 1;
                    for (Post p : postBox) {
                        System.out.print(i + " 번 글 : ");
                        System.out.println(p); // -> to.String() 이 사용됨.
                        i++;
                    }
                    break;

                default:
                    System.out.println("해당하는 명령어가 없습니다.");
                    break;
            }
        }
    }
}
