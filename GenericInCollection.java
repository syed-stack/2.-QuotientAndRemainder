package Collections;

public class GenericInCollection {

}
class Ball{
	
	
		
		public void play() {
			System.out.println("child is plying  with ball...");
		}
		
	}
	class Sweet{
		public void eat() {
			System.out.println("child is eating the sweets.....");
		}
		
	}
	// aproach 1
	class Child{
		Ball ball;
		public void action() {
			ball.play();
	}

}
