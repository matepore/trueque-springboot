package matepore.trueque.springboot.service;

import matepore.trueque.springboot.model.Producto;
import matepore.trueque.springboot.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listarActivos() {
        return repo.findByIdEstadoProducto(1);
    }
}