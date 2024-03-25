package Graphics2;
import java.awt.Color;
import java.awt.Graphics2D;

public class Dots {
		
	    private int x;
	    private int y;
	    final Color BLACK_SHADOW = new Color(33,33,33);
	    final Color BOLT_COLOR = new Color(239,244,249);
	    final int RADIUS = 1;    
	    

	    
	    public Dots(int x, int y) {
	        super(); 
	        this.x = x;
	        this.y = y;
	    }

	    void draw(Graphics2D g) {   
	    	
	    	g.setColor(BLACK_SHADOW.darker());
	    	g.fillOval(x, y, RADIUS * 2, RADIUS * 2);
	    	g.setColor(BLACK_SHADOW);
	    	g.fillOval(x, y, (RADIUS-1) * 2, (RADIUS-1) * 2);
	    	g.setColor(BLACK_SHADOW);
	    	g.drawOval(x, y, RADIUS * 2, RADIUS * 2);

	    	
	    	
	    }
}
