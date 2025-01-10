package com.devradu.Finance_Backend.domain.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "BUDGET")
public class BudgetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Date startDate;

    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
