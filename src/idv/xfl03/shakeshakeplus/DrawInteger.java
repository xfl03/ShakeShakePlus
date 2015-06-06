package idv.xfl03.shakeshakeplus;

import net.axdt.aek.math.MathKit;

import org.lwjgl.opengl.GL11;

public class DrawInteger {
	public final static int width=16;
	public final static int length=73;
	public static int leftx=0;
	public final static int lefty=15;
	public static  int t=0;
	private ShakeShakePlus mainFrame;
	public DrawInteger(ShakeShakePlus mainFrame1){
		mainFrame=mainFrame1;
	}

	public void showint(int a){
		 int b=0;
		 int c=a;
		
		 if(a<mainFrame.config.getMinNum()||
				 a==mainFrame.config.getUnceptNum()||
				 a>mainFrame.config.getMaxNum()){
			 showint(MathKit.random(mainFrame.config.getMinNum(), mainFrame.config.getMaxNum()));
			 return;
			 }
		if(a>=10){
			b=(int)(a/10);
			c=a-b*10;
		}
		showint(b,true);
		showint(c,false);
	 }
	 private void showint(int a,boolean left){
		 leftx=left?36:165;
		 GL11.glColor4f(0f,0f,0f,0.1f);
		 if(a==0){
		     zsf();	 
			 zxf();
			 lxf();
			 lsf();
	         yxf();
	         ysf();
		 }
		 if(a==1){
	         yxf();
	         ysf();
		 }
		 if(a==2){
		     zsf();	 
			 zxf();
			 lxf();
	         ysf();
	         zzj();
		 }
		 if(a==3){
		     zsf();	 
			 zxf();
	         yxf();
	         ysf();
	         zzj();
		 }
		 if(a==4){
			 lsf();
	         yxf();
	         ysf();
	         zzj();
		 }
		 if(a==5){
		     zsf();	 
			 zxf();
			 lsf();
	         yxf();
	         zzj();
		 }
		 if(a==6){
		     zsf();	 
			 zxf();
			 lxf();
			 lsf();
	         yxf();
	         zzj();
		 }
		 if(a==7){
		     zsf();	 
	         yxf();
	         ysf();
		 }
		 if(a==8){
		     zsf();	 
			 zxf();
			 lxf();
			 lsf();
	         yxf();
	         ysf();
	         zzj();
		 }
		 if(a==9){
		     zsf();
		     zxf();
			 lsf();
	         yxf();
	         ysf();
	         zzj();
		 }
	 }
	 private void ysf() {
		// TODO Auto-generated method stub
		 t=length-width;
		 int t2=t+2;
	     //���Ϸ�
			 GL11.glBegin(GL11.GL_QUADS);
	    	GL11.glVertex2f(t+leftx+width/2,lefty+1+width/2+t2);//����
	    	GL11.glVertex2f(t+leftx+width/2,lefty+1+width/2+t2);//����
	    	GL11.glVertex2f(t+leftx+width,lefty+width+1+t2);//����
	    	GL11.glVertex2f(t+leftx,lefty+width+1+t2);//����
	    GL11.glEnd();
	    GL11.glBegin(GL11.GL_QUADS);
	  	GL11.glVertex2f(t+leftx,lefty+length-width+1+t2);//����
	  	GL11.glVertex2f(t+leftx+width,lefty+length-width+1+t2);//����
	  	GL11.glVertex2f(t+leftx+width/2,lefty+length+1-width/2+t2);//����
	  	GL11.glVertex2f(t+leftx+width/2,lefty+length+1-width/2+t2);//����
	  GL11.glEnd();
			 GL11.glBegin(GL11.GL_QUADS);
	       	GL11.glVertex2f(t+leftx,lefty+width+1+t2);//����
	       	GL11.glVertex2f(t+leftx+width,lefty+width+1+t2);//����
	       	GL11.glVertex2f(t+leftx+width,lefty+length-width+1+t2);//����
	       	GL11.glVertex2f(t+leftx,lefty+length-width+1+t2);//����
	       GL11.glEnd();
	}


	public void zsf(){

	     //���Ϸ�
		 GL11.glBegin(GL11.GL_QUADS);
	  	GL11.glVertex2f(leftx+width/2,lefty+2f*length+4-width/2-width);//����
	  	GL11.glVertex2f(leftx+width,lefty+2f*length+4-width-width);//����
	  	GL11.glVertex2f(leftx+width,lefty+2f*length+4-width);//����
	  	GL11.glVertex2f(leftx+width/2,lefty+2f*length+4-width/2-width);//����
	  GL11.glEnd();
	  GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx+length-width,lefty+2*length-width+4-width);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+2*length+4-width/2-width);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+2*length+4-width/2-width);//����
		GL11.glVertex2f(leftx+length-width,lefty+2*length+4-width);//����
	GL11.glEnd();
		 GL11.glBegin(GL11.GL_QUADS);
	     	GL11.glVertex2f(leftx+width,lefty+2*length-2*width+4);//����
	     	GL11.glVertex2f(leftx+length-width,lefty+2*length-2*width+4);//����
	     	GL11.glVertex2f(leftx+length-width,lefty+2*length-width+4);//����
	     	GL11.glVertex2f(leftx+width,lefty+2*length+4-width);//����
	     GL11.glEnd();

		 
	 }
	public void zzj(){

	    //���м�
		 GL11.glBegin(GL11.GL_QUADS);
	 	GL11.glVertex2f(leftx+width/2,lefty+length+2-width/2);//����
	 	GL11.glVertex2f(leftx+width,lefty+length+2-width);//����
	 	GL11.glVertex2f(leftx+width,lefty+length+2);//����
	 	GL11.glVertex2f(leftx+width/2,lefty+length+2-width/2);//����
	 GL11.glEnd();
	 GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx+length-width,lefty+length-width+2);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+length+2-width/2);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+length+2-width/2);//����
		GL11.glVertex2f(leftx+length-width,lefty+length+2);//����
	GL11.glEnd();
		 GL11.glBegin(GL11.GL_QUADS);
	    	GL11.glVertex2f(leftx+width,lefty+length-width+2);//����
	    	GL11.glVertex2f(leftx+length-width,lefty+length-width+2);//����
	    	GL11.glVertex2f(leftx+length-width,lefty+length+2);//����
	    	GL11.glVertex2f(leftx+width,lefty+length+2);//����
	    GL11.glEnd();

		 
	}
	 public void zxf(){
		 //���·�
		 GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx+width/2,lefty+width/2);//����
	  	GL11.glVertex2f(leftx+width,lefty);//����
	  	GL11.glVertex2f(leftx+width,lefty+width);//����
	  	GL11.glVertex2f(leftx+width/2,lefty+width/2);//����
	  GL11.glEnd();
	  GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx+length-width,lefty);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+width/2);//����
		GL11.glVertex2f(leftx+length-width/2,lefty+width/2);//����
		GL11.glVertex2f(leftx+length-width,lefty+width);//����
	GL11.glEnd();
		 GL11.glBegin(GL11.GL_QUADS);
	     	GL11.glVertex2f(leftx+width,lefty);//����
	     	GL11.glVertex2f(leftx+length-width,lefty);//����
	     	GL11.glVertex2f(leftx+length-width,lefty+width);//����
	     	GL11.glVertex2f(leftx+width,lefty+width);//����
	     GL11.glEnd();
		 
	 }
	 public void lxf(){
		 //���·�
		 GL11.glBegin(GL11.GL_QUADS);
	  	GL11.glVertex2f(leftx+width/2,lefty+1+width/2);//����
	  	GL11.glVertex2f(leftx+width/2,lefty+1+width/2);//����
	  	GL11.glVertex2f(leftx+width,lefty+width+1);//����
	  	GL11.glVertex2f(leftx,lefty+width+1);//����
	  GL11.glEnd();
	  GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx,lefty+length-width+1);//����
		GL11.glVertex2f(leftx+width,lefty+length-width+1);//����
		GL11.glVertex2f(leftx+width/2,lefty+length+1-width/2);//����
		GL11.glVertex2f(leftx+width/2,lefty+length+1-width/2);//����
	GL11.glEnd();
		 GL11.glBegin(GL11.GL_QUADS);
	     	GL11.glVertex2f(leftx,lefty+width+1);//����
	     	GL11.glVertex2f(leftx+width,lefty+width+1);//����
	     	GL11.glVertex2f(leftx+width,lefty+length-width+1);//����
	     	GL11.glVertex2f(leftx,lefty+length-width+1);//����
	     GL11.glEnd();
	 }
	 public void yxf(){
		 
		 t=length-width;
	     //���·�
			 GL11.glBegin(GL11.GL_QUADS);
	    	GL11.glVertex2f(t+leftx+width/2,lefty+1+width/2);//����
	    	GL11.glVertex2f(t+leftx+width/2,lefty+1+width/2);//����
	    	GL11.glVertex2f(t+leftx+width,lefty+width+1);//����
	    	GL11.glVertex2f(t+leftx,lefty+width+1);//����
	    GL11.glEnd();
	    GL11.glBegin(GL11.GL_QUADS);
	  	GL11.glVertex2f(t+leftx,lefty+length-width+1);//����
	  	GL11.glVertex2f(t+leftx+width,lefty+length-width+1);//����
	  	GL11.glVertex2f(t+leftx+width/2,lefty+length+1-width/2);//����
	  	GL11.glVertex2f(t+leftx+width/2,lefty+length+1-width/2);//����
	  GL11.glEnd();
			 GL11.glBegin(GL11.GL_QUADS);
	       	GL11.glVertex2f(t+leftx,lefty+width+1);//����
	       	GL11.glVertex2f(t+leftx+width,lefty+width+1);//����
	       	GL11.glVertex2f(t+leftx+width,lefty+length-width+1);//����
	       	GL11.glVertex2f(t+leftx,lefty+length-width+1);//����
	       GL11.glEnd();
	 }
	 public void lsf(){
		 t=length-width+2;
	     
	     //���Ϸ�
		 GL11.glBegin(GL11.GL_QUADS);
	  	GL11.glVertex2f(leftx+width/2,lefty+1+width/2+t);//����
	  	GL11.glVertex2f(leftx+width/2,lefty+1+width/2+t);//����
	  	GL11.glVertex2f(leftx+width,lefty+width+1+t);//����
	  	GL11.glVertex2f(leftx,lefty+width+1+t);//����
	  GL11.glEnd();
	  GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(leftx,lefty+length-width+1+t);//����
		GL11.glVertex2f(leftx+width,lefty+length-width+1+t);//����
		GL11.glVertex2f(leftx+width/2,lefty+length+1-width/2+t);//����
		GL11.glVertex2f(leftx+width/2,lefty+length+1-width/2+t);//����
	GL11.glEnd();
		 GL11.glBegin(GL11.GL_QUADS);
	     	GL11.glVertex2f(leftx,lefty+width+1+t);//����
	     	GL11.glVertex2f(leftx+width,lefty+width+1+t);//����
	     	GL11.glVertex2f(leftx+width,lefty+length-width+1+t);//����
	     	GL11.glVertex2f(leftx,lefty+length-width+1+t);//����
	     GL11.glEnd();
	 }

}
