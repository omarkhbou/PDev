package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Message;

/**
 * Session Bean implementation class MessageManagementEJB
 */
@Stateless
public class MessageManagementEJB implements MessageManagementEJBRemote {

	@PersistenceContext
	EntityManager em; 
    /**
     * Default constructor. 
     */
    public MessageManagementEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addMessage(Message m) {
		
		em.persist(m);
		
	}

	@Override
	public Message findMessageById(int id) {
		
		return em.find(Message.class,id);
	}

	@Override
	public List<Message> findAllMessages() {
		
		return em.createQuery("select m from Message m ",Message.class).getResultList();
	}

	@Override
	public void updateMessage(Message m) {
		
		em.merge(m);
		
	}

	@Override
	public void findByEmail(int id) {
		// TODO Auto-generated method stub
		
	}

}
