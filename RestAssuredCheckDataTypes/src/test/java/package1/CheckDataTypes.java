package package1;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDataTypes
{
	@Test
	public void testDataTypeOfTitle()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.title");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfSubTitle()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.subTitle");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfAuthor()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.author");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfPublishDate()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.publish_date");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfPublisher()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.publisher");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfDescription()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.description");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	
	@Test
	public void testDataTypeOfPages()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.pages");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof Integer);
		}
	}
	
	@Test
	public void testDataTypeOfWebsite()
	{
		ArrayList<Object> al = given().get("https://bookstore.toolsqa.com/BookStore/v1/Books")
				.then().extract().path("books.website");	
		for(Object e : al)
		{
			Assert.assertTrue(e instanceof String);
		}
	}
	

}
