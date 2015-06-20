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
    	//glMatrixMode - ָ����һ�������ǵ�ǰ���� GL_PROJECTION,��ͶӰ����Ӧ�����ľ������.
    	GL11.glMatrixMode(GL11.GL_PROJECTION);
    	//����ǰ���û�����ϵ��ԭ���Ƶ�����Ļ���ģ�������һ����λ����
    	GL11.glLoadIdentity();
    	//http://baike.baidu.com/view/1280554.htm
    	//�������Ͻ�Զ
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
