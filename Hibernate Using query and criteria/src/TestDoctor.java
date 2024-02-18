import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class TestDoctor {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Doctor.class).configure("kamlesh.xml");

		SessionFactory sf=cfg.buildSessionFactory();

		Session ss=sf.openSession();

//
//		Query query=ss.createQuery("from Doctor");
//
//		List<Doctor> list=query.list();
//		System.out.println("this output is using query hibernate : ");
		System.out.println("\n😍😍😍😍😍😍😍   Student Table   😍😍😍😍😍😍😍\n");
//		for(Doctor doctor : list) {
//			System.out.println("id = "+doctor.getId() +" name = "+doctor.getName()+" city ="+doctor.getCity());
//		}
//		
		Criteria criteria=ss.createCriteria(Doctor.class);
		//								columnName  Value
		//criteria.add(Restrictions.eq("name", "Kamlesh"));
		//criteria.add(Restrictions.lt("id", 4));
		//criteria.add(Restrictions.gt("id", 4));
		//criteria.add(Restrictions.like("name","k%"));
		
		//it is for like method
		// it is used for getting the first record
		//criteria.add(Restrictions.like("name","k%"));
		// it is used for getting the last letter
		//criteria.add(Restrictions.like("name","%sh"));
		// it is used for getting the middle letter
		criteria.add(Restrictions.like("name","%ml%"));
		
		// it is for ilike method
		// it is used for getting the first record
		//criteria.add(Restrictions.ilike("name","k%"));
		// it is used for getting the last letter
		//criteria.add(Restrictions.ilike("name","%sh"));
		// it is used for getting the middle letter
		//criteria.add(Restrictions.ilike("name","%ml%"));
		
		List<Doctor> clist= criteria.list();

		
		
		System.out.println("\n😍😍😍😍😍😍😍   Student Table   😍😍😍😍😍😍😍\n");

		for(Doctor doctor : clist) {
			System.out.println("id = "+doctor.getId() +" name = "+doctor.getName()+" city = "+doctor.getCity());
		}
		
		

//		Transaction t=ss.beginTransaction();
//		System.out.println("Step 5......");
//		Doctor dc=new Doctor(2,"aryan","gokhale nagar");
//		ss.save(dc);
//		System.out.println("inserted data "+dc);
//		System.out.println("Step 6......");
//		t.commit();
		ss.close();
	}
}
