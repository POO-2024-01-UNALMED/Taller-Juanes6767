package comunicacion;

public class Libro extends Escrito{

  private String co_autor;
  private String editorial;
  private String edicion;
  private String interpretacion;

  public Libro(String origen,String titulo,String autor, int paginas,String co,String ed,String edi,String i){
    super(origen, titulo, autor,paginas);
    this.co_autor=co;
    this.editorial=ed;
    this.edicion=edi;
    this.interpretacion=i;
  }
  public int palabrasTotales(int p){
    return p*2;
  }
  public String interpretacion(){
    return this.interpretacion;
  }
  public String toString(){
    return super.origen+"\n"+super.titulo+"\n"+super.autor+"\n"+super.paginas+"\n"+this.co_autor+"\n"+this.editorial+"\n"+this.edicion;
  }
  public String getCo_autor(){
    return this.co_autor;
  }
  public void setCo_autor(String letras){
    this.co_autor=letras;
  }
  public String getEditorial(){
    return this.editorial;
  }
  public void setEditorial(String letras){
    this.editorial=letras;
  }
  public String getEdicion(){
    return this.edicion;
  }
  public void setEdicion(String letras){
    this.edicion=letras;
  }
  
}
