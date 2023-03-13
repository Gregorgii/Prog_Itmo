package things;

public class Coordinates {
    private Double x; //Значение поля должно быть больше -597, Поле не может быть null
    private Long y; //Поле не может быть null

    public Coordinates(Double x, Long y){
        this.x = x;
        this.y = y;
    }

    public Double getX(){
        return x;
    }

    public Long getY(){
        return y;
    }

    @Override
    public String toString(){
        return "X: " + x + " Y: " + y;
    }

 
}