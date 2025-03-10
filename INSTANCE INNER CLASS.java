          "lambda Expression ko padney ke liye hme nested of class ka concept pdna hi pdega"

"Nested Class"
there are "two types" of Nested class
i) "Non-static"  ii) "Static" 
=>Non-static:-
a) "Instance" Inner class
b) "Local" Inner class
c) "Anonymous" Inner class:-that extends by a class
                        :-that implements by a interface
						:-that define inside the argument
						
						
                                     [1]:-"INSTANCE INNER CLASS" 

**kisi bhi class ki kitni class file banti hai** 
=> Har class ke corresponding  ek hi .class file banti hai.
-----------------------------------------------------------------------------------------------------

**to ab Hum innner class ka program bna rhe hai usme kitni class file bnegi** 

class Demo{class A{class B{}}}
						
iss program mein 3 class file bnegi
sabse pehle outer class ki class file bnegi:-Demo.class
uske baad inner class ki class file bnegi:-Demo$A.class
aur ab class A ke ander ki inner class ki class file bnegi:-Demo$A$B.class
NOTE=>YDI KOI BHI INNER CLASS HAI TO USKI CLASS FILE HMESHA OUTER CLASS KA NAAME DOLLAR SIMBOL($) 
THEN INNER CLASS NAME .CLASS
-----------------------------------------------------------------------------------------------------

class Demo{class A{class B{public static void main(String ar[]){System.out.println("RAM");}}}}
Error: Main method not found in class DEMO, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
isme error aane ka karan yeh hai ki mein method jo hai waha instance inner class mein hai aur hum 
instance inner class mein  static method nhi bna saktey hai hai.Dusra karan yeh bhi hai ki 
outer class ke corresponding inner class work krti hai aur outer class ke pass main method nhi hai.
-----------------------------------------------------------------------------------------------------

NOTE 1=>HUM KABHI BHI INTANCE INNER CLASS KE ANDER STATIC METHOD BNAKER TEYAR NHI KR SAKTEY HAI.
NOTE 2=> HUM INNER CLASS KA OBJECT KUCH ISS TARAH BNATEY HAI 
Outer class name . Inner class name  refrence variable name=Outer class ka refrence
variable ka naam .object creat krna hai inner class ka.
for example:- Demo d=new Demo();
Demo.A a=d.new A();
Demo.A.B b=a.new B();
-----------------------------------------------------------------------------------------------------

NOTE:- INSTANCE INNER CLASS KO ACCESS KRNE KE LIYE OUTER CLASS KA OBJECT CREAT KRNA COMPULSARY HAI.
KYUKI INNER CLASS KA OBJECT OUTER CLASS KE OBJECT PR DEPEND HOTA HAI .
-----------------------------------------------------------------------------------------------------

**Alag Alag place pr variable ko kese access krenge** 
class A{int x=30;class B{int x=20;void show1(){int x=10;System.out.println(x);
System.out.println(this.x);System.out.println(B.this.x);System.out.println(A.this.x);}}}
-----------------------------------------------------------------------------------------------------

**Outer class ke private data ko Inner class ka method access kr sakta hai ya nhi 
ydi ha to kyu or nhi to kyu**
=> kr sakta hai inner class ka method outer class ke private data ko acces because
inner class bhi to outer class hi member hai na or apni class ka koi bhi member
kisi bhi type ke data ko acces kr sakta hai.
-----------------------------------------------------------------------------------------------------

**KYA HUM CLASS KO PRIVATE DECLARE KR SAKTEY HAI YA NHI 
=> Nhi hum kabhi bhi class ko private declare nhi kr saktey hai kyuki 
ydi hum class ko private declare kr denge to uska content ko access kese krenge.
error aayegi:veriable private not allowed here.
-----------------------------------------------------------------------------------------------------

**HUM OUTER CLASS KE SATH KON KON SE MODIFIER KA USE KR SAKTEY HAI**
a)public, b)default, c)final, d)abstract and e)strictf onlly inn 5 keywords ka use kr saktey hai.
-----------------------------------------------------------------------------------------------------

**HUM INNER CLASS KE SATH KON KON SE MODIFIER KA USE KR SAKTEY HAI**
=>hum uper ke 5 Modifiers ka to use kr hi saktey hai sath hi :-a)protected b)private and 
c)static ka bhi use kr saktey hai esse hum total 8 keywords ka use kr saktey hai.
-----------------------------------------------------------------------------------------------------

**YDI HUMNE INNER CLASS KO PRIVATE DECLARE KR DIYA TO USKE CONTENT KO KESE ACCESS KRENGE**
=>Hum ydi esa krtey hai ki inner class ko private declare kr dete hai,
iss condition mein uske data ko access krne ke liye outer class mein hum instance method
bna denge or usee inner class ko access kr lenge kyuki hme pta hai ki kisi bhi class
ke ander kesa bhi data ho usko usi class ke member access kr sakta hai.
for example:-
class A{private class B{void show1(){System.out.println("class B...");}}
void show(){B b=new B();b.show1();}}
class DEMO
{public static void main(String ar[]){A a=new A();a.show();}} 
-----------------------------------------------------------------------------------------------------

**ACCORDING TO VERSION 1.8 KYA HUM NON-STATIC INNER CLASS MEIN STATIC DATA ASSINGN KR SAKTEY HAI**
=> Nhi kr saktey hai. 
-----------------------------------------------------------------------------------------------------

**KYA HUM OUTER CLASS KI TARAH HI INNER CLASS MEIN BHI INSTANCE BLOCK KA USE KR SAKTEY HAI**
=>HANN HUM INSTANCE BLOCK KA USE KR SAKTEY HAI OUTER CLASS KI TARAH INNER CLASS MEIN BHI.
-----------------------------------------------------------------------------------------------------

**HME PTA HAI KI INNER CLASS KA OBJECT OUTER CLASS KE OBJECT PR DEPEND HOTA HAI 
YDI OUTER CLASS HMARI ABSTRACT HAI TO PHIR USKA TO HUM OBJECT NHI BNA SAKTEY HAI 
ISS CONDITION MEIN HUM INNER CLASS KE DATA KO KESE ACCESS KRENGE.
=>Esa krne ke liye hum jis bhi sub class mein extend krenge uska object bna lenge uske baad 
uss object ki help se abstract class ke ander rakhi hui inner class ka object bnaker teyar 
krenge or us object se inner class ki method ko call krenge.
------------------------------------------------------------------------------------------------------

**YDI HUMNE ABSTRACT CLASS A LIYA HAI OR USKE ANDER INSTANCE INNER CLASS B LIYA HAI AUR 
JIS CLASS MEIN ABSTRACT CLASS KO INHERIT KIYA HAI USS CLASS KA NAME BHI SAME LIYA HAI 
CLASS B KE NAME SE TO ISS CONDITON MEIN KYA HOGA ERROR AAYEGI YA PROGRAM RUN HO JAYEGA**
=>Yes, program run ho jayega koi problem nhi hogi.

class A {class B {}	}
class B extends A{}
class demo{p.s.v.m(){}}
------------------------------------------------------------------------------------------------------

**YDI HUM BINA KOI EXTRA CLASS BNAYE JO ABRACT CLASS A KE ANDER BNI HAI CLASS B KE JESI HI 
ABSTRACT CLASS KI SUBCLASS B BNAYE OR USME HI MAIN METHOD RAKHI HO TO ISS CONDITION MEIN 
TO ISS CONDITION MEIN KYA HOGA**
=>Iss condition mein error generate hogi due to class name conflict.Isse bachne ke liye hum 
jis bhi class mein extend kr rhe hai uska name different rakhenge to hmara program proper work 
krega aur proper output provide krega.

class A{class B{}}
class B extends{p.s.v.m(){}}
------------------------------------------------------------------------------------------------------

**YDI HUM OUTER CLASS KA NAME OR INSTANCE INNER CLASS KA NAAM SAME RAKH DENGE TO KYA HOGA** 
=>Esa sirf inheritance mein hi possible hai ki subclass or super class ki Instance inner class ka 
name same rakh saktey hai ydi hum esa kre ki outer class aur inner class dono ko name same rakhenge
to error generate hogi.wah erro mein brayega ki package mein same class already defined hai.

class A{class A{}}
------------------------------------------------------------------------------------------------------

**HME PTA HAI KI HUM ABSTRACT CLASS KA OBJECT NHI BNA SAKTEY HAI TO YDI HUM CHAHTEY HAI KI HMARE
PASS ABSTRACT INSTANCE INNER CLASS HAI USKE DATA KO ACCESS KRNA HAI TO KESE KRENGE **
=>Hme abstract inner class ka data access krne ke liye ek aur inner class bnani hogi usi same outer
class ke ander aur usme hum inherit kr denge abstract class ko aur new class jo bnai hai uska object 
create krke abstract class ke data ko hum easily access kr saktey hai.

class A{abstract class B{void show(){}}
        class C extends B{}}
class Demo{p.s.v.m(){A a=new A();
A.C c=a.new C(); c.show();}}		
------------------------------------------------------------------------------------------------------
						
**KYA HUM ABSTRACT INSTANCE INNER CLASS KE ANDER ABSTRACT METHOD BNAKER TEYAR KR SAKTEY HAI 
YDI HA TO US ABSTRACT METHOD KE DATA KO ME KESE ACCESS KRENGE **
=>Hum abstract class ke ander abstract method bna saktey hai.uske data ko access krne ke liye hme
inheritance apply krna hoga kyu ki according to rule ydi class mein ek bhi astract method hai to 
uss class ko abstract declare krna compulsory hai or abstract class ka hum objct create nhi kr saktey
hai, To iss condition mein inherit krna hi hoga or subclass mein abstract class ki abstract method ki 
body bnana compulsory hai another inner class mein same outer class ki.
tabhi hum abstract method ke data ko access kr payenge.

class A{class B {abstract void show();}
        class C extends B{void show(){}}}
------------------------------------------------------------------------------------------------------

                                     "POINTS TO REMEMBER"
1)Note:  We can not have a static method in a nested inner class because an inner class is implicitly
associated with an object of its outer class so it cannot define any static method for itself.
For example, the following program doesn’t compile. But Since JAVA Version 16 we can have static 
members in our inner class also.

2)An inner class has access to all members (including private) of the outer class.

3)The inner class can implement interfaces independently of the outer class.

4) Even if the outer class implements an interface, the inner class does not automatically 
implement it unless specified.