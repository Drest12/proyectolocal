
package com.example.Proyecto_Final.Controller;

import com.example.Proyecto_Final.Entity.Reservacion;
import com.example.Proyecto_Final.Service.ReservacionService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservacion")
public class ReservacionController {
    @Autowired
    private ReservacionService reservacionService;
    
    @GetMapping
    public List<Reservacion> findAll(){
        return reservacionService.findAll();
    }
    
  
    
    @GetMapping("/{id}")
    public Optional<Reservacion> findById(@PathVariable Long id){
        return reservacionService.findById(id);
    }
    
    @PostMapping
    public Reservacion add(@RequestBody Reservacion res){
        return reservacionService.add(res);
    }
}
