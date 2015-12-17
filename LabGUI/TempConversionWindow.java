import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener {
    private Container pane;
    private JLabel label;
    private JTextField temp;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(400,120);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	temp = new JTextField(100);
	c.fill = GridBagConstraints.BOTH;
	c.gridx = 0;
	c.gridy = 0;
	c.weightx = 0;
	c.gridwidth = 2;
	pane.add(temp, c);

	JButton celsius = new JButton("To Celsius");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 1;
	c.weightx = .5;
	c.gridwidth = 1;
	pane.add(celsius, c);
	celsius.addActionListener(this);
	celsius.setActionCommand("cel");

	JButton farenheit = new JButton("To Farenheit");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 1;
	c.weightx = .5;
	c.gridwidth = 1;
	pane.add(farenheit, c);
	farenheit.addActionListener(this);
	farenheit.setActionCommand("far");

	label = new JLabel(" ");
	c.fill = GridBagConstraints.BOTH;
	c.gridx = 0;
	c.gridy = 2;
	c.gridwidth = 2;
	c.ipadx = 30;
	pane.add(label, c);

    }

    public void actionPerformed(ActionEvent a) {
	String event = a.getActionCommand();
	
	if (event.equals("cel")) {
	    try {
		label.setText(String.valueOf(FtoC(Integer.parseInt(temp.getText()))));
	    } catch (NumberFormatException e) {
		label.setText("Lol no");
	    }
	}
	if (event.equals("far")) {
	    try {
		label.setText(String.valueOf(CtoF(Integer.parseInt(temp.getText()))));
	    } catch (NumberFormatException e) {
		label.setText("Lol no");
	    }
	}
    }

    public double FtoC(double t) {
	return ((t - 32) * 5) / 9;
    }

    public double CtoF(double t) {
	return ((t * 9) / 5) + 32;
    }

}
