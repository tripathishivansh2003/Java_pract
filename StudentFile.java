import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentFile extends Frame implements ActionListener {
    TextField rollNo, name, marks;
    Button enter, done;
    FileWriter fw;

    StudentFile() {
        setLayout(new FlowLayout());
        
        add(new Label("Roll Number"));
        rollNo = new TextField(20);
        add(rollNo);
        
        add(new Label("Student Name"));
        name = new TextField(20);
        add(name);
        
        add(new Label("Marks"));
        marks = new TextField(20);
        add(marks);
        
        enter = new Button("Enter");
        enter.addActionListener(this);
        add(enter);
        
        done = new Button("Done");
        done.addActionListener(this);
        add(done);
        
        try {
            fw = new FileWriter("student.txt");
        } catch (IOException e) {
            System.out.println(e);
        }
        
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == enter) {
            try {
                fw.write(rollNo.getText() + "," + name.getText() + "," + marks.getText() + "\n");
                rollNo.setText("");
                name.setText("");
                marks.setText("");
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            try {
                fw.close();
                System.exit(0);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new StudentFile();
    }
}