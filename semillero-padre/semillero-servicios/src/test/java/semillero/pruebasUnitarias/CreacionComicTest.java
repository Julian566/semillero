package semillero.pruebasUnitarias;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;


public class CreacionComicTest {
	public static void main(String[] args) {
		Comic comic1 = new Comic();
		comic1.setNombre("Watamote");
		comic1.setEditorial("Babel");
		comic1.setTematicaEnum(TematicaEnum.HORROR);
		comic1.setColeccion("Gangan");
		comic1.setNumeroPaginas(55);
		comic1.setPrecio(new BigDecimal(15000));
		comic1.setAutores("Nico Tanigawa");
		comic1.setColor(true);
		comic1.setFechaVenta(LocalDate.of(2002, Month.SEPTEMBER, 23));
		comic1.setEstadoEnum(EstadoEnum.ACTIVO);
		comic1.setCantidad(20);
		
		Comic comic2 = new Comic();
		comic2.setNombre("Btooom");
		comic2.setEditorial("Panamericana");
		comic2.setTematicaEnum(TematicaEnum.AVENTURAS);
		comic2.setColeccion("Mangaka");
		comic2.setNumeroPaginas(100);
		comic2.setPrecio(new BigDecimal(20000));
		comic2.setAutores("Junya Inoue");
		comic2.setColor(true);
		comic2.setFechaVenta(LocalDate.of(2001, Month.JUNE, 23));
		comic2.setEstadoEnum(EstadoEnum.ACTIVO);
		comic2.setCantidad(5);
		
		Comic comic3 = new Comic();
		comic3.setNombre("Itazura na kiss");
		comic3.setEditorial("Panamericana");
		comic3.setTematicaEnum(TematicaEnum.FANTASTICO);
		comic3.setColeccion("Mangaka");
		comic3.setNumeroPaginas(100);
		comic3.setPrecio(new BigDecimal(20000));
		comic3.setAutores("Kaoru Tada");
		comic3.setColor(false);
		comic3.setFechaVenta(LocalDate.of(2011, Month.APRIL, 23));
		comic3.setEstadoEnum(EstadoEnum.INACTIVO);
		comic3.setCantidad(0);
		
		Comic comic4 = new Comic();
		comic4.setNombre("Feline Daniele");
		comic4.setEditorial("Futabasha");
		comic4.setTematicaEnum(TematicaEnum.HISTORICO);
		comic4.setColeccion("Furry");
		comic4.setNumeroPaginas(1000);
		comic4.setPrecio(new BigDecimal(5000));
		comic4.setAutores("T S Eliot");
		comic4.setColor(false);
		comic4.setFechaVenta(LocalDate.of(1999, Month.JUNE, 20));
		comic4.setEstadoEnum(EstadoEnum.ACTIVO);
		comic4.setCantidad(1000);
		
		Comic comic5 = new Comic();
		comic5.setNombre("Venom");
		comic5.setEditorial("Haku");
		comic5.setTematicaEnum(TematicaEnum.DEPORTIVO);
		comic5.setColeccion("Super");
		comic5.setNumeroPaginas(200);
		comic5.setPrecio(new BigDecimal(7000));
		comic5.setAutores("Stan lee");
		comic5.setColor(false);
		comic5.setFechaVenta(LocalDate.of(1995, Month.JUNE, 12));
		comic5.setEstadoEnum(EstadoEnum.ACTIVO);
		comic5.setCantidad(50);
		
		Comic comic6 = new Comic();
		comic6.setNombre("Steven Universe");
		comic6.setEditorial("Shoten");
		comic6.setTematicaEnum(TematicaEnum.HUMORISTICO);
		comic6.setColeccion("Amateur");
		comic6.setNumeroPaginas(120);
		comic6.setPrecio(new BigDecimal(9000));
		comic6.setAutores("Rebecca Sugar");
		comic6.setColor(false);
		comic6.setFechaVenta(LocalDate.of(1992, Month.DECEMBER, 24));
		comic6.setEstadoEnum(EstadoEnum.INACTIVO);
		comic6.setCantidad(0);
		
		Comic comic7 = new Comic();
		comic7.setNombre("Simpsons");
		comic7.setEditorial("Nuevo Milenio");
		comic7.setTematicaEnum(TematicaEnum.CIENCIA_FICCION);
		comic7.setColeccion("Yellow");
		comic7.setNumeroPaginas(30);
		comic7.setPrecio(new BigDecimal(15000));
		comic7.setAutores("Matt Groening");
		comic7.setColor(true);
		comic7.setFechaVenta(LocalDate.of(1994, Month.AUGUST, 25));
		comic7.setEstadoEnum(EstadoEnum.ACTIVO);
		comic7.setCantidad(50);
		
		Comic comic8 = new Comic();
		comic8.setNombre("Un show mas");
		comic8.setEditorial("Planeta");
		comic8.setTematicaEnum(TematicaEnum.HISTORICO);
		comic8.setColeccion("Azulejo");
		comic8.setNumeroPaginas(20);
		comic8.setPrecio(new BigDecimal(30000));
		comic8.setAutores("Mike mendel");
		comic8.setColor(false);
		comic8.setFechaVenta(LocalDate.of(2004, Month.AUGUST, 10));
		comic8.setEstadoEnum(EstadoEnum.INACTIVO);
		comic8.setCantidad(150);
		
		Comic comic9 = new Comic();
		comic9.setNombre("Luna de Pluton");
		comic9.setEditorial("Planeta");
		comic9.setTematicaEnum(TematicaEnum.HISTORICO);
		comic9.setColeccion("terraria");
		comic9.setNumeroPaginas(20);
		comic9.setPrecio(new BigDecimal(20000));
		comic9.setAutores("dross");
		comic9.setColor(true);
		comic9.setFechaVenta(LocalDate.of(2008, Month.JANUARY, 25));
		comic9.setEstadoEnum(EstadoEnum.ACTIVO);
		comic9.setCantidad(156);
		
		Comic comic10 = new Comic();
		comic10.setNombre("Terrenos");
		comic10.setEditorial("Panamericana");
		comic10.setTematicaEnum(TematicaEnum.BELICO);
		comic10.setColeccion("jardines");
		comic10.setNumeroPaginas(180);
		comic10.setPrecio(new BigDecimal(18000));
		comic10.setAutores("dios");
		comic10.setColor(true);
		comic10.setFechaVenta(LocalDate.of(2011, Month.JANUARY, 11));
		comic10.setEstadoEnum(EstadoEnum.ACTIVO);
		comic10.setCantidad(111);
		
		ArrayList<Object> listaComics = new ArrayList<Object>();
		listaComics.add((Object) comic1);
		listaComics.add((Object) comic2);
		listaComics.add((Object) comic3);
		listaComics.add((Object) comic4);
		listaComics.add((Object) comic5);
		listaComics.add((Object) comic6);
		listaComics.add((Object) comic7);
		listaComics.add((Object) comic8);
		listaComics.add((Object) comic9);
		listaComics.add((Object) comic10);
		
		
	}
	
	private final static Logger log = Logger.getLogger(CreacionComicTest.class);
	@BeforeTest
	public void inicializar() {
		BasicConfigurator.configure();  // inicializa el logger con una configuracion basica
	}
	 
	@Test
	private void ComicsActivos(Object o) {
		log.info("Inicia ejecucion del metodo ComicsActivos()");
		if(o instanceof Comic) {
			
				if(Comic.getEstadoEnum() != EstadoEnum.ACTIVO)
				System.out.println(o.toString());
				
				try {
					if(Comic.getEstadoEnum() != EstadoEnum.ACTIVO) {
						throw new Exception("Comic inactivo");
					}
					
				} catch (Exception e) {
					Assert.assertEquals(e.getMessage(), "Comic inactivo");
				}
				
			
		}
	}	
}
		
		
		
		
		
	