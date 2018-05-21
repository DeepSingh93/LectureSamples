package com.example.project;

import java.util.ArrayList;
import com.example.project.Book;

public interface ILibraryLoader
{
	public void LoadConnectionConfig();
	public ArrayList<Book> LoadAllBooks();
}