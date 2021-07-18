package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Pago {
    public static final Target CASILLA_NOMBRES = Target.the("Nombres").located(By.id("nombres"));
    public static final Target CASILLA_APELLIDOS = Target.the("Apellidos").located(By.id("apellidos"));
    public static final Target CASILLA_EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"pay\"]/div/div[1]/div/div[2]/div[3]/input"));
    public static final Target CASILLA_DOCUMENTO = Target.the("Documento").located(By.id("dni"));
    public static final Target CASILLA_CIUDAD = Target.the("Ciudad").located(By.id("city"));
    public static final Target CASILLA_DIRECCION = Target.the("Direccion").located(By.xpath("//*[@id=\"pay\"]/div/div[1]/div/div[2]/div[6]/input"));
    public static final Target CASILLA_TELEFONO = Target.the("Telefono").located(By.xpath("//*[@id=\"pay\"]/div/div[1]/div/div[2]/div[7]/input"));
    public static final Target NOMBRE_PRODUCTO = Target.the("Nombre producto").located(By.xpath("//*[@id=\"app\"]/article[1]/div/div/div[1]/div[1]/table[1]/tbody/tr/th/div/p"));
}
