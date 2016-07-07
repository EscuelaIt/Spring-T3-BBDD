package es.urjc.code.daw;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
	
	List<Customer> findByFirstName(String firstName);
	
}