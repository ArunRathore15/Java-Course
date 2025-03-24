                                          "FUNCTIONAL INTERFACE"
DEFINITION:-Functional interface hum uss interface ko kehtey hai jiske ander sirf ek hi 
abstract method hoti hai baki other method(instance etc.) kitni bhi ho sakti hai.

functional interface ko samajhne ke liye hum fist program bna rhe hai.
Program 1:-
interface inter1
{
	void show();
}				
class A implements inter1
{
	 public void show(){
		System.out.println("class A");
	}
}
class DEMO
{
	public static void main(String ar[]){
A a=new A();
a.show();		
	}
}

Program 2:-
interface inter1
{
	void show();
	void show1();
}				
class A implements inter1
{
	public void show(){
		System.out.println("class A");
	}
	public void show1(){
		System.out.println("class A1");
	}
}
class DEMO
{
	public static void main(String ar[]){
A a=new A();
a.show();
a.show1();		
	}
}			
NOTE:- program 2 jo hai waha funtional interface nhi hai kyuki usme hume two abstract methods
use ki hai.
ab aage humse esi galti na ho isliye hum annotation ka use krenge,Jiski help se hum sirf 
functional interface ka hi bna payenge program.

Program:-3 

@FunctinalInterface
interface inter1
{
	void show();
	void show1();
}				
class A implements inter1
{
	public void show(){
		System.out.println("class A");
	}
	public void show1(){
		System.out.println("class A1");
	}
}
class DEMO
{
	public static void main(String ar[]){
A a=new A();
a.show();
a.show1();		
	}
}			  
			
OUTPUT:-error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  inter1 is not a functional interface
    multiple non-overriding abstract methods found in interface inter1

NOTE:-Program no 2 mein  aur Program no 3 mein sirf ek hi line ka difference hai 
lekin ussi line se hme compiler bta rha hai ki below jo interface hai waha functional 
interface hai ya nhi hai.
=>Ussi line ko hum annotation kehtey hai.
------------------------------------------------------------------------------------------------

**What is Annotation in java**
=>Annotation ek special type ka metadata hota hai jo compiler, JVM ya framework ko extra 
information provide karta hai. Ye code ke behavior ko modify karne ya compile-time checks 
lagane me madad karta hai.	

✅ Annotations sirf comments nahi hote, balki compiler aur JVM ke liye extra information 
carry karte hain.
✅ Annotations se hum code ko readable, maintainable aur powerful bana sakte hain.
✅ Java me built-in, meta, aur custom annotations ka use hota hai.

Important Annotations:
@Override, @Deprecated, @SuppressWarnings
@FunctionalInterface, @Retention, @Target, @Inherited
Custom annotations ke liye @interface ka use hota hai.
										  
Program:-3 ko hum sirf ek hi abstract method ke sath bnayenge to hmara program proper work krega

@FunctionalInterface
interface inter1
{
	void show();
}				
class A implements inter1
{
	public void show(){
		System.out.println("class A");
	}
}
class DEMO
{
	public static void main(String ar[]){
A a=new A();
a.show();		
	}
}		
isse hmara program porper run kr rha hai.bina kisi error ke 

NOTE:-@FunctionalInterface perticular ussi interface ke liye applicable hoga jis 
interface ke uper humne annotation lgai hai baki ke liye applicable nhi rhega.
------------------------------------------------------------------------------------------------

Program 4:- Iss program se hum samjhtey hai ki note likh hai humne uper uska kya meaning hai.

import java.util.*;
@FunctionalInterface
interface inter1
{
	void show();
}
@FunctionalInterface
interface inter2 extends inter1
{
	void show1();
}
class DEMO implements inter2
{
	public void show(){
		System.out.println("inter1 show method");
	}
	public void show1(){
		System.out.println("inter2 show1 method");
	}
	public static void main(String ar[]){
		DEMO d=new DEMO();
		d.show();
		d.show1();
	}
}

OUTPUT:-error: Unexpected @FunctionalInterface annotation
@FunctionalInterface
^
  inter2 is not a functional interface
    multiple non-overriding abstract methods found in interface inter2
	
NOTE:- Iss program mein error aane ka karan yeh hai ki bhale hi hum ek ek hi method le rhe hai 
lekin jab hum inter2 mein inter1 ko extends kr rhe hai to iss condition mein inter2 ke pass 
two method ho rhi hai.
------------------------------------------------------------------------------------------------

Program:-5 PROGRAM NUMBER 3 MEIN HUM LEMDA EXPRESSION KA USE KRTE HAI KYU KI LAMDA EXPRESSION
KO HUM FUNCTIONAL INTERFACES KE CASE MEIN BHI USE KRTEY HAI 

import java.util.*;
@FunctionalInterface
interface inter1
{
	void show();
}				
class DEMO
{
	public static void main(String ar[]){
inter1 a=()->System.out.println("inter 1");
	a.show();}
}
------------------------------------------------------------------------------------------------

Program:-6 ISS PROGRAM MEIN HUM template TYPE KA USE KR RHE HAI OR PROGRAM KO BNA RHE HAI

import java.util.*;
@FunctionalInterface
interface inter1<T>
{
	void show(T t);
}				
class DEMO
{
	public static void main(String ar[]){
inter1 a=(x)->true;
	a.show(10);}
}
OUTPUT:-Pehle warning message dega uske baad compile time pr or run time pr run ho jayega.

TEMPLATE TYPE:- template type ka mtlb yeh hota hai ki hum koi bhi type ka data de rehe hai 
method ko call krtey time  to compiler check krta hai ki koi unchecked operation to perform 
nhi ho rha hai na yadi ho rha hai to wha compile time pr warning msg provide kr dega. kyuki 
template type ka hone ke karan uska type define nhi kr pa rha hai wha or yeh unsafe operation
bn jata hai yhi karan hai ki template ke case me warning message aaker generate ho rhi hai.

=>Java me Generics Type Erasure hota hai, jo compile-time pe type check karta hai, 
lekin runtime pe type information remove ho jati hai.
------------------------------------------------------------------------------------------------

Program:-7 HUM ISS PROGRAM MEIN GENERIC TYPE KA USE KRKE PROGRAM BNAYENGE

import java.util.*;
@FunctionalInterface
interface inter1<T>
{
	void show(T t);
}				
class DEMO
{
	public static void main(String ar[]){
inter1<String> a=(x)->System.out.println("JAI SHREE RAM JI");
	a.show("ram");}
}
OUTPUT:-JAI SHREE RAM JI 

HUMNE ISS PROGRAM MEIN GENERIC TYPE SPECIFY KR DIYA HAI JISSE HUM YDI GENERIC KE ACCORDING
METHOD KO CALL KRTEY TIME DATA NHI DENGE TO ERROR DE DEGA ISSE HUM BACH JATEY HAI WARNING 
SE OR EXCEPTION AANE SE RUNTIME PR.

=>YDI HUM ABOVE PROGRAM KO PHIR SE LIKHTEY HAI JISME METHOD KO CALL KRTEY TIME ALAG DATA 
DENGE JISSE ERROR AAYEGI.
 
import java.util.*;
@FunctionalInterface
interface inter1<T>
{
	void show(T t);
}				
class DEMO
{
	public static void main(String ar[]){
inter1<String> a=(x)->System.out.println("JAI SHREE RAM JI");
	a.show(10);}
}

OUTPUT:- error: incompatible types: int cannot be converted to String
        a.show(10);}
               ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output

------------------------------------------------------------------------------------------------

**ABHI TAK TO HUMNE KHUDH KE FUNCTIONAL INTERFACES BNAYE HAI AB HUM UNN INTERFACES KI BAAT
KRENGE JO JAVA NE HME PROVIDE KIYE HAI IN DETAIL OR SABHO HUM JITNA HO SKE UTNA PRACTICAL 
KRENGE TAKI JISSE HMARE CONCEPT CLEAR HO JAYE METHOD REFRECE KE LIYE**

                              (A)"UNARY FUNCTIONAL INTERFACE"



                           1) "PREDICATE FUNCTIONAL INTERFACE"
=>Yeh ek functional interface hai kyuki iske pass ek abstract method hai jiska name:-
   (a) public abstract boolean test(T);
=>yeh interface util.function package ke ander rakha hua hai.
=>or test(T) method ka parameter generic type ka hai.
=>OR ISKE PASS CHAR AUR METHODS HAI JISME (B)TO (E) METHODS KE RETURN TYPE PREDICATE HAI 
   (b) public java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);
   (c) public java.util.function.Predicate<T> negate();
   (d) public java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
   (e) public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);

**AB HUM PREDICATE INTERFACE KI INN METHOD KA USE KRKE PROGRAM BNAYENGE** 

(a) public abstract boolean test(T)  

import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		Predicate<Integer> p=a->a>18;
		System.out.println(p.test(10));//false
		System.out.println(p.test(20));//true
	}
}
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

(b) public java.util.function.Predicate<T> and(java.util.function.Predicate<? super T>);

NOTE:- and() method ke case mein dono condition true hogi tabhi program mein wah true dega 
otherwise ydi ek bhi false hai to waha false dega.

import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		int x[]={10,20,30,40,13,5,21,9,25,32,50,39,56};
		Predicate<Integer>p=a->a>10;
		Predicate<Integer>p1=a->a<50;
	show(x,p.and(p1));
	}
		show(int x[],Predicate<Integer> P){
		for(int i:x)
		{
			if(P.test(i)){
				System.out.print(i+" ");
			}
		}
	}
}
OUTPUT:-20 30 40 13 21 25 32 39

1)Sabse Pehle to humne line no. 297 and 298 mein condition ko return krwaya.
2)Jo return hua hai wha line no.299 mein "p" ki place pr condition aai "a>10" aur
"p1" ki place pr "a<50" condition aai.
3)Ab hum line no.302 pr dekhtey hai ki humne yha pr jo "x" array liya hai usko "i" array 
mein one by one value insert kr rhe hai.
4)Ab yha line no.304 pr if ki condition hai jisme hum check kr rhe hai ki i array mein jo 
value aai hai, Kya waha condition ko follow kr rhi hai ya nhi ydi kr rhi hai to true return hoga
kyuki test method ka return type boolean hai.
5)iske me checking kuch iss tarah hogi ki pehle "i" mein jo bhi value aayegi wha "P" ke according
return kregi test() method.
6)To ab test method check kregi ki "P" ki kya condition hai to jo line no.299 mei mili condition usko 
sari ko waha "P" mein rakh dega or dekh legi test() method ki kya hai true ya false.
7) ydi true hai to return kr dega warna kuch nhi.

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

   (c) public java.util.function.Predicate<T> negate();
NOTE:- Is method ki help se normaly jo method work kr rhi hai uska ulta kr saktey hai.
Ydi hum uper ke program mein iss method ko add kr de to output ulta hi aa jayega.


import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		int x[]={10,20,30,40,13,5,21,9,25,32,50,39,56};
		Predicate<Integer>p=a->a>10;
		Predicate<Integer>p1=a->a<50;
	show(x,p.and(p1).negate());
	}
		show(int x[],Predicate<Integer> P){
		for(int i:x)
		{
			if(P.test(i)){
				System.out.print(i+" ");
			}
		}
	}
}
OUTPUT:-10 5 9 50 56

1)Sirf hum samjhenge line no.338 ko ki jo condition hai and ke sath unko chodker 
yeh metlab hai negate() method ka.baki sari process as it is hi hogi previous method mein 
jo humne step kri hai seven steps.
	
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

   (d) public java.util.function.Predicate<T> or(java.util.function.Predicate<? super T>);
	
import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		int x[]={5,8,12,30,9,4,10,36,94,6,2,17,1,45,67,33,59};
		Predicate<Integer>p=a->a>9;
		Predicate<Integer>p1=a->a/3==0;
		Predicate<Integer>p2=a->a%5==0;
		show(x,p.or(p1).or(p2));
	}
	static void show(int x[],Predicate<Integer>P){
		for(int i:x){
		if(P.test(i))
		{
			System.out.print(i+" ");
		}
		}
		
	}
}
OUTPUT:-5 12 30 10 36 94 2 17 1 45 67 33 59

-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

   (e) public static <T> java.util.function.Predicate<T> isEqual(java.lang.Object);
=> method ka return type Predicate hai aur Parameter hum isme object type ka data dete hai.

"V.V.IMP NOTE:-" Predicate interface ki isEqual() method ne test() method ko internally 
Override kiya hua hai.
Step 1:-
import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		Predicate<String>p=Predicate.isEqual("ram");
		System.out.println(p.test("ram"));
		System.out.println(p.test("RAM"));
	}
}
OUTPUT:-true
        false

Step 2:-Final program ki kese override kiya hua hai isEqual() method ne test() method ko.

@FunctionalInterface
interface inter1<T>
{
	boolean test(T t);
	static inter1 isEqual(String s)
	{
		return t->s.equals(t);
	}	
}
class DEMO
{
	public static void main(String ar[]) {
		inter1<String> i=inter1.isEqual("RAMJI"); 
		System.out.println("JAISHREERAMji");
	}
}
------------------------------------------------------------------------------------------------
**HUM SOME QUESTIONS SOLVE KRENGE JO KI PREDICATE INTERFACE SE RELAETED HAI OR AANA CHAHIYE**

//PRINT EVEN NUMBER OF AN ARRAY USING PREDICATE INTERFACE

import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		int x[]={1,5,6,7,8,10,5,46,67,89,88,66,42,40,12};
		Predicate<Integer>p=a->a%2==0;
		show(x,p);
	}
	static void show(int x[],Predicate<Integer> P){
		for(int i:x){
			if(P.test(i)){
				System.out.print(i+" ");
			}
		}
	}
}
OUTPUT:-6 8 10 46 88 66 42 40 12

//WRITE A PROGRAM FOR PRIME NUMBER SERIES USE PREDICATE INTERFACE

import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		Predicate<Integer>p=n->
		{
			int c=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
				return true;
			};
			show(10,50,p);
	}
			static void show(int s,int e,Predicate<Integer>P)
			{
				for(int i=s;i<50;i++){
					if(P.test(i))
					{
						System.out.print(i+" ");
					}
				}
}
}
OUTPUT:-11 13 17 19 23 29 31 37 41 43 47

//WRITE A PROGRAM FOR PRIME AND PALINDROME FUNCTION USING PREDICATE INTERFACE

import java.util.function.Predicate;
class DEMO
{
	public static void main(String ar[]){
		Predicate<Integer>p=n->
		{
			int c=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					return false;
			}
				return true;
			};
		Predicate<Integer>p1=n->
		{
			int n1=n;
			int s=0;
			int a=0;
			while(n!=0)
			{
				a=n%10;
				s=s*10+a;
				n=n/10;
			}
			if(n1==s)
				return true;
			else return false;	
		};	
show(p.and(p1));		
	}
	static void show(Predicate<Integer>P){
		for(int i=100;i<999;i++)
		{
			if(P.test(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
OUTPUT:-101 131 151 181 191 313 353 373 383 727 757 787 797 919 929

------------------------------------------------------------------------------------------------
                                        "POINTS TO REMEMBER"
1)Predicate Interface ke pass total 5 methods hai.
jisme se 1 abstract method hai(test(T)).
aur baki 3 default method hai(or(),negate(),and()).
and 1 static method hai isEqual();	

=>test() method ka return type boolean hai aur baki ki four method ka return type Predicate hai.
=>test() method ka parameter generic type ka hai aur in negate() method  koi parameter nhi hai.
=>or() and and() method ka parameter hai Predicate type ka jabki.
=>isEqual() method ka parameter hai Object type ka.

------------------------------------------------------------------------------------------------
                  **"SOME IMPORTANT QUESTION RELATED TO PREDICATE INTERFACE "**

Basic Questions:
=>What is the Predicate interface in Java?
=>In which package is the Predicate interface available?
=>What is the functional method of the Predicate interface?
=>How is Predicate different from Function and Consumer interfaces?
=>Can you use Predicate with primitive types like int or double? If not, 
how can you handle primitive types?				  
									
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

                              2)"FUNCTION FUNCTIONAL INTERFACE"

**AB HUM EK KAAM KRTEY HAI NORMALY EK INTERFACE BNATEY HAI USME HUM EK METHOD 
BNATEY HAI JISKA RETURN TYPE OR PARAMETER DONO APNE HISAB SE DECLARE KR SAKTEY HAI 
KI HUM KYA PARAMETER DENGE OR KYA RETURN KRWAYENGE**

Program 1:-
@FunctionalInterface
interface inter1<T,R>
{
	R Apply(T t);
}
class DEMO
{
	public static void main(String ar[]){
		inter1<String,Integer>i=a->a.length();

		System.out.println(i.Apply(""));
		System.out.println(i.Apply("ram"));
		System.out.println(i.Apply("ramji"));
	}
} 

Program:-2
@FunctionalInterface
interface inter1<T,R>
{
	R Apply(T t);
}
class DEMO
{
	public static void main(String ar[]){
		inter1<Integer,Integer>i=a->a*a*a;

		System.out.println(i.Apply(1));
		System.out.println(i.Apply(2));
		System.out.println(i.Apply(3));
	}
}

Now, Hum function interface ke baare mein padenge.

=>Yeh ek functional interface hai kyuki iske pass ek abstract method hai jiska name:-
(a)public abstract R apply(T);
=>yeh interface util.function package ke ander rakha hua hai.
=>aur R apply(T) method ka parameter generic type ka hai or return type bhi generic hai
mtlb hum apni need ke according return type or parameter dono rakh saktey hai.
=>Iske pass 3 method aur hai jisme se (b) and (c) default methods hai .
aur 1 method hai (d) wali wo static method hai.
(b)public<V>java.util.function.Function<V,R>compose(java.util.function.Function<?super V,?extends T>);
(c)public<V>java.util.function.Function<T,V>andThen(java.util.function.Function<?super R,?extends V>);
(d)public static <T>java.util.function.Function<T,T>identity();						  	
=>3 methods (b)(c)and(d) ka return type Function hai aur 1 method (a) ka return type R hai 
iska mtlb hai ki generic type hum jese chahey uss form mein return krwa saktey hai.
=>Ab hum inn methods ke parameter ki baat kre to 2 methods (b)and(c) ka parameter Fuction hai.
or baki ki 1 method hai (a) uska parameter jiska parameter T hai mtlb generic type ka mtlb
uska parameter hum apne according rakh saktey hai.
or 1 method aur bachi hai (d) jisme koi parameter nhi hai.	




       **AB HUM FUNCTION INTERFACE KI INN METHOD KA USS KRKE PROGRAM BNATEY HAI**	

      (a)public abstract R apply(T);
	  
** ISS PROGRAM MEIN HUM PREVIOUS PROGRAM  2 KO HI CONVERT KR RHE HAI KITNA ESSAY KAAM HO JATA 
HAI DIRECT USE KARNE PR ** 	  

import java.util.function.Function;
class DEMO{
	public static void main(String ar[]){
		Function<Integer,Integer> f=a->a*a*a;
		System.out.println(f.apply(1));
		System.out.println(f.apply(2));
		System.out.println(f.apply(3));
	}
}

Use Function<T, R> when you need data transformation.
for this we use apply method which transform T to R.
------------------------------------------------------------------------------------------------

(b)public<V>java.util.function.Function<V,R>compose(java.util.function.Function<?super V,?extends T>);

import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Integer> f1=a->a+a;
		Function<Integer,Integer> f2=a->a*a;
		System.out.pintln(f1.compose(f2).apply(10));
	}
}

WORKING KO SAMAJHTEY HAI
=>Pehle apply method call hoga phir 
=>Iske baad compose method call hoga
compose method ke according jo bhi function parameter mein hoga wo pehle call hoga
uske baad jo other function hai wo call hoga,mtlb compose ke left side wala call hoga.

------------------------------------------------------------------------------------------------

(c)public<V>java.util.function.Function<T,V>andThen(java.util.function.Function<?super R,?extends V>);

import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Integer> f1=a->a+a;
		Function<Integer,Integer> f2=a->a*a;
		System.out.println(f1.andThen(f2).apply(10));
	}
}

ISKI WORKING KO SAMAJHTEY HAI 
=>Sabse Pehle apply method call hogi.
=>Iske baad andThen method call hogi jisme sase pehle jo method ke left side mein 
function hai wo call hota hai uske baad jo method ke parameter mein hai wo function call hota hai.

------------------------------------------------------------------------------------------------

**AB HUM ABOVE DONO METHOD KE ACCORDING PROGRAM BNAKER SOLVE KRENGE JISSE HMARE CONCEPT STRONG HO**


import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Integer> f1=a->a+a;
		Function<Integer,Integer> f2=a->a*a;
		System.out.println(f1.compose(f2).andThen(f1).apply(2));
	}
}
OUTPUT:-16
pehle compose method call hua uske baad andThen method call hua.

import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Integer> f1=a->a+a;
		Function<Integer,Integer> f2=a->a*a;
		System.out.println(f1.andThen(f2).compose(f1).apply(2));
	}
}
OUTPUT:-64
isme bhi compose method pehle call hoga uske baad andThen method call hoga.


import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
	Function<Integer,Integer> f1=a->a+a;
	Function<Integer,Integer> f2=a->a*a;
	System.out.println(f1.compose(f2).andThen(f1).compose(f2).compose(f1).andThen(f2).apply(2));
                               1	      1           2           3           2
	}
}
OUTPUT:-1048576

ISKI WORKING KO SAMAJHTEY HAI
=>Firstly apply method call hoga.
=>uske baad first compose method call hoga.
=>uske baad andThen method call hoga.
=>uske baad third compose method call hoga.
=>uske baad second compose method call hoga.
=>uske baad second andThen method call hoga.

**To Kya Yhi difference hai kya sirf compose() and andThen method mein ki ek mein to aage se 
flow chalega or dusri method mein piche se flow chalega**

=>Ha issi difference ke basis pr hum dekhtey hai ki kab hme compose() method ka use krna 
hai or kab hme andThen() method ka use krna hai.
------------------------------------------------------------------------------------------------

(d)public static <T>java.util.function.Function<T,T>identity();

import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		Function<Integer,Integer> f=Function.identity();
		System.out.print(f.apply(10));
	}
}

Identity method ka kya use hai isme to koi bhi changes nhi hua hai 
=> identity method ko  hum uss samay use krtey hai jab hum kisi function ko return 
krwatey hai without any changes ke tab use kr saktey hai identity() method ka .

------------------------------------------------------------------------------------------------

**YHA PR HUM AB FUNCTION INTERFACE SE RELATED KUCH QUESTIONS KO SOLVE KRENGE JO AANA CHAHIYE**

//WRITE A PROGRAM TO REMOVE SPACE FROM A STRING USING FUNCTION FUNCTIONAL INTERFACE

import java.util.function.Function;
class DEMO{
	public static void main(String ar[]){
		
		String s="my name is ram";
		Function<String,String> f=s1->s1.replaceAll(" ","");
	System.out.println(f.apply(s));
	}
	
}
OUTPUT:-mynameisram

//WRITE A PROGRAM TO COUNT SPACE IN ANY MSG OR STRING

import java.util.function.Function;
class DEMO
{
	public static void main(String ar[]){
		String s="my name is ram";
		Function<String,Integer> f=s1->s1.length()-s1.replaceAll(" ","").length();
		System.out.println(f.apply(s));
	}
}

------------------------------------------------------------------------------------------------
                   "BASIC QUESTIONS RELATED TO FUNCTION FUNCTIONAL INTERFACE"
1. What is the Function functional interface in Java?
2. What is the method provided by the Function interface?
3. How do you use the Function interface with lambda expressions?
4. What is the purpose of Function.identity()?
=>It returns a function that returns the input as output without modifying it.
5. What are andThen() and compose() methods in the Function interface?
6. What is the difference between andThen() and compose()?			   
7. Can Function be used for primitive types?
=>No, Function<T, R> works with objects.
8. Why use the Function interface instead of regular methods?										
=>It makes code more readable and reusable.
It helps in functional programming with streams and lambda expressions.
It allows easy method chaining (andThen(), compose()).
										
HUMNE SABHI QUESTIONS KE BARE MEIN SAMJHA HAI IN DETAIL.

										
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-




                            3)"CONSUMER FUNCTIONAL INTERFACE"
=>Consumer ka mtlb hai consume krne wala yeh kuch nhi dega sirf lega baki aage dekhtey hai.							
=>Yeh ek functional interface hai kyuki iske pass ek abstract method hai jiska name:-
(a)  public abstract void accept(T);
=>yeh interface util.function package ke ander rakha hua hai.
=>accept() method ka return type void hai or iska parameter generic type ka hai mtlb hum 
kisi bhi type ka parameter insert kr saktey hai.
=>accept() method ka return type void isliye hai kyuki accept method jo hai yeha sirf lene 
ka kaam krta hai yeh kuch bhi return nhi krta hai isliye accept method ka return type void hai.
=>Consumer Interface ke pass 1 method aur hai jiska name 
(b)  public java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T>);
=>method ka return type Consumer type ka hai or parameter bhi Consumer type ka hi hai.
(b) wali method hai yeh default method hai.

                ** AB HUM INN METHOD KE ACCORDING PROGRAM BNAKER TEYAR KRENGE **

(a)  public abstract void accept(T);

import java.util.function.Consumer;
class DEMO
{
	public static void main(String ar[]){
		Consumer<String> c=a->System.out.println("RAM JI");
		c.accept("arun");
	}
}
------------------------------------------------------------------------------------------------

(b)  public java.util.function.Consumer<T> andThen(java.util.function.Consumer<? super T>);

import java.util.function.Consumer;
class DEMO
{
public static void main(String ar[]){
Consumer<Integer> c=a->{
	System.out.println("ram ji");
	};
	Consumer<Integer> c1=a->{
		System.out.println("jai ram ji");
	};
	System.out.println(c1.andThen(c));
	c.accept(2);
	c1.accept(2);
}
}

------------------------------------------------------------------------------------------------
        "basic questions related to the Consumer functional interface in Java"

1)What is the Consumer functional interface in Java?
2)What is the signature of the accept() method in the Consumer interface?
3)How do you use a Consumer with a lambda expression?
4)What does the Consumer interface do?
5)Can a Consumer functional interface return a value?
6)What is the default method andThen() in the Consumer interface?
=>Consumer interface ki andThen() method bhi Function inteface ki andThen method ki tarah 
hi work krti hai .
7)What happens if you pass a null value to a Consumer?
=>Ydi hum null pass krenge to iss condition mein NullPointerException Aker generate hogi.
8)How do you chain multiple Consumer instances together?
=> We can chain multiple consumer  instances together with the help of andThen() method 
which is default method of Consumer Interface.
9)What is the difference between Consumer and Function functional interfaces?
=>Use Consumer when you only need to consume or perform an action on the input
without returning anything.
=>Use Function when you need to transform an input and return a result.
10)What are some real-world use cases of the Consumer functional interface?
=>The Consumer functional interface is commonly used for side-effect operations like logging, 
modifying data, interacting with external systems, or performing actions on each element of a 
collection. Its primary purpose is to allow you to perform actions without expecting a result, 
making it ideal for tasks that focus on doing something rather than producing a return value

-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-


                               4)"SUPPLIER FUNCTIONAL INTERFACE"

=>=>Yeh ek functional interface hai kyuki iske pass ek abstract method hai jiska name:-
(a)    public abstract T get();
=>yeh interface util.function package ke ander rakha hua hai.
=> Iss interface ke pass sirf or sirf ek hi method hai, baki iske pass au koi bhi method nhi 
hai.
=>iss method ka koi bhi parameter nhi hai or iska return type generic type ka hai 
jo hum interface se return krwana chahtey hai uss type ka hum return type rakh saktey hai.

HUM EK PROGRAM BNAKER DEKHTEY HAI ISS METHOD KA USE KRKE JISSE HMARA CONCEPT CLEAR HO JAYEGA

import java.util.function.Supplier;
class DEMO
{
	public static void main(String ar[]){
		Supplier<String> s=()->"JAI RAM JI";
		System.out.println(s.get());
	}
}							   
------------------------------------------------------------------------------------------------
                   " Basic questions related to Supplier functional interface "
				  
1. What is the Supplier functional interface in Java?
=>The Supplier functional interface represents a function that supplies or produces a result 
without taking any input arguments. Its main purpose is to provide or generate a result 
when called.
2. What is the signature of the get() method in the Supplier interface?
3. What is the return type of the get() method in the Supplier interface?
4. How do you use a Supplier with a lambda expression?
5. How does a Supplier differ from a Consumer?
6. What happens if you call the get() method of a Supplier multiple times?
=> Ydi hum constant value lete hai to waha her bar same hi value dega lekin ydi humne likh 
diya Math.random() is condition mein wha her bar calling krne pr different output return 
krega.
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

                                (B)"BINARY FUNCTIONAL INTERFACE"
								
                               1)"BIPREDICATE FUNCTIONAL INTERFACE"

=>BiPredicate interface jo hai iski property bhi same predicate interface ke jsi hi hai.
=>Isme hme ek fayda yeh hua hai ki iski jo abstract method hai usme hme 2 parameter diye hai
jabki predicate mein hme sirf 1 hi parameter diya tha or iski jo four methods hai unki working 
bhi previous predicate interface ki tarah hi hai ki ki kis method ka kya kam hai .
=> BiPredicate interface mein ek isEqual() wali method nhi hai leki predicate interface ne 
hme yeh method provide ki thi.
iske pass 4 konsi konsi method hai unko hum dekhenge.
(a)public abstract boolean test(T,U);
(b)public java.util.function.BiPredicate<T,U>and(java.util.function.BiPredicate<?superT,?superU>);
(c)public java.util.function.BiPredicate<T,U>negate();
(d)public java.util.function.BiPredicate<T,U>or(java.util.function.BiPredicate<?superT,?superU>);

methods ka uss kr rhe hai

import java.util.function.BiPredicate;
class DEMO
{
	public static void main(String ar[]){
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
		System.out.println(p.test(1,2));
		System.out.println(p.test(1,3));
	}
}
OUTPUT:-false
        true
		
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-


                                2)"BIFUNCTION FUNCTIONAL INTERFACE"

=>Is functional interface ke pass sirf 2 hi method hai jisme se 1 abstract method hai
(a)  public abstract R apply(T, U); 
=>iss Bifunction  functional interface mein hme yeh facility mil gai hai ki isme hum double
parameter insert kr saktey hai apne according or uske baad hum jesa chahtey hai wesa 
return type le saktey hai.
=>function functional interface mein yeh facility nhi thi usme first tha waha parameter ke liye
tha or second jo tha wha return tupe ke liye tha.

(b)public <V> java.util.function.BiFunction<T, U, V> andThen(java.util.function.Function<? super R, ? extends V>);								
=>iss method mein first and second paramter ke liye hai aur third jo hai waha return type ke liye hai.

-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

                                3)"BICONSUMER FUNCTIONAL INTERFACE"

(a)public abstract void accept(T, U);
(b)public java.util.function.BiConsumer<T, U> andThen(java.util.function.BiConsumer<? super T, ? super U>);								
							   
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

NOTE:-TO HME YEH SAMAJH AAYA KI UNARY FUNCTIONAL INTERFACE AND BINARY FUNCTIONAL INTERFACE MEIN 
SIRF ITNA HI DIFFERENCE HAI KI UNARY KE JINE BHI INTERFACES HAI UNME SABHI MEIN SINGLE
PARAMETER HUM PASS KARTEY HAI LEKIN BINARY MEIN HUME DOUBLE PARAMETER KI FACILITYI MIL GAI HAI.

------------------------------------------------------------------------------------------------

                             (C)"PRIMITIVE TYPE FUNCTIONAL INTERFACE"
							 
=>Hum primitive type functional interface ka use isliye krtey hai kyuki,isse hmare program ka 
performance accha ho ske.
=>ab yha performance accha hone ka mtlb yeh hai ki jo hme problem aa rhi thi pehle autoboxing
hoga phir autounboxing hoga. iss problem se bach jayenge.


                               1)"INTPREDICATE FUNCTIONAL INTERFACE"

  public abstract boolean test(int);
  public java.util.function.IntPredicate and(java.util.function.IntPredicate);
  public java.util.function.IntPredicate negate();
  public java.util.function.IntPredicate or(java.util.function.IntPredicate);							   

BUS HME ITNA YAAD RAKHNA HAI KI SABHI METHOD JO HAI PREDICATE JESE WORK KRTI HAI THIK WESE
HI INT,LONG,DOUBLE SABHI KI METHOD WORK KREGI BS JO ABSTRACT METHOD HAI UNME PEHLE HUM 
GENERIC TYPE DE RHE THE TAB AUTOBOXING OR AUTOUNBOXING HO RHI THI LEKIN JAB HUM PRIMITIVE 
TYPE KI VALUE DE DENGE TO USSE AUTOBOXING KRNE KI JARURAT HU NHI PDEGI,OR JAB AUTOBOXING NHI
HOGI TO UNBOXING KRNE KI JARURAT HI NHI HOGI OR KUCH NHI HAI.

                              2)"LONGPREDICATE FUNCTIONAL INTERFACE"

  public abstract boolean test(long);
  public java.util.function.LongPredicate and(java.util.function.LongPredicate);
  public java.util.function.LongPredicate negate();
  public java.util.function.LongPredicate or(java.util.function.LongPredicate);							  
				  
                             3)"DOUBLEPREDICATE FUNCTIONAL INTERFACE"

  public abstract boolean test(double);
  public java.util.function.DoublePredicate and(java.util.function.DoublePredicate);
  public java.util.function.DoublePredicate negate();
  public java.util.function.DoublePredicate or(java.util.function.DoublePredicate);

-----------------------------------------------------------------------------------------------
                              1)"INTFUNCTION FUNCTIONAL INTERFACE"  
							  
			  public abstract R apply(int);

                              2)"LONGFUNCTION FUNCTIONAL INTERFACE"
  public abstract R apply(long);


                              3)"DOUBLEFUNCTION FUNCTIONAL INTERFACE" 
  public abstract R apply(double);

-----------------------------------------------------------------------------------------------
                              1)"INTCONSUMER FUNCTIONAL INTERFACE" 

  public abstract void accept(int);
  public java.util.function.IntConsumer andThen(java.util.function.IntConsumer);

                              2)"LONGCONSUMER FUNCTIONAL INTERFACE"  
							  
  public abstract void accept(long);
  public java.util.function.LongConsumer andThen(java.util.function.LongConsumer);

                              3)"DOUBLECONSUMER FUNCTIONAL INTERFACE"

  public abstract void accept(double);
  public java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer);

-----------------------------------------------------------------------------------------------

                             1)"INTSUPPLIER FUNCTIONAL INTERFACE"  
	  public abstract int getAsInt();			  

                             2)"LONGSUPPLIER FUNCTIONAL INTERFACE"
		public abstract long getAsLong();

                             3)"DOUBLESUPPLIER FUNCTIONAL INTERFACE"
		 public abstract double getAsDouble();
		 
		                     4)"BOOLEANSUPPLIER FUNCTIONAL INTERFACE"
		   public abstract boolean getAsBoolean();		
		   
-----------------------------------------------------------------------------------------------
NOTE:-BAKI AUR BHI  FUNCTIONAL INTERFACES HAI LEKIN JO IMP THE UNKI HUMNE BAAT KRI HAI.
YEH CONTENT ENOUGH HAI FRESHERS KE LIYE BS ISSE AAP DHYAN SE SAMJHNA OR IMLEMENT KRNA 
BAKI AAP KHUDH HI EXPERT BN JAYENGE.

           "ABHI TAK HUMNE TOTAL 20 FUNCTIONAL INTERFACES KE BAARE MEIN BAAT KRI HAI"

		 