                                                "STATIC INNER CLASS"
Points To Remember:-
1)static method ke ander hum sirf static data ko hi acces kr saktey hai.
2)ydi hum chahtey hai ki static mein instance access ho to iske liye hum object bnaker bilkul access kr saktey hai.
3)Non-static method ke ander hum static and non-static both type ke data ko access kr saktey hai.
4)static method ko hum direct class name se access kr saktey hai iske liye hme object create krne ki jarurat 
nhi hoti hai.
5)static data (i.e., static variables, methods, and blocks) ye saare heap memory ke method area me store hotey
hai method area heap ka hi part hai.
6)When to Use static?
✔ When the variable/method belongs to the class rather than objects.
✔ When you want a single shared copy (e.g., constants, counters, configurations).
✔ When you need utility methods (like Math.sqrt(), Arrays.sort()).
✔ When you need one-time initialization (static blocks).	

FIRST PROGRAM FOR STATIC INNER CLASS 

STEP:-1 ISS STEP MEIN HUM NORMAL PROGAM BNAKER TEYAR KRENGE INNER CLASS CLASS PR WITHOUT USING STATIC KEYWORD

class DEMO
{
	class A{
		void show(){
			System.out.println("class A");
		}
	}
	public static void main(String ar[]){
		A a=new A();
		a.show();
	}
}

OUTPUT:-error: non-static variable this cannot be referenced from a static context
                A a=new A();

NOTE:-YHA PR THIS SE RELATED ERROR AANE KA KARAN  HME THIS KEYWORD KI DEFINITION SE CLEAR HO JAYEGA.

DEFINITION:-The this keyword in Java is a reference variable that refers to the current object of a class.
It is primarily used inside instance methods or constructors.
				

------------------------------------------------------------------------------------------------------------------

STEP:-2 HUM PREVIOUS PROGRAM KO STATIC INNER CLASS MEIN CONVERT KRENGE TO BILKUL CHAL JAYEGA

class DEMO
{
	static class A{
		void show(){
			System.out.println("class A");
		}
	}
	public static void main(String ar[]){
		A a=new A();
		a.show();
	}
}				

------------------------------------------------------------------------------------------------------------------
STEP:-3 JESE HUM STATIC DATA KO DIRCTLY CLASS NAME SE ACCESS KR LETE HAI THIK VESE HI HUM STATIC CLASS KA 
OBJECT CLASS NAME KI HELP SE BNAKER USSE ACCESS KR LENGE JO KI INNER CLASS HAI.

class A{
	static class B
	{
		void show(){
			System.out.println("class B");
		}
}}
class DEMO
{
	public static void main(String ar[]){
			A.B b=new A.B();
		b.show();
	}
}

NOTE:- line No. 73 very imp hai isme btaya hai ki kese hum access krenge other class hai to or usme ydi static 
inner class rakhi hui hai to.
------------------------------------------------------------------------------------------------------------------

STEP:-4 HME PTA HAI HUM INSTANCE INNER CLASS KE ANDER KABHI BHI STATIC VARIABLE KO DECLARE NHI KR SAKTEY HAI
USME SIRF HUM FINAL STATIC DECLARE KR SAKTEY HAI KISME INSTANCE INNER CLASS MEIN,
LEKIN STATIC INNER CLASS KE ANDER HUM STATIC VARIABLE KO DECLARE KR SAKTEY HAI.

class A{
	static class B
	{
		static int x=10;
		void show(){
			System.out.println("class B");
			System.out.println("x="+x);
		}
}}
class DEMO
{
	public static void main(String ar[]){
			A.B b=new A.B();
		b.show();
	}
}
------------------------------------------------------------------------------------------------------------------

STEP:- 5 STATIC INNER CLASS KE ANDER YDI HMARI STATIC METHOD HAI TO USSE HUM KESE ACCESS KRENGE OTHER CLASS MEIN
ABHI HUM MAIN METHOD MEIN ACCESS KRWA RHE HAI.

class A{
	static class B
	{
		static void show(){
			System.out.println("class B");
		}
}}
class DEMO
{
	public static void main(String ar[]){
			A.B.show();
	}
}

NOTE:-1 hum kabhi bhi instance inner class ke ander main method ki nhi bna saktey hai kyuki waha static hai 
aur instance inner class ke ander hum static variable ,method kuch bhi nhi bna saktey hai.
NOTE:-2 Hum static inner class ke ander main method ko bna saktey hai kyuki main method bhi static hai aur 
humne step 5 mein static inner class ke ander static method ko bnaker teyar kiya hai.
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
"jese hum class ke and class bnaker teyar kr saktey hai thik vese hi hum kya class ke ander interface bnaker teyar"
"kr saktey hai ya nhi, Or hum class ke ander interface bna saktey hai or iski working ko samjhenge ki kya kya hai"

STEP:-1 ISME HUMNE NORMAL CLASS KE ANDER INTERFACE BNAYA OR INSTANCE INNER LASS SE USSE IMPLEMENT KRKE 
ACCESS KR LIYA INTERFACE KE DATA KO 

class A
{
	interface inter1
	{
		void show();
	}
	class B implements inter1
	{
	public void show(){
		System.out.println("class B ");
	}
	}
}
class DEMO
{
	public static void main(String ar[]){
		A a=new A();
		A.B b=a.new B();
		b.show();
	}
} 
------------------------------------------------------------------------------------------------------------------

STEP:-2 YDI HUM CHAHTEY HAI KI WITHOUT INNER CLASS CLASS KE ANDER JO INTERFACE RAKHA HUA HAI USSE ACCESS KRE 
TO KESE KRENGE ACCESS USKE LIYE PROGRAM HAI NICHE VERY IMP STEP HAI YEH 

class A
{
	interface inter1
	{
		void show();
	}
}
	class B implements A.inter1
	{
	public void show(){
		System.out.println("class B ");
	}
	}
class DEMO
{
	public static void main(String ar[]){
		B b=new B();
		b.show();
	}
}

NOTE:- iss program mein line No.166 very imp hai jisme humne sikh hai ki interface jo ki kisi class ke 
ander hai usse kese access krenge hum outer class se.

-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

"abhi tak humne do batey sikhi hai ki class ke ander class ko bnaker teyar to kr saktey hai sath hi class ke"
"ander interface bhi bnaker teyar kr saktey hai to hmara agala swal yeh hai ki kya hum interface ke ander "
"interface ko bnaker teyar kr saktey hai ya phir nhi to isko ab hum  niche samajhne wale hai "

interface inter1
{
	void show();
	interface inter2{
		void show2();
	}
}
class A implements inter1
{
	public void show(){
		System.out.println("class A");
	}
}
class B implements inter1.inter2
{
	public void show2()
	{
		System.out.println("class B");
	}
}
class DEMO
{
	public static void main(String ar[]){
		A a=new A();
		a.show();
		B b=new B();
		b.show2();
	}
}

NOTE:- iss program se hm samajh aaya ki hum jis bhi inteface ko implements kr rhe hai kisi bhi class 
mein to sirf uski hi method ki body bnana compulsory hai na ki interface ke ander jo interface rakhe
hue hai unki bhi method ki body hme bnana pdegi.
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

"Ab hum yeh samjhenge ki kya hum interface ke ander class ko bnaker teyar kr saktey hai ya phir nhi "
"to yeh bhi java programing mein possible hai ki hum interface ke ander class bna saktey hai "

interface inter1
{
	class A
	{
		void show(){
			System.out.println("class A");
		}
	}
}
class DEMO
{
	public static void main(String ar[])
	{
		inter1.A a=new inter1.A();
		a.show();
	}
}

NOTE:- isme line No.242 very imp hai  ime hum interface ke ander ki class ka object bnana sikh rhe hai.

YDI HUM INHERITANCE APPLY KRTEY HAI TO USS CONDITION MEIN SUBCLASS KE PASS SUPER KA SAARA DATA CHALA JATA 
HAI TO ISS CONDITION MEIN HUM KESE INTERFACE KE ANDER KI INNER CLASS KO ACCESS KRENGE ISKE LIYE PROGRAM 
NICHE HAI 

interface inter1
{
	class A
	{
		void show(){
			System.out.println("class A");
		}
	}
}
class B implements inter1
{}
class DEMO
{
	public static void main(String ar[])
	{
		B.A a=new B.A();
		a.show();
	}
}

YDI HUM CHAHTEY HAI KI DIRECTLY CLASS B KE OBJECT SE KESE ACCESS KRE CLASS A KE DATA KO TO ISKE LIYE 
NICHE HAI PROGRAM 

interface inter1
{
	class A
	{
		void show(){
			System.out.println("class A");
		}
	}
}
class B extends inter1.A
{}
class DEMO
{
	public static void main(String ar[])
	{
		B a=new B();
		a.show();
	}
}
