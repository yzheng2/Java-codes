package cn.itcast.service.impl;

import cn.itcast.service.PersonServer;


public class PersonServiceBean implements PersonServer {
	/* (non-Javadoc)
	 * @see cn.itcast.service.impl.PersonServer#save()
	 */
	@Override
	public void save(){
		System.out.println("I am server()");
	}
}
