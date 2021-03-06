package com.sophossolutions.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;


public class ValidarNombre implements Question <String> {
    private Target target;
    public ValidarNombre(Target target){
        this.target = target;
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static ValidarNombre getText(Target target){
        return new ValidarNombre(target);
    }
}
