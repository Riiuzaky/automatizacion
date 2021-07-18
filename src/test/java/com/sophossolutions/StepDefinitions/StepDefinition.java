package com.sophossolutions.StepDefinitions;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.ValidarNombre;
import com.sophossolutions.tasks.LlenarFormulario;
import com.sophossolutions.tasks.SeleccionMenu;
import com.sophossolutions.userInterfaces.HomeTauret;
import com.sophossolutions.userInterfaces.Pago;
import com.sophossolutions.utilities.Constans;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;


public class StepDefinition {

    @Before
    public void setup(){setTheStage(new OnlineCast());}

    @Given("^Necesito buscar un objeto$")
    public void necesitoBuscarUnObjeto() {
        theActorCalled(Constans.actor).wasAbleTo(Open.browserOn(new HomeTauret()));
        theActorInTheSpotlight().attemptsTo(SeleccionMenu.seleccionarMenu());

    }

    @When("^El objeto debe ser Discos duros$")
    public void elObjetoDebeSerDiscosDuros() {
        theActorInTheSpotlight().attemptsTo(LlenarFormulario.llenado());
    }

    @Then("^Validamos que el formulario este bien llenado$")
    public void validamosQueElFormularioEsteBienLlenado() {
        theActorInTheSpotlight().should(seeThat(ValidarNombre.getText(Pago.NOMBRE_PRODUCTO),equalTo
                ("Disco Duro PC Seagate 4TB Barracuda")).orComplainWith(GeneralException.class,"El disco no es el correcto"));
    }
}
