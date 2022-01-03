package Java_Home_Work.HW_7.Window_Panel.control_panel;

import javax.swing.*;
import java.awt.*;

public class info_field extends JPanel {
        private String map_size = "Map: ";
        private String level_check = "Level: ";
        private String count_check = "Trap: ";

        private JLabel map;
        private JLabel level;
        private JLabel count;


        public info_field(){
            setLayout(new GridLayout(4,1));
            map = new JLabel(map_size);
            level = new JLabel(level_check);
            count = new JLabel(count_check);
            setBorder(BorderFactory.createLineBorder(Color.black));


            add(new JLabel("======Game Info======", SwingConstants.CENTER));
            add(map);
            add(level);
            add(count);
        }

}
