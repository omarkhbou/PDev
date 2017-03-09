package services;

import java.util.List;
import java.util.Set;

import javax.ejb.Remote;

import entities.Forum;

@Remote
public interface ForumServicesEJBRemote {

	public void addForum(Forum f);
	public void updateForum(Forum f);
	public void deleteForum(Forum f);
	public Set<Forum> findByNameForum(String nameForum);
	public List<Forum> findAllForums();
	public Forum findForumById(int idForum);
}
