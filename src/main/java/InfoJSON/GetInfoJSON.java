/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InfoJSON;

import Animales.Animales;
import Animales.AnimalesAnfibios;
import Control.Acciones.AgregarAnimal;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Alisser
 */
public class GetInfoJSON {

    ReadJSON info = new ReadJSON();

    public JSONArray GetInfoAnfibios() throws IOException {
        JSONArray infoAnfibios = new JSONArray();
        int codigo;
        String nombre,
                especie,
                genero,
                habitad,
                zona,
                procedencia,
                dietaPrincipal,
                dietaCompleta[],
                temperaturaHabitad,
                riesgoExtincion,
                tipoReproduccion,
                tipoVeneno,
                precauciones[],
                nivelPeligrosidad;
        boolean peligroso, venenoso;

        JSONArray anfibios = info.AnimalesAnfibiosJSON();
        for (int i = 0; i < anfibios.length(); i++) {
            JSONObject anfibio = anfibios.getJSONObject(i);
            codigo = anfibio.getInt("codigo");
            nombre = anfibio.getString("nombre");
            especie = anfibio.getString("especie");
            genero = anfibio.getString("genero");
            habitad = anfibio.getString("habitad");
            zona = anfibio.getString("zona");
            procedencia = anfibio.getString("procedencia");
            dietaPrincipal = anfibio.getString("dietaPrincipal");
            JSONArray dieta = anfibio.getJSONArray("dietaCompleta");
            dietaCompleta = new String[dieta.length()];
            for (int j = 0; j < dieta.length(); j++) {
                dietaCompleta[i] = dieta.get(i).toString();
            }
            temperaturaHabitad = anfibio.getString("temperaturaHabitad");
            riesgoExtincion = anfibio.getString("riesgoExtincion");
            tipoReproduccion = anfibio.getString("tipoReproduccion");
            tipoVeneno = anfibio.getString("tipoVeneno");
            JSONArray precau = anfibio.getJSONArray("precauciones");
            precauciones = new String[precau.length()];
            for (int j = 0; j < precau.length(); j++) {
                precauciones[i] = precau.get(i).toString();
            }
            nivelPeligrosidad = anfibio.getString("nivelPeligrosidad");
            peligroso = anfibio.getBoolean("peligroso");
            venenoso = anfibio.getBoolean("venenoso");
            AgregarAnimal animal = new AgregarAnimal();
            infoAnfibios.put(animal.crearAnfibio(codigo, nombre, especie, genero, habitad, zona, procedencia, dietaPrincipal, dietaCompleta, temperaturaHabitad, riesgoExtincion, tipoReproduccion, peligroso, nivelPeligrosidad, venenoso, tipoVeneno, precauciones));
        }
        return infoAnfibios;
    }
}
