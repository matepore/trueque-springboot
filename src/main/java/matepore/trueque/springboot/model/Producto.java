package matepore.trueque.springboot.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    private String nombre;

    @Column(columnDefinition = "text")
    private String descripcion;

    private String imagen;

    @Column(name = "id_estado_producto")
    private Integer id_estado_producto;
}