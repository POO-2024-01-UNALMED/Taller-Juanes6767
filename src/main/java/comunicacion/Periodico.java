package comunicacion;

public class Periodico extends Escrito{
  private String fecha;
  private String primicia;
  private String interpretacion;

  public Periodico(String origen,String titulo,String autor, int paginas,String f,String p,String i){
    super(origen, titulo,autor,paginas);
    this.fecha=f;
    this.primicia=p;
    this.interpretacion=i;
  }
  public String interpretacion(){
    return this.interpretacion;
  }
  public String toString(){
    return super.origen+"\n"+super.titulo+"\n"+super.autor+"\n"+super.paginas+"\n"+this.fecha+"\n"+this.primicia;
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
