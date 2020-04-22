/**
 * Changed by choiwj 2020.04.21
 */
import javax.swing.*;
public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void showList(){
        if(this.head == null){
            JOptionPane.showMessageDialog(null, "리스트에 학생이 존재하지 않습니다.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Node n = head;
            System.out.println("Student List");
            System.out.println("************");
            while(n!=null){
                //JOptionPane.showMessageDialog(null, "See the console for students list.", "Linked List", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("ID(학번): "+n.getStudent().getId());
                System.out.println("이름: "+n.getStudent().getName());
                System.out.println("나이: "+n.getStudent().getAge());
                System.out.println("학과: "+n.getStudent().getProgram());
                System.out.println("************");
                n = n.getLink();
            }
            System.out.println("\n\n");
        }
    }

    public void insertAtTheEnd(Student student){
        Node newStudent = new Node(student);
        if(this.head == null){
            head = newStudent;
        }else{
            Node n = head;
            while(n.getLink()!=null){
                n = n.getLink();
            }
            n.setLink(newStudent);
        }

    }

    public void deleteStudent(String id){
        if(this.head == null){
            JOptionPane.showMessageDialog(null, "The list is empty", "Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            Node n = head;
            Node anterior = head;
            if(head.getLink()==null){
                if(id.equals(head.getStudent().getId())){
                    head = null;
                }else{
                    JOptionPane.showMessageDialog(null, "The student does not exist in the list", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //Release memory
            }else{
                anterior = null;
                n = head;
                while(n.getLink()!=null){
                    if(id.equals(n.getStudent().getId())){
                        if(n==head){
                            this.head = n.getLink();
                            //Release memory
                        }else{
                            anterior.setLink(n.getLink());
                            //Release memory
                        }
                        break;
                    }
                    anterior = n;
                    n = n.getLink();
                }
                if(n==null){
                    JOptionPane.showMessageDialog(null, "The student does not exist", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
    }
}
