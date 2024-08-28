package by.itclass._02_spring_jpa.repositories;

import by.itclass._02_spring_jpa.entities.Airplane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    //find, get, query, delete, update
    //By
    //Model
    Airplane findByModel(String model);
    Airplane findByModelAndPlace(String model, int place);
    Airplane findByModelOrPlace(String model, int place);
    Airplane findByModelLike(String model);
    List<Airplane> findAllByModelLike(String model);

    @Query(value = "SELECT * FROM airplane", nativeQuery = true)
    List<Airplane> getAllPlanes();

    @Query(value = "from Airplane WHERE model = ?1 AND place = ?2")
    Airplane concretePlain(String model, int place);
}
