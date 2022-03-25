package dub.dub_spring_backend.db;

import dub.dub_spring_backend.model.user.dubUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<dubUser, String> {
}
