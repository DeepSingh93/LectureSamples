import java.util.ArrayList;

// Square is a composite, making up the Composite pattern (contains components)
public class Square extends BoardComponent
{
	private final ArrayList<BoardComponent> children;
	private BoardComponent parent;
	
	public Square()
	{
		super();
		children = new ArrayList<BoardComponent>();
	}

	@Override
	public void Operation()
	{
		for (int i = 0; i < children.size(); i++)
		{
			BoardComponent child = children.get(i);
			child.Operation();
		}
	}

	@Override
	public void Add(BoardComponent child)
	{
		// I am now this child's parent.
		children.add(child);
		child.SetParent(this);
	}

	@Override
	public void Remove(BoardComponent child)
	{
		// If I this is my last child and I have a parent I must
		// remove myself from my parent too (the square is destroyed)
		children.remove(child);
		if (null != parent && children.isEmpty())
		{
			parent.Remove(this);
		}
	}
}