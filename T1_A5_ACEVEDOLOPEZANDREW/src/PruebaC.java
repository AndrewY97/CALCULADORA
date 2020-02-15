import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ventanaCalcu extends JFrame{
	JTextField cajaprin;
	JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24;
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
		add(B1);
		
		B2 = new JButton("√");
		B2.setBounds(65,130,55,45);
		add(B2);
		
		B3 = new JButton("x2");
		B3.setBounds(125,130,55,45);
		add(B3);
		
		B4= new JButton("1/x");
		B4.setBounds(185,130,55,45);
		add(B4);
		
		B5 = new JButton("CE");
		B5.setBounds(5,180,55,45);
		add(B5);
		
		B6 = new JButton("C");
		B6.setBounds(65,180,55,45);
		add(B6);
		
		B7 = new JButton("B");
		B7.setBounds(125,180,55,45);
		add(B7);
		
		B8= new JButton("÷");
		B8.setBounds(185,180,55,45);
		add(B8);
		
		B9 = new JButton("7");
		B9.setBounds(5,230,55,45);
		add(B9);
		
		B10 = new JButton("8");
		B10.setBounds(65,230,55,45);
		add(B10);
		
		B11 = new JButton("9");
		B11.setBounds(125,230,55,45);
		add(B11);
		
		B12= new JButton("X");
		B12.setBounds(185,230,55,45);
		add(B12);
		
		B13 = new JButton("4");
		B13.setBounds(5,280,55,45);
		add(B13);
		
		B14 = new JButton("5");
		B14.setBounds(65,280,55,45);
		add(B14);
		
		B15 = new JButton("6");
		B15.setBounds(125,280,55,45);
		add(B15);
		
		B16= new JButton("-");
		B16.setBounds(185,280,55,45);
		add(B16);
		
		B17 = new JButton("1");
		B17.setBounds(5,330,55,45);
		add(B17);
		
		B18 = new JButton("2");
		B18.setBounds(65,330,55,45);
		add(B18);
		
		B19 = new JButton("3");
		B19.setBounds(125,330,55,45);
		add(B19);
		
		B20= new JButton("+");
		B20.setBounds(185,330,55,45);
		add(B20);
		
		B21 = new JButton("±");
		B21.setBounds(5,380,55,45);
		add(B21);
		
		B22 = new JButton("0");
		B22.setBounds(65,380,55,45);
		add(B22);
		
		B23 = new JButton(".");
		B23.setBounds(125,380,55,45);
		add(B23);
		
		B24= new JButton("=");
		B24.setBounds(185,380,55,45);
		add(B24);
		
		
		
		
		
		
		
	}
	
}
public class PruebaC {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ventanaCalcu();
			}
		});

	}
}
