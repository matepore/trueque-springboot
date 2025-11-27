package matepore.trueque.springboot.controller;

import matepore.trueque.springboot.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class InicioController {

    private final ProductoService productoService;

    public InicioController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping({"/", "/index"})
    public String inicio(Model model, HttpSession session) {
        String localidad = (String) session.getAttribute("localidad");
        if (localidad == null) {
            localidad = "Ezeiza";
        }
        model.addAttribute("localidad", localidad);
        model.addAttribute("productos", productoService.listarActivos());
        return "index";
    }
}