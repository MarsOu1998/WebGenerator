package Test;

import PO.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Insert1 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        User user=new User();
        user.setPassword("oushile");
        user.setName("张三之王");
        Transaction transaction=session.beginTransaction();
        session.save(user);
        transaction.commit();
        util.HibernateSessionFactory.closeSession();
    }
}
