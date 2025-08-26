package com.example.sistema_financas_pessoal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SistemaFinancasPessoalApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Spring iniciou!");
	}

}
