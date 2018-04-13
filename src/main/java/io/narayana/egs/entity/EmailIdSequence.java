package io.narayana.egs.entity;

import javax.persistence.*;

/**
 * @author narayana
 */
@Entity
@Table(name = "EMAILID_SEQUENCE")
public class EmailIdSequence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static EmailIdSequence newInstance() {
        return new EmailIdSequence();
    }
}
