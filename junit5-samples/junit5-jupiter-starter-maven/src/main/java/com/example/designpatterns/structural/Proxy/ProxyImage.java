package com.example.designpatterns.structural.Proxy;

// This class is a Virtual Proxy
// Its purpose is to let the client use the class to know the filename of the
// image, without having to load the image.
public class ProxyImage implements IImage
{
	// realImage is the large / expensive object we are virtualizing as the proxy.
	private Image realImage;
	private String fileName;
	
	public ProxyImage(String fileName)
	{
		// We save the filename, but we initialize the realImage to null for now
		// to save on loading, if this image is never displayed, we don't need to
		// actually load the image.
		this.fileName = fileName;
		realImage = null;
	}

	@Override
	public String GetFileName()
	{
		return fileName;
	}

	@Override
	public void Display()
	{
		// Now the client wants to display the image, if it hasn't been loaded yet
		// this is the time when we actually have to do the heavy operation.
		if (null == realImage)
		{
			realImage = new Image(fileName);
		}
		// We pass the operation on to the real object.
		realImage.Display();
	}
}