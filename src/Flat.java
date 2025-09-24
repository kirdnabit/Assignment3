public class Flat extends Envelope {
  private String contents;

  public Flat(){
    super();
    contents = "";
  }
  
  public Flat(String dA, String rA, double w, double l, double t, String contents){
    super(dA, rA, w, l, t);
    contents = "";
  }
  
  public String getContents(){
    return contents;
  }
}