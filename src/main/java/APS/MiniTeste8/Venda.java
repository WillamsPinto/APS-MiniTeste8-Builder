package APS.MiniTeste8;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private List<ItemVenda> itens;
	private String data;
	private static Cliente cliente;
	private Frete frete;
	private Funcionario funcionario;
	
	public Venda(String data) {
		this.itens = new ArrayList<ItemVenda>();
		this.data = data;
	}
	
	public Venda() {}
	
	public void addItem(ItemVenda item) {
		itens.add(item);
	}
	
	public List<ItemVenda> getItens(){
		return this.itens;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static Cliente getCliente() {
		return cliente;
	}
	public static void setCliente(Cliente cliente) {
		cliente = cliente;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
}
