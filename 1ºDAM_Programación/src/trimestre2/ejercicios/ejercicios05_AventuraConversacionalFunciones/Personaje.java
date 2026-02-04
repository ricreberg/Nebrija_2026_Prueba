package trimestre2.ejercicios.ejercicios05_AventuraConversacionalFunciones;

public class Personaje {
    private String nombre;
    private int vidas;
    private int flechas;
    private boolean tenerArco;
    private boolean tenerReloj;
    private boolean tenerMedicina;
    private boolean tenerTridente;

    // CONSTRUCTOR
    public Personaje(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.flechas = 0;
        this.tenerArco = false;
        this.tenerReloj = false;
        this.tenerMedicina = false;
        this.tenerTridente = true;
    }

    // GETTERS Y SETTERS
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getVidas() { return vidas; }
    public void setVidas(int vidas) { this.vidas = vidas; }

    public int getFlechas() { return flechas; }
    public void setFlechas(int flechas) { this.flechas = flechas; }

    public boolean isTenerArco() { return tenerArco; }
    public void setTenerArco(boolean tenerArco) { this.tenerArco = tenerArco; }

    public boolean isTenerReloj() { return tenerReloj; }
    public void setTenerReloj(boolean tenerReloj) { this.tenerReloj = tenerReloj; }

    public boolean isTenerMedicina() { return tenerMedicina; }
    public void setTenerMedicina(boolean tenerMedicina) { this.tenerMedicina = tenerMedicina; }

    public boolean isTenerTridente() { return tenerTridente; }
    public void setTenerTridente(boolean tenerTridente) { this.tenerTridente = tenerTridente; }
}