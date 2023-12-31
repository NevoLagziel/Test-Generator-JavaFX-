package model;

public class MultipleChoiceQuestion extends Question implements Cloneable {

	private static final long serialVersionUID = 1L;
	private Set<Answer> answers;
	private int numOfAnswers=0;

	public MultipleChoiceQuestion(String text) {
		super(text);
		numOfAnswers=0;
		answers=new Set<Answer>();
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public boolean addAnswer(String text,boolean isRight) {
		if(answers.add(new Answer(text,isRight))) {
			numOfAnswers++;
			return true;
		}
		return false;
	}	
	public int getNumOfAnswers() {
		return numOfAnswers;
	}
	public void setNumOfAnswers(int numOfAnswers) {
		this.numOfAnswers=numOfAnswers;
	}
	public Set<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "1)"+answers.get(0).toString();
		for(int i=1;i<numOfAnswers;i++){
			s +=(i+1)+")"+answers.get(i).toString();
		}
		s +="\n";
		return s;
	}

}
