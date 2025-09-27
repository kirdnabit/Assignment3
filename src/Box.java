public class Box extends Mail {
  private double height;
  private int count;
  
  public Box(){
    super();
    height = 0;
    count = 0;
  }
  
  public Box(String dA, String rA, double w, double l, double h, int count){
    super(dA, rA, w, l);
    height = h;
    this.count = count;
  }
  
  public double getHeight(){
    return height;
  }
  
  public int getCount(){
    return count;
  }
  
  @Override
  public String toString(){
    return getId() + "\n" + getDeliveryAddress() + "\n" + getReturnAddress() + "\n"
    + getWidth() + "x" + getLength() + "x" + getHeight();
  }

}