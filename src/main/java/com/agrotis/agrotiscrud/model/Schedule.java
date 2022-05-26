package com.agrotis.agrotiscrud.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    long id;

    @NotNull
    String name;

    @NotNull
    Date startDate;

    @NotNull
    Date endDate;

    @NotNull
    @ManyToOne
    Property property;

    @NotNull
    @ManyToOne
    Laboratory laboratory;

    String note;
}
