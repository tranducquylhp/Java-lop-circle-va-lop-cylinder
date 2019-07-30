public class Cylinder extends Circle{
    public double height = 1.0;
    public Cylinder(){

    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        return this.height*this.getArea();
    }
    @Override
    public String toString(){
        return "A Cylinder: radius = "+this.radius+", height = "+this.height+", volume = "+this.getVolume()+", which is a subclass of "+ super.toString();
    }
}
