package com.jdbc;

public class Main {

	public static void main(String[] args)throws Exception  {
		try {
		StatementDemo sd =new StatementDemo();
		//sd.insertdata2();
		//sd.updatadata();
		//sd.deletedata();
		sd.fetchdata();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
