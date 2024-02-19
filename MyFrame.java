import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.add(new MyPanel());
        this.setTitle("Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
    }
}
