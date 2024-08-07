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
  public String interpretacion(){
    return this.interpretacion;
  }
  public String getIdea(){
    return this.idea;
  }
  public setIdea(String s){
    this.idea=s;
  }
  public String[] getArgumentos(){
    return argumentos;
  }
  public setArgumentos(String[] s){
    argumentos=s;
  }
  public String getConclusion(){
    return this.conclusion;
  }
  public setConclusion(String s){
    this.conclusion=s;
  }
  public String getReferencias(){
    return this.referencias;
  }
  public setReferencias(String s){
    this.referencias=s;
  }
}
