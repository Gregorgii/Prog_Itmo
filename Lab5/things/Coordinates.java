package things;
/**
* Class that work w coordinates
*/
public class Coordinates {
    private Double x; //Значение поля должно быть больше -597, Поле не может быть null
    private Long y; //Поле не может быть null

    public Coordinates(Double x, Long y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return The x piece of coordinate
     */
    public Double getX(){
        return x;
    }

    /**
     * @return The y piece of coordinate
     */
    public Long getY(){
        return y;
    }

    /**
     * @return The coordinates
     */
    @Override
    public String toString(){
        return "X: " + x + " Y: " + y;
    }

 
}