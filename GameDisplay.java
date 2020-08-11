import SwingGraphics.Scene;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class GameDisplay extends Scene implements KeyListener{

  private boolean up = false;
  private boolean down = false;
  private boolean left = false;
  private boolean right = false;
  private boolean w = false;
  private boolean a = false;
  private boolean s = false;
  private boolean d = false;
  private boolean space = false;
  private boolean enter = false;
  JFrame window = new JFrame("GameDisplay");

  public GameDisplay(int width, int height){
    super();
    windowSetUp(width, height);
  }

  private void windowSetUp(int width, int height){
    window.setSize(width, height);
    window.setResizable(false);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setContentPane(this);
    window.setVisible(true);
    window.addKeyListener(this);
  }

  public void keyPressed(KeyEvent e){
    keyAction(e, true);
  }

  public void keyReleased(KeyEvent e){
    keyAction(e, false);
  }

  public void keyTyped(KeyEvent e){
  }

  public void keyAction(KeyEvent e, boolean upOrDown){
    switch(e.getKeyCode()){
      case KeyEvent.VK_UP:
        up = upOrDown;
        break;
      case KeyEvent.VK_DOWN:
        down = upOrDown;
        break;
      case KeyEvent.VK_LEFT:
        left = upOrDown;
        break;
      case KeyEvent.VK_RIGHT:
        right = upOrDown;
        break;
      case KeyEvent.VK_W:
        w = upOrDown;
        break;
      case KeyEvent.VK_A:
        a = upOrDown;
        break;
      case KeyEvent.VK_S:
        s = upOrDown;
        break;
      case KeyEvent.VK_D:
        d = upOrDown;
        break;
      case KeyEvent.VK_SPACE:
        space = upOrDown;
        break;
      case KeyEvent.VK_ENTER:
        enter = upOrDown;
        break;
      default:
        break;
    }
  }

  public boolean getUp(){
    return up;
  }

  public boolean getDown(){
    return down;
  }

  public boolean getLeft(){
    return left;
  }

  public boolean getRight(){
    return right;
  }

  public boolean getW(){
    return w;
  }

  public boolean getA(){
    return a;
  }

  public boolean getS(){
    return s;
  }

  public boolean getD(){
    return d;
  }

  public boolean getSpace(){
    return space;
  }

  public boolean getEnter(){
    return enter;
  }

}