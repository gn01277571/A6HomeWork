package ExamPaper;

public class Question implements Questionlist
{
	
	private String description;
	   public Question(String desc)
	   {
	      this.description = desc;
	   }
	   
	   public void print() 
	   {
	      System.out.println(description);
	   }      
	

}
