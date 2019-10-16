package aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.beans.Veiculo;
import aula01_spring_mvc_boot_exercise.pooa.aula01_spring_mvc_boot_exercise.model.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculo () {
		ModelAndView mav = new ModelAndView("lista_veiculos");
		mav.addObject(new Veiculo());
		List<Veiculo> veiculos = veiculoRepository.findAll();
		mav.addObject("veiculos", veiculos);
		
		return mav;
		
	}
	@PostMapping("/veiculos")
	public String salvar (Veiculo veiculo) {
		veiculoRepository.save(veiculo);
		return "redirect:/veiculos";
	}
}
