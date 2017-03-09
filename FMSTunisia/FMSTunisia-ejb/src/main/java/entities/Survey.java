package entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 *
 */
@Entity

public class Survey implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSurvey;
	private String surveySubject;
	private int questionNumber;
	private static final long serialVersionUID = 1L;

	public Survey() {
		super();
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public String getSurveySubject() {
		return this.surveySubject;
	}

	public void setSurveySubject(String surveySubject) {
		this.surveySubject = surveySubject;
	}   
	public int getQuestionNumber() {
		return this.questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSurvey;
		result = prime * result + questionNumber;
		result = prime * result + ((surveySubject == null) ? 0 : surveySubject.hashCode());
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
		Survey other = (Survey) obj;
		if (idSurvey != other.idSurvey)
			return false;
		if (questionNumber != other.questionNumber)
			return false;
		if (surveySubject == null) {
			if (other.surveySubject != null)
				return false;
		} else if (!surveySubject.equals(other.surveySubject))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Survey [idSurvey=" + idSurvey + ", surveySubject=" + surveySubject + ", questionNumber="
				+ questionNumber + "]";
	}
   
}
