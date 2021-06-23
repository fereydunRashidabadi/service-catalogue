package ir.negah.bank.arch.corporate.servicecatalogue.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * created by  f.rashidabadi
 * created on 6/19/2021
 * inside the package - ir.negah.bank.arch.corporate.servicecatalogue.domain.entity
 **/

@Data
@Entity
@Table(name = "ENDPOINT")
public class Endpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endpoint_s")
    @SequenceGenerator(sequenceName = "endpoint_s", allocationSize = 1, name = "endpoint_s")
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_ID")
    private Set<Company> companies;

    @Column(name = "URL", nullable = false)
    private String url;

    @Column(name = "CURL", nullable = false)
    private String curl;

    @Column(name = "TEST_ENV")
    private Boolean testEnv;

    @Column(name = "PROD_ENV")
    private Boolean prodEnv;

    @Column(name = "DESCRIPTION")
    private String description;

}
