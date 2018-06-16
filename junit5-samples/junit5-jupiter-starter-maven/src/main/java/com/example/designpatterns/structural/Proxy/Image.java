package com.example.designpatterns.structural.Proxy;

public class Image implements IImage
{
	// This would be the large image data we would load.
	//BufferedImage imageData;
	private final String fileName;
	
	public Image(String fileName)
	{
		this.fileName = fileName;
		// Here you would perform the heavy duty operation of loading the image
		// into imageData.
	}
	
	@Override
	public String GetFileName()
	{
		return fileName;
	}

	@Override
	public void Display()
	{
		System.out.println("Very complicated code that displays a large image");
	}	
}

