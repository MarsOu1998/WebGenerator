package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;

public class Insert2 {
    public static void main(String[] args) {
        Session session=util.HibernateSessionFactory.getSession();
        //动态模型用HashMap容纳一个记录
        HashMap hashMap=new HashMap();
        hashMap.put("account",3);
        hashMap.put("password","oushile");
        hashMap.put("name","张三的儿子");

        Transaction transaction=session.beginTransaction();
        session.save("User",hashMap);
        transaction.commit();

        util.HibernateSessionFactory.closeSession();
    }
}
