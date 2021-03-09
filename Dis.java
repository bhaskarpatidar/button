import java.awt.*;
import java.awt.event.*;
class dis extends Frame implements ActionListener
{
 Button b,b2;
 TextField tf;
 dis()
 {
  b=new Button("click");
  b2=new Button("clear");
  tf=new TextField(20);
  
  this.setLayout(new FlowLayout());
  add(b);
  add(b2);
  add(tf);
 
  b.addActionListener(this);
  b2.addActionListener(this);
 
  this.addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
	}
	 public void actionPerformed(ActionEvent ae)
	 {
		 String str=ae.getActionCommand();
		if(str.equals("click"))
	  tf.setText("ADARSH TIWARI");
	  if(str.equals("clear"))
	  tf.setText("");
	 }
	  public static void main(String[] args)
	  {
	   dis d=new dis();
	   d.setSize(400,400);
	   d.setVisible(true);
	   }
	   }
