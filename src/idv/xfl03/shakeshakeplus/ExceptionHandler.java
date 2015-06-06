package idv.xfl03.shakeshakeplus;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.axdt.aek.file.RWKit;

public class ExceptionHandler {
	public final static String ERROR_LOG_PATH="ERROR_LOG/ERROR_LOG-"+new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date())+".txt";
	public static boolean CONSOLE_OUT=false;
	public static final File ERROR_LOG_FILE=new File(ERROR_LOG_PATH);
	public final static File ERROR_LOG_FOLDER=new File("ERROR_LOG");
	public static void log(String Msg){
		checkFile();
		String finalLog=Version.NAME+" "+Version.VERSION+"\n"+Msg;
		if(CONSOLE_OUT)
			System.out.println(finalLog);
		RWKit.writeLine2(ERROR_LOG_PATH, finalLog);
	}
	public static void log(Exception e){
		//System.out.println(ERROR_LOG_PATH);
		checkFile();
		String finalLog=Version.NAME+" "+Version.VERSION+"\n"+e.getMessage();
		if(CONSOLE_OUT)
			System.out.println(finalLog);
		RWKit.writeLine2(ERROR_LOG_PATH, finalLog);
	}
	private static void checkFile(){
		if(!ERROR_LOG_FILE.exists())
			try {
				ERROR_LOG_FOLDER.mkdirs();
				ERROR_LOG_FILE.createNewFile();
			} catch (IOException e) {
				//log(e);
				e.printStackTrace();
			}
	}
	
}
