package gt.edu.usac.ipc1a;

import java.awt.Color;
import java.awt.Graphics;
public class Circle {

	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity;
	public float jumpImpulse;

	
	public void Update()
	{
		Rebote();
		ActualizarPosicion();
		DetectarPared();
	}
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}


	public void DetectarPared()
	{
		if(positionX+size > 800)
			System.out.println("Detecte Pared");
	}
	
	public void Draw (Graphics g){		 

		g.setColor(Color.RED);
		g.fillOval(positionX,positionY,size,size);

	}
	public void  Rebote(){
		velocityX += gravity;
	}
	
	class Rebote extends Circle{
	
	public Rebote(){
		if(positionX+size > 800);
		System.out.println("Detectar pared");

	}
	public void AplicarGravedad()
	{
		velocityX += gravity;
	}

}
}

