package exemplo.praticahum.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exemplo.praticahum.business.entity.Empresa;
import exemplo.praticahum.business.entity.repository.EmpresaRepository;

@Service
public class AdministracaoService {

	@Autowired
	EmpresaRepository empresaRepository;
	
	public Empresa abrirEmpresa(Empresa empresa) {
		
		if (!empresaRepository.findByRazaoSocial(empresa.getRazaoSocial())) {
			
		}
		
		return new Empresa();
	}
	
}
