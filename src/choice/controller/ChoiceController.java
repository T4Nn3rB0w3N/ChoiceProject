package choice.controller;

import javax.swing.JOptionPane;

import choice.model.CharacterModel;

import javax.swing.ImageIcon;

public class ChoiceController
{
	private ImageIcon[] icons;
	
	private CharacterModel[] characterArray;
	
	public ChoiceController()
	{
		
		icons = new ImageIcon[6];
		
		icons[0] = new ImageIcon(getClass().getResource("/file/sub-file/sub-sub-file/sub-sub-sub-file/image.png"));
		// index number up to 5, not 6
		
		
		characterArray = new CharacterModel[10];
	}
	
	public void start()
	{
		arrayInitialization();
	}
	
	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "When you initialize an array of objects, \nit is filled with a bunch of null", "Arrays", JOptionPane.INFORMATION_MESSAGE, icons[0]);
		JOptionPane.showMessageDialog(null, "If you try to use them it will crash (");
		
		JOptionPane.showMessageDialog(null, "But if you fill the array with values it is good ");
		
		for (int index = 0; index < characterArray.length; index += 1)
		{
			if (index % 2 == 0)
			{
				characterArray[index] = new CharacterModel();
			}
			
		}
	}
	
	
}
