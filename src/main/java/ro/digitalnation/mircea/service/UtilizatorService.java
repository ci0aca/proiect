package ro.digitalnation.mircea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.digitalnation.mircea.repository.UtilizatorRepository;
import ro.digitalnation.mircea.clase.*;
@Service
public class UtilizatorService {
	
	@Autowired
	private UtilizatorRepository utilizatorRepository;
	
	public List<Utilizator> getAllUtilizatori(){
		List<Utilizator> utilizatori = new ArrayList<>();
		utilizatorRepository.findAll()
							.forEach(utilizatori::add);
		return utilizatori;	
}
	public Utilizator getUtilizator(Long id) {
		return utilizatorRepository.findById(id).get();
	}
	
	public void addUtilizator(Utilizator utilizator) {
		utilizatorRepository.save(utilizator);
	}

	public void updateUtilizator(Long id, Utilizator utilizator) {
		utilizatorRepository.save(utilizator);
	}

	public void deleteUtilizator (Long id) {
		 utilizatorRepository.deleteById(id);
	}
	
}