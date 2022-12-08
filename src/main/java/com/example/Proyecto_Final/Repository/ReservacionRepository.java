
package com.example.Proyecto_Final.Repository;

import com.example.Proyecto_Final.Entity.Reservacion;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservacionRepository extends JpaRepository<Reservacion,Long>  {
    
}
