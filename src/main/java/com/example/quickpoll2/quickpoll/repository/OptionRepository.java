package com.example.quickpoll2.quickpoll.repository;

import com.example.quickpoll2.quickpoll.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
