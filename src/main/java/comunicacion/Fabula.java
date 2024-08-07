package comunicacion;

public class Fabula extends Escrito{
  private String ensenanza;
  private String interpretacion;

  public Fabula(String origen,String titulo,String autor, int paginas,String en,String i){
    super(origen, titulo, autor,paginas);
    this.ensenanza=en;
    this.interpretacion=i;
  }
  
  public String interpretacion(){
    return this.interpretacion;
  }
  public String toString(){
    return super.origen+"\n"+super.titulo+"\n"+super.autor+"\n"+super.paginas+"\n"+this.ensenanza;
  }
  public String getEnsenanza(){
    return this.ensenanza;
  }
  public void setLetras(String l){
    this.ensenanza=l;
}
