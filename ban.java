import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;
import java.util.Date;
import java.io.*;
class a {
int x=20000;
void withd()
{
System.out.println(" ENTER THR AMOUNT DO YOU WANT TO WITHDRAW");
Scanner ch = new Scanner(System.in);
int y=ch.nextInt();
if(y>x)
{
System.out.println("TRANSACTION FAILED");
System.exit(0);
}
else
{
System.out.println("ENTER THE PURPOSE");
String p=ch.next();
x=x-y;
System.out.println("YOUR WITHDRAW AMOUNT IS"+y);
System.out.println("## TRANSACTION SUCCESSFULL ##");
Date t = new Date();
String to=t.toString();
try{
FileWriter fw=new FileWriter("abc.txt",true);
BufferedWriter f=new BufferedWriter(fw);
f.write(to);
f.write(p);
f.newLine();
f.close();
f.flush();
}
catch(Exception e)
{
}
}
}
}
class b extends a{
void dep()
{
System.out.println("ENTER THE AMOUNT DO YOU WANT TO DEPOSIT");
Scanner t=new Scanner(System.in);
int i=t.nextInt();
x=x+i;
System.out.println("## YOUR DEPOSIT IS SAFELY DONE ##");
}
void ch()
{
System.out.println("AMOUNT IS "+x);
}
void hn()
{
try{
Desktop d=Desktop.getDesktop();
d.browse(new URI("https://www.bankbazaar.com/personal-loan-customer-care.html"));
}
catch(Exception e)
{
}
}
void mini()
{try
{
FileReader fr=new FileReader("abc.txt");
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null)
{
System.out.println("details are: "+line);
line=br.readLine();
}
}
catch(Exception e)
{
}
}
void m()
{
int o;
int h=1234;
Scanner m=new Scanner(System.in);
System.out.println("enter your PASSWORD");
int c=m.nextInt();
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
}
if(c==h)
{
System.out.println("WELCOME TO ROCKING ATM");

while(true)
{
Scanner t=new Scanner(System.in);
System.out.println("1.withdraw");
System.out.println("2.deposit");
System.out.println("3.check balance");
System.out.println("4.helpline number");
System.out.println("5.mini statement");
System.out.println("6.exit");

int j=t.nextInt();
switch(j)
{
case 1:
withd();
break;
case 2:
dep();
break;
case 3:
ch();
break;
case 4:
hn();
break;
case 5:
mini();
break;
case 6:
System.exit(0);
break;
default:
System.out.println("invalid");
}
}
}
else{
System.out.println("WRONG PASSWORD");
}
}}
class c{
public static void main(String[] args)
{
b obj=new b();
obj.m();
}
}