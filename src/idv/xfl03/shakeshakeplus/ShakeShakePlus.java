package idv.xfl03.shakeshakeplus;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

public class ShakeShakePlus {
	public boolean play=true;
	public final static float r=0.698f;
	public final static float g=0.6863f;
	public final static float b=0.6273f;
	
	public GlobalConfig config;
	public float r1=r;
	public float g1=g;
	public float b1=b;
	public int rrr=1;
	
    public ShakeShakePlus() {
    	config=new GlobalConfig();
        try {
            Display.setTitle(Version.NAME+" "+Version.VERSION);
            Display.create();
            //Display.setFullscreen(true);
            Display.setDisplayMode(new DisplayMode(643,310));
            Display.setVSyncEnabled(true);
        } catch (LWJGLException e) {
            ExceptionHandler.log(e);
        }
    }
  
 
    public void start() {
    	//glMatrixMode - 指定哪一个矩阵是当前矩阵 GL_PROJECTION,对投影矩阵应用随后的矩阵操作.
    	GL11.glMatrixMode(GL11.GL_PROJECTION);
    	//将当前的用户坐标系的原点移到了屏幕中心：类似于一个复位操作
    	GL11.glLoadIdentity();
    	//http://baike.baidu.com/view/1280554.htm
    	//左右下上近远
    	GL11.glOrtho(0, 600, 0, 400, -100, 100);
    	GL11.glMatrixMode(GL11.GL_MODELVIEW);
    	//System.out.println("h1");
    	DisplayEventHandlerThread aa=new DisplayEventHandlerThread(this);
    	aa.start();
    	DisplayRandom bb=new DisplayRandom(this);
    	bb.run();
        //while (!Display.isCloseRequested()) {}
    	Display.destroy();
    	System.exit(0);
	}
 
    public static void main(String[] args) {
        new ShakeShakePlus().start();
    }

 
}
