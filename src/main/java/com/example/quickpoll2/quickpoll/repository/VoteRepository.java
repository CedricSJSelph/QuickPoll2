package com.example.quickpoll2.quickpoll.repository;

import com.example.quickpoll2.quickpoll.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
