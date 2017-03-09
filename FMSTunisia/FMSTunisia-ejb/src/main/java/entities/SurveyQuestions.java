package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyQuestions
 *
 */
@Entity

public class SurveyQuestions implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idQuestion;
	private int idSurvey;
	private String questionText;
	private int answersNumber;
	private static final long serialVersionUID = 1L;

	public SurveyQuestions() {
		super();
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
	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}   
	public int getAnswersNumber() {
		return this.answersNumber;
	}

	public void setAnswersNumber(int answersNumber) {
		this.answersNumber = answersNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + answersNumber;
		result = prime * result + idQuestion;
		result = prime * result + idSurvey;
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
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
		SurveyQuestions other = (SurveyQuestions) obj;
		if (answersNumber != other.answersNumber)
			return false;
		if (idQuestion != other.idQuestion)
			return false;
		if (idSurvey != other.idSurvey)
			return false;
		if (questionText == null) {
			if (other.questionText != null)
				return false;
		} else if (!questionText.equals(other.questionText))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SurveyQuestions [idQuestion=" + idQuestion + ", idSurvey=" + idSurvey + ", questionText=" + questionText
				+ ", answersNumber=" + answersNumber + "]";
	}
   
}
