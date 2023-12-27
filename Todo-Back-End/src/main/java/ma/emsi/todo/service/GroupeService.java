package ma.emsi.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.todo.entities.Groupe;
import ma.emsi.todo.repository.GroupeRepository;

@Service
	public class GroupeService {
	    @Autowired
	    private GroupeRepository groupeRepository;

	    public List<Groupe> getAllGroupes() {
	        return groupeRepository.findAll();
	    }

	    public Optional<Groupe> getGroupeById(int id) {
	        return groupeRepository.findById(id);
	    }

	    public Groupe createOrUpdateGroupe(Groupe groupe) {
	        return groupeRepository.save(groupe);
	    }

	    public void deleteGroupe(int id) {
	        groupeRepository.deleteById(id);
	    }
	}


