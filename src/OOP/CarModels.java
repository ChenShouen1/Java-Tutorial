package OOP;

public enum CarModels 
{
	M1("m1"), M2("m2"), M3("m3");
	
	public String identifier;
	
	private CarModels(String identifier)
	{
		this.identifier = identifier;
	}
	
	public boolean isModelIdentifier(String identifier)
	{
		boolean result = false;
		for(CarModels value : CarModels.values())
		{
			if(value.identifier.equals(identifier))
			{
				result = true;
			}
		}
		return result;
	}
}
