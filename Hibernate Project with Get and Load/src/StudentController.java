import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentController {
	//default insert method
		public void insertD() {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction t=ss.beginTransaction();
			// default constructor
			Student s=new Student();
			s.setId(6);
			s.setName("Kamlesh");
			ss.save(s);
			System.out.println("Record Inserted.....  "+s);
			t.commit();
			ss.close();
			
		}
	//parameterized insert method
		public void insertP(int id, String name) {
			Configuration cfg=new Configuration();
			cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();

			Transaction t=ss.beginTransaction();
			//parameterized constructor
			Student s1=new Student(id,name);
			ss.save(s1);
			System.out.println("Record Inserted.....  "+s1);
			t.commit();
			ss.close();
		}
		
		
		//default update method
				public void updateD() {
					Configuration cfg=new Configuration();
					cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
					SessionFactory sf=cfg.buildSessionFactory();
					Session ss=sf.openSession();
					Transaction t=ss.beginTransaction();
					// default constructor
					Student s=new Student();
					s.setId(6);
					s.setName("Kamlesh");
					ss.update(s);
					System.out.println("Record Updated.....  "+s);
					t.commit();
					ss.close();
					
				}
		//parameterized update method
				public void updateP(int id, String name) {
					Configuration cfg=new Configuration();
					cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
					SessionFactory sf=cfg.buildSessionFactory();
					Session ss=sf.openSession();

					Transaction t=ss.beginTransaction();
					//parameterized constructor
					Student s1=new Student(id,name);
					ss.update(s1);
					System.out.println("Record Updated.....  "+s1);
					t.commit();
					ss.close();
				}
				
				//default delete method
				public void deleteD() {
					Configuration cfg=new Configuration();
					cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
					SessionFactory sf=cfg.buildSessionFactory();
					Session ss=sf.openSession();
					Transaction t=ss.beginTransaction();
					// default constructor
					Student s=new Student();
					s.setId(6);
					s.setName("Kamlesh");
					ss.delete(s);
					System.out.println("Record Deleted.....  "+s);
					t.commit();
					ss.close();
					
				}
				//parameterized delete method
				public void deleteP(int id, String name) {
					Configuration cfg=new Configuration();
					cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
					SessionFactory sf=cfg.buildSessionFactory();
					Session ss=sf.openSession();

					Transaction t=ss.beginTransaction();
					//parameterized constructor
					Student s1=new Student(id,name);
					ss.delete(s1);
					System.out.println("Record Deleted .....  "+s1);
					t.commit();
					ss.close();
				}
	//default method
	public void getSingleD() {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();

		// this are used for show single record from the database
		Student getExam=ss.get(Student.class, 2);//this method is used to show primary key records
		System.out.println("Get Example : "+getExam);
		ss.close();
	}
	//parameterized method
	public void getSingleP(int id) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();

		// this are used for show single record from the database
		Student getExam=ss.get(Student.class, id);//this method is used to show primary key records
		System.out.println("Get Example : "+getExam);
		ss.close();
	}
	//default method
	public void loadSingleD() {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();

		// this are used for show single record from the database
		Student loadExam=ss.load(Student.class, 1); //Primary key
		System.out.println("Load Example : "+loadExam);
		ss.close();
	}
	//parameterized method
	public void loadSingleP(int id) {
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();

		// this are used for show single record from the database
		Student loadExam=ss.load(Student.class, id); //Primary key
		System.out.println("Load Example : "+loadExam);
		ss.close();
	}
	
	public static void main(String[] args) {
		
		StudentController ss=new StudentController();
		//insert method
		ss.insertD();
		ss.insertP(7, "Komal");
		//update method
		ss.updateD();
		ss.updateP(2, "Aryans");
		//delete method
		ss.deleteD();
		ss.deleteP(2, "Aryans");
		//select method using get method
		ss.getSingleD();
		ss.getSingleP(6);
		//select method using load method
		ss.loadSingleD();
		ss.loadSingleP(1);
		
		
		//Configuration cfg=new Configuration();
		//cfg.addAnnotatedClass(Student.class).configure("kamlesh.xml");
		//SessionFactory sf=cfg.buildSessionFactory();
		//Session ss=sf.openSession();
		//Transaction t=ss.beginTransaction();
		//parameterized constructor
		//Student s1=new Student(3,"Sachin");
		//ss.save(s1);
		//System.out.println("Record Inserted.....  "+s1);

		// default constructor
		//Student s=new Student();
		//s.setId(5);
		//s.setName("Amol");
		//ss.save(s);
		//System.out.println("Record Inserted.....  "+s);
		//t.commit();
	
		//ss.close();
		
	}
}
