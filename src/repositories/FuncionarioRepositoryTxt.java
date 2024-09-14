package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

/*
 * Classe para implementar os métodos da interface
 */

public class FuncionarioRepositoryTxt implements FuncionarioRepository {

	@Override
	public void exportarDados(Funcionario funcionario) {

		try {
			
			var printWriter = new PrintWriter("funcionario_" + funcionario.getId() + ".txt");
			
			printWriter.write("\n" + funcionario.getId());
			printWriter.write("\n" + funcionario.getNome());
			printWriter.write("\n" + funcionario.getCpf());
			printWriter.write("\n" + funcionario.getMatricula());
			printWriter.write("\n" + funcionario.getEndereco().getLogradouro());
			printWriter.write("\n" + funcionario.getEndereco().getNumero());
			printWriter.write("\n" + funcionario.getEndereco().getComplemento());
			printWriter.write("\n" + funcionario.getEndereco().getBairro());
			printWriter.write("\n" + funcionario.getEndereco().getCidade());
			printWriter.write("\n" + funcionario.getEndereco().getEstado());
			printWriter.write("\n" + funcionario.getEndereco().getCep());
			
			printWriter.close();
			
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");
		} catch (Exception e) {
			System.out.println("erro:" + e.getMessage());
		}

	}

}
