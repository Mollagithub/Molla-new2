package com.arif.ui;

import javax.swing.JOptionPane;

public class LoginFrom  {
	
	private void sum(int a, int b)
	{
		int tot=a+b;
		System.out.println("Total : "+tot);
		JOptionPane.showMessageDialog(null, "Total : "+tot);
	}
	
	private void multipul(int a, int b)
	{
		int tot=a*b;
		System.out.println("Multipul : "+tot);
		JOptionPane.showMessageDialog(null, "Multipul : "+tot);
	}
	
	private void division(int a, int b)
	{
		int tot=a/b;
		System.out.println("Division : "+tot);
		JOptionPane.showMessageDialog(null, "Division : "+tot);
	}
	
	private void subtract(int a, int b)
	{
		int tot=a-b;
		System.out.println("Subtract : "+tot);
		JOptionPane.showMessageDialog(null, "Subtract : "+tot);
	}
	
	public static void main(String as[])
	{
		LoginFrom f=new LoginFrom();
		
		int firstInput=  Integer.parseInt( JOptionPane.showInputDialog("Please show me first number"));
		int scoundInput=  Integer.parseInt( JOptionPane.showInputDialog("Please show me second number"));
		f.sum(firstInput,scoundInput );
		f.multipul(firstInput,scoundInput );
		f.division(firstInput,scoundInput );
		f.subtract(firstInput,scoundInput );
		
	}

}
