package nl.sanderhoevers.helloworld;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Game extends JPanel {

    public void setHeigthOfField(int heigthOfField) {
        this.heigthOfField = heigthOfField;
    }

    public void setWidthOfField(int widthOfField) {
        this.widthOfField = widthOfField;
    }

    private int heigthOfField;
    private int widthOfField;

    enum UpOrDown {UP, DOWN};

    enum LeftOrRight {LEFT, RIGHT}

    int x = 0;
    int y = 0;

    UpOrDown upOrDown = UpOrDown.UP;
    LeftOrRight leftOrRight = LeftOrRight.RIGHT;



    public void moveBall() {
        if (upOrDown.equals(UpOrDown.UP)) {
            y = y + 1;
            if(y== heigthOfField -30){
                upOrDown=UpOrDown.DOWN;
            }

        } else {
            y = y - 1;
            if(y==0){
                upOrDown=UpOrDown.UP;
            }

        }

        if (leftOrRight.equals(LeftOrRight.RIGHT)) {
            x = x + 1;
            if(x == widthOfField -30){
                leftOrRight = LeftOrRight.LEFT;
            }
        } else {
            x = x - 1;
            if(x == 0){
                leftOrRight = LeftOrRight.RIGHT;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.fillOval(x, y, 30, 30);

        graphics2D.drawRect(0,0,1024,768 );
    }
}
