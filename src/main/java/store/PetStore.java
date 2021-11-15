package store;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import animals.Animal;

@Entity
public class PetStore {
	
	public PetStore(Long id, String name, String managerName) {
		super();
		this.id = id;
		this.name = name;
		this.managerName = managerName;
	}
	
	public PetStore(String name, String managerName, Address address, ArrayList<Product> products) {
		super();
		this.name = name;
		this.managerName = managerName;
		this.address = address;
		this.products = products;
	}
	
	public PetStore(String name, String managerName) {
		super();
		this.name = name;
		this.managerName = managerName;
	}
	
	public PetStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NAME", length=50, nullable=false, unique=false)
	private String name;
	
	@Column(name="MANAGER_NAME", length=50, nullable=false, unique=false)
	private String managerName;
	
	@ManyToMany
	@JoinTable(name="PET_PROD",
	joinColumns = @JoinColumn(name="ID_PET", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name="ID_PROD", referencedColumnName = "ID"))
	private List<Product> products = new ArrayList<>();
	
	@OneToMany(mappedBy = "petStore")
	private Set<Animal> animals = new HashSet<>();
	
    @OneToOne
    private Address address;
	

	@Override
	public String toString() {
		return "PetStore [id=" + id + ", name=" + name + ", managerName=" + managerName + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
