import java.awt.GraphicsEnvironment;




public class LaunchGame {
	
	GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
	
	public static void main(String[] args) {
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		JWindered j = new JWindered("Buddy");
		
		j.run();
		

	}

}
