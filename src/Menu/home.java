package Menu;
import gdDN.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane,panelMenu;
	private JFrame home = this; // tham chiếu tới Fram hiện tại
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 842, 614);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			panelMenu = new JPanel();
			panelMenu.setBackground(new Color(63, 133, 124));
			panelMenu.setBounds(0, 0, 245, 575);
			contentPane.add(panelMenu);
			panelMenu.setLayout(null);
			
			JLabel lbl1 = new JLabel("Quản lý thư viện");
			lbl1.setForeground(new Color(255, 255, 255));
			
			lbl1.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\manager man.png"));
			lbl1.setHorizontalTextPosition(SwingConstants.CENTER);
			lbl1.setHorizontalAlignment(SwingConstants.CENTER);
			lbl1.setVerticalTextPosition(SwingConstants.BOTTOM); // Hiển thị văn bản phía dưới icon
			lbl1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl1.setBounds(33, 23, 148, 124);
			panelMenu.add(lbl1);
			
			JLabel lbl4 = new JLabel("Quản lý mượn-trả sách");
			lbl4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl4.setForeground(new Color(255, 255, 255));
			lbl4.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\icons8-list-48.png"));
			lbl4.setBounds(10, 348, 227, 41);
			panelMenu.add(lbl4);
			
			JLabel lbl2 = new JLabel("Trang chủ");
			lbl2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl2.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\home.png"));
			lbl2.setForeground(new Color(255, 255, 255));
			lbl2.setBackground(new Color(255, 255, 255));
			lbl2.setBounds(10, 185, 227, 50);
			panelMenu.add(lbl2);
			
			JLabel lbl3 = new JLabel("Quản lý kho sách");
			lbl3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					home.setVisible(false);
					
					QlySach qlsach = new QlySach();
					qlsach.setVisible(true);
				}
			});
			lbl3.setForeground(new Color(255, 255, 255));
			lbl3.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\book stack.png"));
			lbl3.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl3.setBounds(10, 263, 207, 55);
			panelMenu.add(lbl3);
			
			JLabel lbl5 = new JLabel("Quản lý người mượn");
			lbl5.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\people manage.png"));
			lbl5.setForeground(new Color(255, 255, 255));
			lbl5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lbl5.setBounds(10, 420, 227, 55);
			panelMenu.add(lbl5);
			
			JLabel lbl6 = new JLabel("Đăng  xuất");
			lbl6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					home.setVisible(false);
					
					DNhap DN = new DNhap();
					DN.setVisible(true);
					
				}
		});
		lbl6.setIcon(new ImageIcon("C:\\Users\\hoang\\OneDrive\\Documents\\Pictures\\Ảnh cho pbl3\\log out.png"));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl6.setForeground(new Color(255, 255, 255));
		lbl6.setBounds(10, 507, 207, 55);
		panelMenu.add(lbl6);
	}

}
