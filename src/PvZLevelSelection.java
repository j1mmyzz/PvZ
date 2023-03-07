import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PvZLevelSelection {
    private JFrame frame;
    private JPanel panel;
    private JLabel backgroundLabel;
    private JLabel titleLabel;
    private JLabel level1Label;
    private JButton backButton;

    public PvZLevelSelection() {
        // Create the panel and set its layout to null
        panel = new JPanel(null);
        panel.setBackground(Color.WHITE);

        // Set the path to the background image
        String backgroundPath = "src/Backgrounds/LevelSelectionBackground.jpg";
        ImageIcon background = new ImageIcon(backgroundPath);

        // Create the background label and add it to the panel
        backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, 800, 600);
        backgroundLabel.setOpaque(true);
        panel.add(backgroundLabel);

        // Create the title label and add it to the panel
        titleLabel = new JLabel("Select a Level", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setBounds(250, 50, 300, 100);
        panel.add(titleLabel);

        // Create the level 1 label and add it to the panel
        level1Label = new JLabel("Level 1", SwingConstants.CENTER);
        level1Label.setFont(new Font("Arial", Font.PLAIN, 24));
        level1Label.setForeground(Color.BLACK);
        level1Label.setBounds(325, 200, 150, 50);
        panel.add(level1Label);

        // Create the back button and add it to the panel
        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 24));
        backButton.setForeground(Color.BLACK);
        backButton.setBounds(325, 300, 150, 50);
        panel.add(backButton);

        // Add an action listener to the back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new PvZStartMenu();
            }
        });
    }
}

