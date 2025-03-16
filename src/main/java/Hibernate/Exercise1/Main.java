package Hibernate.Exercise1;

import Hibernate.Exercise1.Entity.Actor;
import Hibernate.Exercise1.Entity.Genre;
import Hibernate.Exercise1.Entity.Movie;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Genre.class)
                .addAnnotatedClass(Movie.class)
                .buildSessionFactory();
    }
}
