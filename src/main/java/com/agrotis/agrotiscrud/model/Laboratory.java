package com.agrotis.agrotiscrud.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laboratory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    long id;

    @NotNull
    String name;
}
