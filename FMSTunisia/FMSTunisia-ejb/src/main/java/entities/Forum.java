package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Forum
 *
 */
@Entity

public class Forum implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idForum;
	private String forumName;
	private String description;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="forum",cascade={CascadeType.PERSIST,CascadeType.MERGE}
				,fetch=FetchType.EAGER)
	private List<Section> sectionsList;
	
	@OneToOne
	private Moderator moderator;
	
	public void setSectionsList(List<Section> sectionsList) {
		this.sectionsList = sectionsList;
	}

	public Moderator getModerator() {
		return moderator;
	}

	public void setModerator(Moderator moderator) {
		this.moderator = moderator;
	}

	public List<Section> getSectionsList() {
		return sectionsList;
	}

	public Forum() {
		super();
	}   
	public int getIdForum() {
		return this.idForum;
	}

	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}   
	public String getForumName() {
		return this.forumName;
	}

	public void setForumName(String forumName) {
		this.forumName = forumName;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
