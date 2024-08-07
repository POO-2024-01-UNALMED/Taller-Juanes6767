package comunicacion;
import java.util.*
public class Alfabeto extends Pictograma{
  private static String[] letras;
  private String interpretacion;

  public Alfabeto(String origen,String[] le,String i){
    super(origen);
    letras=le;
    this.interpretacion=i;
    
  }
  int cantidadLetras(){}
  
  public String interpretacion(){
    return this.interpretacion;
  }
  public String[] getLetras(){
    return letras;
  }
  public void setLetras(String[] l){
    letras=l;
  }
  
}
