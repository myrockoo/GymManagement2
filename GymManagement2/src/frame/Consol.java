package frame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Consol extends Frame {
	private Menu m[] = new Menu[4];
	private MenuItem mI[] = new MenuItem[4];

	Consol() {
		super("������ ȭ��");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		MenuBar mb = new MenuBar();
		m[0] = new Menu("����");
		mI[0] = new MenuItem("�ű� ȸ�� ���");
		mI[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new NewAccount();
			}
		});

		mI[1] = new MenuItem("ȸ�� ���� ����");

		mI[2] = new MenuItem("���� ����");

		mI[3] = new MenuItem("�α׾ƿ�");
		mI[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LoginFrame();
				dispose();
			}
		});

		for (MenuItem s : mI) {
			m[0].add(s);
		}

		m[1] = new Menu("��ȸ");
//		ȸ��ǥ, ����ǥ, �̿� ��

		m[2] = new Menu("����");
//		���?, ����ũ��, ��Ʈ, ����, ���ڻ�

		m[3] = new Menu("������ ���");
//		���� ����,

		for (Menu s : m) {
			mb.add(s);
		}

		setMenuBar(mb);
		setSize(400, 400);
		setVisible(true);
	}
}
