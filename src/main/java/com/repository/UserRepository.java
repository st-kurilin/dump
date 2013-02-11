package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for {@link User} instances. Provides basic CRUD operations due to the extension of
 * {@link JpaRepository}. Includes custom implemented functionality by extending {@link UserRepositoryCustom}.
 *
 * @author Oliver Gierke
 */
public interface UserRepository extends CrudRepository<User, Long>, UserRepositoryCustom {


    User findByTheUsersName(String username);
//
//
    List<User> findByLastname(String lastname);

    /**
     * Returns all users with the given firstname. This method will be translated into a query using the one declared in
     * the {@link Query} annotation declared one.
     *
     * @param firstname
     * @return
     */
    @Query("select u from User u where u.firstname = ?1")
    List<User> findByFirstname(String firstname);

    @Query("select u from User u where u.firstname = ?1")
    List<User> findByFooo(String firstname);
    class Fooo{
        public void f(){
            System.out.println("go");
        }
    }
}