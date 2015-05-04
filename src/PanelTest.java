import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTreeUI.MouseHandler;


public class PanelTest extends Canvas implements Runnable {
int x=0;
int y=0;
int width=0;
int height=0;
	static JButton button;
	private Graphics g;
	
	
	
	
	
	PanelTest(){
		
	}
	
//	public static void main() {
//
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//					button = new JButton("color");
//					PanelTest window = new PanelTest();
//					window.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		setBackground(Color.WHITE);
		
		g.setColor(Color.BLACK);
		
		g.fillRect(x,y, width, height);
		//System.out.println("aaaaa");
		}



	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		while (true){
		
			
			repaint();
			//System.out.println("asdasd");
			
			 try {
	                Thread.sleep(30);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
		}
	}
}
