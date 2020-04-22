/**
 * Created by Santiago on 8/25/17.
 */

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        StringBuilder option_list = new StringBuilder();
        option_list.append("1 => 학생 등록\n");
        option_list.append("2 => 학생 리스트\n");
        option_list.append("3 => 리스트에서 삭제\n");
        option_list.append("0 => 종료");
        /*System.out.println("********************************");
        System.out.println("Enter option");
        System.out.println("1 => Add student");
        System.out.println("2 => Show list");
        System.out.println("3 => Delete student");
        System.out.println("0 => Exit");*/
        String response = JOptionPane.showInputDialog(null, option_list.toString(), "Linked List", JOptionPane.INFORMATION_MESSAGE);
        if ((response != null) && (response.toString().length() > 0)) {
            try {
                Integer option = Integer.parseInt(response);
                while (option != 0) {
                    switch (option) {
                        case 0:
                            //JOptionPane.showMessageDialog(null, "Exit.", "Linked List", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case 1:
                            String id = JOptionPane.showInputDialog(null, "ID(학번)을 입력하세요.", "Add Student", JOptionPane.INFORMATION_MESSAGE);
                            String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.", "Add Student", JOptionPane.INFORMATION_MESSAGE);
                            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "나이를 입력하세요.", "Add Student", JOptionPane.INFORMATION_MESSAGE));
                            String program = JOptionPane.showInputDialog(null, "학과를 입력하세요.", "Add Student", JOptionPane.INFORMATION_MESSAGE);
                            Student student = new Student(id, name, age, program);
                            linkedList.insertAtTheEnd(student);
                            break;
                        case 2:
                            linkedList.showList();
                            break;

                        case 3:
                            String deleteId = JOptionPane.showInputDialog(null, "Enter Student ID to delete", "Delete Student", JOptionPane.INFORMATION_MESSAGE);
                            linkedList.deleteStudent(deleteId);
                            break;

                    }
                    option = Integer.parseInt(JOptionPane.showInputDialog(null, option_list.toString(), "Linked List", JOptionPane.INFORMATION_MESSAGE));
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Exit");
        }
    }
}
