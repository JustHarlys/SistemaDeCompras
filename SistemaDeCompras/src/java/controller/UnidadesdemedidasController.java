package controller;

import com.compras.entity.Unidadesdemedidas;
import facade.UnidadesdemedidasFacade;
import controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "unidadesdemedidasController")
@ViewScoped
public class UnidadesdemedidasController extends AbstractController<Unidadesdemedidas> {

    @Inject
    private MobilePageController mobilePageController;

    public UnidadesdemedidasController() {
        // Inform the Abstract parent controller of the concrete Unidadesdemedidas Entity
        super(Unidadesdemedidas.class);
    }

}
