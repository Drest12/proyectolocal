
package com.example.Proyecto_Final.Service.Impl;

import com.example.Proyecto_Final.Entity.Locales;
import com.example.Proyecto_Final.Repository.LocalesRepository;
import com.example.Proyecto_Final.Service.LocalesService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalesServiceImpl implements LocalesService {

     @Autowired
    private LocalesRepository localesRepository;
    @Override
    public List<Locales> findAll() {
        return localesRepository.findAll();
    }

    @Override
    public Optional<Locales> findById(long id) {
        return localesRepository.findById(id);
    }
         @Override
    public Locales add(Locales loc) {
        return localesRepository.save(loc);
    }

}
