package repositories;
import java.io.PrintWriter;
import entities.Funcionario;
import interfaces.FuncionarioRepository;
public class FuncionarioRepositoryXml implements FuncionarioRepository {
	@Override
	public void exportarDados(Funcionario funcionario) {
		
		try {
			
			var printWriter = new PrintWriter("funcionario_" + funcionario.getId() + ".xml");
			
			printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
			printWriter.write("<funcionario>");
				printWriter.write("<id>" + funcionario.getId() + "</id>");
				printWriter.write("<nome>" + funcionario.getNome() + "</nome>");
				printWriter.write("<cpf>" + funcionario.getCpf() + "</cpf>");
				printWriter.write("<matricula>" + funcionario.getMatricula() + "</matricula>");
				printWriter.write("<endereco>");
					printWriter.write("<id>" + funcionario.getEndereco().getId() + "</id>");
					printWriter.write("<logradouro>" + funcionario.getEndereco().getLogradouro() + "</logradouro>");
					printWriter.write("<numero>" + funcionario.getEndereco().getNumero() + "</numero>");
					printWriter.write("<complemento>" + funcionario.getEndereco().getComplemento() + "</complemento>");
					printWriter.write("<bairro>" + funcionario.getEndereco().getBairro() + "</bairro>");
					printWriter.write("<cidade>" + funcionario.getEndereco().getCidade() + "</cidade>");
					printWriter.write("<estado>" + funcionario.getEndereco().getEstado() + "</estado>");
					printWriter.write("<cep>" + funcionario.getEndereco().getCep() + "</cep>");
				printWriter.write("</endereco>");
			printWriter.write("</funcionario>");
			
			printWriter.close();
			
			System.out.println("\nARQUIVO XML GRAVADO COM SUCESSO!");
		}
		catch(Exception e) {
			System.out.println("\nERRO: " + e.getMessage());
		}
	}
}


