/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * AutoRegistroDeportista( idAutoRegistro int IDENTITY(1,1) not null,
 * identificacionUsuario int not null, tipoIdentificacionUsuario int not null,
 * peso numeric(18,0), talla numeric(18,0), altura numeric(18,0), IMC
 * numeric(18,0), FechaRegistra varchar(250), IdRegistra int, FechaEdita
 * varchar(250), IdEdita int, LOG_ACTIVO bit );
 *
 * @author MrHaksh
 */
public class AutoRegistroDeportista {

    int idAutoRegistro;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    float peso;
    float talla;
    float altura;
    float IMC;
    String gradoObesidad;
    String objetivo1;
    String objetivo2;
    String objetivo3;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int log;

    public AutoRegistroDeportista(int idAutoRegistro, int identificacionUsuario, int tipoIdentificacionUsuario, float peso, float talla, float altura, float IMC, String gradoObesidad, String objetivo1, String objetivo2, String objetivo3, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        this.setIdAutoRegistro(idAutoRegistro);
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setPeso(peso);
        this.setTalla(talla);
        this.setAltura(altura);
        this.setIMC(IMC);
        this.setGradoObesidad(gradoObesidad);
        this.setObjetivo1(objetivo1);
        this.setObjetivo2(objetivo2);
        this.setObjetivo3(objetivo3);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }

    public AutoRegistroDeportista(int identificacionUsuario, int tipoIdentificacionUsuario, float peso, float talla, float altura, float IMC, String gradoObesidad, String objetivo1, String objetivo2, String objetivo3, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setPeso(peso);
        this.setTalla(talla);
        this.setAltura(altura);
        this.setIMC(IMC);
        this.setGradoObesidad(gradoObesidad);
        this.setObjetivo1(objetivo1);
        this.setObjetivo2(objetivo2);
        this.setObjetivo3(objetivo3);
        this.setFechaRegistra(fechaRegistra);
        this.setIdRegistra(idRegistra);
        this.setFechaEdita(fechaEdita);
        this.setIdEdita(idEdita);
        this.setLog(log);
    }

    public AutoRegistroDeportista() {
    }

    public String getGradoObesidad() {
        return gradoObesidad;
    }

    public void setGradoObesidad(String gradoObesidad) {
        this.gradoObesidad = gradoObesidad;
    }

    public int getIdAutoRegistro() {
        return idAutoRegistro;
    }

    public void setIdAutoRegistro(int idAutoRegistro) {
        this.idAutoRegistro = idAutoRegistro;
    }

    public int getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(int identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getTipoIdentificacionUsuario() {
        return tipoIdentificacionUsuario;
    }

    public void setTipoIdentificacionUsuario(int tipoIdentificacionUsuario) {
        this.tipoIdentificacionUsuario = tipoIdentificacionUsuario;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTalla() {
        return talla;
    }

    public void setTalla(float talla) {
        this.talla = talla;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getObjetivo1() {
        return objetivo1;
    }

    public void setObjetivo1(String objetivo1) {
        this.objetivo1 = objetivo1;
    }

    public String getObjetivo2() {
        return objetivo2;
    }

    public void setObjetivo2(String objetivo2) {
        this.objetivo2 = objetivo2;
    }

    public String getObjetivo3() {
        return objetivo3;
    }

    public void setObjetivo3(String objetivo3) {
        this.objetivo3 = objetivo3;
    }

    public String getFechaRegistra() {
        return fechaRegistra;
    }

    public void setFechaRegistra(String fechaRegistra) {
        this.fechaRegistra = fechaRegistra;
    }

    public int getIdRegistra() {
        return idRegistra;
    }

    public void setIdRegistra(int idRegistra) {
        this.idRegistra = idRegistra;
    }

    public String getFechaEdita() {
        return fechaEdita;
    }

    public void setFechaEdita(String fechaEdita) {
        this.fechaEdita = fechaEdita;
    }

    public int getIdEdita() {
        return idEdita;
    }

    public void setIdEdita(int idEdita) {
        this.idEdita = idEdita;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

}
