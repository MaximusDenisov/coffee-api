package ru.krbk.coffeeapi.repository;

import org.springframework.data.repository.CrudRepository;
import ru.krbk.coffeeapi.entity.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
