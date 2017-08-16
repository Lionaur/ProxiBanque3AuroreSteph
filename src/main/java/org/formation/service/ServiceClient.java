package org.formation.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.formation.dao.IDaoClient;
import org.formation.model.Client;

@Named
public class ServiceClient implements IServiceClient, Serializable {

	private static final long serialVersionUID = -4467538330489170199L;
	
	@Inject
	private IDaoClient dao;
	
	@Override
	public List<Client> getClients() throws Exception {
		List<Client> clients = dao.getClients();
		return clients;
	}

	@Override
	public void addClient(Client cli) throws Exception {
		dao.addClient(cli);
		
	}

	@Override
	public Client getClient(long idClient) throws Exception {
		Client client = dao.getClient(idClient);
		return client;
	}

	@Override
	public void updateClient(Client cli) throws Exception {
		dao.updateClient(cli);
		
	}

	@Override
	public void deleteClient(long idClient) throws Exception {
		dao.deleteClient(idClient);
		
	}

}
