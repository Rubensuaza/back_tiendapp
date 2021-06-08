package co.edu.tienda.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.tienda.entity.TipoDocumento;

import co.edu.tienda.repository.TipoDocumentoRepository;
import co.edu.tienda.service.TipoDocumentoService;

@Service
public class TipoDocumnetoServiceImpl implements TipoDocumentoService {
	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;
	


	@Override
	public List<TipoDocumento> findAll() {		
		return tipoDocumentoRepository.findAll();
	}

}
