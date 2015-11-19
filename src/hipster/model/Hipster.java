package hipster.model;

public class Hipster
{
	private String name;
	private String[] hipsterPhrases;
	private Book [] hipsterBooks;
	
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		
		
		setupArray();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster , but ";
		hipsterPhrases[2] = "OH NICE JOB";
		hipsterPhrases[3] = "I was into computers before it was cool";
	}

	private void setupBooks()
	{
		Book firstBook, seconedBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Bill nye");
		firstBook.setTitle("Undeniable");
		firstBook.setSubject("Evolutionary science");
		firstBook.setPageCount(350);
		firstBook.setPrice(20.00);
		
		
		seconedBook = new Book();
		
		seconedBook.setAuthor("Bill nye");
		seconedBook.setTitle("UNSTOPABLE");
		seconedBook.setSubject("Climate Change");
		seconedBook.setPageCount(400);
		seconedBook.setPrice(30.00);
		
		thirdBook = new Book(5, "Dr.Suess", "Counting", "one fish two fish", 2.00 );
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = seconedBook;
		hipsterBooks[2] = thirdBook;
		
		
		
		
	}

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	
	
}