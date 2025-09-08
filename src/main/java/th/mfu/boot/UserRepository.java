package th.mfu.boot;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();               // test คาดหวังให้มีเมธอดนี้

    User findByUsername(String username);
}
