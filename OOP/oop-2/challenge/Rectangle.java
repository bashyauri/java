public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(2, 2);
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }

    }

    public double getWidth() {
        return this.width;
    }

    public void increaseWidth(double value) {
        setWidth(this.width+=value);
    }

    public double getLength() {
        return this.length;
    }


    public double getArea() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return String.format("Length - %.2f ,width - %.2f, Area = %.2f and Perimeter = %.2f", this.length, this.width,getArea(),perimeter());
    }
    
}
