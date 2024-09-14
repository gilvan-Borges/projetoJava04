package interfaces;

import entities.Funcionario;

public interface FuncionarioRepository {

	/*
	 * Método abstrato: Consiste de um método que não possui corpo.
	 * São métodos que tem apenas assinatura.
	 * Quando uma classe HERDAR a interface, a classe deverá fornecer corpo
	 * (IMPLEMENTAR) todos os métodos abstratos da interface
	 */

	void exportarDados(Funcionario funcionario);
	
}
