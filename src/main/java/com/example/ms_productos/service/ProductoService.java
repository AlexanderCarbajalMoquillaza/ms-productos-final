package com.example.ms_productos.service;

import com.example.ms_productos.dto.ProductoRequestDTO;
import com.example.ms_productos.dto.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {
    List<ProductoResponseDTO> listarTodos();
    ProductoResponseDTO obtenerPorId(Long id);
    ProductoResponseDTO guardar(ProductoRequestDTO productoRequestDTO);
    ProductoResponseDTO actualizar(Long id, ProductoRequestDTO productoRequestDTO);
    void eliminar(Long id);
    ProductoResponseDTO descontarStock(Long id, Integer cantidad);
    ProductoResponseDTO aumentarStock(Long id, Integer cantidad);
}
