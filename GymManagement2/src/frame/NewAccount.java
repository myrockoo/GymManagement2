package frame;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewAccount extends Frame {
	private Label l[] = new Label[10];
	private TextField tf[] = new TextField[10];
	private Checkbox cbMale, cbFeMale;
	private Checkbox cbUse, cbNotUse;
	private Button ok, cancle;

	public NewAccount() {
		super("���� ����");
		setLayout(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		l[0] = new Label("���̵�");
		l[1] = new Label("��й�ȣ");
		l[2] = new Label("�̸�");
		l[3] = new Label("�������");
		l[4] = new Label("��ȭ��ȣ");

		l[5] = new Label("����");
		l[5].setBounds(20, 200, 50, 25);
		add(l[5]);
		Panel pGen = new Panel(new FlowLayout(FlowLayout.LEFT));
		pGen.setBounds(140, 200, 150, 25);
		CheckboxGroup groupG = new CheckboxGroup();
		cbMale = new Checkbox("����", groupG, true);
		cbFeMale = new Checkbox("����", groupG, false);
		pGen.add(cbMale);
		pGen.add(cbFeMale);
		add(pGen);

		l[6] = new Label("������ ��� ����");
		l[6].setBounds(20, 230, 100, 25);
		add(l[6]);
		Panel pStorage = new Panel(new FlowLayout(FlowLayout.LEFT));
		pStorage.setBounds(140, 230, 150, 25);
		CheckboxGroup groupS = new CheckboxGroup();
		cbUse = new Checkbox("���", groupS, true);
		cbNotUse = new Checkbox("�̻��", groupS, false);
		pStorage.add(cbUse);
		pStorage.add(cbNotUse);
		add(pStorage);

		for (int i = 0; i < 5; i++) {
			l[i].setBounds(20, 50 + i * 30, 50, 25);
			tf[i] = new TextField(10);
			tf[i].setBounds(140, 50 + i * 30, 150, 25);
			add(l[i]);
			add(tf[i]);
		}
		
		ok = new Button("Ȯ��");
		ok.setBounds(100, 265, 50, 30);
		add(ok);
		
		cancle = new Button("���");
		cancle.setBounds(170, 265, 50, 30);
		cancle.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();				
			}
		});
		add(cancle);		
		
		setSize(330, 330);
		setVisible(true);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new NewAccount();
//
//	}
}
