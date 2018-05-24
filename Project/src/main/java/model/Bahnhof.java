package model;

import org.hibernate.annotations.Entity;

@Entity
public class Bahnhof {

	private Long ID;

	private String name;

	private int absPreisEntfernung;

	private int absKmEntfernung;

	private int absZeitEntfernung;

	private boolean kopfBahnhof;

}