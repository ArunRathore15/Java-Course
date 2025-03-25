     AAJ HUM NAI SHURUAT KR RHE HAI METHOD REFRENCE KI JO KI VERY IMPORTANT CONCEPT HAI 
=>annonymous inner class ka extended version tha lamda expression 
=>lamda expression ka extended version hai method refrence, Yeh man kr chalna hai .

                                       "METHOD REFRENCE"

**METHOD REFRENCE KYA HAI?AUR ISKO USE KRNE KA KYA BENEFIT HAI?**
"METHOD REFRENCE":-
=>Java Programming ne hme ek new feature provide kiya hai version 8 mein 
jiska name method refrence hai.
=>yeh ek aasan or short hai lamda expression ka mtlb lamda expression ka extended form hai
hum esa bol saktey hai.
=>jis tarah hum lamda expression ki help se  functional interface ki abstract method ko 
refer krne ka kaam krtey they thik usi tarah method refrence ka kaam bhi yhi hai 
functional interface ki abstract methods ko refer krna aur bhi easy form mein in comparison
to lamda expression.
=>abhi tak hum lamda expression ko use kr rhe the uski jagah pr method refrence ko use 
krenge ab her jagah.
"BENEFIT":-
=>Iska benefit yeh hai ki hum ek method ke refrence(mtlb jo ek method kaam kr rhi hai) ko 
dusri method mein easily refer kr saktey hai bina override kre directly.

"IN OTHER WORDS":-Predifined method ko functional interface ki abstract method ke corresponding 
assign karna hi method refrence hai.

uper ki line ka mtlb hai ki hme functional interface ki abstract method ko ab override krne 
ki koi jarurat nhi hai.
kyuki hme thik vesi hi working wali method aur khi mil gai hai to iss condition mein humne 
interface ki abstract method ko override nhi kiya aur jo same property wali method mili hai 
usi ko interface ki abstract method mein assign kr diya hai mtlb jo property thi uss method ki
jo hme mili thi usko humne directly bina override kiye interface ki abstract method ko de diya
hai. Aur issi condition ko hum method refrence kehtey hai ya phir method ko refrence krna kehtey.

------------------------------------------------------------------------------------------------

**METHOD REFRENCE KI HELP SE HUM KIS KIS TYPE KI METHOD KO REFER KR SAKTEY HAI**
=>Hum 3 type ki method ko refer kr saktey hai:-

1)Refrence to static method.
2)Refrence to instance method.
3)Refrence to a constructor.

------------------------------------------------------------------------------------------------

**TO HMARA AGLA QUESTION HAI KI KYA METHOD REFRENCE SIRF FUNCTIONAL INTERFACE MEIN HI 
WORK KRTA HAI YA PHIR OTHER TYPE JO HAI INTERFACE KE USME BHI WORK KREGA **

=>Yeh sirf functional interface ke liye hi hai because
ydi normal interface mein more than 1 method rhi to 
pta hi nhi chalege ki kis method ke corresponding 
compiler ko working krna hai.

------------------------------------------------------------------------------------------------

**KYA METHOD REFRENCE MEIN PARAMETER LIST BHI SAME HONA CHAHIYE YA NHI **
=>METHOD REFRENCE  KE CASE MEIN FUNCTIONAL INTERFACE KI METHOD KA JO PARAMETER HAI 
SAME WESA HI PARAMETER HONA COMPULSORY HAI WARNA ERROR DEGA.

------------------------------------------------------------------------------------------------

**TO KYA METHOD REFRENCE KE CASE MEIN RETURN TYPE BHI SAME HONA CONPULSORY HAI YA NHI **
=>YES, method refrence ke case mein return type bhi same hona compulsory hai 
ydi esa nhi kiya to compilation error dega.

------------------------------------------------------------------------------------------------

                              
							  "METHOD REFRENCE BY STATIC METHOD"

AB HUM METHOD REFRENCE SE RELATED KUCH PROGRAM BNATEY HAI JISSE HMARE CONCEPT OR BHI 
CLEAR HO SKE 

Program:-1 using lamda expression

@FunctionalInterface
interface inter1
{
	void show(int x);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 i=(a)->{
			System.out.println("jai shree ram");
		};
		i.show(10);
	}
}
OUTPUT:-jai shree ram


Program:-2 convert above program using method refrence
@FunctionalInterface
interface inter1
{
	void show(int x);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 i=System.out::println;
		i.show(10);
	}
}
OUTPUT:-10

Program:-3 using lamda expression
@FunctionalInterface
interface inter1
{
	void show(int x,int y);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 i=(a,b)->{
			System.out.println("sum:-"+(a+b));
		};
		i.show(2,3);
	}
}
OUTPUT:- sum:-5

Program:-4 converting above program 3 using method refrence

@FunctionalInterface
interface inter1
{
	void show(int x,int y);
}
class A
{
	static void sum(int x,int y)
	{
		System.out.println("sum:-"+(x+y));
	}
}
class DEMO
{
	public static void main(String ar[]){
inter1 i=A::sum;
i.show(2,3);
	}
}

NOTE:-If we use the method then class will definitly load.

Program:-5 Uper likhe hue note ko samajhne ke liye hum previous program 4 ko hi modify kr rhe 
hai.


@FunctionalInterface
interface inter1
{
	void show(int x,int y);
}
class A
{
	static
	{
		System.out.println("class A static block!");
	}
	static void sum(int x,int y)
	{
		System.out.println("sum:-"+(x+y));
	}
}
class DEMO
{
	public static void main(String ar[]){
inter1 i=A::sum;
i.show(2,3);
	}
}
TO ABOVE PROGRAM SE CLEAR HO GYA HAI KI METHOD KA USE KARNE PR CLASS LOAD HO JATA HAI.


Program:-6 Functional interface ki abstract method ke corresponding working krenge 

import java.util.function.*;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Double>f=Math::sqrt;
		Consumer<Double>c=System.out::println;
		c.accept(f.apply(25));
	}
}
OUTPUT:- 5.0

Program:-7 humne uper pda hai ki return type bhi same hona chahiye yidi alag hai to error
dega isi ko hum implement krke dekhenge iske liye humne program 4 ko hi liya hai.

@FunctionalInterface
interface inter1
{
	int show(int x,int y);//sirf iss line mein changes kiye hai.
}
class A
{
	static void sum(int x,int y)
	{
		System.out.println("sum:-"+(x+y));
	}
}
class DEMO
{
	public static void main(String ar[]){
inter1 i=A::sum;
i.show(2,3);
	}
}
OUTPUT:- error: incompatible types: bad return type in method reference
inter1 i=A::sum;
         ^
    void cannot be converted to int
	
Program:-8 Lekin ab hum previous program 7 mein small changes krenge phir dekhtey hai 
ki program chalta hai ya nhi.
	
@FunctionalInterface
interface inter1
{
int show(int x,int y);
}
class A
{
	static int sum(int x,int y)//sirf iss line mein changes kiya 
	{
		System.out.println("sum:-"+(x+y));
		return 10;
	}
}
class DEMO
{
	public static void main(String ar[]){
inter1 i=A::sum;
i.show(2,3);
	}
}
OUTPUT:- sum:-5

=>output isliye aa rha hai kyuki sum method ne apni property show method ko de di hai
jisse kya hua ki iska jo return type hai wo show method ke return type se return ho jayega.


Program:-9 Ab hum apna jo previous program hai usme chota sa changes krenge or dekhenge ki 
kya hota hai.

	
@FunctionalInterface
interface inter1
{
Object show(int x,int y);
}
class A
{
	static int sum(int x,int y)//sirf iss line mein changes kiya 
	{
		System.out.println("sum:-"+(x+y));
		return 10;
	}
}
class DEMO
{
	public static void main(String ar[]){
inter1 i=A::sum;
i.show(2,3);
	}
}
OUTPUT:-sum:-5

=>iska output kese aaya hum samjhtey hai ki sum method ki property jab hum show method ko 
refer kr rhe hai tab jo hmara sum method ka return type hai int wo autoboxing hoker pehle
Integer mein convert hoga uske baad Integer Object mein store ho jayega.

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

                               "METHOD REFRENCE BY INSTANCE METHOD"
HUM DEKHENGE INSTANCE METHOD KE CASE MEIN KI KESE INSTANCE METHOD KI PROPERTY HUM 
FUNCTIONAL INTERFACE KI ABSTRACT METHOD KO REFER KRE

ISKE LIYE HUM PROGRAM BNA RHE HAI DIRECT OR USKO SAMJHENGE

Program:-1
@FunctionalInterface
interface inter1
{
	void show();
}				
class A
{
	void show()
	{
		System.out.println("class A show1 method");
	}
}
class DEMO
{
	public static void main(String ar[]){
		A a1=new A();
		inter1 i=a1::show;
		i.show();
	}
}
			   
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

                                        "CONSTRUCTOR REFRENCE"
										
=>contructor ke case mein  refrence dene ke liye hume new keyword ka use krna hoga.
sirf itna hi difference hai baki process same rhegi.

@FunctionalInterface
interface inter1
{
	void show(int x,int y);
}							
class A
{
	A(int x,int y)
	{
	System.out.println(x+y);
	}
}   
class DEMO
{
	public static void main(String ar[]){
		inter1 i=A::new;
		i.show(2,3);
	}
}