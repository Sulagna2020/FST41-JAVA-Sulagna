package Activities;


	abstract class Book {
	    String title;
	    //Abstract method
	    abstract void setTitle(String s);
	    
	    String getTitle() {
	        return title;
	    }	        
	}

	class MyBook extends Book {
	    //Define abstract method
	    public void setTitle(String s) {
	        title = s;
	        
	    }
	}
	public class Activity5 {
		

	    public static void main(String []args) {
	        
	        String title = "World Famous Stories";
	        Book newNovel = new MyBook();
	        newNovel.setTitle(title);
	        System.out.println("The title is: " + newNovel.getTitle());
	    }
	}
	
	
