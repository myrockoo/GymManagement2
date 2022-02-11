package frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrame extends Frame {
	private Label lId, lPwd;
	private Button bLog, bCan;
	private TextField tId, tPwd;

	LoginFrame() {
		super("로그인 창");
		setLayout(null);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		lId = new Label("ID : ");
		lId.setBounds(50, 50, 100, 20);
		tId = new TextField(10);
		tId.setBounds(150, 50, 100, 20);

		lPwd = new Label("Password : ");
		lPwd.setBounds(50, 75, 100, 20);
		tPwd = new TextField(10);
		tPwd.setBounds(150, 75, 100, 20);
		tPwd.setEchoChar('*');

		bLog = new Button("Login");
		bLog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (tId.getText().equals("admin") && tPwd.getText().equals("admin")) {
					new Consol();
					dispose();
				} else {
					new LoginDialog(null);
				}
			}
		});

		bCan = new Button("Cancle");
		bCan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		Panel paButton = new Panel();
		paButton.add(bLog);
		paButton.add(bCan);
		paButton.setBounds(0, 110, 300, 30);

		add(lId);
		add(tId);
		add(lPwd);
		add(tPwd);
		add(paButton);

		addKeyListener(new KeyAdapter() {
			
		});
		setBackground(Color.lightGray);
		setSize(300, 180);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
