import java.awt.*;
import java.awt.event.*;
class msg extends Frame
{
  msg()
  {
     addWindowListener(new WindowAdapter()
            {
              public void windowClosing(WindowEvent we)
                 {
                   System.exit(0);
                  }
     });
   }
   public void paint(Graphics g)
	 {
	    this.setBackground(new Color(100,25,25));
		
		Font f=new Font("Arial",Font.BOLD,25);
		g.setFont(f);
		g.setColor(Color.green);
		g.drawString("hello World",100,100);
		}
		
		public static void main(String[] args)
		{
		  msg m=new msg();
		  m.setSize(450,540);
		  m.setVisible(true);
		  }
}
