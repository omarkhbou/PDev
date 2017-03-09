package entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Visit
 *
 */
@Entity

public class Visit implements Serializable {

	   
	@Id
	private int idVisit;
	private int idUser;
	private Date date;
	private int idForum;
	
	@ManyToOne
	private Section section;
	
	private static final long serialVersionUID = 1L;

	public Visit() {
		super();
	}   
	public int getIdVisit() {
		return this.idVisit;
	}

	public void setIdVisit(int idVisit) {
		this.idVisit = idVisit;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public int getIdForum() {
		return this.idForum;
	}

	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}   

	public Section getSection() {
		return section;
	}
	public void setSection(Section section) {
		this.section = section;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idForum;
		result = prime * result + section.getIdSection();
		result = prime * result + idUser;
		result = prime * result + idVisit;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visit other = (Visit) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idForum != other.idForum)
			return false;
		if (section.getIdSection() != other.section.getIdSection())
			return false;
		if (idUser != other.idUser)
			return false;
		if (idVisit != other.idVisit)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Visit [idVisit=" + idVisit + ", idUser=" + idUser + ", date=" + date + ", idForum=" + idForum
				+ ", idSection=" + section.getIdSection() + "]";
	}
   
}
