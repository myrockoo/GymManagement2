package frame;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginDialog extends Dialog {
	private Label msg, msg2; 
	private Button ok;
	
	public LoginDialog(Frame f) {
		super(f, "�α��� ����", true);
		setBounds(50, 50, 180, 110);
		setLayout(new FlowLayout());

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		msg = new Label("���̵�� �н����带", Label.CENTER);
		msg2 = new Label("Ȯ�����ּ��� ", Label.CENTER);

		ok = new Button("OK");
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		add(msg);
		add(msg2);
		add(ok);
		setVisible(true);
	}
}
