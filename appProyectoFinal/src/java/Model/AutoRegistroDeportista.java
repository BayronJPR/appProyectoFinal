/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
AutoRegistroDeportista(
idAutoRegistro int IDENTITY(1,1) not null,
identificacionUsuario int not null,
tipoIdentificacionUsuario int not null,
peso numeric(18,0),
talla numeric(18,0),
altura numeric(18,0),
IMC numeric(18,0),
FechaRegistra varchar(250),
IdRegistra int,
FechaEdita varchar(250),
IdEdita int,
LOG_ACTIVO bit
);
 * 
 * @author MrHaksh
 */
public class AutoRegistroDeportista {
    
    int idAutoRegistro;
    int identificacionUsuario;
    int tipoIdentificacionUsuario;
    int peso;
    int talla;
    int altura;
    int IMC;
    String gradoObesidad;
    String fechaRegistra;
    int idRegistra;
    String fechaEdita;
    int idEdita;
    int log;

    public AutoRegistroDeportista(int idAutoRegistro, int identificacionUsuario, int tipoIdentificacionUsuario, int peso, int talla, int altura, int IMC, String gradoObesidad, String fechaRegistra, int idRegistra, String fechaEdita, int idEdita, int log) {
        
        this.setIdAutoRegistro(idAutoRegistro);
        this.setIdentificacionUsuario(identificacionUsuario);
        this.setTipoIdentificacionUsuario(tipoIdentificacionUsuario);
        this.setPeso(peso);
        this.setTalla(talla);
        this.setAltura(altura);
        this.setIMC(IMC);
        this.setGradoObesidad(gradoObesidad);
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIMC() {
        return IMC;
    }

    public void setIMC(int IMC) {
        this.IMC = IMC;
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
