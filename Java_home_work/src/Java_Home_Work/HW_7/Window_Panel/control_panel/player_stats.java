package Java_Home_Work.HW_7.Window_Panel.control_panel;

import javax.swing.*;
import java.awt.*;

public class player_stats extends JPanel {
    private String hp_check = "HP: ";
    private String mp_check = "MP: ";
    private String str_check = "Stretch: ";
    private String exp_check = "Experience: ";

    private JLabel hp;
    private JLabel mp;
    private JLabel str;
    private JLabel exp;


    public player_stats(){
        setLayout(new GridLayout(6,1));
        hp = new JLabel(hp_check);
        mp = new JLabel(mp_check);
        str = new JLabel(str_check);
        exp = new JLabel(exp_check);
        add(new JLabel("======Player Info======", SwingConstants.CENTER));
        add(hp);
        add(mp);
        add(str);
        add(exp);
        add(new JLabel("====================", SwingConstants.CENTER));
    }
}
