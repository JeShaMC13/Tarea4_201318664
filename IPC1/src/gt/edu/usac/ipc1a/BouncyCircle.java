package gt.edu.usac.ipc1a;
import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Circle{
			
		Color color;
		public BouncyCircle(){
			
			size = 150;
			gravity = 0.5f;
			color = Color.ORANGE;
		}

		@Override
		public void DetectarPared()
		{
			if(positionX+size > 800)
				{
					Saltar();
					CambiarColor();
					System.out.println("Se detecto Pared");
				}
		}
		
		public void Saltar(){
			velocityX = 5f;
		}
		
		public void CambiarColor()
		{
			color = Color.GREEN;
		}
		
		@Override
	 	public void Draw (Graphics g){		 
			 g.setColor(color);
			 g.fillOval(positionX,positionY,size,size);
		}

	}
