package Java_Home_Work.HW_7.Window_Panel.control_panel;

import javax.swing.*;
import java.awt.*;

public class move_button extends JPanel {
    private JButton up_button;
    private JButton left_button;
    private JButton right_button;
    private JButton down_button;

public move_button(){
    setLayout(new GridLayout(2,3));
    up_button = new JButton("🢁");
    left_button = new JButton("🢀");
    right_button = new JButton("🢂");
    down_button = new JButton("🢃");

    add(new JPanel());
    add(up_button);
    add(new JPanel());
    add(left_button);
    add(down_button);
    add(right_button);

}

}
