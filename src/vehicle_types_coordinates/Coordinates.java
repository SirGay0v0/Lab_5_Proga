package vehicle_types_coordinates;

public class Coordinates {
    private Float x;//Поле не может быть null
    private float y;//Поле не может быть null

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
        System.out.println("Координата y не может равняться null. Введите другое значение.");
    }
}
