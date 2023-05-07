package Test.demo.repository;

import Test.demo.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends CrudRepository<Users,Long> {
}
