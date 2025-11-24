package org.example;

import java.util.ArrayList;
import java.util.List;

public class cumpleRepo {

    public static final List<cumpleAgenda> RESULTADO = new ArrayList<>();
    private List<cumpleAgenda> Lista = new ArrayList<>();

    public List<cumpleAgenda> GetLista() {
        return Lista;
    }

    public void AddCumple(cumpleAgenda cumple) {
        Lista.add(cumple);
    }

    public cumpleAgenda BuscarPorNombre(String nombre) {
        for (cumpleAgenda c : Lista) {
            if (c.GetNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        return null;
    }

    public List<cumpleAgenda> BuscarPorDia(int dia) {
        List<cumpleAgenda> RESULTADO = new ArrayList<>();
        for (cumpleAgenda c : Lista) {
            if (c.GetDia() == dia) {
                RESULTADO.add(c);
            }
        }
        return RESULTADO;
    }

    public boolean EliminarPorNombre(String nombre) {
        cumpleAgenda encontrado = BuscarPorNombre(nombre);
        if (encontrado != null) {
            Lista.remove(encontrado);
            return true;
        }
        return false;
    }
}
