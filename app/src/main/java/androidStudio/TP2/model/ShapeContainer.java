package androidStudio.TP2.model;

import android.graphics.Canvas;

import java.util.HashMap;
import java.util.List;

import androidStudio.TP2.tp2_androidstudio.ShapeContainerChangeListener;

public class ShapeContainer {
    List<ShapeContainerChangeListener> ListShapeContainerlister;
    HashMap <DrawableShape , Place> canevas;
    public void draw(Canvas canvas){
        for (DrawableShape ds : canevas.keySet()) {
            Place place = canevas.get(ds);
                ds.drawShape(place.getX1(),place.getY1(),place.getX2(),place.getY2(),canvas);

        }

    }
    public boolean add(DrawableShape shape, Place place){
        canevas.put(shape, place);
        if (canevas.get(shape).equals(place)){
            return false;
        }
        return true;
    }
    public void addChangeListener(ShapeContainerChangeListener listener){
        ListShapeContainerlister.add(listener);
    }
    public void removeChangeListener(ShapeContainerChangeListener listener){
        ListShapeContainerlister.remove(listener);
    }

}
