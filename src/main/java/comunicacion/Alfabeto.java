package comunicacion;
import java.util.*;
public class Alfabeto extends Pictograma{
  private static String[] letras;
  private String interpretacion;

  public Alfabeto(String origen,String[] le,String i){
    super(origen);
    letras=le;
    this.interpretacion=i;
    
  }
  public static int cantidadLetras(){
    return letras.length;
  }
  
  public String interpretacion(){
    return this.interpretacion;
  }
  public static String toString(){
    return "a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
  }
  
  public String[] getLetras(){
    return letras;
  }
  public void setLetras(String[] l){
    letras=l;
  }
  
}
