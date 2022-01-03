package Java_Home_Work.HW_7.Window_Panel;

import Java_Home_Work.HW_7.MainWindow;
import Java_Home_Work.HW_7.Window_Panel.control_panel.control_button;
import Java_Home_Work.HW_7.Window_Panel.control_panel.info_field;
import Java_Home_Work.HW_7.Window_Panel.control_panel.move_button;
import Java_Home_Work.HW_7.Window_Panel.control_panel.player_stats;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel { //info
        private int panelWidth = 200;

        private control_button control_button;
        private info_field info_field;
        private move_button move_button;
        private player_stats player_stats;

        private JTextArea log; // для текста
        private JScrollPane scroll; // для скрола

        public InfoPanel(MainWindow mainWindow){
        test_panel();
        create();
        logs();

        add(control_button);
        add(info_field);
        add(player_stats);
        add(move_button);
        add(scroll);

    }
        private void test_panel(){
            setPreferredSize(new Dimension(panelWidth, MainWindow.HEIGHT)); //задаём полуфиксированную ширину для инфопанели
            setBackground(Color.darkGray);
            setLayout(new GridLayout(5, 1)); //размер в столбцах. сейча инфопанель вмещает пять элементов в один ряд.
    }
    private void create(){
        control_button = new control_button();
        info_field = new info_field();
        move_button = new move_button();
        player_stats = new player_stats();
    }
    private void logs(){
            log = new JTextArea();
            log.setEditable(false); //запрещаем редактирование поля
            log.setLineWrap(true); //разрешаем перенос строки
            scroll = new JScrollPane(log); //создаём скролл и передаём ему лог, чтобы работало в нём.
    }
    public void recordLog(String msg){
            log.append(msg + "\n"); //добавляет указанный текст в конец документа.
    }
}
