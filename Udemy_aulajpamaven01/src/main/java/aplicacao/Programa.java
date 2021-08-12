package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

	//	Pessoa p1 = new Pessoa(4,"LionMan", "thundercat@gmail.com");
	//	Pessoa p2 = new Pessoa(5,"PapaLeguas", "Ind.Warner@gmail.com");
	//  Pessoa p3 = new Pessoa(6,"PicaPau", "rachadores@gmail.com");
	
//	System.out.println(p1);
//	System.out.println(p2);
//	System.out.println(p3);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = emf.createEntityManager();
	
	for(int i=0; i<15; i++) {
	Pessoa p = em.find(Pessoa.class, i);
	System.out.println(p);
	}
	
//	System.out.println("Pronto");
	em.close();
	emf.close();
	}

}
