package com.repository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Implementation fo the custom repository functionality declared in {@link UserRepositoryCustom} based on JPA. To use
 * this implementation in combination with Spring Data JPA you can either register it programatically:
 * <p/>
 * <pre>
 * EntityManager em = ... // Obtain EntityManager
 *
 * UserRepositoryCustom custom = new UserRepositoryImpl();
 * custom.setEntityManager(em);
 *
 * RepositoryFactorySupport factory = new JpaRepositoryFactory(em);
 * UserRepository repository = factory.getRepository(UserRepository.class, custom);
 * </pre>
 * <p/>
 * Using the Spring namespace the implementation will just get picked up due to the classpath scanning for
 * implementations with the {@code Impl} postfix.
 * <p/>
 * <pre>
 * &lt;jpa:repositories base-package=&quot;com.acme.repository&quot; /&gt;
 * </pre>
 * <p/>
 * If you need to manually configure the custom instance see {@link UserRepositoryJdbcImpl} for an example.
 *
 * @author Oliver Gierke
 */
class UserRepositoryImpl implements UserRepositoryCustom {
    /*
     * (non-Javadoc)
     * @see org.springframework.data.jpa.example.repository.UserRepositoryCustom#myCustomBatchOperation()
     */
    public List<User> myCustomBatchOperation() {
        if(new Random().nextBoolean()){
            System.out.println("111");
            return new ArrayList<>();
        } {
            System.out.println("22");
            return new ArrayList<>();
        }

    }
}