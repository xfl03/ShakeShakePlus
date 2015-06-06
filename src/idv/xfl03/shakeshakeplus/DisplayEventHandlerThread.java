package idv.xfl03.shakeshakeplus;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class DisplayEventHandlerThread extends Thread {
	private ShakeShakePlus shakeshakeplus;
	
	public DisplayEventHandlerThread(ShakeShakePlus mainFrame){
		shakeshakeplus=mainFrame;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void run(){
		while(!Display.isCloseRequested()){
			try{
			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)||Mouse.isButtonDown(0)){
				shakeshakeplus.play=!shakeshakeplus.play;
				try {
					this.sleep(200);
				} catch (InterruptedException e) {
					ExceptionHandler.log(e);
				}
			}
			}catch(Exception e){
				ExceptionHandler.log(e);
			}
        }
	}
	
}
