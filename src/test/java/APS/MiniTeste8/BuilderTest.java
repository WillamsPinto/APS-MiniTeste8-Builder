package APS.MiniTeste8;

import org.junit.Test;

import junit.framework.TestCase;

public class BuilderTest extends TestCase {
	
	@Test
	public void testClientePF() {
		Produto banana = new Produto("Banana", 2.00);
		Venda venda = new VendaBuilder()
				.Data("10/10/2020")
				.ClientePF("José", "000.000.000-00")
				.Frete(20.00)
				.Item(3, banana)
				.Funcionario("João")
				.Build();
		
		assertEquals("Data: 10/10/2020"
				+ "\nFrete: 20.0"
				+ "\nItens: [Produto:Descricao:Banana, preco=2.0],Quantidade: 3]"
				+ "\nFuncionario: João",venda.toString());
	}
	
	@Test
	public void testClientePJ() {
		Produto caneta = new Produto("Caneta", 2.00);
		Venda venda = new VendaBuilder()
				.Data("11/10/2020")
				.ClientePF("Monstros SA", "xx.xxx.xxx/xxxx-xx")
				.Frete(20.00)
				.Item(5000, caneta)
				.Funcionario("João")
				.Build();
		
		assertEquals("Data: 11/10/2020"
				+ "\nFrete: 20.0"
				+ "\nItens: [Produto:Descricao:Caneta, preco=2.0],Quantidade: 5000]"
				+ "\nFuncionario: João",venda.toString());
	}
}
