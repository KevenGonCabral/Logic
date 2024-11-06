public class Produto {
    
     private String codigo;
     private String descri;
     private String fabricante;
     private int estoque;
     
    public Produto(String codigo, String descri, String fabricante, int estoque) {
        this.setCodigo(codigo);
        this.setDescri(descri);
        this.setFabricante(fabricante);
        this.setEstoque(estoque);
                                                                                 }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescri() {
        return descri;
    }
    public void setDescri(String descri) {
        this.descri = descri;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

     

}