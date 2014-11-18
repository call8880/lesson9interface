import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BreezySwing.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import TurtleGraphics.*;


public class ShapeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtinfo;
	StandardPen p;
	abstractShape s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShapeGUI frame = new ShapeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShapeGUI() {
		
		SketchPadWindow w = new SketchPadWindow(400, 400);
		p = new StandardPen(w);
		s = new circle(0,0,0);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectAShape = new JLabel("Select a Shape");
		lblSelectAShape.setBounds(10, 11, 82, 14);
		contentPane.add(lblSelectAShape);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 29, 414, 47);
		contentPane.add(panel);
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				erase();
				s = new circle(0,0,50);
				s.draw(p);
				txtinfo.setText(s.toString());
				
			}
		});
		panel.add(btnCircle);
		
		JButton btnWheel = new JButton("Wheel");
		panel.add(btnWheel);
		
		JButton btnrect = new JButton("Rectangle");
		btnrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnrect);
		
		JButton btnTriangle = new JButton("Triangle");
		panel.add(btnTriangle);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setBounds(10, 128, 46, 14);
		contentPane.add(lblOptions);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(10, 153, 82, 97);
		contentPane.add(panel_1);
		
		JButton btnMove = new JButton("Move");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new x: "));
				double y = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter new y: "));
				erase();
				s.move(x,y);
				s.draw(p);
				txtinfo.setText(s.toString());
				
			}
		});
		panel_1.add(btnMove);
		
		JButton btnResize = new JButton("Resize");
		btnResize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(btnResize);
		
		JButton btnQuit = new JButton("Quit");
		panel_1.add(btnQuit);
		
		JLabel lblShapeData = new JLabel("Shape Data");
		lblShapeData.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblShapeData.setBounds(116, 87, 102, 24);
		contentPane.add(lblShapeData);
		
		txtinfo = new JTextField();
		txtinfo.setBackground(Color.YELLOW);
		txtinfo.setEditable(false);
		txtinfo.setBounds(116, 122, 308, 128);
		contentPane.add(txtinfo);
		txtinfo.setColumns(10);
	}
	private void erase(){
		p.setColor(Color.white);
		s.draw(p);
		p.setColor(Color.GREEN);
	}
	
}
