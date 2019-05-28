package br.com.zenganet.segurancabasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zenganet.segurancabasic.model.Apolice;

@Repository
public interface ApoliceRepository extends JpaRepository<Apolice, Long> {

	public List<Apolice> findByClienteId(long clienteId);
	
}
