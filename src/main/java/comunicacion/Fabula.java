package comunicacion;

public class Fabula extends Escrito{
  private String ensenanza;
  private String interpretacion;

  public Fabula(String origen,String titulo,String autor, int paginas,String en,String i){
    super(origen, titulo, autor,paginas);
    this.ensenanza=en;
    this.interpretacion=i;
  }
  public int palabrasTotales(int p){
    return p;
  }
  public String interpretacion(){
    return this.interpretacion;
  }
  public String toString(){
    return super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.ensenanza;
  }
  public String getEnsenanza(){
    return this.ensenanza;
  }
  public void setLetras(String l){
    this.ensenanza=l;
}
}
