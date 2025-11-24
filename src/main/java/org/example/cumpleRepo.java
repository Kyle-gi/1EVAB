package org.example;

import java.util.ArrayList;
import java.util.List;

public class cumpleRepo {

    private List<cumpleRepo> Lista = new ArrayList<>();

    public List<cumpleRepo> GetLista() {
        return Lista;
    }

    public void AddCumple(cumpleRepo cumple) {
        Lista.add(cumple);
    }

    public cumpleRepo BuscarPorNombre(String nombre) {
        for (cumpleRepo c : Lista) {
            if (c.GetLista().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public List<cumpleRepo> BuscarPorDia(int dia) {
        List<cumpleRepo> resultado = new ArrayList<>();
        for (cumpleRepo c : Lista) {
            if (c.AddCumple(); == dia) {
                resultado.add(c);
            }
        }
        return resultado;
    }

    public boolean EliminarPorNombre(String nombre) {
        cumpleRepo encontrado = BuscarPorNombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
