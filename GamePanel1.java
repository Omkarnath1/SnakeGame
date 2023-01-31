/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Time;

public class GamePanel1 extends JPanel implements KeyListener, ActionListener {

    ImageIcon snaketitle= new ImageIcon(getClass().getResource("snaketitle.jpg"));
    ImageIcon downmouth= new ImageIcon(getClass().getResource("downmouth.png"));
    ImageIcon upmouth= new ImageIcon(getClass().getResource("upmouth.png"));
    ImageIcon leftmouth= new ImageIcon(getClass().getResource("leftmouth.png"));
    ImageIcon rightmouth= new ImageIcon(getClass().getResource("rightmouth.png"));
    ImageIcon enemy= new ImageIcon(getClass().getResource("enemy.png"));
    ImageIcon snakeimage= new ImageIcon(getClass().getResource("snakeimage.png"));


    int[] snakexlength= new int[750];
    int[] snakeylength=new int[750];
    boolean left=false;
    boolean right = true;
    boolean down = false;
    boolean up=false;
    boolean gameover=false;
    int move=0;
    int lengthOfSnake=3;
    Timer time;
    int delay=150;
    GamePanel1(){
        addKeyListener(this);
        setFocusable(true);
        time = new Timer(delay, this);
        time.start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.white);
        g.drawRect(24,10,851,55);
        g.drawRect(24,74,851,576);

        snaketitle.paintIcon(this,g,25,11);
        g.setColor(Color.black);
        g.fillRect(25,75,851,576);
        if(move==0){
            snakexlength[0] =100;
            snakexlength[1]=75;
            snakexlength[2]=50;

            snakeylength[0]=100;
            snakeylength[1]=100;
            snakeylength[2]=100;
            move++;
        }
        if(left){
            leftmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
        }
        if(right){
            rightmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
        }
        if(up){
            upmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
        }
        if(down){
            downmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);
        }
        for(int i=1;i<lengthOfSnake;i++){
            snakeimage.paintIcon(this,g,snakexlength[i],snakeylength[i]);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE && gameover){
            restart();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            left=true;
            right=false;
            up=false;
            down = false;
            move++;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            left=false;
            right=true;
            up=false;
            down = false;
            move++;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            left=false;
            right=false;
            up=false;
            down = true;
            move++;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            left=false;
            right=false;
            up=true;
            down = false;
            move++;
        }
    }

    private void restart() {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=lengthOfSnake-1;i>0;i-- ){
            snakexlength[i]=snakexlength[i-1];
        }
        if(left){
            snakexlength[0]=snakexlength[0]-25;
        }
        if(right){
            snakexlength[0]=snakexlength[0]+25;
        }
        if(down){
            snakeylength[0]=snakeylength[0]+25;
        }
        if(up){
            snakeylength[0]= snakeylength[0]-25;
        }
        if(snakexlength[0]>850) snakexlength[0]=25;
        if(snakexlength[0]<25)  snakexlength[0]=850;
        if(snakeylength[0]>625) snakeylength[0]=75;
        if(snakeylength[0]<75)   snakeylength[0]=625;
        repaint();
    }
}*/

