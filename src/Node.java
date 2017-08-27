/**
 * Created by Santiago on 8/25/17.
 */
public class Node {
    private Student student;
    private Node link;

    public Node(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
