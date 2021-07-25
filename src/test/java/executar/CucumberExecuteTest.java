package executar;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.hpe.alm.octane.OctaneCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import drivers.web.DriverWeb;
import enums.Browser;

@RunWith(OctaneCucumber.class)
@CucumberOptions(features = "src/test/resources/features/", 
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Evidencias/Status - Automacao de Testes.html",
				"pretty",
				"html:src/test/resources/relatorios/cucumber-reports/",
				"json:src/test/resources/relatorios/cucumber-reports/cucumber.json",
				"junit:src/test/resources/relatorios/cucumber-reports/Cucumber.xml"}, 
		glue = {""},// 
		tags = "@S1", //
		snippets = SnippetType.CAMELCASE,
		monochrome = true, 
		dryRun = true, 
		strict = false)
public class CucumberExecuteTest {

	@BeforeClass
	public static void setarConfiguracoes() {
		DriverWeb.getDriver(Browser.CHROME, true);
		new MakeDirectory().validarDiretorio();
		new ValidateEvidence().deletarPrints();
	}

	@AfterClass
	public static void fecharNavegador() {	
		DriverWeb.finalizarDriver();
		Reporter.loadXMLConfig(new File("Configuracao/extension-config.xml"));
		Reporter.setSystemInfo("Usuário Executor", System.getProperty("user.name"));
		Reporter.setSystemInfo("Sistema Operacional", System.getProperty("os.name").toString());
		Reporter.setTestRunnerOutput("Relatório de execução dos testes automatizados");
	}
}