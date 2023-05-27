import javax.swing.*;

public class test {
    public static void main(String[] args){
        new test();
    }

    public test() {
    int n = JOptionPane.showOptionDialog(null, "test", "Test", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
    System.out.println(n);
    }
}
