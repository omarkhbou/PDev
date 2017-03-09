package services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Forum;

/**
 * Session Bean implementation class ForumServicesEJB
 */
@Stateless
@LocalBean
public class ForumServicesEJB implements ForumServicesEJBRemote, ForumServicesEJBLocal {

	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public ForumServicesEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addForum(Forum f) {
		em.persist(f);
	}

	@Override
	public void updateForum(Forum f) {
		em.merge(f);
	}

	@Override
	public void deleteForum(Forum f) {
		em.remove(em.merge(f));
	}

	@Override
	public Set<Forum> findByNameForum(String forumName) {
		return (HashSet<Forum>) em.createQuery("select f from Forum f where f.nameForum=:fname"
				, Forum.class)
				.setParameter("fname", forumName).getResultList();
	}

	@Override
	public List<Forum> findAllForums() {

		return em.createQuery("select f from Forum f", Forum.class).getResultList();
	}

	@Override
	public Forum findForumById(int idForum) {

		return  em.createQuery("select f from Forum f where f.idForum=:fid"
				, Forum.class)
				.setParameter("fid", idForum).getSingleResult();
	}

	@Override
	public void afficheOK() {
System.out.println("OK");		
	}

}
