package comunicacion;

public class Periodico extends Escrito{
  private String fecha;
  private String primicia;
  private String interpretacion;

  public String interpretacion(){
    return this.interpretacion;
  }
  public String getFecha(){
    return this.fecha;
  }
  public void setFecha(String letras){
    this.fecha=letras;
  }
  public String getPrimicia(){
    return this.primicia;
  }
  public void setPrimicia(String letras){
    this.primicia=letras;
  }
}
