package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;


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

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
		
		
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster , but ";
		hipsterPhrases[2] = "OH NICE JOB";
		hipsterPhrases[3] = "I was into computers before it was cool";
	}
	


}