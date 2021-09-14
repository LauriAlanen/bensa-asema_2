import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class main extends JFrame {

	private JPanel contentPane;
	private JLabel label_d;
	private JLabel label_95;
	private JLabel label_98;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	public static JLabel price_d;
	public static JLabel price_98;
	public static JLabel price_95;
	private JMenuItem mntmNewMenuItem_2;
	public admin_window admin_window = new admin_window();
	public static String file_95 = "src/bensat/95e.txt";
	public static String file_98 = "src/bensat/98e.txt";
	public static String file_d = "src/bensat/diesel.txt";
	private JMenuItem mntmNewMenuItem_3;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	Font digital7;
	private JPanel panel_5;
	private JLabel lblNewLabel_2;
	public static JLabel kahvi_field;
	private JLabel lblNewLabel_3;
	public static JLabel donitsi_field;
	private JLabel lblNewLabel_6;
	public static JLabel pizza_field;
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
					file.update();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(main.class.getResource("/kuvia/gasoline.png")));
		setResizable(false);
		try {
			digital7 = Font.createFont(Font.TRUETYPE_FONT, new File("src/fontit/digital-7.ttf")).deriveFont(70);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(digital7);
		}
		catch(IOException | FontFormatException e) {
			e.printStackTrace();
			
		}
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Asetukset");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem_1 = new JMenuItem("Admin");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		mntmNewMenuItem = new JMenuItem("Sulje");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vastaus = JOptionPane.showConfirmDialog(null, "Haluatko varmasti poistua sovelluksesta?");
				if(vastaus == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			}
				
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_2 = new JMenuItem("Admin");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin_window.dispose();
				admin_window = new admin_window();
				admin_window.setVisible(true);
				
			}
		});
		
		mntmNewMenuItem_3 = new JMenuItem("P\u00E4ivit\u00E4");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				file.update();


			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setForeground(new Color(0, 128, 128));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 300, 694, 149);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/kuvia/tankki.png")));
		lblNewLabel.setBounds(10, 11, 128, 128);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Bensaa huippuhintaan!");
		lblNewLabel_1.setBackground(new Color(0, 128, 128));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Javanese Text", Font.PLAIN, 50));
		lblNewLabel_1.setBounds(147, 24, 499, 114);
		panel.add(lblNewLabel_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 178, 170));
		panel_1.setBounds(0, 0, 340, 300);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(20, 20, 300, 73);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		label_95 = new JLabel("95E");
		label_95.setBounds(10, 0, 82, 67);
		panel_2.add(label_95);
		label_95.setForeground(Color.WHITE);
		label_95.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 50));
		
				
				price_95 = new JLabel("Aseta hinta");
				price_95.setBounds(151, -6, 149, 73);
				panel_2.add(price_95);
				price_95.setForeground(Color.RED);
				price_95.setFont(new Font("Digital-7", price_95.getFont().getStyle() & ~Font.BOLD, price_95.getFont().getSize() + 55));
				price_95.setText("1.222");
				
				panel_3 = new JPanel();
				panel_3.setBackground(new Color(0, 0, 128));
				panel_3.setBounds(20, 113, 300, 73);
				panel_1.add(panel_3);
				panel_3.setLayout(null);
				
				label_98 = new JLabel("98E");
				label_98.setBounds(10, 0, 82, 67);
				panel_3.add(label_98);
				label_98.setForeground(Color.WHITE);
				label_98.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 50));
				
				price_98 = new JLabel("Aseta hinta");
				price_98.setBounds(151, -6, 149, 73);
				panel_3.add(price_98);
				price_98.setForeground(Color.RED);
				price_98.setFont(new Font("Digital-7", price_98.getFont().getStyle() & ~Font.BOLD, price_98.getFont().getSize() + 55));
				price_98.setText("1.222");
				
				panel_4 = new JPanel();
				panel_4.setBackground(new Color(0, 0, 128));
				panel_4.setBounds(20, 206, 300, 73);
				panel_1.add(panel_4);
				panel_4.setLayout(null);
				
				label_d = new JLabel("D");
				label_d.setBounds(10, 0, 36, 67);
				panel_4.add(label_d);
				label_d.setForeground(Color.WHITE);
				label_d.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 50));
				
				price_d = new JLabel("Aseta hinta");
				price_d.setBounds(151, -6, 149, 73);
				panel_4.add(price_d);
				price_d.setForeground(Color.RED);
				price_d.setFont(new Font("Digital-7", price_d.getFont().getStyle() & ~Font.BOLD, price_d.getFont().getSize() + 55));
				price_d.setText("1.222");
				
				panel_5 = new JPanel();
				panel_5.setBackground(new Color(60, 179, 113));
				panel_5.setBounds(339, 0, 355, 300);
				contentPane.add(panel_5);
				panel_5.setLayout(null);
				
				lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(main.class.getResource("/kuvia/coffee.png")));
				lblNewLabel_2.setBounds(10, 11, 64, 80);
				panel_5.add(lblNewLabel_2);
				
				kahvi_field = new JLabel("Kahvi vain t\u00E4n\u00E4\u00E4n 1.50\u20AC");
				kahvi_field.setFont(new Font("Sylfaen", Font.PLAIN, 20));
				kahvi_field.setBounds(84, 49, 227, 26);
				panel_5.add(kahvi_field);
				
				lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon(main.class.getResource("/kuvia/donut_1.png")));
				lblNewLabel_3.setBounds(10, 103, 64, 80);
				panel_5.add(lblNewLabel_3);
				
				donitsi_field = new JLabel("Donitsi perjantaihin asti 2\u20AC");
				donitsi_field.setFont(new Font("Sylfaen", Font.PLAIN, 20));
				donitsi_field.setBounds(84, 138, 235, 27);
				panel_5.add(donitsi_field);
				
				lblNewLabel_6 = new JLabel("");
				lblNewLabel_6.setIcon(new ImageIcon(main.class.getResource("/kuvia/pizza.png")));
				lblNewLabel_6.setBounds(10, 194, 64, 80);
				panel_5.add(lblNewLabel_6);
				
				pizza_field = new JLabel("Quattro stagioni pizza 12\u20AC");
				pizza_field.setFont(new Font("Sylfaen", Font.PLAIN, 20));
				pizza_field.setBounds(84, 234, 227, 26);
				panel_5.add(pizza_field);
	}
	
	public static class file{
	
	public static String readFile(String filename) {
		String alltext = "";
		
		try {
			FileReader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			String line;
			while((line = br.readLine()) != null) {
				alltext += line + "\n";
			}
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
			alltext = "";
		}
		return alltext;
		
	}
	
	public static void writeFile(String txt, String filename) {
		try {
			FileWriter fwriter = new FileWriter(filename, false);
			fwriter.write(txt + "\n");
			fwriter.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void update() {
		price_d.setText(file.readFile(file_d));
		price_98.setText(file.readFile(file_98));
		price_95.setText(file.readFile(file_95));
	}
}
}
