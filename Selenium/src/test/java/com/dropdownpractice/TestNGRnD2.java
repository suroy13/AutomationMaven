
  package com.dropdownpractice;
  
  import org.testng.annotations.AfterClass; import
  org.testng.annotations.AfterGroups; import
  org.testng.annotations.AfterMethod; import org.testng.annotations.AfterSuite;
  import org.testng.annotations.AfterTest; import
  org.testng.annotations.BeforeClass; import
  org.testng.annotations.BeforeGroups; import
  org.testng.annotations.BeforeMethod; import
  org.testng.annotations.BeforeSuite; import org.testng.annotations.BeforeTest;
  import org.testng.annotations.Test;
  
  public class TestNGRnD2 {
  
	  @Test (groups ={"smoke"})
  
  public void A () { System.out.println("Test on class 2"); }
  
  @Test
  
  public void AB () { System.out.println("Test2 on class 2"); }
  
  @BeforeSuite public void B () { System.out.println("BeforeSuite on class 2"); }
  
  @AfterSuite public void C () { System.out.println("AfterSuite on class 2"); }
  
  @BeforeTest public void D () { System.out.println("BeforeTest on class 2"); }
  
  @AfterTest
  
  public void E () { System.out.println("AfterTest on class 2"); }
  
  @BeforeGroups
  
  public void F () { System.out.println("BeforeGroups on class 2"); }
  
  @AfterGroups public void G () { System.out.println("AfterGroups on class 2"); }
  
  @BeforeClass
  
  public void H () { System.out.println("BeforeClass on class 2"); }
  
  @AfterClass
  
  public void I () { System.out.println("AfterClass on class 2"); }
  
  @BeforeMethod public void J () { System.out.println("BeforeMethod on class 2"); }
  
  
  @AfterMethod public void K () { System.out.println("AfterMethod on class 2"); }
  
  }
 