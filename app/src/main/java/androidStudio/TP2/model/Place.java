package androidStudio.TP2.model;

import java.util.Objects;

public class Place {
    private final float startX; // borne gauche
    private final float endX; // borne droite
    private final float startY;// borne gauche
    private final float endY;// borne droite

    public Place(float x1,float x2,float y1, float y2){
        this.startX = x1;
        this.endX = x2;
        this.startY = y1;
        this.endY = y2;
    }

    public float getX1() {
        return startX;
    }

    public float getX2() {
        return endX;
    }

    public float getY1() {
        return startY;
    }

    public float getY2() {
        return endY;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Place)){
            return false;
        }
        Place p = (Place)o;
        return p.startX == startX && p.endX == endX && p.startY == startY && p.endY == endY;
    }
}
