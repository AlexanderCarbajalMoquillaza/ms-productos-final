package com.example.ms_productos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductoRequestDTO {

    @NotBlank(message = "El nombre del producto no puede estar vacío")
    private String nombre;

    private String descripcion;

    @NotBlank(message = "La imagen del producto no puede estar vacío")
    private String imagenUrl;

    @NotNull(message = "El precio es obligatorio")
    @Min(value = 0, message = "El precio debe ser mayor o igual a 0")
    private BigDecimal precio;

    @NotNull(message = "El stock es obligatorio")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stock;

    private Boolean estado;
}
