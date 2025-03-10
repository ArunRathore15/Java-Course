                                             "LOCAL INNER CLASS"

**LOCAL VARIABLE KISE KEHTEY HAI AUR GLOBAL VARIABLE KISE KEHTEY HAI**
=>Local variable jo ki kisi method ya phir block ke ander likhe ho aur unka scope specific block ke ander
hi hota hai. Jabki Global variable ka scope puri class mein hota hai unko hum uss perticular class ke ander
khi pr bhi use kr saktey hai.
------------------------------------------------------------------------------------------------------------------

**HUM LOCAL INNER CLASS KA PROGRAM KESE BNAKER TEYAR KRENGE **
=>Local inner class bhi local variable ki tarah hi method ke ander hoti hai.
local inner class ko hum method ke bahar access nhi kr saktey hai local variable ki tarah hi.
local inner class ko access krne ke liye uss perticular method ander jiske ander local inner class hai usme 
local inner class ka object create krke local inner  class ko call krenge.

class A
{
	void show()
	{
		class B 
		{
			void show2()
			{
				System.out.println("Local inner class B");
			}
		}
		B b1=new B();
		b1.show2();
		System.out.println("outer class A");
	}
}
class DEMO
{
	public static void main(String ar[])
	{
		A a=new A();
		a.show();
	}
}
------------------------------------------------------------------------------------------------------------------

**LOCAL INNER CLASS KE CASE MEIN .CLASS FILE KIS NAME SE BANKER TEYAR HOGI**
=>Kisi outer class ke ander ydi ek method hai or us method ke ander ek local inner class hai tab:-
pehle outer class ki class file:-
"A.class"
uske baad method ki local inner class ki class file:-
"A$1B.class"
ydi jyada method hai to unke according numbering change hogi ydi ek aur method hai or usme bhi class B hai tab
"A$2B.class"
ydi ek aur method hai aur usme class C hai to uske liye 
"A$1C.class"
iss hme pta chalta hai ki numbering btati hai ki total kitni class hai perticular name se jo name likha hai 
piche numberning ke. 											 
------------------------------------------------------------------------------------------------------------------

**KYA HUM OUTER CLASS KI STATIC METHOD MEIN BHI LOCAL INNER CLASS BNAKER TEYAR KR SAKTEY HAI YA NHI **
=>YES, Hum static method mein bhi Local Inner Class bna saktey hai.

class A11
{
	static void show()
	{
		class B22 
		{
			void show2()
			{
				System.out.println("Local inner class B22");
			}
		}
		B22 b1=new B22();
		b1.show2();
		System.out.println("outer class A11");
	}
}
class DEMO
{
	public static void main(String ar[])
	{
		A11 a=new A11();
		A11.show();
	}
}
------------------------------------------------------------------------------------------------------------------

**KYA HUM CONSTRUCTOR KE ANDER LOCAL INNER CLASS BNA SAKTEY HAI YA NHI **
=>Yes,hum contructor ke ander bhi Local Inner Class bnaker teyar kr saktey hai.

class A{
	A(){
		class B {
			void show2(){
				System.out.println("Local inner class B");
				}
				}
				B b1=new B();
				b1.show2();
				System.out.println("outer class A");
				}
				}
class DEMO{
	public static void main(String ar[]){
		A a=new A();
		}
		}
------------------------------------------------------------------------------------------------------------------

**KYA HUM INSTANCE BLOCK KE ANDER LOCAL INNER CLASS BNAKER TEYAR KR SAKTEY HAI YA NHI**
=>Haa,hum instance block ke ander bhi Local Inner Class Bnaker Teyar Kr saktey hai.

class A{
	 {//Instance Block
		class B {
			void show2(){
				System.out.println("Local inner class B");
				}
				}
				B b1=new B();
				b1.show2();
				System.out.println("outer class A");
				}
	}
class DEMO{
	public static void main(String ar[]){
		A a=new A();
		}
		}		
------------------------------------------------------------------------------------------------------------------

**KYA HUM STATIC BLOCK KE ANDER LOCAL INNER CLASS BNAKER TEYAR KR SAKTEY HAI**
=> Ha hum static block ke ander bhi local inner class ko bnaker teyar kr saktey hai.
		
class A{
	 static
	 {
		class B {
			void show2(){
				System.out.println("Local inner class B");
				}
				}
				B b1=new B();
				b1.show2();
				System.out.println("outer class A");
				}
	}
class DEMO{
	public static void main(String ar[]){
		A a=new A();
		}
		}		
------------------------------------------------------------------------------------------------------------------

**KYA HUM OUTER CLASS KE ANDER METHOD KE ANDER PROGRAM CONTROL STATEMENT IF-ELSE KE ANDER LOCAL
INNER CLASS BNAKER TEYAR KR SAKTEY HAI YA NHI **
=> YES,Hum program bnaker teyar kr saktey hai.

class A{
	void show(){
	if(true){
		class B {
			void show2(){
				System.out.println("Local inner class B");
				}
				}
	B b1=new B();
	b1.show2();
	}
	else{
		System.out.println("outer class A");
		}
		}
		}
class DEMO{
	public static void main(String ar[]){
		A a=new A();
		a.show();
		}
		}
------------------------------------------------------------------------------------------------------------------

**KYA HUM OUTER CLASS KE ANDER METHOD KE ANDER LOOP KE ANDER LOCAL INNER CLASS BNAKER TEYAR KR SAKTEY HAI YA NHI**
=>YES, hum bnaker teyar kr saktey hai.

class A{
	void show(){
	for(int i=1;i<=5;i++){
		class B {
			void show2(){
				System.out.println("Local inner class B");
				}
				}
	B b1=new B();
	b1.show2();
		System.out.println("outer class A");
		}
		}
		}
class DEMO{
	public static void main(String ar[]){
		A a=new A();
		a.show();
		}
		}
------------------------------------------------------------------------------------------------------------------

**YDI HUMNE METHOD KE ANDER KISI BHI VARIABLE KO DECLARE KRA HAI OR HUM METHOD KE ANDER JO CLASS HAI USME ACCESS
KR RHE HAI TO USS VARIABLE KO FINAL DECLARE KRNA COMPULSARY HAI  UPTA VERSION 1.7 TILL 1.8 ERROR NHI AAYEGI 
PROPER RUN HO JAYEGA KYUKI HUM VARIABLE KO FINAL DECLARE TO NHI KR RHE HAI LEKIN WAHA INTERNALLY EFFECTIVELY 
FINAL HAI **

class A11
{
     void show()
	{
		int x=10;
		class B22 
		{
			void show2()
			{
				System.out.println("x="+x);
			}
		}
		B22 b1=new B22();
		b1.show2();
		System.out.println("outer class A11");
	}
}
class DEMO
{
	public static void main(String ar[])
	{
		A11 a=new A11();
		a.show();
	}
}
ydi hme dekhna hai ki wha final hai ya nhi hai internally to iske liye niche program hai hum update kr he hai 
value to wah erro de rha hai line NO. 247 KE CORRESPONDING

class A11
{
     void show()
	{
		int x=10;
		class B22 
		{
			
			void show2()
			{
				x=20;//error
				System.out.println("x="+x);
			}
		}
		B22 b1=new B22();
		b1.show2();
		System.out.println("outer class A11");
	}
}
class DEMO
{
	public static void main(String ar[])
	{
		A11 a=new A11();
		a.show();
	}
}

error: local variables referenced from an inner class must be final or effectively final
                                x=20;
NOTE:-Local variable jisko bhi hum access krne ki koshish kr rhe hai usko yato  vo final hona chahiye ya phir 
effectively final.								


		
 