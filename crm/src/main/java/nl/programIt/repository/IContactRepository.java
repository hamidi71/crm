package nl.programIt.repository;

import nl.programIt.entities.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactRepository extends JpaRepository<Contacts, Long> {
	public Contacts findByEmailAndPassword(String username,String password);
	//select e from Contacts e where e.email=usrename and e.password=password
	@Query("select s from Contacts s where s.email=:u and s.password=:pwd")
	public Contacts auth(@Param("u") String username,@Param("pwd") String password);
	
	
	
	
}
