package Anastasiya;
import javax.swing.*;

public class Main extends JFrame{

    private JPanel contentPanel;
    private static JTextField wspolrzedne;
    public static JTextField getWspolrzedne(){
        return wspolrzedne;
    }

    public Main(){
        super("Zadanie 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        contentPanel.setLayout(null);

        wspolrzedne = new JTextField();
        wspolrzedne.setBounds(130,170,70,25);
        contentPanel.add(wspolrzedne);

        MyPanel panel = new MyPanel();
        contentPanel.add(panel);

        setContentPane(contentPanel);
        setSize(400,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    Main test = new Main();
                    test.setVisible(true);

                }catch (Exception e){
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}