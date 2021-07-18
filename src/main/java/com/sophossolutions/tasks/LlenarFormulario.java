package com.sophossolutions.tasks;

import com.sophossolutions.userInterfaces.Pago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class LlenarFormulario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Jonathan Steven").into(Pago.CASILLA_NOMBRES),
                Enter.theValue("Cruz Monroy").into(Pago.CASILLA_APELLIDOS),
                Enter.theValue("Jonathan@gmail.com").into(Pago.CASILLA_EMAIL),
                Enter.theValue("123456789").into(Pago.CASILLA_DOCUMENTO),
                Enter.theValue("BOGOTA DC").into(Pago.CASILLA_CIUDAD),
                Enter.theValue("KR 145 # 150-64").into(Pago.CASILLA_DIRECCION),
                Enter.theValue("987654321").into(Pago.CASILLA_TELEFONO));
    }

    public static LlenarFormulario llenado (){return Tasks.instrumented(LlenarFormulario.class);}
}
