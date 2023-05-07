package Test.demo.repository;



import Test.demo.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<Address,Integer> {
}

