import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class AIPaddle
{
    int x;
    int y;
    int width = 10;
    int height = 60;
    int speed = 3;
    
    boolean upKey = false;
    boolean downKey = false;
    
    Rectangle physicalBound;
    
    public AIPaddle(int x, int y) //takes the starting position of the paddle
    {
        this.x = x;
        this.y = y;
        
        physicalBound = new Rectangle(x, y, width, height);
        physicalBound.setBounds(x, y, width, height);
    }
    
    public void update(Game game)
    {
        physicalBound.setBounds(x, y, width, height);
        
        if(game.ball.y < y && y >= 0)
        {
            y -= speed;
        }
        
        if(game.ball.y > y && y+ height <= game.getHeight())
        {
            y += speed;
        }
    }
    
    public void render(Graphics pic)
    {
        pic.setColor(Color.WHITE);
        pic.fillRect(x, y, width, height);
    }
    
}
