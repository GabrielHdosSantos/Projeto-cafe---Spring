package project.coffee.app.model.admin;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import project.coffee.app.model.user.User;

@Entity
@Table(name = "Admin")
public class Admin extends User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Deprecated
	public Admin() {
	}

	public Admin(String nome, String cpf, String senha) {
		super(nome, cpf, senha);
	}

}
