import java.util.Scanner;

public class RetailShop {

				public static void main(String[] args) 
				{
					@SuppressWarnings("resource")
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter your name: ");
					String name=sc.nextLine();
					System.out.println("Hello "+ name +","+ " choose your category : ");
					System.out.println("1.Are you employee of the store?");
					System.out.println("2.Are you affliate of the store?");
					System.out.println("3.Are you a customer?");
					int n=sc.nextInt();
					switch(n)
					{
						case 1:
						System.out.println("Enter your bill amount: ");
						float bill_e=sc.nextFloat();
						double bill1_e=bill_e-(bill_e*0.3);
						if(bill1_e>100)
						{
							double bill2_e=Math.floor((bill1_e/100))*5;
							System.out.println(name+" Your bill amount is "+(bill1_e-bill2_e));
						}
						else
						{
							System.out.println(name+" Your bill amount is "+bill1_e);
						}
						break;
						
					case 2:
						System.out.println("Enter your bill amount: ");
						float bill_a=sc.nextFloat();
						double bill1_a=bill_a-(bill_a*0.1);
						if(bill1_a>100)
						{
							double bill2_a=Math.floor((bill1_a)/100)*5;
							System.out.println(name+" Your bill amount is "+(bill1_a-bill2_a));
						}
						else
						{
							System.out.println(name+" Your bill amount is "+bill1_a);
						}
						break;
						
					case 3:
						System.out.println("Are you a customer over 2 years:\n1.Yes \n2.No");
						int v=sc.nextInt();
						if(v==1)
						{
							System.out.println("Enter your bill amount : ");
							float bill_c=sc.nextFloat();
							double bill1_c=(bill_c*0.95);
								if(bill1_c>100)
								{
									double bill2_c=Math.floor(bill1_c/100)*5;
									System.out.println(name+"," + " You get a discount for being a valuable customer for over 2 years : "+(bill1_c-bill2_c));
								}
								else
								{
									System.out.println(name+","+ " You get a discount for being a valuable customer for over 2 years : "+bill1_c);
			
							}
						}		
						if(v==2)
						{
							System.out.println("Enter your bill amount : ");
							float bill=sc.nextFloat();
							if(bill>100)
							{
								double bill1=Math.floor(bill/100)*5;
								System.out.println(name+"," + " Your bill amount is "+(bill-bill1));
							}
							else
							{
								System.out.println(name+"," +" your bill amount is "+bill);
								break;
								
							}
						}
					}
						
				}

			 }
