package com.example.designpatterns.structural.Proxy;

import java.util.ArrayList;
import java.util.Random;

public class Client
{
	private ArrayList<IImage> images;
	
	public Client()
	{
		LoadOneMillionImagesFromFileSystem();
		Random rand = new Random();
		DisplayOneImage(MakeImageFileNameFromInt(rand.nextInt(1000000)));
	}
	
	private void LoadOneMillionImagesFromFileSystem()
	{
		images = new ArrayList<IImage>();
		// Pretend to load a bunch of images from the filesystem.
		// Instantiate the proxy though so we don't actually load the image files.
		// Imagine how slow this would be if you actually loaded all 1 million images!
		for (int i = 0; i < 1000000; i++)
		{
			images.add(new ProxyImage(MakeImageFileNameFromInt(i)));
		}
	}
	
	private void DisplayOneImage(String fileName)
	{
		// Iterate through the one million images to find the one image to display
		// note how we only ever actually load 1 single image.
		for (int i = 0; i < 1000000; i++)
		{
			IImage image = images.get(i);
			if (image.GetFileName().equalsIgnoreCase(fileName))
			{
				image.Display();
				break;
			}
		}
	}
	
	private String MakeImageFileNameFromInt(int i)
	{
		return "image" + Integer.toString(i) + ".jpg";
	}
}