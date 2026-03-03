package sn.edu.ugb.lumiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.ugb.lumiere.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}