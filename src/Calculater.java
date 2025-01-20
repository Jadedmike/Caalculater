import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculater {
    private JPanel Calculater;
    private JTextField TextDisplay;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton _Button;
    private JButton xButton1;
    private JButton xButton;
    private JButton button12;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button16;
    private JButton ACButton;
    private JButton button2;
    private JButton _Button1;
    private JButton button4;
    private JButton a00Button;

    double a, b, result;
    String op;


    public Calculater() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a8Button.getText());

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a3Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a00Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextDisplay.setText(TextDisplay.getText() + a0Button.getText());
            }
        });
        _Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (TextDisplay.getText().contains("."))
               {
                   double pm = Double.parseDouble(TextDisplay.getText());
                   pm = pm * -1;
                   TextDisplay.setText(String.valueOf(pm));

               }else
               {
                   long PM = Long.parseLong(TextDisplay.getText());
                   PM = PM * -1;
                   TextDisplay.setText(String.valueOf(PM));


               }
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!TextDisplay.getText().contains("."))
                {
                    TextDisplay.setText(TextDisplay.getText() + button16.getText());
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextDisplay.getText());
                op = "+";
                TextDisplay.setText("");

            }
        });
        _Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextDisplay.getText());
                op = "-";
                TextDisplay.setText("");

            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextDisplay.getText());
                op = "*";
                TextDisplay.setText("");

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextDisplay.getText());
                op = "/";
                TextDisplay.setText("");

            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(TextDisplay.getText().length() > 0)
                { StringBuilder strB = new StringBuilder(TextDisplay.getText());
                    strB.deleteCharAt(TextDisplay.getText().length() - 1);
                    backspace = strB.toString();
                    TextDisplay.setText(backspace);
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(TextDisplay.getText());


                if(op == "+")
                {
                    result = a + b;
                    if (result%1 !=0)
                    {TextDisplay.setText(String.valueOf(result));}
                    else {
                        TextDisplay.setText(String.valueOf((long) result));
                    }
                }
                else if(op == "-")
                {
                    result = a - b;
                    TextDisplay.setText(String.valueOf(result));
                }

                else if(op == "*")
                {
                    result = a * b;
                    TextDisplay.setText(String.valueOf(result));
                }
                else if(op == "/")
                {
                    result = a / b;
                    TextDisplay.setText(String.valueOf(result));
                }

            }
        });
    }


    public static void main(String[] args) {
        System.out.println("Welcome");
        JFrame frame = new JFrame("Calculater");
        frame.setContentPane(new Calculater().Calculater);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
