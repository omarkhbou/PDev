package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reaction
 *
 */
@Entity

public class Reaction implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReaction;
	private int idUser;
	private int idPost;
	private int idComment;
	private int idReply;
	private boolean report;
	private boolean like;
	private boolean dislike;
	private static final long serialVersionUID = 1L;

	public Reaction() {
		super();
	}   
	public int getIdReaction() {
		return this.idReaction;
	}

	public void setIdReaction(int idReaction) {
		this.idReaction = idReaction;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdPost() {
		return this.idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public int getIdReply() {
		return this.idReply;
	}

	public void setIdReply(int idReply) {
		this.idReply = idReply;
	}   
	public boolean getReport() {
		return this.report;
	}

	public void setReport(boolean report) {
		this.report = report;
	}   
	public boolean getLike() {
		return this.like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}   
	public boolean getDislike() {
		return this.dislike;
	}

	public void setDislike(boolean dislike) {
		this.dislike = dislike;
	}
   
}
