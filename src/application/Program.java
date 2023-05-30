package application;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Registro;
import entidades.gerar_Arquivo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			//ler nome
			System.out.print("Digite o nome do Funcionário: ");
			String nome = sc.nextLine();
			
			
			Registro r = new Registro();
			gerar_Arquivo ga = new gerar_Arquivo();
			
			//Registrar data e hora
			r.registrar_data_hora();
			//Registrar nome
			r.cadastrar_nome(nome);
			System.out.println(r.toString());
			ga.gerar_Arquivos(r.toString());
		
		}catch(InputMismatchException e){
			System.out.println("Erro: "+ e.getMessage());
		}
		
		
	
	
	}

}
