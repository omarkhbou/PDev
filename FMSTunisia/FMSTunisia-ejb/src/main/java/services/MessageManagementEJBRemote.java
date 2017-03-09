package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Message;

@Remote
public interface MessageManagementEJBRemote {
	
	public void addMessage(Message m);
	public Message findMessageById(int id);
	public List<Message> findAllMessages();
	public void updateMessage(Message m);
	public void findByEmail(int id);

}
