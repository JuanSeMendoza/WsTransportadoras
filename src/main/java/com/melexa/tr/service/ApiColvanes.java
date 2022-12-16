package com.melexa.tr.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.melexa.tr.entities.Transportadoras;
import com.melexa.tr.model.Colvanes;
import com.melexa.tr.repositories.ColvanesRepository;
import com.melexa.tr.util.Constantes;

@Service
public class ApiColvanes {

	@Autowired
	ColvanesRepository colvanesRepository;
	public String consultaRemesa() {
		
		Transportadoras transportadoras = new Transportadoras();
		
		Colvanes colvanes = new RestTemplate().getForObject(Constantes.API_COLVANES, Colvanes.class);
		String json = new Gson().toJson(colvanes);
	
		transportadoras.setIdCompania(Constantes.COMPANIA);
		transportadoras.setIdTransportadora(Constantes.ID_COLVANES);
		transportadoras.setIdTipoDocumento(Constantes.ID_TIPO_GUIA);
		transportadoras.setDocumento(colvanes.getGuia());
		transportadoras.setDatos(json);
		
		colvanesRepository.save(transportadoras);
		
		
		return "ok";
		
	}
}
