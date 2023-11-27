package Anastasiya;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyPanel extends JPanel{
    public MyPanel(){
        setBackground(Color.BLUE);
        setLayout(null);
        setBounds(10,7,365,150);
        setFocusable(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Main.getWspolrzedne().setText(String.format("%d, %d", e.getX(),e.getY()));

            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Main.getWspolrzedne().setText("");
                }
            }
        });
    }
}
