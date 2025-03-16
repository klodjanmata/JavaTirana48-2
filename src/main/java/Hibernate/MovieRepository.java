package Hibernate;

import Hibernate.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MovieRepository {

    public void save(Movie movie) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(movie);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void delete(Movie movie) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(movie);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void update(Movie movie) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(movie);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Movie getMovieById(int id) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.find(Movie.class, id);
        }
    }

    public List<Movie> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            //return session.createQuery("from Movie").list();
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Movie> cq = cb.createQuery(Movie.class);
            Root<Movie> root = cq.from(Movie.class);
            cq.select(root); // <- correct way
            return session.createQuery(cq).getResultList();
        }
    }

}
