package Test.demo.repository;



import Test.demo.model.Order_Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends CrudRepository<Order_Table, Integer> {
}

