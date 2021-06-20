/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author SPARTAN PC
 */
public class Persona {

    private String nombre;
    private Integer edad;
    private String NSS;
    private char sexo;
    private Double peso;
    private Double altura;

    public Persona() {
        super();
        this.nombre = "";
        this.edad = 0;
        this.sexo = Constantes.SEXO_HOMBRE;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, Integer edad, String NSS, char sexo, Double peso, Double altura) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.NSS = generaNSS();
        this.sexo = comprobarSexo(sexo)?sexo:Constantes.CHAR_FAIL;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        Double imc = this.peso / Math.pow(this.altura,2);
        imc = Constantes.SEXO_HOMBRE != this.sexo ? imc + 1.0 : imc;
        
        if (imc < 20) {
            return Constantes.PESO_PORDEBAJO;
        } else if (imc < 25) {
            return Constantes.PESO_IDEAL;
        }
        return Constantes.SOBREPESO;
    }

    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }

    private boolean comprobarSexo(char sexo) {
        return Constantes.getSexos().contains(sexo);
    }

   public String toString() {
        return "nombre=" + nombre + "   edad=" + edad + "    NSS=" + NSS + "    sexo=" + sexo + "    peso=" + peso
                + "    altura=" + altura;
    }

    private String generaNSS() {
        String theAlphaNumericS;
        StringBuilder builder;
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        builder = new StringBuilder(8);
        for (int m = 0; m < 8; m++) {
            int myindex = (int) (theAlphaNumericS.length() * Math.random());
            builder.append(theAlphaNumericS.charAt(myindex));
        }

        return builder.toString();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public char getSexo() {
        return this.sexo;
    }    
}
