                                               "ANONYMOUS INNER CLASS"
                                            (BINA NAME WALI INNER CLASS)
=>Aage badne se pehle hme kuch points ko dhyan mein rakhna hai ki super class ka refrence variable subclass ke object ko
Hold kr sakta hai.
=>Hum abstract class ka object to create nhi kr saktey hai lekin abstract class ka hum refrence variable(refrence object) 
bilkul bnaker teyar kr saktey hai.
                             "PART FIRST: Anonymous Inner Class That Extends By a class"

Anonymous inner class ko samajhne ke liye pehla program:-
STEP 1:-
abstract class A
{
	void show(){
		System.out.println("class A...");
	}
}										
class DEMO
{
	public static void main(String ar[]){
		A a=new A();
		a.show();
	}
}
OUTPUT:-error: A is abstract; cannot be instantiated
                A a=new A();
Yha Pr Error Isliye Aa Rhi Hai Kyuki Hme Pta Hai Ki Hum Abstract Class Ka Object Nhi Bna Saktey Hai Phir Bhi Hum Koshish
Kr Rhe Hai.

STEP:-2
abstract class A
{
	void show(){
		System.out.println("class A...");
	}
}
class B extends A
{}										
class DEMO
{
	public static void main(String ar[]){
		A a=new B();
		a.show();
	}
}
OUTPUT:-"class A..."

STEP:-3 PRAGRAM FOR ANONYMOUS INNER CLASS

abstract class A
{
	void show(){
		System.out.println("class A...");
	}
}										
class DEMO
{
	public static void main(String ar[]){
		A a=new A(){};
		a.show();
	}
}
OUTPUT:-"class A..."
------------------------------------------------------------------------------------------------------------------------------

**TO SWAL YEH AATA HAI KI STEP 3 MEIN PROGRAM KYU RUN HO GYA BINA KISI ERORE KE JABKI STEP 1 KE PROGRAM MEIN ERROR THI**
=> Step:1 me, Hum abstract class ka object create nhi kr saktey hai aur hum uska object bna rhe the isliye error aa rhi hai 
=> Step:2 me, Hum abstract class ka object na bna kr uski sub class ka object create kr rhe hai or hme pta hai ki abstract 
class ka hum bhale hi object nhi bna saktey hai lekin uska refrence variable bna saktey hai, to humne ek sub class bnaya jiski
help se hum super abstract class ko access kr paye.
=> Step:3 me, To aapke mn mein swal aa rha hoga ki  humne iss step mein to esa kiya hi nhi phir bhi program runn kese ho rha 
hai to hum bta de ki line NO.57 humne jo likha uski help se chal rha hai ab isko hum samajhtey hai.
step:2 se connect krke samajhne ki koshish krtey hai uski line NO.40  se or step:3 ki line NO. 57 dono se.

A a=new B()                                                                A a=new A()
                                                                           {

																		   }

i)jis tarah humne subclass B ko bnaya                              i) thik ussi tarah humne ek anonymous class ko bnaker
Abstract class A ke data ko access krne                              teyar kiya hai.curli bracket se.jo ki subclass hai 
ke liye.			                                                 abstract class A Ki internally.

ii)new B() isse subclass ka object create                          ii)Aur isme Humne new A(){} likhe hai isse humne uss
hua hai class B ka.usko humne superclass                              anonymous class ka object create kra hai jo ki sub-
ke variable se hold krwaya hai.                                       class hai super class A Ki.Yeh Hme kese pta chala  
jo ki hme pta hai superclass ka refrence                               ki jo object create hua hai wha ussi Abstract class 
variable subclass ke object ko hold                                   ke corresponding bna hai? Humne jab anonymous class
kr sakta hai.                                                         ka object create krtey hai tab hum super class ko uss
															          krtey hai, isse hme pta chala.Aur uss object ko humne
																	  superclass ke refrence variable se hold krwa liya 
																	  ese hmara program chala.
------------------------------------------------------------------------------------------------------------------------------

**ANONYMOUS INNER CLASS JO HUMNE BNAKER TEYAR KIYA HAI USKI .CLASS FILE KESE BANKER TEYAR HOGI**

abstract class A
{
	void show(){
		System.out.println("class A...");
	}
}										
class DEMO
{
	public static void main(String ar[]){
		A a=new A(){};
		a.show();
	}
}
=>Sabse pehle to DEMO.class banker teyar hogi 
=>Iske baad ek class banker teyar hogi A.class
=>Ab yaad rhe anonymous class bhalehi A class se extends hai lekin waha jis bhi class ke ander hai 
ussi class ke corresponding anonymous class ki .class file bnegi.
to anonymous inner class ki class file DEMO$1.class bnegi.
------------------------------------------------------------------------------------------------------------------------------
**YDI HUMNE KOI  ABSTRACT METHOD BNAI ABSTRACT CLASS A MEIN  TO USKI BODY HUM KHA BNAYENGE OR KESE BNATEY HAI**
=>Ydi koi  abstract method di hoti hai hmari abstract class mein to uski body hme subclass mein bnaker teyar krna hota hai

Step 1:-iske liye hum normal program bnaker teyar krtey hai samajhne ke liye
abstract class A
{
	abstract void show();
}						
class B extends A
{
	void show(){
		System.out.println("class A ki abstract method ko define kiya hai class B mein");
	}
}				
class DEMO
{
	public static void main(String ar[]){
		A a=new B();
		a.show();
	}
}
	OUTPUT:-"class A ki abstract method ko define kiya hai class B mein"

STEP:-2 AB HUM ISI PROGRAM KO ANONYMOUS INNER CLASS MEIN CONVERT KRENGE 

abstract class A
{
	abstract void show();
}										
class DEMO
{
	public static void main(String ar[]){
		A a=new A()
		{
			void show()
			{
		System.out.println("class A ki abstract method ko define kiya hai anonymous inner class mein");
			}
		};
		a.show();
	}
}		
OUTPUT:-"class A ki abstract method ko define kiya hai anonymous inner class mein"

STEP:-3 ISS STEP MEIN HUM PREVIOUS STEP KO HI THOD CHANGE KRENGE KI  OBJECT KO BINA STORE KRWAYE BHI PROGRAM BNA SAKTEY HAI

abstract class A
{
	abstract void show();
}										
class DEMO
{
	public static void main(String ar[]){
		new A()
		{
			void show()
			{
		System.out.println("class A ki abstract method ko define kiya hai anonymous inner class mein");
			}
		}.show();
	}
}
------------------------------------------------------------------------------------------------------------------------------

**AB HUMNE PDA HUA HAI METHOD OVERRIDING KE CASE MEIN HUM HAR EK OBJECT KE CORRESPONDING METHOD KO CALL KR RHE HAI 
LEKIN AB HUM CHAHTEY HAI KI KISI PERTICULAR OBJECT KE CORRESPONDING METHOD KO OVERRIDE KRE TO HUM KESE KRENGE **

STEP:1 ISME HUM OOPS KE CONCEPT KO SAMAJHTEY HAI PEHLE ISKE LIYE PROGRAM BNA RHE HAI.

class Employee
{
	void sal()
	{
		System.out.println("50,000");
	}
	void com()
	{
		System.out.println("Evision");
	}
}
class Manager extends Employee
{
	void sal()
	{
		System.out.println("70,000");
	}
	public static void main(String ar[]){
		Employee Arun=new Manager();
		Employee Sonu=new Manager();
		Employee Ram=new Manager();
		
		Arun.sal();
		Arun.com();
		
		Sonu.sal();
		Sonu.com();
		
		Ram.sal();
		Ram.com();
			}
}
NOTE:-Uper Wale Program Mein Hum Alag-Alag object Ke Corresponding methods ko call kr rhe hai lekin unme common changes ho 
rhe hai lekin hum chahtey hai ki sirf Object "Arun" ke corresponding hi salary mein changes ho baki ke kitne bhi object hai
unke corresponding koi bhi changes nhi ho mtlb previous mein jo bhi salary thi wo hi rhe.

STEP:-2 PERTICULAR OBJECT KE LIYE HUM METHOD KO OVERRIDE KESE KRE ISKE LIYE PROGRAM 

class Employee
{
	void sal()
	{
		System.out.println("50,000");
	}
	void com()
	{
		System.out.println("Evision");
	}
}
class Manager extends Employee
{
	public static void main(String ar[]){
		Employee Arun=new Manager(){
			void sal(){
				System.out.println("70,000");
			}
		};
		Employee Sonu=new Manager();
		Employee Ram=new Manager();
		
		Arun.sal();
		Arun.com();
		
		Sonu.sal();
		Sonu.com();
		
		Ram.sal();
		Ram.com();
			}
}
NOTE:-Perticular Object Ke Corresponding Hum Method ko Anonymous Class Ki Help Se Override Krenge.



-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-

                              "PART SECOND:Anonymous Inner Class That Implemented By Interface"
Hme kuch points yaad rehne chahiye iss second part ko padne se pehle 
1)Hum interface ka object nhi bna saktey hai, Lekin refrence variable bnaker teyar kr saktey hai.
2)interface ke ander jitni bhi methods hai unki body bnana compulsory hai .
3)interface ke ander jitni bhi methods hai unme by default jvm public and abstract add kr 
  deta hai isliye hum jab bhi methods ko use krenge uss samay hme public likhna compulsory hai.

STEP:-1 HUM PEHLE TO NORMAL PROGRAM BNAYENGE INTERFACE KA OR NORMAL CLASS KA 

interface inter1{
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
		inter1 in=new A();
		in.show();
	}
}

STEP:-2 AB HUM USSI PROGRAM KO INONYMOUS INNER CLASS MEIN CONVERT KRENGE JO KI IMPLEMENTS RHEGA INTERFACE SE

interface inter1{
	void show();
}  
class DEMO
{
	public static void main(String ar[]){
		inter1 in=new inter1(){
			public void show(){
		System.out.println("anonymous inner class that implements by an interface");
	}
		};
		in.show();
	}
}
ABOVE PROGRAM SE RELATED SOME IMP POINTS 
a)sabse phle humne anonymous inner class bnaya.
b)waha anonymous inner class inter1 interface se implement hai.
c)aur jo object banker teyar ho hai wo yha pr anonymous inner class ka banker teyar ho rha hai.
d) uss object to inter1 ka refrence variable hold kr rha hai.
------------------------------------------------------------------------------------------------------------------------------
**YDI HUM CHAHTEY HAI KI AWT KE CONCEPT MEIN ANONYMOUS INNER CLASS KESE BNAYE EVENT HANDLING MEIN LISTNER INTERFACE KA CASE**

STEP:-1 Pehle Hum Normal Program Bnayenge Bina Anonymous Class Ka Use Krke Phir Hum Next Step Mein Usi Program Ko Convert 
Krenge Anonymous Inner Class Ke Case Mein Ki Kese Bnaker Teyar Kre.

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1;
	FDemo(){
		setVisible(true);
		setSize(600,600);
		setLocation(300,150);
		setLayout(new FlowLayout());
		b1=new Button("Click!!");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	setBackground(Color.red);	
	}
}
class DEMO
{
public static void main(String ar[]){
	FDemo f=new FDemo();
}
}

STEP:-2 Convert Above Program To Anonymous Inner Class 
FIRST PROGRAM 
import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1;
	FDemo(){
		setVisible(true);
		setSize(600,600);
		setLocation(300,150);
		setLayout(new FlowLayout());
		b1=new Button("Click!!");
		add(b1);
		b1.addActionListener(this);
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

SECOND PROGRAM


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
		b1=new Button("Click!!");
		add(b1);
		b1.addActionListener(new ActionListener(){
		
	public void actionPerformed(ActionEvent e)
	{
	setBackground(Color.red);	
	}});
	}
}
class DEMO
{
public static void main(String ar[]){
	FDemo f=new FDemo();
}
}
							  
							
							
-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
							  
                           "PART THIRD:-Anonymous inner class that define inside the argument"
     "isko samajhne ke pehle hum Adapter class ka concept samjhenge jisse hme third part ko samajhne mein aasani hogi"
Adapter class ko start krne se pehle hum thod dekh lete hai awt ke concept ko ki usme kese frame ko hum delete krtey hai.
first hum program bna rhe hai  nomaly awt ka usko samajhtey hai 
STEP:-1
import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(300,200);	
	}
}
class DEMO
{
	public static void main(String ar[]){
		FDemo f=new FDemo();
	}
}
OUTPUT:-ISS PROGRAM SE FRAME BANKER TEYAR HO JAYEGI LEKIN USKO HUM X(CROSS) KR RHE HAI TO NHI HO RHI HAI 

STEP:-2 HUM CHAHTEY HAI KI  HUM JAB CROSS PR CLICK KRE TAB FRAME HAT JAYE ISKE LIYE HUM PROGRAM BNA REH HAI JISME HUM 
WINDOW LISTNER KA USE KRENGE JO KI awt.event.* package MEIN RAKHA HUA HAI.

import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements WindowListener
{
	FDemo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(300,200);
		addWindowListener(this);	
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowOpened(WindowEvent e){}	
}
class DEMO
{
	public static void main(String ar[]){
		FDemo f=new FDemo();
	}
}

NOTE:- AB HUME SIRF EK HI METHOD KI JARURAT THI LEKIN JO WINDOWLISTNER INTERFACE HAI NA USKE PASS 7 ABSTRACT METHOD HAI 
TO HME SABHI KO SUB CLASS MEIN OVERRIDE KRNA COMPULSORY HAI ISLIYE HMARI MAJBURI THI KI HME SARI METHOD KO OVERRIDE KRNA
PDA.MTLB YEH HAI KI HAMAE PASS YDI 5 CLASSES HAI OR UNME HME KISI MEIN 2 METHOD KI JARURAT HAI YA PHIR KISI CLASS MEIN 
HME 5 METHOD KI JARURAT HAI TO HME NEED TO SIRF 5 METHODS KI HAI LEKIN HME SARI KI SARI METHODS JO KI INTERFACE KI HAI UNKO 
SUB CLASS MEIN DEFINE KRNA COMPULSORY HAI.

=>Lekin Esa Na Krna Pde Iske Liye Java Programming Ne Hme Concept Diya Hai Adapter Class, Jiski Help Se Hum Is Problem Se 
Bach Payenge.

STEP:-3 ADAPTER CLASS KA CONCEPT PADTEY HAI
Isme Hum Sabse Pehle ek progam bnaker teyar krtey hai jo ki adapter class ke liye hoga wo btata hai ki adapter class kese 
work krta hai isme hum anonymous inner class ka use krtey hai jo ki adapter class ki subclass hoti hai or adapter class ko 
hum uss perticular interface se implements krtey hai jiske pas khi sari methods hai.

part:-1

import java.awt.event.*;
class MyAdapter implements WindowListener
{
		public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}

part:-2

import java.awt.*;
import java.awt.event.*;
class FDEMO extends Frame
{
	FDEMO(){
		setVisible(true);
		setSize(500,500);
		setLocation(300,200);
		setBackground(Color.red);
		MyAdapter m=new MyAdapter()
		{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}	
		};
addWindowListener(m);
}
}
class DEMO 
{
	public static void main(String ar[])
	{
		FDEMO F=new FDEMO();
	}
}
------------------------------------------------------------------------------------------------------------------------------

STEP:-3 VERY IMP STEP HAI HAI ISSE DHYAN SE SAMAJHNA HAI
 
part:-1

import java.awt.event.*;
class MyAdapter implements WindowListener
{
		public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}

part:-2

import java.awt.*;
import java.awt.event.*;
class FDEMO extends Frame
{
	FDEMO(){
		setVisible(true);
		setSize(500,500);
		setLocation(300,200);
		setBackground(Color.blue);
addWindowListener(new MyAdapter()
		{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}	
		});
}
}
class DEMO 
{
	public static void main(String ar[])
	{
		FDEMO F=new FDEMO();
	}
}

NOTE:- LINE NO 138 TO 143 KO HI HUM ANONYMOUS INNER CLASS INSIDE THE PARAMETER KEHTEY HAI.

------------------------------------------------------------------------------------------------------------------------------
**REAL LIFE EXAMPLE OF ADAPTER CLASS IN ATM MACHINE**


import java.awt.*;
import java.awt.event.*;

class DEMO extends Frame {
    TextField textField;

   DEMO() {
        setTitle("ATM Keypad (AWT Example)");
        setSize(500,500);
		setLocation(300,200);
		setBackground(Color.red);
		
        setLayout(new FlowLayout());

        textField = new TextField(10);
        add(textField);

        // Adding KeyListener using KeyAdapter
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) { // Allow only numbers
                    e.consume();  // Ignore the invalid key press
                }
            }
        });

        addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                dispose();  // Close window on clicking "X"
            }  
        });
     setVisible(true);
    }
    public static void main(String[] args) {
        new DEMO(); // Open ATM keypad window
    }
}						  
     ** "ISKE AAGE HUM LAMDA EXPRESSION KO PDENGE JO KI ANONYMOUS INNER CLASS KA ADVANCE VERSION HAI" **
														  
																	  
																	  
																	  

				