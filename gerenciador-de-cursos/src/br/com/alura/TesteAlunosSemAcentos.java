package br.com.alura;

import java.util.*;

public class TesteAlunosSemAcentos {

    public static void main(String[] args) {
    	
        //1) adicione alguns alunos
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        
        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());

        //3) tente adicionar um aluno que existe
        alunos.add("Pedro");
        
        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());
        
        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
    }
}