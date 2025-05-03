package br.com.rns.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "invoice")
@Getter
@Setter
@NoArgsConstructor
public class Invoice implements Serializable {


    private static final long serialVersionUID = 1088407771257439764L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;
    @Column(name = "corporative_name")
    private String corporativeName;
    @Column(name = "generation_month")
    private String generationMonth;
    @Column(name = "calc_value")
    private double calcValue;
}
