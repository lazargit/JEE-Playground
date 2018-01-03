package dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import hibernate.HibernateUtil;
import model.Kunde;

public class KundeHibernateDAO implements KundeDAO{

	@Override
	public Kunde findKunde(String usr, String pwd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Kunde.class);
		
		criteria.add(Restrictions.eq("username", usr)).add(Restrictions.eq("passwort", pwd));
		
		Kunde k = (Kunde) criteria.uniqueResult();
		
		session.close();
		return k;
	}

	@Override
	public boolean storeNewKunde(Kunde newKunde) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		session.save(newKunde);
		tr.commit();
		
		return tr.wasCommitted();
	}
	
	public static void main(String[] args) {
		KundeHibernateDAO dao = new KundeHibernateDAO();
		System.out.println(dao.findKunde("max", "123"));
	}

}
