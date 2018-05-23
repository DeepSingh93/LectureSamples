public class DeliveryAddress
{
	public String name;
	public String street;
	public String city;
	public String province;
	public String postalCode;
}

public interface PARTMANAGER
{
	public enum PartResponse
	{
		OUT_OF_STOCK,
		NO_LONGER_MANUFACTURED
	}

	// Submit part for manufacture and delivery.
	public PartResponse SubmitPartForManufactureAndDelivery(int partNumber, int quantity, DeliveryAddress deliveryAddress);
}