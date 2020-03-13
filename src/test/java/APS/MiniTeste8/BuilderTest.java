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
				+ "\nCliente: José | CPF: 000.000.000-00["
				+ "\nItem: Banana | Preço: R$: 2.0 | Quantidade: 3]"
				+ "\nFrete: R$:20.0"
				+ "\nFuncionario: João",venda.toString());
	}
	
	@Test
	public void testClientePF3Produtos() {
		
		Produto banana = new Produto("Banana", 2.00);
		Produto abacaxi = new Produto("Abacaxi", 1.50);
		Produto tamarindo = new Produto("Tamarindo", 2.50);
		
		Venda venda = new VendaBuilder()
				.Data("10/10/2020")
				.ClientePF("José", "000.000.000-00")
				.Frete(50.00)
				.Item(3, banana)
				.Item(5, abacaxi)
				.Item(25, tamarindo)
				.Funcionario("José")
				.Build();
		
		assertEquals("Data: 10/10/2020"
				+ "\nCliente: José | CPF: 000.000.000-00["
				+ "\nItem: Banana | Preço: R$: 2.0 | Quantidade: 3, "
				+ "\nItem: Abacaxi | Preço: R$: 1.5 | Quantidade: 5, "
				+ "\nItem: Tamarindo | Preço: R$: 2.5 | Quantidade: 25]"
				+ "\nFrete: R$:50.0"
				+ "\nFuncionario: José",venda.toString());
	}
	
	@Test
	public void testClientePJ() {
		Produto caneta = new Produto("Caneta", 2.00);
		Venda venda = new VendaBuilder()
				.Data("11/10/2020")
				.ClientePJ("Monstros SA", "xx.xxx.xxx/xxxx-xx")
				.Frete(20.00)
				.Item(5000, caneta)
				.Funcionario("João")
				.Build();
		
		assertEquals("Data: 11/10/2020"
				+ "\nCliente: Monstros SA | CNPJ: xx.xxx.xxx/xxxx-xx["
				+ "\nItem: Caneta | Preço: R$: 2.0 | Quantidade: 5000]"
				+ "\nFrete: R$:20.0"
				+ "\nFuncionario: João",venda.toString());
	}
	
	@Test
	public void testClientePJ5Produtos() {
		
		Produto caneta = new Produto("Caneta", 1.00);
		Produto lapis = new Produto("Lapís", 1.50);
		Produto tesoura = new Produto("Tesoura", 2.50);
		Produto grampeador = new Produto("Grampeador", 5.50);
		Produto marcador = new Produto("Marcador", 1.25);
		
		Venda venda = new VendaBuilder()
				.Data("10/10/2020")
				.ClientePJ("Monstros SA", "xx.xxx.xxx/xxxx-xx")
				.Frete(150.55)
				.Item(2000, caneta)
				.Item(2500, lapis)
				.Item(2000, tesoura)
				.Item(1500, grampeador)
				.Item(2500, marcador)
				.Funcionario("José")
				.Build();
		
		assertEquals("Data: 10/10/2020"
				+ "\nCliente: Monstros SA | CNPJ: xx.xxx.xxx/xxxx-xx["
				+ "\nItem: Caneta | Preço: R$: 1.0 | Quantidade: 2000, "
				+ "\nItem: Lapís | Preço: R$: 1.5 | Quantidade: 2500, "
				+ "\nItem: Tesoura | Preço: R$: 2.5 | Quantidade: 2000, "
				+ "\nItem: Grampeador | Preço: R$: 5.5 | Quantidade: 1500, "
				+ "\nItem: Marcador | Preço: R$: 1.25 | Quantidade: 2500]"
				+ "\nFrete: R$:150.55"
				+ "\nFuncionario: José",venda.toString());
	}
}
