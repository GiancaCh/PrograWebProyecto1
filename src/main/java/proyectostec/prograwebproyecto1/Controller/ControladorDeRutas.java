package proyectostec.prograwebproyecto1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorDeRutas {

    @GetMapping("/")
    public String IniciarSesion() {
        return "paginalogin";
    }

    // RUTAS PARA PERFIL USUARIO
    @GetMapping("/inicio")
    public String PaginaPrincipal() {
        return "paginaprincipal";
    }

    @GetMapping("/menu_productos")
    public String MenuDeProductos() {
        return "menuproductos";
    }

    @GetMapping("/realizar_pedidos")
    public String CreacionPedidos() {
        return "crearpedidos";
    }

    @GetMapping("/pedidos_realizados")
    public String PedidosCreados() {
        return "pedidosrealizados";
    }

    // RUTAS PARA PERFIL ADMIN
    @GetMapping("/reporte_pedidos")
    public String VistaTotalDePedidos() {
        return "reportegeneralpedidos";
    }

}
