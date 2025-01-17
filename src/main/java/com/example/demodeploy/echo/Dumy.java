package com.example.demodeploy.echo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Dumy {
    @Id
    int id;
    String msg;
}