package com.example.inicial1.repositories;
//BASE PARA TODOS LOS REPOSITORYS

import com.example.inicial1.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean //No se puede instanciar esta clase
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}
