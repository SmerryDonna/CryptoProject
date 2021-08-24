package com.cryptoproject.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.cryptoproject.graph.InterGraph;
import com.cryptoproject.graph.LogInGraph;
import com.cryptoproject.model.Model;

public class ControllerUIModel {
	
	private InterGraph inter;
	private LogInGraph login;
	private Model model;
	
    
	
	private ActionListener gestoreSubmitInter;
    private ActionListener gestoreSubmitLogin;
    
    private String indirizzoProtafoglio;
	private String previsione;
	private String valuta;
	private String scommessa;
	
	private String username;
	private String psw;

	
	
	
	public ControllerUIModel (InterGraph inter, LogInGraph login, Model model) {
		this.inter = inter;
		this.login = login;
		this.model = model;
		gestoreEventi();
		
		
		 //assegno il gestore di evento al bottone btnSubmit dell'interfaccia
        inter.getBtnSubmit().addActionListener(gestoreSubmitInter);
        
        login.getBtnSubmit().addActionListener(gestoreSubmitLogin);
	}
	
	
	private void gestoreEventi() {
		//Codice gestore dell'interfaccia grafica autenticata
		gestoreSubmitInter = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				indirizzoProtafoglio = inter.getPortafoglio();
				previsione = inter.getPrevisione();
				valuta = inter.getValuta();
				scommessa = inter.getScommessa();
				
				
			}
			
		};
		
		//Codice gestore dell'interfaccia di login
		gestoreSubmitLogin = new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				username = login.getUsername();
				psw = login.getPsw();
			}
		};
		
	}



}
