package personalProject01;

public class Post {

    String title;
    String content;
    String author;

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " | " + content + " | " + author;
    }
}
