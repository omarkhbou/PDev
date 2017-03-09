package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Complaint;

/**
 * Session Bean implementation class ComplaintManagementEJB
 */
@Stateless
public class ComplaintManagementEJB implements ComplaintManagementEJBRemote {

	@PersistenceContext
	EntityManager em;
    /**
     * Default constructor. 
     */
    public ComplaintManagementEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addComplaint(Complaint c) {
		

		em.persist(c);
		
	}

	@Override
	public Complaint findComplaintById(int id) {
		
		return em.find(Complaint.class,id);
	}

	@Override
	public List<Complaint> findAllComplaints() {
		
		return em.createQuery("select c from Complaint c ",Complaint.class).getResultList();
	}

	@Override
	public Complaint findComplaintByState(String state) {
		
		//combobox pour choisir l'etat 
				return em.createQuery("select c from Complaint c where c.state=?1",Complaint.class)
				.setParameter(1, state)
				.getSingleResult();
	}

	@Override
	public void treatComplaint(int id) {
		
		em.find(Complaint.class,id).setState("teated");
		
	}

	@Override
	public void updateComplaint(Complaint c) {
		
		em.merge(c); 
		
	}

}
