package com.bigone;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sa {
	public static void main(String args[]) {

		String nome;
		double saldo = 0;
		int cpf = 0;
		int birth = 0;
		int gender = 0;
		int pass = 0;
		double saque = 1;
		double dep = 1;
		boolean ativo = true;
		int passcheck;
		double app;
		final double rendimento = 0.5;
		double poupanca;
		double investimento;
		int cont = 0;
		double rendimentoMensal = 0;
		float finan;
		final double jurosImo = 5.79;
		final double jurosAut = 2.90;
		while (ativo == true) {
			Scanner abc = new Scanner(System.in);
			System.out.println("1. Criar conta");
			System.out.println("2. Saque");
			System.out.println("3. Depósito");
			System.out.println("4. Transferência");
			System.out.println("5. Aplicar na poupança");
			System.out.println("6. Aplicar no fundo");
			System.out.println("7. Simulação");
			System.out.println("8. Verificar Saldo");
			System.out.println("9. Histórico de transações");
			System.out.println("10. Sair");
			int menu1 = abc.nextInt();
			cont++;
			if (cont % 3 == 0) {
				rendimentoMensal += rendimento;
			}
			switch (menu1) {
			// Criar Conta
			case 1:
				System.out.println("Insira seu nome:");
				abc.nextLine();
				nome = abc.nextLine();
				System.out.println("Insira seu CPF (sem pontos e hífen):");
				cpf = abc.nextInt();
				System.out.println("Insira sua data de nascimento (DDMMAAAA):");
				birth = abc.nextInt();
				System.out.println("Insira seu gênero (Masculino = 1, Feminino = 2):");
				gender = abc.nextInt();
				System.out.println("Insira sua senha (apenas numeros):");
				pass = abc.nextInt();
				break;

			// Saque
			case 2:
				System.out.println("Insira valor para sacar:");
				saque = abc.nextDouble();
				while (saque <= 0) {
					System.out.println("Digite um valor valido");
					saque = abc.nextDouble();
				}
				while (saque > saldo) {
					abc.nextLine();
					System.out.println(
							"Você não possui dinheiro suficiente na sua conta. Digite '0' para não sacar , ou digite um valor valido");
					saque = abc.nextDouble();
				}
				System.out.println("Senha de conta:");
				passcheck = abc.nextInt();
				while (passcheck != pass) {
					abc.nextLine();
					System.out.println("Senha incorreta. Tente novamente:");
					passcheck = abc.nextInt();
				}
				saldo = saldo - saque;

				break;
			// Deposito
			case 3:
				while (dep <= 0) {
					System.out.println("Digite um valor valido");
					dep = abc.nextDouble();
				}
				System.out.println("Quanto irá adicionar para sua conta?");
				dep = abc.nextDouble();
				saldo = dep + saldo;
				break;
			// Transferencia
			case 4:
				break;
			// Aplicar na Poupança
			case 5:
				System.out.println("Insira valor para aplicar:");
				app = abc.nextDouble();
				while (app <= 0) {
					System.out.println("Digite um valor valido");
					app = abc.nextDouble();
				}
				while (app > saldo) {
					abc.nextLine();
					System.out.println(
							"Você não possui dinheiro suficiente na sua conta. Digite '0' para não aplicar , ou digite um valor valido");
					app = abc.nextDouble();
				}
				System.out.println("Senha de conta:");
				passcheck = abc.nextInt();
				while (passcheck != pass) {
					abc.nextLine();
					System.out.println("Senha incorreta. Tente novamente:");
					passcheck = abc.nextInt();
				}
				saldo -= app;
				poupanca = (app * rendimento) / 100;
				poupanca += rendimentoMensal;
				app = app + poupanca;
				// Só para ver se funciona : System.out.println(app);
				break;

			// Fundo de investimento
			case 6:
				System.out.println("Insira valor para aplicar:");
				app = abc.nextDouble();
				while (app <= 0) {
					System.out.println("Digite um valor valido");
					app = abc.nextDouble();
				}
				while (app > saldo) {
					abc.nextLine();
					System.out.println(
							"Você não possui dinheiro suficiente na sua conta. Digite '0' para não aplicar , ou digite um valor valido");
					app = abc.nextDouble();
				}
				System.out.println("Senha de conta:");
				passcheck = abc.nextInt();
				while (passcheck != pass) {
					abc.nextLine();
					System.out.println("Senha incorreta. Tente novamente:");
					passcheck = abc.nextInt();
				}
				saldo -= app;
				investimento = (app * rendimento) / 100;
				investimento += rendimentoMensal;
				app = app + investimento;
				// Só para ver se funciona : System.out.println(app);
				break;
			case 7:
				System.out.println(
						"Voce Deseja um financiamnto para um automovel ? (digite 1) ou para um imovel(digite2)");
				finan = abc.nextFloat();
				System.out.println("Digite o valor total do finan");
				double vl = abc.nextDouble();
				System.out.println("Digite o numero de parcelas");
				int parc = abc.nextInt();
				vl /= parc;
				double total = parc;
				if (finan == 1) {
					double porc = (vl*jurosAut) / 100;
					for (int i = 1; i < parc; i++) {
						vl = vl + porc;
						System.out.println(vl);
						total += vl;
					}
					System.out.println("total : " + total);
				}
				if (finan == 2) {
					double porc1 = (vl * jurosImo) / 100;
					for (int i = 1; i < parc; i++) {
						porc1+=porc1;
						vl = vl + porc1;
						System.out.println(vl);
						total += vl;
					}
					System.out.println("total : " + total);
				}
					System.out.println("Digite 10 para voltar");
					 int sair= abc.nextInt();
					 
					 while(sair !=10){
					 System.out.println("Digite uma opçao valida");
					 sair= abc.nextInt();
					 }
					
				 break;
						 
				
				
			case 10:
				ativo = false;
				break;

			}

		}
	}
}