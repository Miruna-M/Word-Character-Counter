import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class WordCharCounter extends JFrame {
    private JTextArea textArea;
    private JLabel wordCounterLabel;
    private JLabel charCounterLabel;
    private JButton countButton;
    private JScrollPane scrollpane;

    public WordCharCounter() {
        setTitle("Word & Character Counter");
        setSize(300, 300);
        setLayout(new FlowLayout());

        textArea = new JTextArea(10, 120);
        textArea.setLineWrap(true);
       
        scrollpane = new JScrollPane(textArea);
        scrollpane.setBounds(25,90,725,350);
       
        wordCounterLabel = new JLabel("Words: 0");
        charCounterLabel = new JLabel("Characters: 0");
        countButton = new JButton("COUNT");

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                String[] words = text.split("\\s+");
                int wordCount = words.length;
                int charCount = text.length();
                wordCounterLabel.setText("Words: " + wordCount);
                charCounterLabel.setText("Characters: " + charCount);
            }
        });

        add(textArea);
        add(countButton);
        add(wordCounterLabel);
        add(charCounterLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WordCharCounter();
    }
}