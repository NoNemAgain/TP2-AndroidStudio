package androidStudio.TP2.model;

import android.graphics.Canvas;

import java.util.HashMap;
import java.util.List;

public class ShapeContainer {

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

}
