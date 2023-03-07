import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class PvZStartMenu extends JPanel implements ActionListener {
    private JButton startButton, quitButton;
    private Clip music;

    public PvZStartMenu() {
        //music
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/Music/Plants vs Zombies Soundtrack. [Main Menu].wav"));
            music = AudioSystem.getClip();
            music.open(audioInputStream);
            music.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception ex) {
            System.out.println("Error loading music file: " + ex.getMessage());
        }

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(700, 450));

        // Create a JLabel with the background image
        JLabel background = new JLabel(new ImageIcon("src/Backgrounds/Plants-vs-Zombies-Game-of-the-year-edition-free-origin.jpeg"));
        add(background, BorderLayout.CENTER);

        // Create a panel for the buttons and add it to the south of the frame
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        startButton = new JButton("Start Game");
        startButton.addActionListener(this);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Take the user to the level selection screen
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(PvZStartMenu.this);
                frame.getContentPane().removeAll();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                music.close();
                //new PvZLevelSelection();

            }
        });
        buttonPanel.add(startButton);

        quitButton = new JButton("Quit Game");
        quitButton.addActionListener(this);
        buttonPanel.add(quitButton);

        add(buttonPanel, BorderLayout.SOUTH);



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