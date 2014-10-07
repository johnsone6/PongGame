
/**
 * 
 */
public class Ball
{
    // instance variables - replace the example below with your own
    private int xPos,yPos;
    public int dx=5, dy=-5;

    /**
     * This will have to be changed depending on size of applet to place at center of the board
     */
    public Ball()
    {
        setPos(250,140);
    }

    /**
     * 
     */
    public void setPos (int x, int y)
    {
        this.xPos=x;
        this.yPos=y;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getX()
    {
        return xPos;
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int getY()
    {
        // put your code here
        return yPos;
    }


    /**
     *Movement of ball
     */
    public void move()
    {
        setPos(this.getX() + dx, this.getY() + dy);
    }


    /**
     * Restart after score
     */
    public void restart()
    {
        setPos(250,140);
        dx=5;
        dy=-5;
    }


}
