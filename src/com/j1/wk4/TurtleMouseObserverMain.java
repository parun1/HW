package com.j1.wk4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.geom.Point20;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdpater() {
      public vodi mousePessed(MouseEvent e) {
       Point20.Double p;
       //p=(Point20.Double)e.getPoint()
        p=toTurtlePos(e.getPoint());
        d=distance(p);
        w=towards(p);
        headng(w);
        forward(d);
        setStatusText("moving to"+p,toString());
      }
    });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point20.Double p;
        double d;
        double w;
        //p=(Point20.Double)e.getPoint()
        p=toTurtlePos(e.getPoint());
      moveTo(p);
      steStatusText("dragging to"+p.toString());
      }
    });
  }
}
public class TurtleMouseObserverMain {
  public static void main(String[] args) {
    TurlteMouseListener t=new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or darg");
  }
}