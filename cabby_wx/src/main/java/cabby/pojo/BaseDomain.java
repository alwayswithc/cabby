/**
 * This file created at 2016年3月9日.
 *
 * Copyright (c) 2002-2016 Bingosoft, Inc. All rights reserved.
 */
package cabby.pojo;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author Cabby
 */
public class BaseDomain implements Serializable{

	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO implement BaseDomain.toString
		return ToStringBuilder.reflectionToString(this);
	}
	
}
