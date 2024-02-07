package controller;

import com.compras.entity.Empleados;
import facade.EmpleadosFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "empleadosController")
@ViewScoped
public class EmpleadosController extends AbstractController<Empleados> {

    @Inject
    private MobilePageController mobilePageController;

    public EmpleadosController() {
        // Inform the Abstract parent controller of the concrete Empleados Entity
        super(Empleados.class);
    }

}
