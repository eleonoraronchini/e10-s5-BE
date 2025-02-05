package com.Epicode.demoSpring;

import com.Epicode.demoSpring.service.OrdineService;
import com.Epicode.demoSpring.service.TavoloService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.table.TableCellEditor;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DemoSpringApplicationTests {
	@Autowired DemoSpringApplication app;
	@Autowired private TavoloService tavoloService;
	@Autowired private OrdineService ordineService;

	private Tavolo tavolo;
	private Ordine ordine;


	@Test
	void contextLoads() {
	}

	@BeforeAll
    static void printMessage(){
		System.out.println("INIZIO TEST");

	}
	@AfterAll
    static void printClosingMessage(){
		System.out.println("TEST ANDANTO A BUON FINE");

	}

	@BeforeEach
	void printEachMessage (){
		System.out.println("TEST PROVA");
	}

	@Test
	void verifyTavolo1 (){
		tavolo = tavoloService.createTavolo1();
		assertNotNull(tavolo);

	}

	@Test
	@DisplayName("verifica che i coperti dell'ordine 1 = 1")
	void verifyPlacesOrdine2 (){
		ordine = ordineService.createOrdine2();
		assertEquals(1,ordine.getPlaces());
	}

	@Test
	@DisplayName("verifica che prezzo totale di ordine 3 = 260.8 euro")
	void verifyOrdine3Price (){
		ordine = ordineService.createOrdine3();
		assertEquals(260.8, ordine.TotaleOrdine());
	}


}
