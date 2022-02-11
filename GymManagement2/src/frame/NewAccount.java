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
		super("계정 생성");
		setLayout(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		l[0] = new Label("아이디");
		l[1] = new Label("비밀번호");
		l[2] = new Label("이름");
		l[3] = new Label("생년월일");
		l[4] = new Label("전화번호");

		l[5] = new Label("성별");
		l[5].setBounds(20, 200, 50, 25);
		add(l[5]);
		Panel pGen = new Panel(new FlowLayout(FlowLayout.LEFT));
		pGen.setBounds(140, 200, 150, 25);
		CheckboxGroup groupG = new CheckboxGroup();
		cbMale = new Checkbox("남자", groupG, true);
		cbFeMale = new Checkbox("여자", groupG, false);
		pGen.add(cbMale);
		pGen.add(cbFeMale);
		add(pGen);

		l[6] = new Label("보관함 사용 여부");
		l[6].setBounds(20, 230, 100, 25);
		add(l[6]);
		Panel pStorage = new Panel(new FlowLayout(FlowLayout.LEFT));
		pStorage.setBounds(140, 230, 150, 25);
		CheckboxGroup groupS = new CheckboxGroup();
		cbUse = new Checkbox("사용", groupS, true);
		cbNotUse = new Checkbox("미사용", groupS, false);
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
		
		ok = new Button("확인");
		ok.setBounds(100, 265, 50, 30);
		add(ok);
		
		cancle = new Button("취소");
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
