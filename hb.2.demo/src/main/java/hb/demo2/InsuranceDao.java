package hb.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hb.demo2.model.Insurance;

public class InsuranceDao {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public void create(Insurance obj) {
		try (Session session = getSessionFactory().openSession()) {
           session.getTransaction().begin();
           session.save(obj);
           session.getTransaction().commit();
		}
    
}

	private SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		if (sessionFactory == null) {
			registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(registry);
			Metadata metadata = sources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}
	
	static void shutdown() {
		// TODO Auto-generated method stub
		if(registry!=null)
		{
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}


}
