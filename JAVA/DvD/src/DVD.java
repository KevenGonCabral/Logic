public class DVD {
  private String nomea;
  private int carreira;
  private String titulo; 
  private String cod; 
  private int anol; 
  private String genero; 
  private float valorp; 
  private String gravadora;

public DVD(String nomea,int carreira, String titulo, String cod, int anol, String genero, float valorp, String gravadora){
    this.setNomea(nomea);
    this.setCarreira(carreira);
    this.setTitulo(titulo);
    this.setCod(cod);
    this.setAnol(anol);
    this.setGenero(genero);
    this.setValorp(valorp);
    this.setGravadora(gravadora);
                                                                                                            }
                                                                                                            

public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getCod() {
    return cod;
}
public void setCod(String cod) {
    this.cod = cod;
}
public int getAnol() {
    return anol;
}
public void setAnol(int anol) {
    this.anol = anol;
}
public String getGenero() {
    return genero;
}
public void setGenero(String genero) {
    this.genero = genero;
}
public float getValorp() {
    return valorp;
}
public void setValorp(float valorp) {
    this.valorp = valorp;
}
public String getGravadora() {
    return gravadora;
}
public void setGravadora(String gravadora) {
    this.gravadora = gravadora;
} 
public String getNomea() {
    return nomea;
}
public void setNomea(String nomea) {
    this.nomea = nomea;
}
public int getCarreira() {
    return carreira;
}
public void setCarreira(int carreira) {
    this.carreira = carreira;
}

                 }