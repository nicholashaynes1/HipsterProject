package hipster.controller;

import hipster.view.HipsterFrame;
import hipster.model.Hipster;

public class HipsterController
{
	private HipsterFrame baseFrame;
	private Hipster FirstHipster;

	public HipsterController()
	{
		FirstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}

	public Hipster getFirstHipster()
	{
		return FirstHipster;
	}

	public void setFirstHipster(Hipster firstHipster)
	{
		FirstHipster = firstHipster;
	}

	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}

	public void setBaseFrame(HipsterFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}

	public void start()
	{
		String myName = baseFrame.getResponse("what is your name?");
		FirstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s hipster project.");
	}

}
