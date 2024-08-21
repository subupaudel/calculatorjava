import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char mathop;
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton mul;
    private JButton btn2;
    private JButton btn3;
    private JButton btn5;
    private JButton btn8;
    private JButton point;
    private JButton add;
    private JButton btn6;
    private JButton btn9;
    private JButton clear;
    private JButton sub;
    private JButton div;
    private JButton isequal;
    private JButton btn1;
    private JButton btn4;
    private JButton btn7;
    private JButton btn0;
    private void getOperator(String btnText){
        mathop = btnText.charAt(0);
        total1= total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }
    public JavaCalculator(){
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1Text = textDisplay.getText() + btn1.getText();
                textDisplay.setText(btn1Text);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2Text = textDisplay.getText() + btn2.getText();
                textDisplay.setText(btn2Text);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3Text = textDisplay.getText() + btn3.getText();
                textDisplay.setText(btn3Text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4Text = textDisplay.getText() + btn4.getText();
                textDisplay.setText(btn4Text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5Text = textDisplay.getText() + btn5.getText();
                textDisplay.setText(btn5Text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6Text = textDisplay.getText() + btn6.getText();
                textDisplay.setText(btn6Text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7Text = textDisplay.getText() + btn7.getText();
                textDisplay.setText(btn7Text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8Text = textDisplay.getText() + btn8.getText();
                textDisplay.setText(btn8Text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9Text = textDisplay.getText() + btn9.getText();
                textDisplay.setText(btn9Text);
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0Text = textDisplay.getText() + btn0.getText();
                textDisplay.setText(btn0Text);
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if(textDisplay.getText().contains(".")){
                    point.setEnabled(false);
                }
                else {
                    String pointText = textDisplay.getText() + point.getText();
                    textDisplay.setText(pointText);
                }
                point.setEnabled(true);
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = add.getText();
                getOperator(button_text);
            }
        });
        isequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathop){
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = sub.getText();
                getOperator(button_text);
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = div.getText();
                getOperator(button_text);
            }
        });
        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = mul.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
