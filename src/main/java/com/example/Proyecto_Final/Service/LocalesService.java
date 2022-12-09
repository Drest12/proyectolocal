/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Proyecto_Final.Service;

import com.example.Proyecto_Final.Entity.Locales;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author USUARIO
 */
public interface LocalesService {
    public List<Locales> findAll();
     public Optional<Locales> findById(long id);
          //Funcion para agregar datos
    public Locales add(Locales loc);
}
