
package com.example.Proyecto_Final.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Locales")
@Table(name="locales")
public class Locales {
     private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_local")
    private long codigo;
    @Column(name="nom_local")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
}
