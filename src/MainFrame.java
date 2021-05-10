import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
    // Константы, задающие размер окна приложения, если оно
    // не распахнуто на весь экран
    private static final int WIDTH = 700;
    private static final int HEIGHT = 500;

    private JMenuItem pauseMenuItem;
    private JMenuItem pause2MenuItem;
    private JMenuItem resumeMenuItem;

    // Поле, по которому прыгают мячи
    private Field field = new Field();
    
    public static void main(String[] args) {
        // Создать и сделать видимым главное окно приложения
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}