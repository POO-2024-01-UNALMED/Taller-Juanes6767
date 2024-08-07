package comunicacion;

public class Fabula extends Escrito{
  private String ensenanza;
  private String interpretacion;

  public String interpretacion(){
    return this.interpretacion;
  }
  public String getEnsenanza(){
    return this.ensenanza;
  }
  public void setLetras(String l){
    this.ensenanza=l;
}
