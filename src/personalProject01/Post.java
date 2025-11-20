package personalProject01;

public class Post {
    int id;
    String title;
    String content;
    String author;

    public Post(int count, String title, String content, String author) {
        this.id = count;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + content + " | " + author;
    }
}
