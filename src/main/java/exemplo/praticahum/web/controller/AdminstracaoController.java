package exemplo.praticahum.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import exemplo.praticahum.business.entity.Empresa;

@Controller
public class AdminstracaoController {

	
	@RequestMapping("/adm/planejarEmpresa")
	public String planejarEmpresa(Empresa empresa) {
		return("planejarEmpresa");
	}
	
	@RequestMapping("/adm/ativarEmpresa")
	public String ativarEmpresa() {
		return("ativarEmpresa");
	}
	
	@RequestMapping("/adm/desativarEmpresa")
	public String desativarEmpresa() {
		return("desativarEmpresa");
	} 
	
}
