package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Section
 *
 */
@Entity

public class Section implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSection;
	private String sectionName;
	private String description;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Forum forum;
	
	@OneToMany(mappedBy="section",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Post> postsList;
	
	@OneToMany(mappedBy="section",fetch=FetchType.EAGER)
	private Set<Visit> visitsList;

	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	public List<Post> getPostsList() {
		return postsList;
	}
	public void setPostsList(List<Post> postsList) {
		this.postsList = postsList;
	}
	public Section() {
		super();
	}   
	public int getIdSection() {
		return this.idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}   
	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
