package controller;

import com.compras.entity.Departamentos;
import facade.DepartamentosFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "departamentosController")
@ViewScoped
public class DepartamentosController extends AbstractController<Departamentos> {

    @Inject
    private MobilePageController mobilePageController;

    public DepartamentosController() {
        // Inform the Abstract parent controller of the concrete Departamentos Entity
        super(Departamentos.class);
    }

}
