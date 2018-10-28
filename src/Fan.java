import javafx.scene.paint.Color;

public class Fan {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    public String color = "BLUE";
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    public Fan()
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public void toStrings()
    {if (this.on == false)
    {System.out.println("The Fan is off, the color is " + this.color + " and the radius of the fan is " + this.radius);
    }
    else
        {System.out.println("The fan is on and its speed is currently " + this.speed);
            System.out.println("The color of the fan is " + this.color + " and the radius is " + this.radius);
        }

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
