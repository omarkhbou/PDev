package services;

import java.util.List;

import javax.ejb.Remote;

import entities.Section;

@Remote
public interface SectionServicesEJBRemote {

	public void addSection(Section section);
	public void updateSection(Section section);
	public void deleteSection(Section section);
	public List<Section> findAllSections();
	public Section findSectionById(int sectionId);
	public Section findSectionByName(String sectionName);
	
}
