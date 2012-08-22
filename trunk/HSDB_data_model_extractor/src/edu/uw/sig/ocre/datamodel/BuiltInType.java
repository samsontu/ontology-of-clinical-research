/**
 * 
 */
package edu.uw.sig.ocre.datamodel;

import java.util.Map;

/**
 * @author detwiler
 * @date Aug 12, 2011
 */
public class BuiltInType implements Type
{
	private String name = null;
	
	public BuiltInType(String name)
	{
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.uw.sig.ocre.datamodel.Type#getName()
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.uw.sig.ocre.datamodel.Type#getUri()
	 */
	@Override
	public String getUri()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see edu.uw.sig.ocre.datamodel.XSDEntity#toXMLString()
	 */
	@Override
	public String toXMLString()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
