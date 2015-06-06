package idv.xfl03.shakeshakeplus;

import net.axdt.aek.math.MathKit;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class DisplayRandom {
	private ShakeShakePlus mainFrame;
	private DrawInteger bb;
	private int time;
	public DisplayRandom(ShakeShakePlus mainFrame1){
		mainFrame=mainFrame1;
	}

	public void run(){
		time=mainFrame.config.getRefreshTime();
		bb=new DrawInteger(mainFrame);
		while (!Display.isCloseRequested()) {
			 if(time<mainFrame.config.getRefreshTime()-10){
           	  time+=11;
             try {
 				Thread.sleep(10);
 			} catch (InterruptedException e) {
 				ExceptionHandler.log(e);
 			}
             continue;
		}else{
			time=0;
		}
			 if(mainFrame.play){
           	  mainFrame.rrr=MathKit.random(mainFrame.config.getMinNum(), mainFrame.config.getMaxNum());
           	  mainFrame.r1=(float)Math.random();
           	  mainFrame.g1=(float)Math.random();
           	  mainFrame.b1=(float)Math.random();
             }else{
           	  mainFrame.r1=ShakeShakePlus.r;
           	  mainFrame.g1=ShakeShakePlus.g;
           	  mainFrame.b1=ShakeShakePlus.b;
             }
       	 // Clear the screen and depth buffer
        	GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT); 
           // set the color of the quad (R,G,B,A)
           GL11.glColor3f(mainFrame.r1,mainFrame.g1,mainFrame.b1);
             
           // draw quad
           GL11.glBegin(GL11.GL_QUADS);
               GL11.glVertex2f(0,0);//左上
               GL11.glVertex2f(385,0);//右上 285
               GL11.glVertex2f(385,265);//右下285 165
               GL11.glVertex2f(0,265);//左下 0 165
           GL11.glEnd();
           
        // set the color of the quad (R,G,B,A)
           GL11.glColor3f(1.0f,0.8f,0.0f);
           
           // draw quad
           GL11.glBegin(GL11.GL_QUADS);
               GL11.glVertex2f(10,10);//左上
               GL11.glVertex2f(272,10);//右上
               GL11.glVertex2f(272 ,152);//右下
               GL11.glVertex2f(10,152);//左下
           GL11.glEnd();
           //System.out.println(mainFrame.rrr);
           bb.showint(mainFrame.rrr);
              Display.update();
             
              
       }
		//Display.destroy();
	}
}
