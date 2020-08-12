import SwingGraphics.Scene;
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 * Creates a window that the graphics can be displayed on and suppoerts simple controles. 
 */
public class GameDisplay extends Scene implements KeyListener{

  // The following instance variables save if a key is currently being pressed as a boolean value.
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

  /**
   * Constructor. Creats a GameDisplay for the user to play their games on. 
   * @param width The width of the window.
   * @param height The height of the window.
   */
  public GameDisplay(int width, int height){
    super();
    windowSetUp(width, height);
  }

  /**
   * Does all of the initial set up for the window. Should only be called by the constructor.
   */
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

  /**
   * Gets if the up key is currently being pressed as a boolean. 
   * @return True of the up key is being pressed, false otherwise.
   */
  public boolean getUp(){
    return up;
  }

  /**
   * Gets if the down key is currently being pressed as a boolean. 
   * @return True of the down key is being pressed, false otherwise.
   */
  public boolean getDown(){
    return down;
  }

  /**
   * Gets if the left key is currently being pressed as a boolean. 
   * @return True of the left key is being pressed, false otherwise.
   */
  public boolean getLeft(){
    return left;
  }

  /**
   * Gets if the right key is currently being pressed as a boolean. 
   * @return True of the right key is being pressed, false otherwise.
   */
  public boolean getRight(){
    return right;
  }

  /**
   * Gets if the w key is currently being pressed as a boolean. 
   * @return True of the w key is being pressed, false otherwise.
   */
  public boolean getW(){
    return w;
  }

  /**
   * Gets if the a key is currently being pressed as a boolean. 
   * @return True of the a key is being pressed, false otherwise.
   */
  public boolean getA(){
    return a;
  }

  /**
   * Gets if the s key is currently being pressed as a boolean. 
   * @return True of the s key is being pressed, false otherwise.
   */
  public boolean getS(){
    return s;
  }

  /**
   * Gets if the d key is currently being pressed as a boolean. 
   * @return True of the d key is being pressed, false otherwise.
   */
  public boolean getD(){
    return d;
  }

  /**
   * Gets if the space key is currently being pressed as a boolean. 
   * @return True of the space key is being pressed, false otherwise.
   */
  public boolean getSpace(){
    return space;
  }

  /**
   * Gets if the enter key is currently being pressed as a boolean. 
   * @return True of the enter key is being pressed, false otherwise.
   */
  public boolean getEnter(){
    return enter;
  }
}