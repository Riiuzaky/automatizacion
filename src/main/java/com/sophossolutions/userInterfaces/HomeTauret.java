package com.sophossolutions.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.tauretcomputadores.com/home")
public class HomeTauret extends PageObject {

    public static final Target MENU_CATEGORIAS = Target.the("Menu categorias").located(By.xpath("/html/body/header/div[3]/div/div[3]/div[1]"));
    public static final Target SUBMENU_ALMACENAMIENTO = Target.the("Submenu Almacenamiento").located(By.xpath("/html/body/header/div[3]/div/div[3]/div[1]/div/ul/li[2]"));
    public static final Target SUBMENU_DISCOSDUROS = Target.the("Submenu Discos Duros").located(By.xpath("//*[@id=\"submenu5\"]/div/ul/li[1]/a"));
}
