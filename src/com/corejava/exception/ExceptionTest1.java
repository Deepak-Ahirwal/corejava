package com.corejava.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i=1;
			if(i==1)
				throw new IOException();
				else
					throw new SQLException();
			
		}catch(SQLException | IOException e){
			System.out.println(e +"---- > handle");
		}
	}

}
