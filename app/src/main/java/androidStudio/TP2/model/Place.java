package androidStudio.TP2.model;

import java.util.Objects;

public class Place {
    private final float x1; // borne gauche
    private final float x2; // borne droite
    private final float y1;// borne gauche
    private final float y2;// borne droite

    public Place(float x1,float x2,float y1, float y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getY1() {
        return y1;
    }

    public float getY2() {
        return y2;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Place)){
            return false;
        }
        Place p = (Place)o;
        return p.x1 == x1 && p.x2 == x2 && p.y1 == y1 && p.y2 == y2;
    }
}
