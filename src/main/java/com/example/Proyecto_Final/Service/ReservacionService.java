
package com.example.Proyecto_Final.Service;

import com.example.Proyecto_Final.Entity.Reservacion;
import java.util.List;
import java.util.Optional;


public interface ReservacionService {
        //Funcion para mostrar todos los datos
    public List<Reservacion> findAll();
    
    
    //Funcion para busqueda por id
    public Optional<Reservacion> findById(long id);
    
    //Funcion para agregar datos
    public Reservacion add(Reservacion res);
    
}
