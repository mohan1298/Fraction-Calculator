
import java.awt.*;								

import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.*;

public class FractionCalculator extends JFrame implements ActionListener {					//Fraction calculator class
		
	JTextField textfield;
	
	int k = 1, x = 0, y = 0, z = 0,exception=0;
	
	double n;
	
	Fraction a =new Fraction(); 															//creating fraction objects
	Fraction b=new Fraction();
	Fraction temp=new Fraction();
	Fraction res=new Fraction();
	Fraction m1 = new Fraction();
	
	char ch;
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp,
	fac, plus, min, div, log, rec, mul, eq, addSub, dot, mr, mc, mp,
	mm, sqrt, sin, cos, tan,num,den;

	Container cont;
	JPanel textPanel, buttonpanel;



	FractionCalculator() { 																	// FractionCaculator constructer
		cont = getContentPane();
		cont.setLayout(new BorderLayout());									// setting Layout
		JPanel textpanel = new JPanel();									// creating Panel
		textfield = new JTextField(25);
		textfield.setHorizontalAlignment(SwingConstants.RIGHT);				// Alignment of TextFeild
		textfield.addKeyListener(new KeyAdapter() {							// Event handler for TextFeild
			public void keyTyped(KeyEvent keyevent) {
				char c = keyevent.getKeyChar();
				if (c >= '0' && c <= '9') {
				} else {
					keyevent.consume();
				}
			}
		});
	
	
	textpanel.add(textfield);												// Adding TextFeild to Panel
	buttonpanel = new JPanel();												// creating new Button Panel			
	buttonpanel.setLayout(new GridLayout(8, 4, 2, 2));						// setting layout to GridLayout
	boolean t = true;	
	mr = new JButton("MR");													// Creating new Buttons 
	buttonpanel.add(mr);													// Adding Button to Button Panel
	mr.addActionListener(this);												// Handling Event by Event Handlers (ActionListener)
	
	// In the same way creat required buttons
	
	mc = new JButton("MC");
	buttonpanel.add(mc);
	mc.addActionListener(this);

	mp = new JButton("M+");
	buttonpanel.add(mp);
	mp.addActionListener(this);

	mm = new JButton("M-");
	buttonpanel.add(mm);
	mm.addActionListener(this);

	b1 = new JButton("1");
	buttonpanel.add(b1);
	b1.addActionListener(this);
	b2 = new JButton("2");
	buttonpanel.add(b2);
	b2.addActionListener(this);
	b3 = new JButton("3");
	buttonpanel.add(b3);
	b3.addActionListener(this);

	b4 = new JButton("4");
	buttonpanel.add(b4);
	b4.addActionListener(this);
	b5 = new JButton("5");
	buttonpanel.add(b5);
	b5.addActionListener(this);
	b6 = new JButton("6");
	buttonpanel.add(b6);
	b6.addActionListener(this);

	b7 = new JButton("7");
	buttonpanel.add(b7);
	b7.addActionListener(this);
	b8 = new JButton("8");
	buttonpanel.add(b8);
	b8.addActionListener(this);
	b9 = new JButton("9");
	buttonpanel.add(b9);
	b9.addActionListener(this);

	zero = new JButton("0");
	buttonpanel.add(zero);
	zero.addActionListener(this);

	plus = new JButton("+");
	buttonpanel.add(plus);
	plus.addActionListener(this);

	min = new JButton("-");
	buttonpanel.add(min);
	min.addActionListener(this);

	mul = new JButton("*");
	buttonpanel.add(mul);
	mul.addActionListener(this);

	div = new JButton("/");
	div.addActionListener(this);
	buttonpanel.add(div);

	addSub = new JButton("+/-");
	buttonpanel.add(addSub);
	addSub.addActionListener(this);

	dot = new JButton(".");
	buttonpanel.add(dot);
	dot.addActionListener(this);

	eq = new JButton("=");
	buttonpanel.add(eq);
	eq.addActionListener(this);

	rec = new JButton("1/x");
	buttonpanel.add(rec);
	rec.addActionListener(this);
	sqrt = new JButton("Sqrt");
	buttonpanel.add(sqrt);
	sqrt.addActionListener(this);
	log = new JButton("log");
	buttonpanel.add(log);
	log.addActionListener(this);

	sin = new JButton("SIN");
	buttonpanel.add(sin);
	sin.addActionListener(this);
	cos = new JButton("COS");
	buttonpanel.add(cos);
	cos.addActionListener(this);
	tan = new JButton("TAN");
	buttonpanel.add(tan);
	tan.addActionListener(this);
	pow2 = new JButton("x^2");
	buttonpanel.add(pow2);
	pow2.addActionListener(this);
	pow3 = new JButton("x^3");
	buttonpanel.add(pow3);
	pow3.addActionListener(this);
	exp = new JButton("Exp");
	exp.addActionListener(this);
	buttonpanel.add(exp);
	//fac = new JButton("n!");
	//fac.addActionListener(this);
	//buttonpanel.add(fac);
	
	/*num = new JButton("ENTER");
	num.addActionListener(this);
	buttonpanel.add(num);*/
	
	den = new JButton("|");
	den.addActionListener(this);
	buttonpanel.add(den);

	clr = new JButton("AC");
	buttonpanel.add(clr);
	clr.addActionListener(this);
	cont.add("Center", buttonpanel);						// Adding Button Panel to Frame
	cont.add("North", textpanel);							// Adding TextFeild to Frame
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
	}														//end of constructer

	  // Creating Action Listener which implements actionperformed method  
public void actionPerformed(ActionEvent e) {			  // Action Listener for Button 1
	String s = e.getActionCommand();
	if (s.equals("1")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "1");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "1");
			z = 0;
		}
	}
	if (s.equals("2")) {									// Action Listener for Button 2
		if (z == 0) {
			textfield.setText(textfield.getText() + "2");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "2");
			z = 0;
		}
	}
	if (s.equals("3")) {									// ActionListener for Button 3
		if (z == 0) {
			textfield.setText(textfield.getText() + "3");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "3");
			z = 0;
		}
	}
	if (s.equals("4")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "4");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "4");
			z = 0;
		}
	}
	if (s.equals("5")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "5");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "5");
			z = 0;
		}
	}
	if (s.equals("6")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "6");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "6");
			z = 0;
		}
	}
	if (s.equals("7")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "7");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "7");
			z = 0;
		}
	}
	if (s.equals("8")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "8");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "8");
			z = 0;
		}
	}
	if (s.equals("9")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "9");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "9");
			z = 0;
		}
	}
	if (s.equals("0")) {
		if (z == 0) {
			textfield.setText(textfield.getText() + "0");
		} else {
			textfield.setText("");
			textfield.setText(textfield.getText() + "0");
			z = 0;
		}
	}
	
	/*if (s.equals("ENTER")) {
		if (textfield.getText().equals("")) {
			textfield.setText("");
			
		} else {
			//temp.setNumerator(Integer.parseInt(textfield.getText()));
			toFraction(textfield.getText());
			//txtfld.setText("");
			//txtfld.setText(temp.getNumerator()+"|"+temp.getDenominator());
			//f1.setDenominator(Integer.parseInt(txtfld.getText()));
		}
	}*/
	
	if (s.equals("|")) {									// ActionListener for | Button used as an 'bar' for separatin numerator and denominator 
		if (textfield.getText().equals("")) {
			textfield.setText("");
			
		} else {
			//temp.setDenominator(Integer.parseInt(txtfld.getText()));
			//txtfld.setText(temp.getNumerator()+"|"+temp.getDenominator());
			//f1.setDenominator(Integer.parseInt(txtfld.getText()));
			textfield.setText(textfield.getText()+"|");
		}
	}
	
	if (s.equals("AC")) {
		textfield.setText("");
		x = 0;
		y = 0;
		z = 0;
		exception=0;
	}
	
	if (s.equals("log")) {														// Action Listener for LOG Button
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = temp.getNumerator()/temp.getDenominator();
			//if(a>1)
			//{
				n=Math.log(n);
				textfield.setText("");
				textfield.setText(textfield.getText() + n);
			}
			//else
			//{
				//txtfld.setText("Math Error");
			//}
			
		}
	}
	
	if (s.equals("COS")) {											// ActionListener for cos Button
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = Math.cos(temp.getNumerator()/temp.getDenominator());
			textfield.setText("");
			textfield.setText(textfield.getText() + n);
			}
		}
	}
	
	if (s.equals("SIN")) {									// ActionListener for SIN Button	
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = Math.sin(temp.getNumerator()/temp.getDenominator());
			textfield.setText("");
			textfield.setText(textfield.getText() + n);
			}
		}
	}
	
	if (s.equals("TAN")) {								// ActionListener for TAN Button
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = Math.tan(temp.getNumerator()/temp.getDenominator());
			textfield.setText("");
			textfield.setText(textfield.getText() + n);
			}
		}
	}
	
	if (s.equals("Sqrt")) {							// ActionListener for Sqrt
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = Math.sqrt(temp.getNumerator()/temp.getDenominator());
			textfield.setText("");
			textfield.setText(textfield.getText() + n);
			}
		}
	}
	
	if (s.equals("1/x")) {							// ActionListener for Button '1\x'
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			res = temp.inverse();			
			textfield.setText(res.getNumerator()+"|"+res.getDenominator());
			}
		}
	}
	
	if (s.equals("x^2")) {							// ActionListener for Button x^2 
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			temp.setNumerator((int) Math.pow(temp.getNumerator(),2));
			try
			{
				temp.setDenominator((int) Math.pow(temp.getDenominator(),2));
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			textfield.setText("");
			textfield.setText(temp.getNumerator()+"|"+temp.getDenominator());
			}
		}
	}
	
	if (s.equals("x^3")) {						// ActionListener for Button x^3 
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			res.setNumerator((int) Math.pow(temp.getNumerator(),3));
			try
			{
				res.setDenominator((int) Math.pow(temp.getDenominator(),3));
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//result.setDenominator((int) Math.pow(temp.getDenominator(),3));
			textfield.setText("");
			textfield.setText(res.getNumerator()+"|"+res.getDenominator());
			}
		}
	}
	
	if (s.equals("Exp")) {								// ActionListener for Button Exp 
		if (textfield.getText().equals("")) {
			textfield.setText("");
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			n = Math.exp(temp.getNumerator()/temp.getDenominator());
			textfield.setText("");
			textfield.setText(textfield.getText() + n);
			}
		}
	}
	
	if (s.equals("MC")) {					//ActionListener for Button MC
		m1.setNumerator(0);
		textfield.setText("");
	}
	
	if (s.equals("MR")) {					// Action Listener for Button MR
		//txtfld.setText("");
		toFraction(textfield.getText());
		if(exception==1)
		{
			textfield.setText("Denominator cannot be zero");
		}
		else
		{
		m1.setNumerator(temp.getNumerator());
		try
		{
			m1.setDenominator(temp.getDenominator());
		}catch(DenominatorException z)
		{
			textfield.setText(z.getMessage());
		}
		//m1.setDenominator(temp.getDenominator());
		textfield.setText(m1.getNumerator()+"|"+m1.getDenominator());
		}
	}
	
	if (s.equals("M+")) {								//ActionListener for Button M+
		if (k == 1) {
			m1.setNumerator(temp.getNumerator());
			try
			{
				m1.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//m1.setDenominator(temp.getDenominator());
			k++;
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			m1=m1.add(temp);
			textfield.setText(m1.getNumerator()+"|"+m1.getDenominator());
			}
		}
	}
	
	if (s.equals("M-")) {								//ActionListener for Button M-
		if (k == 1) {
			m1.setNumerator(temp.getNumerator());
			try
			{
				m1.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//m1.setDenominator(temp.getDenominator());
			k++;
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			m1=m1.subtract(temp);
			textfield.setText(m1.getNumerator()+"|"+m1.getDenominator());
			}
		}
	}
	
	if (s.equals("+")) {								//ActionListener for Button +
		if (textfield.getText().equals("")) {
			textfield.setText("");
			a.setNumerator(0);
			try
			{
				a.setDenominator(1);
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(1);
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			
			
			a.setNumerator(temp.getNumerator());
			try
			{
				a.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(temp.getDenominator());
			textfield.setText("");
			ch = '+';														// set char to +
			y = 0;
			x = 0;
			}
		}
		textfield.requestFocus();
	}
	
	if (s.equals("-")) {						//ActionListener for Button -
		if (textfield.getText().equals("")) {
			textfield.setText("");
			a.setNumerator(0);
			try
			{
				a.setDenominator(1);
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(1);
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			a.setNumerator(temp.getNumerator());
			try
			{
				a.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(temp.getDenominator());
			textfield.setText("");
			ch = '-';										// set char to -
			y = 0;
			x = 0;
			}
		}
		textfield.requestFocus();
	}
	
	if (s.equals("*")) {							//ActionListener for Button *
		if (textfield.getText().equals("")) {
			textfield.setText("");
			a.setNumerator(0);
			try
			{
				a.setDenominator(1);
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(1);
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{			
			a.setNumerator(temp.getNumerator());
			try
			{
				a.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(temp.getDenominator());
			textfield.setText("");
			ch = '*';										// set char to *
			y = 0;
			x = 0;
		}
		}
		textfield.requestFocus();
	}
	
	if (s.equals("/")) {							//ActionListener for Button /
		if (textfield.getText().equals("")) {
			textfield.setText("");
			a.setNumerator(0);
			try
			{
				a.setDenominator(1);
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(1);
		} else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			a.setNumerator(temp.getNumerator());
			try
			{
				a.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f1.setDenominator(temp.getDenominator());
			textfield.setText("");
			ch = '/';													// set char to /
			y = 0;
			x = 0;
			}
		}
		textfield.requestFocus();
	}
		
	if (s.equals("+/-")) {						//ActionListener for Button +/-
		if (x == 0) {
			if(isFraction(textfield.getText()))
			{
				temp.setNumerator(-1*temp.getNumerator());
				textfield.setText(temp.getNumerator()+"|"+temp.getDenominator());
			}
			else
				textfield.setText("-" + textfield.getText());
			x = 1;
		} else {
			textfield.setText(textfield.getText());
		}
	}
	
	if (s.equals("=")) {						//ActionListener for Button =
		if (textfield.getText().equals("")) {
			textfield.setText("");
			/*if((ch == '*')||(ch == '/'))
			{	
				f2.setNumerator(1);
				f2.setDenominator(1);
			}
			else
			{
				f2.setNumerator(0);
				f2.setDenominator(1);
			}*/
		} 
		else {
			toFraction(textfield.getText());
			if(exception==1)
			{
				textfield.setText("Denominator cannot be zero");
			}
			else
			{
			b.setNumerator(temp.getNumerator());
			try
			{
				b.setDenominator(temp.getDenominator());
			}catch(DenominatorException z)
			{
				textfield.setText(z.getMessage());
			}
			//f2.setDenominator(temp.getDenominator());
			
			switch (ch) {								// Genrating output as per the char 
			case '+':						// Addition case
				res = a.add(b);
				break;
			case '-':						// Subtraction case
				res = a.subtract(b);
				break;
			case '/':						// Division case
				res = a.divide(b);
				break;
			case '*':						// Multiplication case
				res = a.multiply(b);
				break;
			}
			textfield.setText("");
			textfield.setText(res.getNumerator()+"|"+res.getDenominator());
			
			z = 1;
			}
		}
	}
	
	
	
	
	
}

public boolean isFraction(String s)				// checking wether Fraction is or not
{
	for(int i = 0; i < s.length();i++)
	{
		if(s.charAt(i)=='|')
		{
			return true;
		}
		
	}
	return false;
}

public void toFraction(String s)					// converting into Fraction  using String arguments
{
	int i = 0;
	String ch=new String();
	while(s.charAt(i)!='|' && i<s.length())
	{
		ch=ch+s.charAt(i);
		i++;
	}
	temp.setNumerator(Integer.parseInt(ch));
	
	String ch1=new String();
	if(s.charAt(i)=='|')
	{
		i++;
		while(i<s.length())
		{
			ch1=ch1+s.charAt(i);
			i++;
		}
		try
		{
			temp.setDenominator(Integer.parseInt(ch1));
		}catch(DenominatorException z)
		{
			
			exception=1;
		}
		
	}
	
	
	
}

public static void main(String args[]) {					// main which calls the swing 
	try {
		UIManager
				.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	} catch (Exception e) {
	}
	FractionCalculator f = new FractionCalculator();
	f.setTitle("ScientificCalculator");
	f.pack();
	f.setVisible(true);
}
}