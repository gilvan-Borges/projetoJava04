package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Endereco;
import entities.Funcionario;
import interfaces.FuncionarioRepository;
import repositories.FuncionarioRepositoryTxt;
import repositories.FuncionarioRepositoryXml;

public class FuncionarioController {

	/*
	 * Método para capturar os dados dos funcionario
	 * e exportar para um determinado arquivo
	 */
	public void cadastrarFuncionario() {
		
		
		var funcionario = obterDadosFuncionario();
		funcionario.setEndereco(obterDadosEndereco());
		
		//Criando uma variavel da interface
		FuncionarioRepository funcionarioRepository = null;
	
		var tipo = JOptionPane.showInputDialog("ESCOLHA (1)TXT OU (2)XML");
		switch (tipo){
		case "1":
			funcionarioRepository = new FuncionarioRepositoryTxt();//POLIMOFISMO
			break;
		case "2":
			funcionarioRepository = new FuncionarioRepositoryXml();//POLIMOFISMO			
			break;
		}
		
		//exportar os dados para arquivo
		funcionarioRepository.exportarDados(funcionario);
	}
	
	 /*
	 * criando um metodo para fazer a captura dos dados do funcionario
	 */
	
	private Funcionario obterDadosFuncionario(){
		
		var funcionario = new Funcionario();
		
		funcionario.setId(UUID.randomUUID());
		funcionario.setNome(JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONÁRIO:"));
		funcionario.setCpf(JOptionPane.showInputDialog("INFORME O CPF DO FUNCIONÁRIO:"));
		funcionario.setMatricula(JOptionPane.showInputDialog("INFORME A MATRICULA DO FUNCIONÁRIO:"));
		
		return funcionario;
	}
	/*
	 * criando um metodo para fazer a captura dos dados do endereço.
	 */
	
	private Endereco obterDadosEndereco() {
		
		var endereco = new Endereco();
		
		endereco.setId(UUID.randomUUID());
		endereco.setLogradouro(JOptionPane.showInputDialog("INFORME O LOGRADOURO:"));
		endereco.setNumero(JOptionPane.showInputDialog("INFORME O NUMERO:"));
		endereco.setComplemento(JOptionPane.showInputDialog("INFORME O COMPLEMENTO:"));
		endereco.setBairro(JOptionPane.showInputDialog("INFORME O BAIRRO:"));
		endereco.setCidade(JOptionPane.showInputDialog("INFORME A CIDADE:"));
		endereco.setEstado(JOptionPane.showInputDialog("INFORME O ESTADO:"));
		endereco.setCep(JOptionPane.showInputDialog("INFORME O CEP:"));
		
		return endereco;
	}
}
