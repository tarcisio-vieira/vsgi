package br.com.vsgi.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vsgi.core.domain.user.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
