package com.cicd.jaaj;

import java.util.Scanner;

public class Greeting {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		
		String greeting = "Bem vindo, ";
		
		System.out.println("Insira seu nome");
		String nome = scan.next();
		
		System.out.println("Insira sua idade");
		int idade = scan.nextInt();
		
		 
		System.out.println(greeting + nome + "\n" + "Voc� tem "+ idade + " anos");
		
		System.out.println("Ass: Criadora, Jackeline");
		System.out.println("Colaborador: Carjooj");
		// Comentário atividade fork
		System.out.println("Forkando o repo")
		
	}
}
