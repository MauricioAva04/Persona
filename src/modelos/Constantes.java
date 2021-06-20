/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SPARTAN PC
 */
public class Constantes {
    	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';
	public static final char CHAR_FAIL = 'F';

	public static final int PESO_PORDEBAJO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int SOBREPESO = 1;
	public static final String PESO_PORDEBAJO_S = "La persona esta por debajo de su peso ideal";
	public static final String PESO_IDEAL_S = "La persona esta en su peso ideal";
	public static final String SOBREPESO_S = "La persona tiene sobrepeso";
        
	public static final String MAYOR_EDAD = "La persona es mayor de edad";
	public static final String MENOR_EDAD = "La persona es menor de edad";
        
        
	public static final String CADENA_VACIA = "";
	public static final String SEXO_ERROR = "Sexo invalido";

	public static List<Character> getSexos()
	{
		List<Character> sexos = new ArrayList<>();
		sexos.add(SEXO_HOMBRE);
		sexos.add(SEXO_MUJER);
		return sexos;
	}

	/**
	 * CONSTRUCTOR(ES)
	 */

	public Constantes()
	{
		super();
	}
}
