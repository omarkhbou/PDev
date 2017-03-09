package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Section;

/**
 * Session Bean implementation class SectionServicesEJB
 */
@Stateless
public class SectionServicesEJB implements SectionServicesEJBRemote, SectionServicesEJBLocal {

	@PersistenceContext
	EntityManager em;

	/**
	 * Default constructor.
	 */
	public SectionServicesEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSection(Section section) {
		em.persist(section);
	}

	@Override
	public void updateSection(Section section) {
		em.merge(section);
	}

	@Override
	public void deleteSection(Section section) {
		em.remove(em.merge(section));
	}

	@Override
	public List<Section> findAllSections() {
		return em.createQuery("select s from Section s", Section.class).getResultList();
	}

	@Override
	public Section findSectionById(int sectionId) {
		return em.createQuery("select s from Section s where s.id=1?", Section.class).setParameter(1, sectionId)
				.getSingleResult();
	}

	@Override
	public Section findSectionByName(String sectionName) {
		return em.createQuery("select s from Section s where s.sectionName=1?", Section.class)
				.setParameter(1, sectionName).getSingleResult();
	}

}
