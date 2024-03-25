
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
  
  public class TestNGRnD {
  
  @Test
  
  public void A () { System.out.println("Test"); }
  
  @Test
  
  public void AB () { System.out.println("Test2"); }
  
  @BeforeSuite public void B () { System.out.println("BeforeSuite"); }
  
  @AfterSuite public void C () { System.out.println("AfterSuite"); }
  
  @BeforeTest public void D () { System.out.println("BeforeTest"); }
  
  @AfterTest
  
  public void E () { System.out.println("AfterTest"); }
  
  @BeforeGroups
  
  public void F () { System.out.println("BeforeGroups"); }
  
  @AfterGroups public void G () { System.out.println("AfterGroups"); }
  
  @BeforeClass
  
  public void H () { System.out.println("BeforeClass"); }
  
  @AfterClass
  
  public void I () { System.out.println("AfterClass"); }
  
  @BeforeMethod public void J () { System.out.println("BeforeMethod"); }
  
  
  @AfterMethod public void K () { System.out.println("AfterMethod"); }
  
  }
 