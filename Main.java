package ExamPaper;

public class Main 
{

	public static void main(String[] args) 
	{
		
		ExamPaper exampaper1 = new ExamPaper();
		exampaper1.add(new Question("Q1"));
		exampaper1.add(new Question("Q2"));
		
		ExamPaper exampaper2 = new ExamPaper();
		exampaper2.add(new Question("Q3"));
		exampaper2.add(new Question("Q4"));
		
		ExamPaper exampaper3 = new ExamPaper();
		exampaper3.add(new Question("Q5"));
		exampaper3.add(new Question("Q6"));
		
		ExamPaper thefinal = new ExamPaper();
		thefinal.add(exampaper1);
		thefinal.add(exampaper2);
		thefinal.add(exampaper3);
		
		
		thefinal.print();

	}

}
