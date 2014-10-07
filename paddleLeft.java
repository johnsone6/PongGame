
/**
 * This is the paddle for Player 1 control
 * 
 *  The position needs to be changed depending on how large the applet will be.
 * 
 */
public class paddleLeft
{
    // instance variables - replace the example below with your own
    private int yPos=0;
    final int XPos=30;

    /**
     * Constructor for objects of class paddleLeft
     */
    public paddleLeft()
    {
        setPos(120);
    }

    /**
     * Method to if paddle is moved off screen:
     * Again needs to be tweaked depending on size of applet
     * 
     * 
     */
    public void setPos(int pos)
    {
        this.yPos= pos;
        if(yPos > 230)
        {
            setPos(230);
        }
        else if(yPos<0)
        {
            setPos(0);
    }
}



    /**
     * Return statement.
     *
     * 
     */
    public int getPos()
    {
        // put your code here
        return yPos;
}
}
