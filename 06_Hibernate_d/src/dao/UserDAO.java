package dao;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import hibernate.HibernateUtil;
import model.User;

public class UserDAO {
	
	public void attachUser(User user){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(user);
		tr.commit();
		
		System.out.println(tr.wasCommitted());
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query q = session.createQuery("From User");// HQL
		
		return q.list(); 
	}
	
	public List<User> findUsersBySurname(String surname){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query q = session.createQuery("From User where nachname = :n");
		q.setParameter("n", surname);
		
		return q.list();
	}
	
	public List<User> findByExample(User user){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		Example example = Example.create(user);
		criteria.add(example);
		
		return criteria.list();

	}
	
	public User findUserByUsernameAndPassword(String usr, String pwd){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		
		criteria.add(Restrictions.eq("username", usr)).add(Restrictions.eq("passwort", pwd));
		User u =(User) criteria.uniqueResult();
		session.close();
		
		return u;
		
	}
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		//dao.attachUser(new User("Otto", "Meier"));
		//System.out.println(dao.findAllUsers());
		//System.out.println(dao.findUsersBySurname("Meier"));
		
//		User u = new User();
//		u.setVorname("Otto");
//		System.out.println(dao.findByExample(u));
//		User u2 = new User("Paul", "Schultz","test","123");
//		dao.attachUser(u2);
		
		
		System.out.println(dao.findUserByUsernameAndPassword("test", "123"));
		HibernateUtil.getSessionFactory().close();
	}

}
