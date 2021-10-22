package semillero.pruebasUnitarias;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import junit.framework.Assert;
/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author Julian Rodriguez
 * @version
 */
public class OperacionesAritmeticasTest {
	
	private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure();  // inicializa el logger con una configuracion basica
	}
	
	@Test
	public void validarResultadosSumaExitoso() {
		log.info("Inicia ejecucion del metodo validarResultadosSumaExitoso()");
		log.info("======================Inician pruebas unitarias===========");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 450;
		
//		Assert.assertFalse(condition);
//		Assert.assertTrue(condition);
//		Assert.assertNotNull(object);
//		Assert.assertNull(object);
//		Assert.assertEquals(expected, actual);
		Assert.assertEquals(resultado, numero1 + numero2);
		
		log.info("Finaliza la ejecucion de validarResultadosSumaExitoso()");
		
		
	}
	
	@Test
	public void validarResultadoSumaFallido() {
		log.info("Inicia ejecucion del metodo validarResultadosSumaExitoso()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 455;
		
		try {
			
			if(resultado != (numero1+numero2)) {
				log.info("Se ha generado un error probando validarResultadosSumaExitoso()");
				throw new Exception("La suma ha fallado en el calculo");
			}
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		}
		 
		log.info("Finaliza la ejecucion de validarResultadosSumaExitoso()");
		
	}
	
	@AfterTest
	public void finalizarPruebasUnitarias() {
		log.info(":::::::::Finalizan Pruebas Unitarias:::::::::::::");
		
	}
	

}
