package frame;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Menubar extends Frame{
	String name[] = { "m1", "m2", "m3", "m4" };
	MenuItem mi[] = new MenuItem[4];

	Menubar() {
		super("관리자 화면");
		setSize(400, 400);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("m1");
		for (int i = 0; i < mi.length; i++) {
			mi[i] = new MenuItem(name[i]);
			mi[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				}
			});
			m1.add(mi[i]);
		}
		Menu m2 = new Menu("m2");

		mb.add(m1);
		mb.add(m2);

		setMenuBar(mb);
		setVisible(true);
	}
}
