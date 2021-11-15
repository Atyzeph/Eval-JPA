package animals;

import java.util.Date;

import javax.persistence.*;

import enums.FishLivEnv;
import store.PetStore;

@Entity
public class Fish extends Animal {

		
	public Fish(Long id, Date dateBirth, String color, FishLivEnv fishLivEnv, PetStore petStore) {
		super(id, dateBirth, color, petStore);
		this.fishLivEnv = fishLivEnv;
		// TODO Auto-generated constructor stub
	}

	public Fish(Date dateBirth, String color, FishLivEnv fishLivEnv, PetStore petStore) {
		super(dateBirth, color, petStore);
		this.fishLivEnv = fishLivEnv;
		// TODO Auto-generated constructor stub
	}
	
	public Fish() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Column(name="LIVING_ENV", length=50, nullable=false, unique=false)
	@Enumerated(EnumType.STRING)
	private FishLivEnv fishLivEnv;
	
	
	@Override
	public String toString() {
		return "Cat [fishLivEnv=" + fishLivEnv + "]";
	}


	public FishLivEnv getFishLivEnv() {
		return fishLivEnv;
	}

	public void setFishLivEnv(FishLivEnv fishLivEnv) {
		this.fishLivEnv = fishLivEnv;
	}
}
