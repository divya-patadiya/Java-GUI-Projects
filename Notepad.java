import javax.swing.*;
import java.awt.*;
class Notepad{
	public static void main(String[] args) {
		JFrame frame=new JFrame("Notepad");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1368,725);

		JMenuBar mb=new JMenuBar();
		JMenu m1=new JMenu("File");
		JMenu m2=new JMenu("Edit");
		JMenu m3=new JMenu("Format");
		JMenu m4=new JMenu("View");
		JMenu m5=new JMenu("Help");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		mb.add(m5);


		JMenuItem minew=new JMenuItem("	New  				"+"  "+"	Ctrl+N");
		JMenuItem miopen=new JMenuItem("	Open 			 	"+"  "+"	Ctrl+O");
		JMenuItem misave=new JMenuItem("	Save 			 	"+"  "+"	Ctrl+S");
		JMenuItem misaveas=new JMenuItem("	Save As... 			 	");
		JMenuItem mips=new JMenuItem("	Page Setup... 			 	");
		JMenuItem mip=new JMenuItem("	Print 			 	"+"  "+"	Ctrl+P");
		JMenuItem miexit=new JMenuItem("	Exit 			 	");

		JMenuItem miundo=new JMenuItem("	Undo 			 	"+"  "+"	Ctrl+Z");
		JMenuItem micut=new JMenuItem("	Cut 			 	"+"  "+"	Ctrl+X");
		JMenuItem micopy=new JMenuItem("	Copy 			 	"+"  "+"	Ctrl+C");		
		JMenuItem mipaste=new JMenuItem("	Paste 			 	"+"  "+"	Ctrl+V");		
		JMenuItem midel=new JMenuItem("	Delete 			 	"+"  "+"	Del");		
		JMenuItem mifind=new JMenuItem("	Find... 			 	"+"  "+"	Ctrl+F");		
		JMenuItem mifindn=new JMenuItem("	Find Next 			 	"+"  "+"	F3");		
		JMenuItem mirep=new JMenuItem("	Replace 			 	"+"  "+"	Ctrl+H");		
		JMenuItem migoto=new JMenuItem("	Go To... 			 	"+"  "+"	Ctrl+G");		
		JMenuItem misa=new JMenuItem("	Select All 			 	"+"  "+"	Ctrl+A");		
		JMenuItem mitd=new JMenuItem("	Time/Date 			 	"+"  "+"	F5");	

		JMenuItem miwp=new JMenuItem("	Word Wrap 			 	");			
		JMenuItem mifont=new JMenuItem("	Font... 			 	");	

		JMenuItem misb=new JMenuItem("	Status Bar 			 	");					

		JMenuItem mivh=new JMenuItem("	View Help 			 	");			
		JMenuItem mian=new JMenuItem("	About Notepad 			 	");			

		m1.add(minew);
		m1.add(miopen);
		m1.add(misave);
		m1.add(misaveas);
		m1.add(mips);
		m1.add(mip);
		m1.add(miexit);

		m2.add(miundo);
		m2.add(micut);
		m2.add(micopy);
		m2.add(mipaste);
		m2.add(midel);
		m2.add(mifind);
		m2.add(mifindn);
		m2.add(mirep);
		m2.add(migoto);
		m2.add(misa);
		m2.add(mitd);

		m3.add(miwp);
		m3.add(mifont);

		m4.add(misb);

		m5.add(mivh);
		m5.add(mian);

		JPanel panel=new JPanel();
		JTextArea ta=new JTextArea();
		frame.getContentPane().add(BorderLayout.SOUTH,panel);
		frame.getContentPane().add(BorderLayout.NORTH,mb);
		frame.getContentPane().add(BorderLayout.CENTER,ta);

		frame.setVisible(true);

	}
}