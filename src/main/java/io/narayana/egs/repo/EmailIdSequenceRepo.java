package io.narayana.egs.repo;

import io.narayana.egs.entity.EmailIdSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author narayana
 */
@Repository
public interface EmailIdSequenceRepo extends JpaRepository<EmailIdSequence, Long> {
}
