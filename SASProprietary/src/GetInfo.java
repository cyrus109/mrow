import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.sas.util.SasPasswordEncodingException;
import com.sas.util.SasPasswordString;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GetInfo {

	private JFrame frmSaspwutillity;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnGetpass;
	private JButton btnClearall;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GetInfo window = new GetInfo();
					window.frmSaspwutillity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GetInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSaspwutillity = new JFrame();
		frmSaspwutillity.setTitle("SASpwUtillity");
		BorderLayout borderLayout = (BorderLayout) frmSaspwutillity.getContentPane().getLayout();
		borderLayout.setHgap(7);
		frmSaspwutillity.setBounds(100, 100, 300, 100);
		frmSaspwutillity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnGetinfo = new JButton("Decode");
		btnGetinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String decode = null;
				String input = textField_1.getText();
				input=input.replaceAll("\\s+$", "");
				try {
					decode = SasPasswordString.decode(input);
				} catch (SasPasswordEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textField.setText(decode);
			}
		});
		frmSaspwutillity.getContentPane().add(btnGetinfo, BorderLayout.EAST);
		
		textField = new JTextField();
		frmSaspwutillity.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		frmSaspwutillity.getContentPane().add(textField_1, BorderLayout.NORTH);
		textField_1.setColumns(10);
		
		btnGetpass = new JButton("Encode");
		btnGetpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String decode = null;
				String input = textField.getText();
				input=input.replaceAll("\\s+$", "");
				try {
					decode = SasPasswordString.encode(input);
				} catch (SasPasswordEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				textField_1.setText(decode);
			}
		});
		frmSaspwutillity.getContentPane().add(btnGetpass, BorderLayout.WEST);
		
		btnClearall = new JButton("ClearAll");
		btnClearall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		frmSaspwutillity.getContentPane().add(btnClearall, BorderLayout.CENTER);
	}

}
