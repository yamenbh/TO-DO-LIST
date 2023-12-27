package ma.emsi.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.todo.entities.Groupe;
import ma.emsi.todo.service.GroupeService;

@RestController
	@RequestMapping("/groupes")
	public class GroupeController {
	    @Autowired
	    private GroupeService groupeService;

	    @GetMapping
	    public List<Groupe> getAllGroupes() {
	        return groupeService.getAllGroupes();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Groupe> getGroupeById(@PathVariable int id) {
	     Optional<Groupe> optionalGroupe = groupeService.getGroupeById(id);
	        return optionalGroupe.map(groupe -> new ResponseEntity<>(groupe, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }

	    @PostMapping
	    public ResponseEntity<Groupe> createGroupe(@RequestBody Groupe groupe) {
	        Groupe createdGroupe = groupeService.createOrUpdateGroupe(groupe);
	        return new ResponseEntity<>(createdGroupe, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Groupe> updateGroupe(@PathVariable int id, @RequestBody Groupe groupe) {
	        if (!groupeService.getGroupeById(id).isPresent()) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	        groupe.setId(id);
	        Groupe updatedGroupe = groupeService.createOrUpdateGroupe(groupe);
	        return new ResponseEntity<>(updatedGroupe, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteGroupe(@PathVariable int id) {
	        if (!groupeService.getGroupeById(id).isPresent()) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	        groupeService.deleteGroupe(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

}
