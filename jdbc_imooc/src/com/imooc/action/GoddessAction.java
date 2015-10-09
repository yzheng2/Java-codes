package com.imooc.action;

import java.util.ArrayList;

import org.ietf.jgss.GSSContext;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	public static void main(String[] args) throws Exception {
		
		GoddessDao g = new GoddessDao();
		ArrayList<Goddess> gs = g.query();
		
		for(Goddess goddess : gs){
			System.out.println(goddess.getUser_name() + "," + goddess.getAge());
		}
	}
}
