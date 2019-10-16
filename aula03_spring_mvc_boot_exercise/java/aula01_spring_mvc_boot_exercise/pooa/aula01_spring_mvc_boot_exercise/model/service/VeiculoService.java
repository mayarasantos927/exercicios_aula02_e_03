package aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.beans.Veiculo;
import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.repository.VeiculoRepository;
import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.utils.Calculadora;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar(Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	
	public List <Veiculo> listarTodos(){
		List<Veiculo> veiculos = veiculosRepo.findAll();
		for (Veiculo veiculo : veiculos) {
			veiculo.setTotal(calculadora.calculaKMLitro(veiculo.getLitro(), veiculo.getKm()));
		}
		return veiculos;
	}
}
