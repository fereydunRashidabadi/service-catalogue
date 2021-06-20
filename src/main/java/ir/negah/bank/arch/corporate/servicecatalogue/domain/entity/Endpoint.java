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
@Table(name = "ENDPOINT")
public class Endpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endpoint_s")
    @SequenceGenerator(sequenceName = "endpoint_s", allocationSize = 1, name = "endpoint_s")
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "ENDPINT_NAME", nullable = false)
    private String endpointName;

}
