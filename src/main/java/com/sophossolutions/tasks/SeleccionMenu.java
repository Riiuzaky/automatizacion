package com.sophossolutions.tasks;

import com.sophossolutions.userInterfaces.HomeTauret;
import com.sophossolutions.userInterfaces.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SeleccionMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeTauret.MENU_CATEGORIAS),
                Click.on(HomeTauret.SUBMENU_ALMACENAMIENTO),
                Click.on(HomeTauret.MENU_CATEGORIAS),
                Click.on(HomeTauret.SUBMENU_DISCOSDUROS), MoveMouse.to(Productos.SELECCION_PRODUCTO),
                Click.on(Productos.SELECCION_PRODUCTO),
                Click.on(Productos.SELECCION_CARRITO),
                Click.on(Productos.SELECCION_PAGAR));
        //try {
        //    wait(20000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
    }


    public static SeleccionMenu seleccionarMenu(){return Tasks.instrumented(SeleccionMenu.class);}
}
