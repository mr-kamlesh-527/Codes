import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpController {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		System.out.println("step 1......");
		cfg.addAnnotatedClass(Employee.class).configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ss=sf.openSession();
		//Employee ee=ss.get(Employee.class, 1);
		Employee ee=ss.load(Employee.class, 1);
		System.out.println(ee);
		
		//Transaction t=ss.beginTransaction();
		//Employee ee=new Employee(2,"Aryan");
		//ss.delete(ee);
		//ss.save(ee);
		//ss.update(ee);
		//System.out.println("Data saved Succesfuly.....");
		//t.commit();
		ss.close();
	}
}
