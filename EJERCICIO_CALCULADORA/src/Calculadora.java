import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frame;
	private JTextField display;
	
	private double primero;
	private double segundo;
	private double resultado;
	private String operacion;
	private Boolean punto;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void borrarCero(){
		
		if (display.getText().equals("0")){
			display.setText("");
		}
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 153));
		frame.getContentPane().setLayout(null);
		
		punto = false;
		segundo = 0;
		primero = 0;
		resultado = 0;
		operacion = "";
		
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				borrarCero();
				
				display.setText(display.getText() + uno.getText());
				
			}
		});
		uno.setFont(new Font("Tahoma", Font.BOLD, 14));
		uno.setBounds(29, 273, 77, 77);
		frame.getContentPane().add(uno);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + dos.getText());
			}
		});
		dos.setFont(new Font("Tahoma", Font.BOLD, 14));
		dos.setBounds(116, 273, 77, 77);
		frame.getContentPane().add(dos);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + tres.getText());
			}
		});
		tres.setFont(new Font("Tahoma", Font.BOLD, 14));
		tres.setBounds(203, 273, 77, 77);
		frame.getContentPane().add(tres);
		
		JButton multiplicar = new JButton("*");
		multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primero = Double.parseDouble(display.getText());
				display.setText("0");
				
				operacion = "multiplicar";
				punto = false;
				
			}
		});
		multiplicar.setFont(new Font("Tahoma", Font.BOLD, 14));
		multiplicar.setBounds(307, 273, 77, 77);
		frame.getContentPane().add(multiplicar);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + cuatro.getText());
			}
		});
		cuatro.setFont(new Font("Tahoma", Font.BOLD, 14));
		cuatro.setBounds(29, 185, 77, 77);
		frame.getContentPane().add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + cinco.getText());
			}
		});
		cinco.setFont(new Font("Tahoma", Font.BOLD, 14));
		cinco.setBounds(116, 185, 77, 77);
		frame.getContentPane().add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + seis.getText());
			}
		});
		seis.setFont(new Font("Tahoma", Font.BOLD, 14));
		seis.setBounds(203, 185, 77, 77);
		frame.getContentPane().add(seis);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primero = Double.parseDouble(display.getText());
				display.setText("0");
				
				operacion = "restar";
				punto = false;
				
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 14));
		minus.setBounds(307, 185, 77, 77);
		frame.getContentPane().add(minus);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + siete.getText());
			}
		});
		siete.setFont(new Font("Tahoma", Font.BOLD, 14));
		siete.setBounds(29, 97, 77, 77);
		frame.getContentPane().add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				borrarCero();
				display.setText(display.getText() + ocho.getText());
			}
		});
		ocho.setFont(new Font("Tahoma", Font.BOLD, 14));
		ocho.setBounds(116, 97, 77, 77);
		frame.getContentPane().add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarCero();
				display.setText(display.getText() + nueve.getText());
			}
		});
		nueve.setFont(new Font("Tahoma", Font.BOLD, 14));
		nueve.setBounds(203, 97, 77, 77);
		frame.getContentPane().add(nueve);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primero = Double.parseDouble(display.getText());
				display.setText("0");
				
				operacion = "sumar";
				punto = false;
				
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 14));
		plus.setBounds(307, 97, 77, 77);
		frame.getContentPane().add(plus);
		
		JButton minus_plus = new JButton("+/-");
		minus_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Lo que hay dentro del display * (-1)
				display.setText(String.valueOf(Double.parseDouble(display.getText()) * (-1)));
				
			}
		});
		minus_plus.setFont(new Font("Tahoma", Font.BOLD, 14));
		minus_plus.setBounds(29, 449, 164, 77);
		frame.getContentPane().add(minus_plus);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundo = Double.parseDouble(display.getText());
				
				if (operacion.equals("sumar")){
					
					resultado = primero + segundo;
					
				} else if (operacion.equals("restar")){
					resultado = primero - segundo;
				} else if (operacion.equals("multiplicar")){
					resultado = primero * segundo;
				} else if (operacion.equals("dividir")){
					resultado = primero / segundo;
				}
				
				display.setText(String.valueOf(resultado));
				primero = 0;
				segundo = 0;
				operacion = "";
				resultado = 0;
				
			}
		});
		equal.setFont(new Font("Tahoma", Font.BOLD, 14));
		equal.setBounds(203, 449, 181, 77);
		frame.getContentPane().add(equal);
		
		JButton coma = new JButton(".");
		coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(display.getText().contains(".")){
					
				} else if (punto==false){
					display.setText(display.getText()+coma.getText());
				}
				punto = true;
				
			}
		});
		coma.setFont(new Font("Tahoma", Font.BOLD, 14));
		coma.setBounds(29, 361, 77, 77);
		frame.getContentPane().add(coma);
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + cero.getText());
			}
		});
		cero.setFont(new Font("Tahoma", Font.BOLD, 14));
		cero.setBounds(116, 361, 77, 77);
		frame.getContentPane().add(cero);
		
		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("0");
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setBounds(203, 361, 77, 77);
		frame.getContentPane().add(clear);
		
		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primero = Double.parseDouble(display.getText());
				display.setText("0");
				
				operacion = "dividir";
				punto = false;
				
			}
		});
		dividir.setFont(new Font("Tahoma", Font.BOLD, 14));
		dividir.setBounds(307, 361, 77, 77);
		frame.getContentPane().add(dividir);
		
		display = new JTextField();
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setText("0");
		display.setEnabled(false);
		display.setBounds(29, 27, 355, 59);
		frame.getContentPane().add(display);
		display.setColumns(10);
		frame.setBounds(100, 100, 427, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
