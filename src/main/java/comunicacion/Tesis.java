package comunicacion;

public class Tesis extends Escrito{

  private String idea;
  private static String[] argumentos; 
  private String conclusion;
  private String referencias;
  private String interpretacion;

  public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] arg,String conclusion,String referencias,String interpretacion){
    super(origen, titulo,autor,paginas);
    this.idea=idea;
    argumentos=arg; 
    this.conclusion=conclusion;
    this.referencias=referencias;
    this.interpretacion=interpretacion;
  }
  public int palabrasTotales(int p){
    return p*5*super.getPaginas();
  }
  public String interpretacion(){
    return this.interpretacion;
  }
  public String toString(){
    String s=super.getOrigen()+"\n"+super.getTitulo()+"\n"+super.getAutor()+"\n"+super.getPaginas()+"\n"+this.idea+"\n"+argumentos.length+"\n"+this.conclusion+"\n"+this.referencias;
    return s;
  }
  public String getIdea(){
    return this.idea;
  }
  public void setIdea(String s){
    this.idea=s;
  }
  public String[] getArgumentos(){
    return argumentos;
  }
  public void setArgumentos(String[] s){
    argumentos=s;
  }
  public String getConclusion(){
    return this.conclusion;
  }
  public void setConclusion(String s){
    this.conclusion=s;
  }
  public String getReferencias(){
    return this.referencias;
  }
  public void setReferencias(String s){
    this.referencias=s;
  }
}
