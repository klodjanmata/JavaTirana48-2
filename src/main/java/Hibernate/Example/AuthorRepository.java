package Hibernate.Example;

import Hibernate.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AuthorRepository {

    public void save(Author author) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(author);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delete(Author author) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(author);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public void update(Author author) {
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            Transaction transaction = session.beginTransaction();
//            session.merge(author);
//            transaction.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public Author getById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.find(Author.class, id);
        }
    }

    public List<Author> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Author> cq = cb.createQuery(Author.class);
            Root<Author> root = cq.from(Author.class);
            cq.select(root);
            return session.createQuery(cq).getResultList();
        }
    }
}
