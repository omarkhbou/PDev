package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyAnwer
 *
 */
@Entity

public class SurveyAnwer implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnswer;
	private int idQuestion;
	private int idSurvey;
	private String answerText;
	private static final long serialVersionUID = 1L;

	public SurveyAnwer() {
		super();
	}   
	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public String getAnswerText() {
		return this.answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerText == null) ? 0 : answerText.hashCode());
		result = prime * result + idAnswer;
		result = prime * result + idQuestion;
		result = prime * result + idSurvey;
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
		SurveyAnwer other = (SurveyAnwer) obj;
		if (answerText == null) {
			if (other.answerText != null)
				return false;
		} else if (!answerText.equals(other.answerText))
			return false;
		if (idAnswer != other.idAnswer)
			return false;
		if (idQuestion != other.idQuestion)
			return false;
		if (idSurvey != other.idSurvey)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SurveyAnwer [idAnswer=" + idAnswer + ", idQuestion=" + idQuestion + ", idSurvey=" + idSurvey
				+ ", answerText=" + answerText + "]";
	}
   
}
