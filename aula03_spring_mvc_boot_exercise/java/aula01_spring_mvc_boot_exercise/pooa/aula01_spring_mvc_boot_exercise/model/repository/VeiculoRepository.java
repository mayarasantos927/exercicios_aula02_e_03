package aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.beans.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
