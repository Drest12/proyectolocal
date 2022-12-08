/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Proyecto_Final.Service.Impl;

import com.example.Proyecto_Final.Entity.Reservacion;
import com.example.Proyecto_Final.Repository.ReservacionRepository;
import com.example.Proyecto_Final.Service.ReservacionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReservacionServiceImpl implements ReservacionService {

    @Autowired
    private ReservacionRepository reservacionRepository;
    
    @Override
    public List<Reservacion> findAll() {
        return reservacionRepository.findAll();
    }


    @Override
    public Optional<Reservacion> findById(long id) {
        return reservacionRepository.findById(id);
    }

    @Override
    public Reservacion add(Reservacion res) {
        return reservacionRepository.save(res);
    }
}
