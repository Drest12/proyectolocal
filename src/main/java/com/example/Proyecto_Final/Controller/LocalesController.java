
package com.example.Proyecto_Final.Controller;

import com.example.Proyecto_Final.Entity.Locales;
import com.example.Proyecto_Final.Service.LocalesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/locales")
public class LocalesController {
    @Autowired
    private LocalesService localesservice;
    
    @GetMapping
    public List<Locales> findAll(){
        return localesservice.findAll();
    }
     @GetMapping("/{id}")
    public Optional<Locales> findById(@PathVariable Long id){
        return localesservice.findById(id);
    }
}
