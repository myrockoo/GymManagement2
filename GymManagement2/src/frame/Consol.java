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
		super("관리자 화면");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		MenuBar mb = new MenuBar();
		m[0] = new Menu("관리");
		mI[0] = new MenuItem("신규 회원 등록");
		mI[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new NewAccount();
			}
		});

		mI[1] = new MenuItem("회원 정보 수정");

		mI[2] = new MenuItem("계정 관리");

		mI[3] = new MenuItem("로그아웃");
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

		m[1] = new Menu("조회");
//		회원표, 직원표, 이용 수

		m[2] = new Menu("설정");
//		밝기?, 글자크기, 폰트, 배경색, 글자색

		m[3] = new Menu("관리자 기능");
//		계정 관리,

		for (Menu s : m) {
			mb.add(s);
		}

		setMenuBar(mb);
		setSize(400, 400);
		setVisible(true);
	}
}
