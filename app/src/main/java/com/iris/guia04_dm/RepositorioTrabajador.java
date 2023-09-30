package com.iris.guia04_dm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RepositorioTrabajador {
    List<Trabajador> mainList;


    public RepositorioTrabajador(){
        mainList = new ArrayList<>();

    }

    public List<Trabajador> getAllListTrabajadores(){
        return this.mainList;
    }

    public Trabajador getTrabajadorById(String idMainObject){
        for (Trabajador person : mainList) {
            if (Objects.equals(person.getCPersona(), idMainObject)) {
                return person;
            }
        }
        return null;
    }

    public boolean AddTrabajador(Trabajador mainObject) {
        return this.mainList.add(mainObject);
    }

}

