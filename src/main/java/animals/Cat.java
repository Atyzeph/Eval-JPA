package animals;

import java.util.Date;

import javax.persistence.*;

import store.PetStore;

@Entity
public class Cat extends Animal {

	
	public Cat(Long id, Date dateBirth, String color, String chipId, PetStore petStore) {
		super(id, dateBirth, color, petStore);
		this.chipId = chipId;
		// TODO Auto-generated constructor stub
	}
	
	public Cat(Date dateBirth, String color, String chipId, PetStore petStore) {
		super(dateBirth, color, petStore);
		this.chipId = chipId;
		// TODO Auto-generated constructor stub
	}

	public Cat() {
		super();
	}

	@Column(name="SHIP_ID", length=50, nullable=false, unique=false)
	private String chipId;

	public String getChipId() {
		return chipId;
	}

	public void setChipId(String chipId) {
		this.chipId = chipId;
	}
}