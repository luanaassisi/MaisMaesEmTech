package program;

import java.util.ArrayList;
import java.util.Scanner;

import pessoas.Canditato;
import pessoas.Voluntario;

public class MaeTech {

	public static void main(String[] args) {
		
		String nome,endereco,formacao,areaAtuacao,escolaridade;
		int idade,qtFilhos,idadeFilhos,op;
		long cpf,telefone;
		 double renda;
		char resp=' ';
		 
		Scanner sc=new Scanner(System.in);
		 
		ArrayList<String> canditato=new ArrayList<String>();
		ArrayList<String> voluntario=new ArrayList<String>();
		
		
		Voluntario voluntar=new Voluntario();
		Canditato cand=new Canditato();
		

		
//		comeco while
		do {
			
		System.out.println("=========================================================");
		System.out.println("            Bem vindo ao ++Mães{em tech}");
		
		System.out.println("=========================================================");
		
			System.out.println("1-Cadastrar Candidato ou 2-Cadastrar Voluntario 3-Candidatos Cadastrados 4-Voluntarios Cadastrados:");
			op=sc.nextInt();
			
			
			
			switch(op) {
			
//			cadastro de Candidato
			case 1:
				
				System.out.println("Nome do Candidato:");
				nome=sc.next();
				nome+=sc.nextLine();
				cand.setNome(nome);
				
				System.out.println("Endereço do Candidato:");
				endereco=sc.next();
				endereco+=sc.nextLine();
				cand.setEndereco(endereco);
				
				System.out.println("Idade do Candidato:");
				idade=sc.nextInt();
				cand.setIdade(idade);
				
				System.out.println("Cpf do Candidato:");
				cpf=sc.nextLong();
				cand.setCpf(cpf);
				
				System.out.println("Telefone do Candidato:");
				telefone=sc.nextLong();
				cand.setTelefone(telefone);
				
				System.out.println("Quantidade de filhos do Candidato:");
				qtFilhos=sc.nextInt();
				cand.setQtFilhos(qtFilhos);
				
				System.out.println("idade do filho(s) do Candidato:");
				idadeFilhos=sc.nextInt();
				cand.setIdade(idadeFilhos);
				
				System.out.println("escolaridade do Candidato:");
				escolaridade=sc.next();
				escolaridade+=sc.nextLine();
				cand.setEscolaridade(escolaridade);
				
				System.out.println("Renda do Candidato:");
				renda=sc.nextDouble();
				cand.setRenda(renda);

				
				if(idade>=18) {
				
				canditato.add(cand.toString());
				cand.increment();
				
					System.out.println("Candidato Cadastrado com sucesso!");
				
				
				
				
					if(renda<1000 || idadeFilhos<=13) {
						System.out.println(" O ++maes{em tech} vai entrar em contato!");
					}else {
						System.out.println("Vai concorrer Normalmente!");
					}
				
				
				}else {
					System.out.println("voce nao tem idade pra concorrer");
				}

				
			
			
				break;
				
				
			case 2:
//			Cadastro de Voluntario
				System.out.println("Nome do Voluntario:");
				nome=sc.next();
				nome+=sc.nextLine();
			
				voluntar.setNome(nome);
				
				System.out.println("Endereço voluntario:");
				endereco=sc.next();
				endereco+=sc.nextLine();
			
				voluntar.setEndereco(endereco);

				System.out.println("idade do voluntario:");
				idade=sc.nextInt();
				voluntar.setIdade(idade);
				
				System.out.println("Cpf do voluntario:");
				cpf=sc.nextLong();
				voluntar.setCpf(cpf);
				
				System.out.println("telefone do voluntario:");
				telefone=sc.nextLong();
				voluntar.setTelefone(telefone);
				
				System.out.println("formação do voluntario:");
				formacao=sc.next();
				formacao+=sc.nextLine();
				voluntar.setFormacao(formacao);
				
				System.out.println("area de Atuação do voluntario:");
				areaAtuacao=sc.next();
				areaAtuacao+=sc.nextLine();
				voluntar.setAreaAtuacao(areaAtuacao);
		
				
				
				if(idade>=18) {
				
				System.out.println("Vinculo anterior a Generation? s ou n");
				char r=sc.next().charAt(0);
				
			
//				
				switch(r) {
				case 's':
					System.out.println("Aprovado, vamos verificar a melhor area para você");
					
					voluntario.add(voluntar.toString());
					voluntar.increment();
					break;
					
				
				case 'n':
					System.out.println("area de formação? 1-Psicologia ou 2-Direito 3-Outra");
					String res=sc.next();
					
					if(res.equals("psicologia") || res.equals("Psicologia") || res.equals("PSICOLOGIA") ||res.equals("1")) {
						System.out.println("Aprovado vai para area de Psicologia do ++maes{em tech}");
						voluntario.add(voluntar.toString());
						voluntar.increment();
					}
					else if(res.equals("direito") || res.equals("Direito") || res.equals("DIREITO") ||res.equals("2")) {
						System.out.println("Aprovado vai para area de apoio a Direito do ++maes{em tech}");
						voluntario.add(voluntar.toString());
						voluntar.increment();
					}
					else {
						System.out.println("Obrigado pela candidatura, mas não atende aos requisitos.");
						
					}
				
				}
				
				
				}else {
					System.out.println("voce nao idade pra ser voluntario!");
				}
				
			
				break;
			
			case 3:
//				Mostrar Candidatos
				
				System.out.println("lista de Candidatos:");
				if(canditato.isEmpty()) {
					System.out.println("cadastre candidatos na opção 1");
				
				}else {
				
					for(int i=0;i<canditato.size();i++) {
						System.out.println(canditato.get(i).toString());
					}
			
				}
				
				break;
				
			case 4:
//				Mostrar Voluntarios
			
				System.out.println("lista de Voluntarios:");
				
				if(!voluntario.isEmpty()) {
					for(int i=0;i<voluntario.size();i++) {
						System.out.println(voluntario.get(i).toString());
					}
				}else {
						System.out.println("cadastre Voluntario na opção 2");
				}
				
				break;
			
				default:
				 System.out.println("Esta Opção não existe!");
				break;
			
			}
			

			
			
			
			
			System.out.println("deseja sair! s ou n?");
			resp=sc.next().charAt(0);
		
		}while(resp!='s');
//		fim while
		
		
		sc.close();
		System.out.println("FIM!");
		
		
		
		
		
		
		
		
		
	}

}
