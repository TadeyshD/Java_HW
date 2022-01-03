package Java_Home_Work.HW_7;

import Java_Home_Work.HW_7.Window_Panel.GamePanel;
import Java_Home_Work.HW_7.Window_Panel.InfoPanel;

import javax.swing.*;
import java.awt.*;
import java.io.ObjectInputStream;
import java.util.Set;

public class MainWindow extends JFrame {
    private int width_field = 1024;
    private int height_field = 768;
    private int position_w = 300;
    private int position_h = 200;
    private String Title = "Hello World";
    private InfoPanel infoPanel;
    private GamePanel mapPanel;

    private ActionContainer actionContainer;

    MainWindow(){
        setupWindow();
        mapPanel = new GamePanel();
        infoPanel = new InfoPanel(this);
        actionContainer = new ActionContainer(infoPanel);
        add(mapPanel);
        add(infoPanel, BorderLayout.EAST);
        setVisible(true);
    }

    private void setupWindow(){
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(width_field, height_field);
    setLocation(position_w, position_h);
    setTitle(Title);
    setResizable(false);
}

    public ActionContainer getActionContainer(){
        return actionContainer;
    }

}






