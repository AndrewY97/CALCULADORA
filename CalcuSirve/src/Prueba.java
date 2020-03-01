import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ventanaCalcu extends JFrame implements ActionListener{
	String  op="",sim="",res="",op2="";
	float r1,r2,fin;
	JTextField cajaprin;
	JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24;
	Boolean xd=false;
	public ventanaCalcu(){
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setSize(260,467);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblTexto4 = new JLabel();
		lblTexto4.setText("ESTÁNDAR");
		lblTexto4.setBounds(2,0,70,30);
		add(lblTexto4);
		
		cajaprin = new JTextField();
		cajaprin.setEditable(false);
		cajaprin.setBounds(2, 30, 240, 80);
		add(cajaprin);
		
		JLabel lblTexto1 = new JLabel();
		lblTexto1.setText("MC");
		lblTexto1.setBounds(8,60,250,120);
		add(lblTexto1);
		
		JLabel lblTexto2 = new JLabel();
		lblTexto2.setText("MR");
		lblTexto2.setBounds(48,60,250,120);
		add(lblTexto2);
		
		JLabel lblTexto3 = new JLabel();
		lblTexto3.setText("M+");
		lblTexto3.setBounds(88,60,250,120);
		add(lblTexto3);
		
		JLabel lblTexto5 = new JLabel();
		lblTexto5.setText("M-");
		lblTexto5.setBounds(128,60,250,120);
		add(lblTexto5);
		
		JLabel lblTexto6 = new JLabel();
		lblTexto6.setText("MS");
		lblTexto6.setBounds(168,60,250,120);
		add(lblTexto6);
		
		JLabel lblTexto7 = new JLabel();
		lblTexto7.setText("M");
		lblTexto7.setBounds(208,60,250,120);
		add(lblTexto7);
		
		B1 = new JButton("%");
		B1.setBounds(5,130,55,45);
		B1.addActionListener(this);
		add(B1);
		
		B2 = new JButton("√");
		B2.setBounds(65,130,55,45);
		B2.addActionListener(this);
		add(B2);
		
		B3 = new JButton("x2");
		B3.setBounds(125,130,55,45);
		B3.addActionListener(this);
		add(B3);
		
		B4= new JButton("1/x");
		B4.setBounds(185,130,55,45);
		B4.addActionListener(this);
		add(B4);
		
		B5 = new JButton("CE");
		B5.setBounds(5,180,55,45);
		B5.addActionListener(this);
		add(B5);
		
		B6 = new JButton("C");
		B6.setBounds(65,180,55,45);
		B6.addActionListener(this);
		add(B6);
		
		B7 = new JButton("B");
		B7.setBounds(125,180,55,45);
		B7.addActionListener(this);
		add(B7);
		
		B8= new JButton("÷");
		B8.setBounds(185,180,55,45);
		B8.addActionListener(this);
		add(B8);
		
		B9 = new JButton("7");
		B9.setBounds(5,230,55,45);
		B9.addActionListener(this);
		add(B9);
		
		B10 = new JButton("8");
		B10.setBounds(65,230,55,45);
		B10.addActionListener(this);
		add(B10);
		
		B11 = new JButton("9");
		B11.setBounds(125,230,55,45);
		B11.addActionListener(this);
		add(B11);
		
		B12= new JButton("x");
		B12.setBounds(185,230,55,45);
		B12.addActionListener(this);
		add(B12);
		
		B13 = new JButton("4");
		B13.setBounds(5,280,55,45);
		B13.addActionListener(this);
		add(B13);
		
		B14 = new JButton("5");
		B14.setBounds(65,280,55,45);
		B14.addActionListener(this);
		add(B14);
		
		B15 = new JButton("6");
		B15.setBounds(125,280,55,45);
		B15.addActionListener(this);
		add(B15);
		
		B16= new JButton("-");
		B16.setBounds(185,280,55,45);
		B16.addActionListener(this);
		add(B16);
		
		B17 = new JButton("1");
		B17.setBounds(5,330,55,45);
		B17.addActionListener(this);
		add(B17);
		
		B18 = new JButton("2");
		B18.setBounds(65,330,55,45);
		B18.addActionListener(this);
		add(B18);
		
		B19 = new JButton("3");
		B19.setBounds(125,330,55,45);
		B19.addActionListener(this);
		add(B19);
		
		B20= new JButton("+");
		B20.setBounds(185,330,55,45);
		B20.addActionListener(this);
		add(B20);
		
		B21 = new JButton("±");
		B21.setBounds(5,380,55,45);
		B21.addActionListener(this);
		add(B21);
		
		B22 = new JButton("0");
		B22.setBounds(65,380,55,45);
		B22.addActionListener(this);
		add(B22);
		
		B23 = new JButton(".");
		B23.setBounds(125,380,55,45);
		B23.addActionListener(this);
		add(B23);
		
		B24= new JButton("=");
		B24.setBounds(185,380,55,45);
		B24.addActionListener(this);
		add(B24);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==B1) {
			//JOptionPane.showMessageDialog(getParent(), "%");
			xd=true;
			//op=op+"%";
			cajaprin.setText(op);
		}
		if(e.getSource()==B2) {
			//JOptionPane.showMessageDialog(getParent(), "R");
			sim="√";
			xd=true;
			//op=op+"√";
			cajaprin.setText(op);
		}
		if(e.getSource()==B3) {
			//JOptionPane.showMessageDialog(getParent(), "x2");
			xd=true;
			sim="x2";
			//op=op+"x2";
			cajaprin.setText(op);
		}
		if(e.getSource()==B4) {
			//JOptionPane.showMessageDialog(getParent(), "1/x");
			xd=true;
			//op=op+"1/x";
			cajaprin.setText(op);
		}
		if(e.getSource()==B5) {
			//JOptionPane.showMessageDialog(getParent(), "CE");
			sim="";
			op="";
			op2="";
			xd=false;
			cajaprin.setText("0");
		}
		if(e.getSource()==B6) {
			//JOptionPane.showMessageDialog(getParent(), "C");
			op2="";
			sim="";
			xd=false;
			op="";
			cajaprin.setText("0");
		}
		if(e.getSource()==B7) {
			//JOptionPane.showMessageDialog(getParent(), "B");
			cajaprin.setText("b");
		}
		if(e.getSource()==B8) {
			sim="/";
			xd=true;
			//op=op+"/";
			//cajaprin.setText(op);
			//JOptionPane.showMessageDialog(getParent(), sim);
		}
		if(e.getSource()==B9) {
			if (xd==false) {
				op=op+"7";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"7";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			//JOptionPane.showMessageDialog(getParent(), "7");
			cajaprin.setText(op);
		}
		if(e.getSource()==B10) {
			//JOptionPane.showMessageDialog(getParent(), "8");
			if (xd==false) {
				op=op+"8";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"8";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B11) {
			//JOptionPane.showMessageDialog(getParent(), "9");
			if (xd==false) {
				op=op+"9";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"9";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B12) {
			sim="x";
			xd=true;
			//op=op+"x";
			//cajaprin.setText(op);
			//JOptionPane.showMessageDialog(getParent(), sim);
		}
		if(e.getSource()==B13) {
			//JOptionPane.showMessageDialog(getParent(), "4");
			if (xd==false) {
				op=op+"4";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"4";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B14) {
			//JOptionPane.showMessageDialog(getParent(), "5");
			if (xd==false) {
				op=op+"5";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"5";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B15) {
			//JOptionPane.showMessageDialog(getParent(), "6");
			if (xd==false) {
				op=op+"6";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"6";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B16) {
			sim="-";
			xd=true;
			//op=op+"-";
			//cajaprin.setText(op);
			//JOptionPane.showMessageDialog(getParent(), sim);
		}
		if(e.getSource()==B17) {
			//JOptionPane.showMessageDialog(getParent(), "1");
			if (xd==false) {
				op=op+"1";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"1";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B18) {
			//JOptionPane.showMessageDialog(getParent(), "2");
			if (xd==false) {
				op=op+"2";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"2";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B19) {
			//JOptionPane.showMessageDialog(getParent(), "3");
			if (xd==false) {
				op=op+"3";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"3";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B20) {
			sim="+";
			xd=true;
			//cajaprin.setText(op);
			//JOptionPane.showMessageDialog(getParent(), sim);
		}
		if(e.getSource()==B21) {
			//JOptionPane.showMessageDialog(getParent(), "mmn");
			cajaprin.setText("");
			op="±"+op;
			cajaprin.setText(op);
		}
		if(e.getSource()==B22) {
			//JOptionPane.showMessageDialog(getParent(), "0");
			if (xd==false) {
				op=op+"0";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op2=op2+"0";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B23) {
			//JOptionPane.showMessageDialog(getParent(), ".");
			if (xd==false) {
				op=op+".";
				//JOptionPane.showMessageDialog(getParent(), op);
			}else {
				op="";
				op2=op2+".";
				//JOptionPane.showMessageDialog(getParent(), op2);
			}
			cajaprin.setText(op);
		}
		if(e.getSource()==B24) {
			//JOptionPane.showMessageDialog(getParent(), "=");
			if(sim=="+") {
				r1=Float.parseFloat(op);
				r2=Float.parseFloat(op2);
				fin=r1+r2;
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			if(sim=="-") {
				r1=Float.parseFloat(op);
				r2=Float.parseFloat(op2);
				fin=r1-r2;
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			if(sim=="x") {
				r1=Float.parseFloat(op);
				r2=Float.parseFloat(op2);
				fin=r1*r2;
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			if(sim=="/") {
				r1=Float.parseFloat(op);
				r2=Float.parseFloat(op2);
				fin=r1/r2;
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			if(sim=="√") {
				r1=Float.parseFloat(op);
				//r2=Float.parseFloat(op2);
				fin=(float) Math.sqrt(r1);
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			if(sim=="x2") {
				r1=Float.parseFloat(op);
				//r2=Float.parseFloat(op2);
				fin=(float)Math.pow(r1,2);
				res=Float.toString(fin);
				//int numEntero = Integer.parseInt(numCadena);
			}
			//JOptionPane.showMessageDialog(getParent(), op);
			//JOptionPane.showMessageDialog(getParent(), sim);
			//JOptionPane.showMessageDialog(getParent(), op2);
			cajaprin.setText(res);
			sim="";
			op="";
			op2="";
			xd=false;
			fin=0;
			res="";
			
			
		}
	}
	
}
public class Prueba {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ventanaCalcu();
			}
		});

	}
}
