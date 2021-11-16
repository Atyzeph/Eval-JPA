package store;

import javax.persistence.*;


@Entity
public class Address {

	public Address(String number, String street, String zipCode, String city) {
		super();
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NUMBER", length=50, nullable=false, unique=false)
	private String number;
	
	@Column(name="STREET", length=50, nullable=false, unique=false)
	private String street;
	
	@Column(name="ZIP_CODE", length=5, nullable=false, unique=false)
	private String zipCode;
	
	@Column(name="CITY", length=100, nullable=false, unique=false)
	private String city;
	
    @OneToOne(mappedBy = "address")
    private PetStore petStore;
	

	@Override
	public String toString() {
		return "Address [id=" + id + ", number=" + number + ", street=" + street + ", zipCode=" + zipCode + ", city=" + city + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public PetStore getPetStore() {
		return petStore;
	}

	public void setPetStore(PetStore petStore) {
		this.petStore = petStore;
	}
}
