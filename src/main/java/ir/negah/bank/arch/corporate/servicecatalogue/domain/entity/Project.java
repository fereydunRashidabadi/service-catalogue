package ir.negah.bank.arch.corporate.servicecatalogue.domain.entity;

import lombok.*;

import javax.persistence.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.domain.entity
 **/

@Data
@Entity
@Table(name = "PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "project_s")
    @SequenceGenerator(sequenceName = "project_s", allocationSize = 1, name = "project_s")
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

}
