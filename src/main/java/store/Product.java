package store;
import java.util.Set;
import javax.persistence.*;
import enums.ProdType;

@Entity
public class Product {
	
	public Product(Long id, String code, String label, ProdType prodType, double price) {
		super();
		this.id = id;
		this.code = code;
		this.label = label;
		this.prodType = prodType;
		this.price = price;
	}
	
	public Product(String code, String label, ProdType prodType, double price) {
		super();
		this.code = code;
		this.label = label;
		this.prodType = prodType;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CODE", length=50, nullable=false, unique=false)
	private String code;
	
	@Column(name="LABEL", length=50, nullable=false, unique=false)
	private String label;
	
	@Column(name="PROD_TYPE", length=50, nullable=false, unique=false)
	@Enumerated(EnumType.STRING)
	private ProdType prodType;
	
	@Column(name="PRICE", length=50, nullable=false, unique=false)
	private double price;
	
	@ManyToMany(mappedBy = "products")
	private Set<PetStore> petStores;

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", label=" + label + ", prodType=" + prodType + ", price="
				+ price + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ProdType getProdType() {
		return prodType;
	}

	public void setProdType(ProdType prodType) {
		this.prodType = prodType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
