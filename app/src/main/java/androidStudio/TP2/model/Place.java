package androidStudio.TP2.model;

import java.util.Objects;

public class Place {
    private final float startX; // borne gauche
    private final float endX; // borne droite
    private final float startY;// borne gauche
    private final float endY;// borne droite

    public Place(float x1,float y1,float x2, float y2){
        this.startX = x1;
        this.startY = y1;
        this.endX = x2;
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

}
