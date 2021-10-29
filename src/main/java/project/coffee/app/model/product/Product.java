package project.coffee.app.model.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_product")
	private Long id;

	@Column(name = "product_name", nullable = false, unique = true, length = 25)
	private String name;

	@Column(name = "product_prrice", nullable = false, unique = false)
	private double price;

	@Column(name = "product_about", nullable = true, unique = false, length = 40)
	private String about;
	
	@Column(name = "product_image", nullable = false, unique = false)
	private String imageURL;
	
	public Product(String name, double price, String about, String imageUrl) {

		this.imageURL = imageUrl;
		this.price = price;
		this.name = name;
		this.about = about;
	}

	@Deprecated
	public Product() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
