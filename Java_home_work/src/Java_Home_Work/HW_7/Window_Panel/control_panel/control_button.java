package Java_Home_Work.HW_7.Window_Panel.control_panel;

import javax.swing.*;
import java.awt.*;

public class control_button extends JPanel {
    private JButton startGame;
    private JButton exitGame;

    public control_button(){
        setLayout(new GridLayout(3, 1));
        startGame = new JButton("Start Game");
        exitGame = new JButton("Exit Game");

        add(new JLabel("===new Game control===", SwingConstants.CENTER));
        add(startGame);
        add(exitGame);
    }
}
