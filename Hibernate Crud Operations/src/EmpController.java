import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpController {
	public static void main(String[] args) {
		System.out.println("Started.....1");
		Configuration cfg=new Configuration();
		System.out.println("Started.....2");
		
		cfg.addAnnotatedClass(Employee.class).configure();
		System.out.println("Started.....3");
		
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println("Started.....4");
		
		Session ss=sf.openSession();
		System.out.println("Started.....5");
		//Employee ee=ss.get(Employee.class, 1);
		Employee ee=ss.load(Employee.class, 1);
		System.out.println(ee);
		
		//Transaction t=ss.beginTransaction();
		System.out.println("Started.....6");
		//Employee ee=new Employee(2,"Aryan");
		//ss.delete(ee);
		//ss.save(ee);
		//ss.update(ee);
		//System.out.println("Data saved Succesfuly.....");
		//t.commit();
		ss.close();
	}
}
