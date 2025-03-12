**lamda expression ko samajhne ke liye pehle hme annonymous inner class ana chaiye kyuki usi ka extended version 
hai lamda expression**
                            "lamda expression ko introduce version 1.8 mein kiya hai "

**lamda expression ko samjhne se pehle hum yeh samajh le ki functional interface kya hotey hai**
"FUCTIONAL INTERFACE:-The interface which contain only one abstract method is called functional interface"

NOTE:-HUM LAMDA EXPRESSION KA USE SIRF OR SIRF FUNCTIONAL INTERFACE KE CASE MEIN HI KR SAKTEY HAI. 

                                   "DEFINITION OF LAMDA EXPRESSION:-"
**Lambda expression ek nameless (anonymous) function hai jo bina kisi method ya class ko explicitly 
define kiye functional interface ke ek single abstract method (SAM) ko implement karta hai.

Yeh ek short-cut syntax hai jo Java 8 me functional programming ko support karne ke liye introduce 
kiya gaya tha. Lambda expressions se code concise, readable aur maintainable ban jata hai.**

"SYNTAX OF LAMDA EXPRESION:"
=>(parameters) -> { body }	Where 
	
parameters: Method ke input parameters.
-> (arrow operator): Yeh batata hai ki yeh ek lambda expression hai.
body: Method ka implementation.

"TYPES OF LAMDA EXPRESSION:"
1)Lamda expression with no parameter==() -> { // method body };
2)Lamda expression with one parameter==(param) -> { // method body };
3)Lamda expression with multiple parameter==(param1, param2) -> { // method body };
4)Lamda expression with Block Body==(param1, param2) -> {
                                     // Multiple statements
                                         statement1;
                                         statement2;
                                      return result;
                                        };
5)Lamda expression with Return Statement==(param) -> { return result; };
						   

STEP:-1 HUM FUNCTIONAL INTERFACE KA EK PROGRAM BNAKER DEKHTEY HAI.

interface inter1
{
	void show();
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=new inter1(){
			public void show(){
				System.out.println("Inter1  se implemented annonymous class");
			}
		};
		in.show();
	}
}
------------------------------------------------------------------------------------------------------------------

STEP:-2 ABOVE EXAMPLE KO HUM LAMDA EXPRESION MEIN CONVERT KRNE WALE HAI .
=>LAMDA EXPRESION WITH NO PARAMETER KA EXAMPLE HAI YEH

interface inter1
{
	void show();
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=()->{
				System.out.println("Inter1  se bnaya lamda expression");
		};
		in.show();
	}
}

NOTE:-1 ydi hum difference dekhe ki step 1 or step 2 dono mein kya difference hai to hum samajh payenge ki 
jo lamda expression hai na wo annonyous class ka short form hai yeh mann sakte hai.
lamda expression bolta hai ki ydi tumhare pass ek hi method hai to tum uska name bhi mt do mujhe or tum abhi tak
annonymous class ka object bna rhe the wo bhi mt bnao uski jagah pr parenthesis ka use kr lo parameter ke perpose
se or arrow operator(->) ka use kr lo yeh btane ke liye ki yeh lamda expression hai or method ki body ki tarah 
body bna do bs kaam khatam mujhe naam ki jarurat nhi hai, tumhara kaam ho rha hai yhi kafi hai.
NOTE:-2 ydi ek hi statement hai to curli bracket{} ki need nhi hai.

------------------------------------------------------------------------------------------------------------------

STEP:-3 LAMDA EXPRESSION WITH ONE PARAMETER

interface inter1
{
	void show(int x);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=(int a)->{
				System.out.println("Inter1  se bnaya lamda expression="+a);
		};
		in.show(100);
	}
}
1)lamda expression mein hum ydi single parameter ka use kr rhe hai to uska data_type nhi bhi denge to koi
issue nhi hoga.
2)lamda expression mein hum ydi single parameter ka use kr rhe hai to usme paranthesis bhi nhi denge to bhi 
koi problem nhi hogi.
3)lamda expression mein ydi hum single statement use kr rhe hai to hme curly bracket lgane ki koi jarurat 
nhi hai.

==>ISME HUMNE JO BHI UPER 3 POINTS MEIN KHA HAI USSE IMPLEMENT KRENGE.

interface inter1
{
	void show(int x);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=a->System.out.println("Inter1  se bnaya lamda expression="+a);
		in.show(100);
	}
}
NOTE:-1 YDI HUM PARANTHESIS HTA DENGE OR DATA_TYPE NHI HTAYENENGE TO ERROR DEGA 
2 YDI HUM DATA_TYPE HTA DENGE OR PARANTHESIS NHI HTAYENGE TO ERROR NHI DEGA PROPER RUN HOGA.

------------------------------------------------------------------------------------------------------------------

STEP:-3 LAMDA EXPRESSION WITH MULTIPLE PARAMETER KA PROGRAM

interface inter1
{
	void show(int x,int y);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=(int a,int b)->System.out.println("Sum="+(a+b));
		in.show(10,20);
	}
}
1)Hme yaad rakhna hai ki hum sirf without parenthesis tab hi likh saktey hai jab hmare pass sirf single parameter
rhe ydi isse jyada hai aur hum paranthesis ka use nhi krtey hai to error aayegi.
2)hum koi bhi method ko call krtey time ydi parameter mein value dete hai to wo bydefault int data_type hi manega 
or hum ydi alag alag data_type ka use krtey hai to lamda expression mein to jis bhi data type ki range jyada hogi 
usme convert kr dega wo saare data ko addition ke case mein.yeh tab hoga jab hum lamda expression ke parameter mein
data_type nhi lete hai tab waha dono mein se jiski range jyada rehti hai usme convert kr deta hai.
3)Ydi humne method mein shi parameter diye hai or or lemda expression mein uske  reverse data_type liye hai to 
iss condition mein error aayegi.
------------------------------------------------------------------------------------------------------------------

STEP:-4 LAMDA EXPRESSION WITH RETURN STATEMENT 

 interface inter1
{
	int show(int x,int y);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=(int a,int b)->{return(a+b);};
		int sum=in.show(10,20);
		System.out.println(sum);
	}
}
1)jab hum return statement ka use kr rhe hai to curli bracket lgana compulsory hi hai ydi esa nhi krtey 
hai to error aayegi.
2)esa isliye ki jab hum return statement ka use kr rhe hai to waha bol rha hai ki aapko return lgane ki jarurat 
nhi hai ydi single statement hai to hum return type ke according return kr denge by default.
3)dhyan rhe curli bracket ke baad semicolon lgana bhi jaruri hai warna error aa sakti hai.

 interface inter1
{
	int show(int x,int y);
}
class DEMO
{
	public static void main(String ar[]){
		inter1 in=(int a,int b)->
		(a+b);
		int sum=in.show(10,20);
		System.out.println(sum);
	}
}
------------------------------------------------------------------------------------------------------------------
**AB HUM CHAHTEY HAI KI YDI HME GRAPHICS MEIN LAMDA EXPRESSION KA USE KRNA HAI ANNONYMOUS INNER CLASS KI JAGAH
TO HUM KESE USE KRENGE ISKE LIYE HUM PROGRAM BNAKER DEKHENGE**

STEP:-1 Pehle hum annonymous mein bnaker teyar krenge then second step mein hum usko lemda mein convert krenge

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame 
{
	Button b1;
	FDemo(){
		setVisible(true);
		setSize(600,600);
		setLocation(300,150);
		setLayout(new FlowLayout());
		b1=new Button("RRRR");
		add(b1);
		b1.addActionListener(al);
	}
	ActionListener al=new ActionListener(){
		
	public void actionPerformed(ActionEvent e)
	{
	setBackground(Color.red);	
	}};
}
class DEMO
{
public static void main(String ar[]){
	FDemo f=new FDemo();
}
}
------------------------------------------------------------------------------------------------------------------

STEP:-2 AB HME PTA HAI KI ACTIONLISTNER FUNCTIONAL INTERFACE HAI TO USME HUM LAMDA EXPRESSION KA USE KR SAKTEY HAI
TO AB HUM ABOVE EXAMPLE KO LAMDA EXPRESSION KI HELP SE BNAYENGE.

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame 
{
	Button b1;
	FDemo(){
		setVisible(true);
		setSize(600,600);
		setLocation(300,150);
		setLayout(new FlowLayout());
		b1=new Button("RRRR");
		add(b1);
		b1.addActionListener(e->setBackground(Color.red));
	}
}
class DEMO
{
public static void main(String ar[]){
	FDemo f=new FDemo();
}
}
