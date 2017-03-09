package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComment;
	private int idPost;
	private int idUser;
	private String text;
	private String file;
	private int numberOfLikes;
	private int numberOfDislikes;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public int getIdPost() {
		return this.idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
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
		return "Comment [idComment=" + idComment + ", idPost=" + idPost + ", idUser=" + idUser + ", text=" + text
				+ ", file=" + file + ", numberOfLikes=" + numberOfLikes + ", numberOfDislikes=" + numberOfDislikes
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((file == null) ? 0 : file.hashCode());
		result = prime * result + idComment;
		result = prime * result + idPost;
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
		Comment other = (Comment) obj;
		if (file == null) {
			if (other.file != null)
				return false;
		} else if (!file.equals(other.file))
			return false;
		if (idComment != other.idComment)
			return false;
		if (idPost != other.idPost)
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
