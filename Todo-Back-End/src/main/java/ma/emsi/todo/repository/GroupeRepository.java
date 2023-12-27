package ma.emsi.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.todo.entities.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Integer> {
    // Vous pouvez ajouter des méthodes spécifiques si nécessaire
}
