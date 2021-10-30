package project.coffee.app.model.customer;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import project.coffee.app.model.product.Product;
import project.coffee.app.model.user.User;

@Entity
@Table(name = "customer")
public class Customer extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Deprecated
	public Customer() {}

	public Customer(String nome, String cpf, String senha, Product product) {
		super(nome, cpf, senha);

	}


}
