public class Envelope extends Mail{
  private double thickness;
  
  public Envelope(){
    super();
    thickness = 0;
  }
  
  public Envelope(String dA, String rA, double w, double l, double t){
    super(dA, rA, w, l);
    thickness = t;
  }
  
  public double getThickness(){
    return thickness;
  }
  
  @Override
  public String toString(){
    return getId() + "\n" + getdeliveryAddress() + "\n" + getReturnAddress() + "\n"
    + getWidth() + "x" + getLength() + "x" + getThickness();
  }
}