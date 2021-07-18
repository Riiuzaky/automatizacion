package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Productos {
    public static final Target SELECCION_PRODUCTO = Target.the("Productos").located(By.xpath("//*[@id=\"products\"]/div[5]/div/div/ul/li[1]/div/div[4]/button"));
    public static final Target SELECCION_CARRITO = Target.the("Carrito").located(By.xpath("/html/body/header/div[1]/div[2]/div"));
    public static final Target SELECCION_PAGAR = Target.the("Pagar").located(By.xpath("/html/body/header/div[1]/div[2]/div/div[2]/div[2]/a"));
}
