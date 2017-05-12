package br.com.douglasfernandes.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.douglasfernandes.logger.Logs;

/**
 * Controle das requisicoes
 * @author douglas.f.filho
 *
 */
@Controller
@Transactional
public class SiteController {
	
	@RequestMapping("/")
	public String homePage(){
		Logs.info("[SiteController]::homePage():: Bem vindo a pagina index");
		return "index";
	}
	
}
