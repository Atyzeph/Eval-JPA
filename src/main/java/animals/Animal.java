package animals;

import java.util.Date;

import javax.persistence.*;

import store.PetStore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
	
	public Animal(Long id, Date dateBirth, String color, PetStore petStore) {
		super();
		this.id = id;
		this.dateBirth = dateBirth;
		this.color = color;
		this.petStore = petStore;
	}

	public Animal(Date dateBirth, String color, PetStore petStore) {
		super();
		this.dateBirth = dateBirth;
		this.color = color;
		this.petStore = petStore;
	}
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="DATE", columnDefinition="DATE")
	private Date dateBirth;
	
	@Column(name="COLOR", length=50, nullable=false, unique=false)
	private String color;
	
	@ManyToOne
	@JoinColumn(name="PET_ID")
	protected PetStore petStore;
	
	
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", dateBirth=" + dateBirth + ", color=" + color + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDateBirth() {
		return dateBirth;
	}


	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
