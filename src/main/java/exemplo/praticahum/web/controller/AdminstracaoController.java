package exemplo.praticahum.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import exemplo.praticahum.business.entity.Empresa;
import exemplo.praticahum.business.service.AdministracaoService;

@Controller
public class AdminstracaoController {

	@Autowired
	AdministracaoService administracaoService;
	
	@RequestMapping("/adm/planejarEmpresa")
	public ModelAndView planejarEmpresa(Empresa empresa) {
		
		ModelAndView retorno = new ModelAndView();
		retorno.addObject("empresa", administracaoService.abrirEmpresa(empresa));
		
		return retorno;
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
