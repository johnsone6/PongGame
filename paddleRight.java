
/**
 * Human2/AI controlled paddle
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddleRight
{
    
    private int yPos=0, score;
    final int XPos= 460;

    /**
     * Paddle position set to where ball is
     * Score set to 0
     */
    public paddleRight(int ballPos)
    {
        setPos(ballPos);
        setScore(0);
    }

    /**
     * 
     */
    public void setPos(int pos)
    {
        this.yPos=pos;
        if (yPos >230)
        {
            setPos(230);
        }
        else if (yPos<0)
        {
            setPos(0);
        }
        
    }



    /**
     * Return
     */
    public int get()
    {
        // put your code here
        return yPos;
    }


    /**
     * Set and Get score
     */
    public void setScore (int score)
    {
        this.score=score;
    }


    /**
     *Return Score
     */
    public int getScore()
    {
       return this.score;
    }

    
}
