package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComplaint;
	private String text;
	private String state="Not yet processed";
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Complaint() {
		super();
	}   
	public int getIdComplaint() {
		return this.idComplaint;
	}

	public void setIdComplaint(int idComplaint) {
		this.idComplaint = idComplaint;
	}   
	
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idComplaint;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Complaint other = (Complaint) obj;
		if (idComplaint != other.idComplaint)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Complaint [idComplaint=" + idComplaint + ", text=" + text + ", state=" + state + ", user=" + user + "]";
	}
	
   
}
