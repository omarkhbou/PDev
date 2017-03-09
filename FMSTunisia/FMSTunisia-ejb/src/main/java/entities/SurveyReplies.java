package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyReplies
 *
 */
@Entity

public class SurveyReplies implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idReply;
	private int idSurvey;
	private int idUser;
	private int idQuestion;
	private int idAnswer;
	private static final long serialVersionUID = 1L;

	public SurveyReplies() {
		super();
	}   
	public int getIdReply() {
		return this.idReply;
	}

	public void setIdReply(int idReply) {
		this.idReply = idReply;
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}   
	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAnswer;
		result = prime * result + idQuestion;
		result = prime * result + idReply;
		result = prime * result + idSurvey;
		result = prime * result + idUser;
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
		SurveyReplies other = (SurveyReplies) obj;
		if (idAnswer != other.idAnswer)
			return false;
		if (idQuestion != other.idQuestion)
			return false;
		if (idReply != other.idReply)
			return false;
		if (idSurvey != other.idSurvey)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SurveyReplies [idReply=" + idReply + ", idSurvey=" + idSurvey + ", idUser=" + idUser + ", idQuestion="
				+ idQuestion + ", idAnswer=" + idAnswer + "]";
	}
   
}
