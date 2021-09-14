
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;


public class admin_window extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private char[] password = {'1', '2', '3', '4'};
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	public static JTextField update_95;
	public static JTextField update_98;
	public static JTextField update_d;
	private JButton btnNewButton;
	private JTextField kahvi_text;
	private JTextField donitsi_text;
	private JTextField pizza_text;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel;
	private JButton btnNewButton_1;

	public admin_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(admin_window.class.getResource("/kuvia/gasoline.png")));
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter(){
			public void windowClosing(java.awt.event.WindowEvent e) {
				main.file.update();
			}
		});
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] entry_pass = passwordField.getPassword();
				if(Arrays.equals(password, entry_pass)) {
					update_d.setEnabled(true);
					update_98.setEnabled(true);
					update_95.setEnabled(true);
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(true);
					kahvi_text.setEnabled(true);
					donitsi_text.setEnabled(true);
					pizza_text.setEnabled(true);




				}
				}
				
			
		});
		passwordField.setBounds(10, 26, 130, 19);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("Salasana");
		lblNewLabel.setBounds(10, 10, 99, 13);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("95E");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 100, 31, 23);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("98E");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(10, 150, 31, 23);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("D");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(10, 200, 13, 23);
		contentPane.add(lblNewLabel_3);
		
		update_95 = new JTextField("");
		update_95.setEnabled(false);
		update_95.setBounds(65, 104, 96, 19);
		contentPane.add(update_95);
		update_95.setColumns(10);
		
		update_98 = new JTextField("");
		update_98.setEnabled(false);
		update_98.setColumns(10);
		update_98.setBounds(65, 150, 96, 19);
		contentPane.add(update_98);
		
		update_d = new JTextField("");
		update_d.setEnabled(false);
		update_d.setColumns(10);
		update_d.setBounds(65, 200, 96, 19);
		contentPane.add(update_d);
		
		btnNewButton = new JButton("P\u00E4ivit\u00E4 hinnat");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(update_95.getText().isEmpty() == false) {
						if(update_95.getText().length() <= 5) {
						float f_95 = Float.parseFloat(update_95.getText());
						main.file.writeFile(String.valueOf(f_95), main.file_95);
						}
						else {
							JOptionPane.showMessageDialog(null, "Liian pitkä numero(95)!", "Virhe", JOptionPane.ERROR_MESSAGE);
							update_95.setText("");
						}
					}
					if(update_98.getText().isEmpty() == false) {
						if(update_98.getText().length() <= 5) {
						float f_98 = Float.parseFloat(update_98.getText());
						main.file.writeFile(String.valueOf(f_98), main.file_98);
						}
						else {
							JOptionPane.showMessageDialog(null, "Liian pitkä numero (98)!", "Virhe", JOptionPane.ERROR_MESSAGE);
							update_98.setText("");
						}
					}
					
					if(update_d.getText().isEmpty() == false) {
						if(update_d.getText().length() <= 5) {
						float f_d = Float.parseFloat(update_d.getText());
						main.file.writeFile(String.valueOf(f_d), main.file_d);
						}
						else {
							JOptionPane.showMessageDialog(null, "Liian pitkä numero(d)!", "Virhe", JOptionPane.ERROR_MESSAGE);
							update_d.setText("");
						}
					}
				}
				
				catch(Exception error) {
					JOptionPane.showMessageDialog(null, "Annoithan numeron?", "Virhe", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(10, 55, 130, 21);
		contentPane.add(btnNewButton);
		
		kahvi_text = new JTextField("");
		kahvi_text.setEnabled(false);
		kahvi_text.setColumns(10);
		kahvi_text.setBounds(318, 104, 96, 19);
		contentPane.add(kahvi_text);
		
		donitsi_text = new JTextField("");
		donitsi_text.setEnabled(false);
		donitsi_text.setColumns(10);
		donitsi_text.setBounds(318, 150, 96, 19);
		contentPane.add(donitsi_text);
		
		pizza_text = new JTextField();
		pizza_text.setEnabled(false);
		pizza_text.setColumns(10);
		pizza_text.setBounds(318, 200, 96, 19);
		contentPane.add(pizza_text);
		
		lblNewLabel_4 = new JLabel("Kahvi");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_4.setBounds(231, 100, 45, 23);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Donitsi");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_5.setBounds(231, 150, 56, 23);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Pizza");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_6.setBounds(231, 200, 45, 23);
		contentPane.add(lblNewLabel_6);
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(222, 0, 222, 271);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton_1 = new JButton("P\u00E4ivit\u00E4 kent\u00E4t");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(kahvi_text.getText() == null || kahvi_text.getText().length() > 24) {
					JOptionPane.showMessageDialog(null,"Tarkista tekstikenttä(kahvi)!", "Virhe", JOptionPane.ERROR_MESSAGE);
				}
				else if(kahvi_text.getText().length() > 4) {
					main.kahvi_field.setText(kahvi_text.getText());
				}
				
				if(donitsi_text.getText() == null || donitsi_text.getText().length() > 24) {
					JOptionPane.showMessageDialog(null,"Tarkista tekstikenttä(donitsi)!", "Virhe", JOptionPane.ERROR_MESSAGE);
				}
				else if(donitsi_text.getText().length() > 4) {
					main.donitsi_field.setText(donitsi_text.getText());
				}
				
				if(pizza_text.getText() == null || pizza_text.getText().length() > 24) {
					JOptionPane.showMessageDialog(null,"Tarkista tekstikenttä(pizza)!", "Virhe", JOptionPane.ERROR_MESSAGE);
				}
				else if(pizza_text.getText().length() > 4) {
					main.pizza_field.setText(pizza_text.getText());
				}

			}
		});
		btnNewButton_1.setBounds(10, 54, 130, 21);
		panel.add(btnNewButton_1);
	}
}