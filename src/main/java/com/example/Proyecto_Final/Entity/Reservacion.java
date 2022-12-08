
package com.example.Proyecto_Final.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Reservacion")
@Table(name="reservacion")
public class Reservacion {
         private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_cliente")
    private long codigo;
    @Column(name="nom_cliente")
    private String nombre;
    @Column(name = "dni")
    private String dni;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha_res")
    private String fecha_reservacion;
    @Column(name = "cantidad_per")
    private String cantidad_personas;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "nom_local")
    private String nombre_local;
    @Column(name = "tipo_evento")
    private String tipo_evento;

}
