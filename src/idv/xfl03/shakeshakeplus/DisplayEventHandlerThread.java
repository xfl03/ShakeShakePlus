package idv.xfl03.shakeshakeplus;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

public class DisplayEventHandlerThread extends Thread {
	private ShakeShakePlus shakeshakeplus;
	
	public DisplayEventHandlerThread(ShakeShakePlus mainFrame){
		shakeshakeplus=mainFrame;
	}
	
	@Override
	public void run(){
		//while(!Display.isCloseRequested()){
		while(true){
			try{
			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)||Mouse.isButtonDown(0)){
				shakeshakeplus.play=!shakeshakeplus.play;
				while(!Display.isCloseRequested()&&
						(Keyboard.isKeyDown(Keyboard.KEY_SPACE)||Mouse.isButtonDown(0))){
					
				}
			}
			}catch(Exception e){
				ExceptionHandler.log(e);
			}
        }
	}
	
}
