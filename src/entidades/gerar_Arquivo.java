package entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gerar_Arquivo {
	
	private String registro;
	
	public gerar_Arquivo() {}
	
	public void gerar_Arquivos(String registro) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Marcacoes.txt", true))) {
			bw.write(registro);
			bw.newLine();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	
	}
	
	


