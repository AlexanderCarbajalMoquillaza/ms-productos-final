package com.example.ms_productos.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagenUrl;
    private BigDecimal precio;
    private Integer stock;
    private Boolean estado;
    private LocalDateTime fechaCreacion;
}
