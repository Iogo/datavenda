package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(null,"Iogo Soares","iogo_114@hotmail.com");
		//Pessoa p2 = new Pessoa(null,"Ilma Soares","iogo_114@hotmail.com");
		//Pessoa p3 = new Pessoa(null,"Dhony Soares","iogo_114@hotmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Grava os dados
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto");*/
		
		//Recupera os dados
		Pessoa p = em.find(Pessoa.class, 2);
		
		//Apaga os dados
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		
		em.close();
		emf.close();
		
	}

}
