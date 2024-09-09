package detalles_ventas.domain;


import com.bicicampus.campusbici.bicicletas.domain.Bicicleta;
import com.bicicampus.campusbici.ventas.domain.Ventas;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetallesVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private Ventas venta;

    @ManyToOne
    @JoinColumn(name = "id_bicicleta")
    private Bicicleta bicicleta;
    @NotBlank
    @Column
    private int cantidad;
@NotBlank
    @Column
    private double precioUnitario;
}
