package com.example.quickpoll2.quickpoll.repository;

import com.example.quickpoll2.quickpoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {



//    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.PUT)
//    public default ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
//        // Save the entity
//        Poll p = PollRepository.save(poll);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.DELETE)
//    public default ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
//        PollRepository.delete(pollId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}