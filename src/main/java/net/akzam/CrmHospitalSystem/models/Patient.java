package net.akzam.CrmHospitalSystem.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patient")
@PrimaryKeyJoinColumn(name = "patient_id")
public class Patient extends Person{

    @Column(name = "info")
    private String info;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
