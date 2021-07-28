package interfaces.web;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import drivers.web.DriverWeb;
import interfaces.log.LogWeb;

public interface IGet {
	static Logger logger = LogWeb.getLogger(IGet.class);

	default String getText(By element) {
		String text = null;
		try {
			logger.info(String.format("Do method [obterTexto] with the element [%s].", element));
			text = DriverWeb.getDriver().findElement(element).getText();
			logger.info(String.format("Get text [%s].", text));
		}catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage());
		}
		return text;
	}

	default List<String> getTexts(By element) {
		List<String> text = new ArrayList<>();
		try {
			logger.info(String.format("Do method [getTexts] with element [%s].", element));
			DriverWeb.getDriver().findElements(element).
			stream().forEach(e->text.add(e.getText()));
				
			logger.info(String.format("Get texts [%s].", text));
		} catch (NoSuchElementException|TimeoutException|ElementNotVisibleException e) {
			logger.error(e.getMessage());
			Assert.fail(LocalDateTime.now() + " " + e.getMessage());
		}
		return text;
	}

	

	


	
	
	
	default String obterTextoHidden(By element) {
		try {
			logger.info(String.format("Do method[obterTexto] with the element [%s].", element));
			String retorno = DriverWeb.getDriver().findElement(element).getAttribute("innerText");
			logger.info(String.format("Get text [%s].", retorno));
			return retorno;

		} catch (NoSuchElementException e) {
			logger.error(" -- ERRO: element: '" + element + "' NAO encontrado.'");
			Assert.fail(LocalDateTime.now() + " -- NAO foi possivel localizar o element: '" + element + "' em tela.");
		} catch (TimeoutException e) {
			logger.error(" -- ERRO: Tempo excedido para encontrar o element: '" + element);
			Assert.fail(LocalDateTime.now() + " Tempo excedido para encontrar o element: '" + element + "' em tela.");
		} catch (ElementNotVisibleException e) {
			logger.error(" -- ERRO: element: '" + element + "' NAO esta visivel na plataforma: '");
			Assert.fail(LocalDateTime.now() + " -- O element: " + element + "NAO esta visivel' em tela.");
		}
		return null;
	}
}