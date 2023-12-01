package com.project.wms.DAO;

import com.project.wms.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IUser extends CrudRepository<Usuario, Integer> {

}
