package com.j1.wk4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyAdapter;


class TurtleListener extends Turtle {
  public TurtleListener() {
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e){
      int keyCode=e.getKeyCode();
      switch(keyCode) {
        case KeyEvent.VK_UP:
        setSatatusText("forward 20");
        forward(20);
        break;
      case KeyEvent.VK_DOWN:
        setStatusTect("back 20");
        back(20);
        break;
      case KeyEvent.VK_Q:
       setStatusText("q pessed and exiting");
       break;
    }
      }
    } );
  }
}


public class TurlteKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t=new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press ant key");
  }
}