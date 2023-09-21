public class Editora {
    private int idEditora;
    private String razaoSocial;
    private String contato;
    private String cidade;
    private String UF;

    public Editora(int idEditora, String razaoSocial, String contato, String cidade, String UF) {
        this.idEditora = idEditora;
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.cidade = cidade;
        this.UF = UF;
    }


    public int getIdEditora(){
        return idEditora;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getContato() {
        return contato;
    }
    public String getCidade() {
        return cidade;
    }
    public String getUF() {
        return UF;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setContato(String contato) {
        this.razaoSocial = razaoSocial;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setUF(String UF) {
        this.UF = UF;
    }
}
