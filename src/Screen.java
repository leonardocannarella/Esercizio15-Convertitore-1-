import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen
{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton converti€In$Button;
    private JButton converti$In€Button;
    private Convertitore c1 = new Convertitore();


    public Screen()
    {
        converti€In$Button.addActionListener(this::actionPerformed);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == converti€In$Button)
        {
            c1.setDenaro(Double.parseDouble(textField1.getText()));
            double ris = c1.convertiEUR_DOL();
            textField2.setText("Dollari convertiti: " + ris);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Convertitore");
        frame.setContentPane(new Screen().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}