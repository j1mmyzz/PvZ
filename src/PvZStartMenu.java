import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartMenu extends JPanel implements ActionListener {
    private JButton startButton, quitButton;

    public StartMenu() {
        setLayout(new GridLayout(2, 1));
        setPreferredSize(new Dimension(600, 500));

        JLabel title = new JLabel("Plants vs Zombies");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setHorizontalAlignment(JLabel.CENTER);
        add(title);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        buttonPanel.add(startButton);

        quitButton = new JButton("Quit Game");
        quitButton.addActionListener(this);
        buttonPanel.add(quitButton);

        add(buttonPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            // Start the game
            // Insert code to start the game here
        } else if (e.getSource() == quitButton) {
            // Quit the game
            System.exit(0);
        }
    }

}
