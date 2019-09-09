import java.applet.Applet;
import java.awt.Graphics;
public class FirstApplet extends Applet{
	public void init(){
		System.out.println("Applet intialize red");
		
	}
	public void start(){
		System.out.println("Applet destroyed");
	}
	public void stop(){
		System.out.println("Applet stoped...");
	}
	public void destroy(){
		System.out.println("Applet Destroyed");
	}
	public void pain(Graphics g){
		g.draw String("my first applet",300,300);

	}
	}
