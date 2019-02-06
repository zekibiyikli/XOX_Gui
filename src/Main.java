import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Main {
	static JFrame frame;
	static JPanel panel;
	static JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,resultButton,restart;
	static String [][] xox= {
			{"-","-","-"},
			{"-","-","-"},
			{"-","-","-"},
	};
	static int sira=0;
	static int s=0;
	static JLabel result;

	public static void main(String[] args) {
		MainScreen();
	}
	
	
	public static void MainScreen() {
		
		Check();
		
		if(s==0) {
			frame=new JFrame("Tabu");
			frame.setSize(600, 600);//frame boyutunu ayarlama
			frame.setVisible(true);//frame gosterme
			frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
			
			panel=new JPanel();
			panel.setSize(600,600);
			panel.setLocation(0, 0);
			panel.setLayout(null);
			
			btn1=new JButton(xox[0][0]);
			btn1.setSize(100,100);
			btn1.setLocation(100,100);
			btn1.addActionListener(new Action());
			panel.add(btn1);
			
			btn2=new JButton(xox[0][1]);
			btn2.setSize(100,100);
			btn2.setLocation(100,200);
			btn2.addActionListener(new Action());
			panel.add(btn2);
			
			btn3=new JButton(xox[0][2]);
			btn3.setSize(100,100);
			btn3.setLocation(100,300);
			btn3.addActionListener(new Action());
			panel.add(btn3);
			
			btn4=new JButton(xox[1][0]);
			btn4.setSize(100,100);
			btn4.setLocation(200,100);
			btn4.addActionListener(new Action());
			panel.add(btn4);
			
			btn5=new JButton(xox[1][1]);
			btn5.setSize(100,100);
			btn5.setLocation(200,200);
			btn5.addActionListener(new Action());
			panel.add(btn5);
			
			btn6=new JButton(xox[1][2]);
			btn6.setSize(100,100);
			btn6.setLocation(200,300);
			btn6.addActionListener(new Action());
			panel.add(btn6);
			
			btn7=new JButton(xox[2][0]);
			btn7.setSize(100,100);
			btn7.setLocation(300,100);
			btn7.addActionListener(new Action());
			panel.add(btn7);
			
			btn8=new JButton(xox[2][1]);
			btn8.setSize(100,100);
			btn8.setLocation(300,200);
			btn8.addActionListener(new Action());
			panel.add(btn8);
			
			btn9=new JButton(xox[2][2]);
			btn9.setSize(100,100);
			btn9.setLocation(300,300);
			btn9.addActionListener(new Action());
			panel.add(btn9);
			
			frame.add(panel);
			frame.repaint();
		}
		
		
	}
	
	public static void Check() {
		int i=0;
		if(xox[0][0]=="X"&&xox[0][1]=="X"&&xox[0][2]=="X"){
			i=1;
			}
		else if(xox[1][0]=="X"&&xox[1][1]=="X"&&xox[1][2]=="X"){
			i=1;
			}
		else if(xox[2][0]=="X"&&xox[2][1]=="X"&&xox[2][2]=="X"){
			i=1;
			}
		else if(xox[0][0]=="X"&&xox[1][0]=="X"&&xox[2][0]=="X"){
			i=1;
			}
		else if(xox[0][1]=="X"&&xox[1][1]=="X"&&xox[2][1]=="X"){
			i=1;
		}
		else if(xox[0][2]=="X"&&xox[1][2]=="X"&&xox[2][2]=="X"){
			i=1;
		}
		else if(xox[0][0]=="X"&&xox[1][1]=="X"&&xox[2][2]=="X"){
			i=1;
			}
		else if(xox[0][2]=="X"&&xox[1][1]=="X"&&xox[2][0]=="X"){
			i=1;
			}
		//asdasd
		else if(xox[0][0]=="O"&&xox[0][1]=="O"&&xox[0][2]=="O"){
			i=2;
		}
		else if(xox[1][0]=="O"&&xox[1][1]=="O"&&xox[1][2]=="O"){
			i=2;
		}
		else if(xox[2][0]=="O"&&xox[2][1]=="O"&&xox[2][2]=="O"){
			i=2;
		}
		else if(xox[0][0]=="O"&&xox[1][0]=="O"&&xox[2][0]=="O"){
			i=2;
		}
		else if(xox[0][1]=="O"&&xox[1][1]=="O"&&xox[2][1]=="O"){
			i=2;
		}
		else if(xox[0][2]=="O"&&xox[1][2]=="O"&&xox[2][2]=="O"){
			i=2;
		}
		else if(xox[0][0]=="O"&&xox[1][1]=="O"&&xox[2][2]=="O"){
			i=2;
		}
		else if(xox[0][2]=="O"&&xox[1][1]=="O"&&xox[2][0]=="O"){
			i=2;
		}
		else if(xox[0][0]!="-"&&xox[0][1]!="-"&&xox[0][2]!="-"&&xox[1][0]!="-"&&xox[1][1]!="-"&&xox[1][2]!="-"&&xox[2][0]!="-"&&xox[2][1]!="-"&&xox[2][2]!="-"){
			i=3;
		}
		
		if(i==1 || i==2 || i==3) {
			frame.dispose();
			Result(i);
			s=1;
		}
	}
	
	public static void Result(int i) {
		frame=new JFrame("Tabu");
		frame.setSize(1000, 1000);//frame boyutunu ayarlama
		frame.setVisible(true);//frame gosterme
		frame.setResizable(true);//framein boyutunu ayarlamayý negelliyor
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame kapattýktan sonra arkada çalýþmayý durduruyor
		
		panel=new JPanel();
		panel.setSize(500,500);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		
		if(i==1) {
			result=new JLabel("1. Oyuncu (X) kazandý.");
			result.setSize(250,250);
			result.setLocation(30,90);
			panel.add(result);
		}else if(i==2) {
			result=new JLabel("2. Oyuncu (O) kazandý.");
			result.setSize(250,250);
			result.setLocation(30,90);
			panel.add(result);
		}else if(i==3) {
			result=new JLabel("Berabere Bitti");
			result.setSize(250,250);
			result.setLocation(30,90);
			panel.add(result);
		}

		restart=new JButton("Tekrar");
		restart.setSize(100,100);
		restart.setLocation(300,300);
		restart.addActionListener(new Action());
		panel.add(restart);
		
		frame.add(panel);
		frame.repaint();
	}
	
	static class Action implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn1){
				if(xox[0][0].equals("-")) {
					if(sira==0) {
						xox[0][0]="X";
						sira=1;
					}
					else {
						xox[0][0]="0";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn2) {
				if(xox[0][1].equals("-")) {
					if(sira==0) {
						xox[0][1]="X";
						sira=1;
					}
					else {
						xox[0][1]="O";
						sira=0;
					}
					
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn3) {
				if(xox[0][2].equals("-")) {
					if(sira==0) {
						xox[0][2]="X";
						sira=1;
					}
					else {
						xox[0][2]="O";
						sira=0;
					}
					
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn4) {
				if(xox[1][0].equals("-")) {
					if(sira==0) {
						xox[1][0]="X";
						sira=1;
					}
					else {
						xox[1][0]="O";
						sira=0;
					}
					
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn5) {
				if(xox[1][1].equals("-")) {
					if(sira==0) {
						xox[1][1]="X";
						sira=1;
					}
					else {
						xox[1][1]="O";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn6) {
				if(xox[1][2].equals("-")) {
					if(sira==0) {
						xox[1][2]="X";
						sira=1;
					}
					else {
						xox[1][2]="O";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn7) {
				if(xox[2][0].equals("-")) {
					if(sira==0) {
						xox[2][0]="X";
						sira=1;
					}
					else {
						xox[2][0]="O";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn8) {
				if(xox[2][1].equals("-")) {
					if(sira==0) {
						xox[2][1]="X";
						sira=1;
					}
					else {
						xox[2][1]="O";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==btn9) {
				if(xox[2][2].equals("-")) {
					if(sira==0) {
						xox[2][2]="X";
						sira=1;
					}
					else {
						xox[2][2]="O";
						sira=0;
					}
				}
				frame.dispose();
				MainScreen();
			}
			else if(e.getSource()==restart) {
				for(int i=0;i<xox.length;i++) {
					for(int j=0;j<xox[0].length;j++) {
						xox[i][j]="-";
					}
					sira=0;
					s=0;
					frame.dispose();
					MainScreen();
				}
			}
		}
		}

}
