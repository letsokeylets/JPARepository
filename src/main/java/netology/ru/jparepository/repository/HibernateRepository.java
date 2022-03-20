package netology.ru.jparepository.repository;


import netology.ru.jparepository.entity.InfoPerson;
import netology.ru.jparepository.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HibernateRepository extends JpaRepository<Persons, InfoPerson> {

    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByInfoPersonAge(int age);

    Optional<Persons> findByInfoPersonNameAndInfoPersonSurname(String name, String surname);

}
