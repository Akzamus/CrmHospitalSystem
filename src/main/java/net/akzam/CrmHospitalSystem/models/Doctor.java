package net.akzam.CrmHospitalSystem.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "doctor")
@PrimaryKeyJoinColumn(name = "doctor_id")
public class Doctor extends Person{

    @Column(name = "type")
    private String type;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
}
