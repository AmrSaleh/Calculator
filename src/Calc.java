import java.awt.dnd.MouseDragGestureRecognizer;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Calc {

	public static main_Window myFrame;
	public static PanelTest myPanel;

	public static void main(String[] args) {

		//myFrame = new main_Window();
		
		JFrame myFrame2 =new JFrame();
		 myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 myFrame2.setSize(400,225);
		 myFrame2.setVisible(true);

		myPanel = new PanelTest();
		
		myFrame2.add(myPanel);
		myPanel.addMouseListener(new MouseListener() {
			
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				myPanel.width=e.getX()-myPanel.x;
				myPanel.height=e.getY()-myPanel.y;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				myPanel.x=e.getX();
				myPanel.y=e.getY();
				myPanel.width=0;
				myPanel.height=0;
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		myPanel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				myPanel.width=e.getX()-myPanel.x;
				myPanel.height=e.getY()-myPanel.y;
			}
		});
		myPanel.run();
		
		//main_Window.main();

	}

	
}
