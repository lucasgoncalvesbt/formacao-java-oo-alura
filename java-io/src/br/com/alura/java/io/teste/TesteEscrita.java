package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException{
		
		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer isr = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(isr);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asddadasdadasdasdasdad dasd");
		
		bw.close();

	}

}
