package idv.xfl03.shakeshakeplus;

import java.io.File;
import java.io.IOException;

import net.axdt.aek.file.RWKit;

public class GlobalConfig {
	public final static String CONFIG_FILE_PATH="config\\ShakeShakePlus.txt";
	public final static File CONFIG_FILE_FILE=new File(CONFIG_FILE_PATH);
	public final static File CONFIG_FILE_FOLDER=new File("config");
	public final static int DEFAULT_MIN_NUM=1;
	private int min_num=DEFAULT_MIN_NUM;
	
	public final static int DEFAULT_MAX_NUM=41;
	private int max_num=DEFAULT_MAX_NUM;
	
	public final static int[] DEFAULT_UNEXCEPT_NUM={0,0,0,0,0,0,0,0,0,0};
	private int[] unexcept_num=DEFAULT_UNEXCEPT_NUM;
	
	public final static int DEFAULT_REFRESH_TIME=150;
	private int refresh_time=DEFAULT_REFRESH_TIME;
	
	public final static String DEFAULT_CONFIG_TEXT = 
			"min_num="+DEFAULT_MIN_NUM+"\n"+
			"max_num="+DEFAULT_MAX_NUM+"\n"+
			"unexpect_num="+DEFAULT_UNEXCEPT_NUM[0]+"\n"+
			"refresh_time="+DEFAULT_REFRESH_TIME;
	private String config_text="";
	
	public GlobalConfig(){
		refresh();
	}
	
	public void refresh(){
		//System.out.println("refresh");
		checkFile();
		String temp=RWKit.readNoComment(CONFIG_FILE_PATH, "#");
		if(temp==null)
			config_text="";
		else
			config_text=temp;
		
		if( //config_text.equalsIgnoreCase(DEFAULT_CONFIG_TEXT)||
			config_text.equalsIgnoreCase("Exception")||
			config_text.equalsIgnoreCase("")){
			addNew();
			refresh();
		}
		else
			split();
	}
	private void checkFile() {
		if(!CONFIG_FILE_FILE.exists())
			try {
				CONFIG_FILE_FOLDER.mkdirs();
				CONFIG_FILE_FILE.createNewFile();
			} catch (IOException e) {
				ExceptionHandler.log(e);
			}
		
	}

	private void split(){
		String[] temp1=config_text.split("\n");
		//System.out.println(temp1.length);
		if(temp1.length<4){
			refresh();
			return;
		}
		for(int i=0;i<temp1.length;i++){
			String[] temp2=temp1[i].split("=");
			if(temp2.length<2)
				continue;
			if(temp2[0].equalsIgnoreCase("min_num")){
				min_num=Integer.parseInt(temp2[1]);
				//System.out.println(min_num);
				continue;
			}
			if(temp2[0].equalsIgnoreCase("max_num")){
				max_num=Integer.parseInt(temp2[1]);
				continue;
			}
			if(temp2[0].equalsIgnoreCase("min_num")){
				unexcept_num[0]=Integer.parseInt(temp2[1]);
				continue;
			}
			if(temp2[0].equalsIgnoreCase("refresh_time")){
				refresh_time=Integer.parseInt(temp2[1]);
				continue;
			}
		}
	}
	public void addNew(){
		RWKit.write(CONFIG_FILE_PATH, DEFAULT_CONFIG_TEXT);
	}
	
	public int getMinNum(){
		//System.out.println("a"+min_num);
		return min_num;
	}
	public int getMaxNum(){
		return max_num;
	}
	public int getUnceptNum(){
		return unexcept_num[0];
	}
	public int getRefreshTime(){
		return refresh_time;
	}
}
