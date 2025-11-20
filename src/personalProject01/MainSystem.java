package personalProject01;

import java.util.Scanner;
import java.util.ArrayList;

public class MainSystem {
    public static void main(String[] args) {
        ArrayList<Post> postBox = new ArrayList<>(); // Post 객체가 저장되는 통
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("명령어를 입력해 주세요 (write, list, exit, delete, update) : ");
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
                    Post newPost = new Post(count, title, content, author);
                    postBox.add(newPost); // 통에 저장하기

                    System.out.println(count + " 번 글이 저장되었습니다.");
                    count++;
                    break;
                case "list":
                    // 글 목록 출력.
                    System.out.println("====== 게시물 목록 ======");
                    for (Post p : postBox) {
                        System.out.println(p); // -> to.String() 이 사용됨.
                    }
                    break;
                case "delete":
                    System.out.print("몇 번글을 삭제하시고 싶으십니까? : ");
                    int targetId = Integer.parseInt(scanner.nextLine()); // nextInt 보다 훨씬 안전함, \n까지 통째로 가져오는 nextLine()을 사용했기 떄문에.
                    boolean isFound = false; // 찾았는지 확인하는 깃발

                    // 리스트를 처음부터 끝까지 뒤짐
                    for (int i = 0; i < postBox.size(); i++) {
                        Post p = postBox.get(i);

                        // 번호에 맞는 글 찾기
                        if (p.id == targetId) { // Post 클래스에 id 필드가 있어야 함
                            postBox.remove(i); // 찾으면 삭제해야함
                            System.out.println(targetId + "번 글이 삭제 되었습니다.");
                            isFound = true;
                            break; // 지웠으면 반복문 종료
                        }
                    }

                    if (!isFound) {
                        System.out.println("그런 번호의 글은 없습니다.");
                    }
                    break;
                case "update":
                    System.out.print("몇 번 글을 수정하시고 싶으십니까? : ");
                    int target = Integer.parseInt(scanner.nextLine());
                    boolean isUpdated = false;

                    for (Post p : postBox) {
                        if (p.id == target) {
                            System.out.print("새 제목: ");
                            String newTitle = scanner.nextLine();
                            System.out.print("새 내용: ");
                            String newContent = scanner.nextLine();
                            System.out.print("새 작성자: ");
                            String newAuthor = scanner.nextLine();

                            p.title = newTitle;
                            p.content = newContent;
                            p.author = newAuthor;

                            System.out.println(target + "번 글이 수정되었습니다.");
                            isUpdated = true;
                            break;
                        }
                    }
                    if (!isUpdated) {
                        System.out.println("그런 번호의 글은 없습니다.");
                    }
                    break;
                default:
                    System.out.println("해당하는 명령어가 존재하지 않습니다.");
                    break;
            }
        }
    }
}
