package nodo1;

import processing.core.PApplet;

public class ControlNodo1 {
	
	private PApplet pantalla;
	private Comunication com;
	private Circle circle;
	
	public ControlNodo1(PApplet pantalla){
		this.pantalla=pantalla;
		circle = new Circle(pantalla);
		com=new Comunication();
		//com.start();
	}
	
	public void draw(){
		circle.draw();
		circle.setPosX(com.getRecibidoX());
		circle.setPosY(com.getRecibidoY());
	}
	
	public void mouseMoved(int mouseX, int mouseY){
		com.enviar(mouseX, mouseY);
	}

}
