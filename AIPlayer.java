import java.awt.geom.Rectangle2D;

public class AIPlayer extends Rectangle2D.Double
{
    // instance variables
    private final int gameHeight, gameWidth;
    private final double WIDTH = 10, HEIGHT = 60, SPEED;

    /**
     * Constructor for objects of class AIPlayer
     */
    public AIPlayer(int x, int y, double speed, int gameWidth, int gameHeight)
    {
       SPEED = speed;
       this.x = x;
       this.y = y;
       this.height = HEIGHT;
       this.width = WIDTH;
       this.gameHeight = gameHeight;
       this.gameWidth = gameWidth;
    }

    /**
     * 
     */
    public void moveAI(double ballX, double ballY)
    {
        if (ballX >= gameWidth/2){
            if (ballY < y && y>=2)
                y-=SPEED;
            if (ballY >y && y+height <=gameHeight)
                y+=SPEED;       
            }
        }
}
