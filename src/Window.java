import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel statsPanel;
    private JLabel aliveLabel;
    private JLabel generationsLabel;



    public Window() {
        super("Game of Life");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        statsPanel = new JPanel();
        statsPanel.setName("Stats Panel");
        statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
        add(statsPanel, BorderLayout.PAGE_START);

        generationsLabel = new JLabel();
        generationsLabel.setName("GenerationLabel");
        generationsLabel.setText("Generation #0");
        statsPanel.add(generationsLabel);

        aliveLabel = new JLabel();
        aliveLabel.setName("AliveLabel");
        aliveLabel.setText("Alive: 0");
        statsPanel.add(aliveLabel);



        setVisible(true);
    }
}
