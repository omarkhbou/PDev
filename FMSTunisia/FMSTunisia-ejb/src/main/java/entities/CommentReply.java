package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CommentReply
 *
 */
@Entity

public class CommentReply implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReply;
	private int idComment;
	private int idUser;
	private String text;
	private String file;
	private int numberOfLikes;
	private int numberOfDislikes;
	private static final long serialVersionUID = 1L;

	public CommentReply() {
		super();
	}   
	public int getIdReply() {
		return this.idReply;
	}

	public void setIdReply(int idReply) {
		this.idReply = idReply;
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}   
	public int getNumberOfLikes() {
		return this.numberOfLikes;
	}

	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}   
	public int getNumberOfDislikes() {
		return this.numberOfDislikes;
	}

	public void setNumberOfDislikes(int numberOfDislikes) {
		this.numberOfDislikes = numberOfDislikes;
	}
	@Override
	public String toString() {
		return "CommentReply [idReply=" + idReply + ", idComment=" + idComment + ", idUser=" + idUser + ", text=" + text
				+ ", file=" + file + ", numberOfLikes=" + numberOfLikes + ", numberOfDislikes=" + numberOfDislikes
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + idComment;
		result = prime * result + idReply;
		result = prime * result + idUser;
		result = prime * result + numberOfDislikes;
		result = prime * result + numberOfLikes;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		CommentReply other = (CommentReply) obj;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (idComment != other.idComment)
			return false;
		if (idReply != other.idReply)
			return false;
		if (idUser != other.idUser)
			return false;
		if (numberOfDislikes != other.numberOfDislikes)
			return false;
		if (numberOfLikes != other.numberOfLikes)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
   
}
