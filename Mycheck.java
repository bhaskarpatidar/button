import java.awt.*;
import java.awt.event.*;
class mycheck extends Frame implements ItemListener
{
  String msg="";
  Checkbox c1,c2,c3,c4;
  mycheck()
  {
    setLayout(new FlowLayout());
	
	c1=new Checkbox("Name");
	c2=new Checkbox("Branch");
	c3=new Checkbox("subject");
	c4=new Checkbox("year");
	
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	c4.addItemListener(this);
	
	addWindowListener(new WindowAdapter()
            {
              public void windowClosing(WindowEvent we)
                 {
                   System.exit(0);
                  }
     });
   }
   public void itemStateChanged(ItemEvent ie)
   {
     repaint();
	 }
	 public void paint(Graphics g)
	 {
	    g.drawString("show state:",15,100);
		msg="Adarsh Tiwari:"+c1.getState();
		g.drawString(msg,15,120);
		msg="cse:"+c2.getState();
		g.drawString(msg,15,140);
		msg="java:"+c3.getState();
		g.drawString(msg,15,160);
		msg="second:"+c4.getState();
		g.drawString(msg,15,180);
		}
		
		public static void main(String[] args)
		{
		   mycheck mc=new mycheck();
		   mc.setTitle("checkbox");
		   mc.setSize(450,450);
		   mc.setVisible(true);
		   }
}		   
