package bz.data.MainClass.Dao;

import bz.data.MainClass.Entities.Bungalow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface Bungalowrepository extends JpaRepository<Bungalow,Long> {
}
