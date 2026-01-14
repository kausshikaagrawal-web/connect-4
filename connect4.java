import java.util.*;
class connect4
{
public static void main (String ag[])throws Exception
{
Scanner sc=new Scanner(System.in);
int r,c,i,x,c1,c2,j2,s=0,s2=0,x4,i4;
System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println("                              ===========================================================");
System.out.println();
System.out.println("                                                 "+"C O N N E C T    F O U R ");
System.out.println();
System.out.println("                              ===========================================================");
System.out.println();
System.out.println();
System.out.println();System.out.println();
System.out.println("=========================== ");
System.out.println(" INSTRUCTIONS   TO   PLAY  ");
System.out.println("=========================== ");
System.out.println();System.out.println();
System.out.println("1)    "+"Enter   The   Row   And   Column   Of   The   Arena   ( Both >=4)");
System.out.println();
System.out.println("2)    "+"Enter   The   Column   Number    Where   You   Want   To   Place   Your   VARIABLE .");System.out.println();
System.out.println("3)    "+"Enter   The   Column   Number    Within   The   Range .");System.out.println();
System.out.println("4)    "+"Enter   The   Names   Of   The   Player   Who   Are   Later   Given   The    VARIABLES    Alphabetically    As   -   A  ,  B   etc.");
System.out.println();
System.out.println("5)    "+"The   PLAYER   Who    Successfully   Puts   4 VARIABLES   Together   Either   ( Horizontally  ,  Vertically  ,  Diagonally  )    WINS   THE   GAME .");     
System.out.println();
System.out.println();
System.out.println();
System.out.println();
System.out.println("ENTER  1  -"+"    NEW    GAME");
System.out.println();
System.out.println();
System.out.println("ENTER  2  -"+"    CONTINUE    OLD    GAME");
System.out.println();
System.out.println();
int f = sc.nextInt();
System.out.println();
System.out.println();System.out.println();
if(f==1);
{
System.out.println("Player  A -   Enter   Your   NAME ");
System.out.println();System.out.println();
String g=sc.next();
System.out.println();System.out.println();
System.out.println("Player  B -   Enter   Your   NAME " );
System.out.println();System.out.println();
String g2=sc.next();
System.out.println();System.out.println();
System.out.println();
System.out.println("Enter   Rows   And   Columns   Of   The   Arena");
System.out.println();
System.out.print("ROWS   -   ");
r=sc.nextInt();
System.out.println();
System.out.print("COLUMNS  -   ");
c=sc.nextInt();
int j=2*r-2;
j2=2*r-2;
String arr[][]=new String[2*r][2*c+1];
for(i=0 ; i<2*r ; i++)
{
for(x=0 ; x<2*c+1 ; x++)
{
if(i%2==1)
{
if(x%2==1)
{
arr[i][x]="--";}
}
if(i%2==1)
{
if(x%2==0)
{
arr[i][x]=" ";}
}
if(i%2==0)
{
if(x%2==1)
{
arr[i][x]="  ";}
}
if(i%2==0)
{
if(x%2==0)
{
arr[i][x]="|";}
}
}
}
System.out.println();
System.out.println();
System.out.println("                                                    ==============================");
System.out.println("                                                       LETS   START   THE   GAME");
System.out.println("                                                    ==============================");
System.out.println();System.out.println();
System.out.println();
for(i=0 ; i<2*r ; i++)
{
for(x=0 ; x<2*c+1 ; x++)
{
System.out.print(arr[i][x]);
}
System.out.println();
}
abc: for(int u=0;u<(r*c+1)/2;u++)
{
System.out.println();
System.out.println();
System.out.println(g+" - Enter   A   COLUMN   Number ");
System.out.println();
c1=sc.nextInt();
System.out.println();
System.out.println();
c1=2*c1-1;
while(s==0)
{
if(arr[j][c1].compareTo("  ") ==0)
{
arr[j][c1]="A ";
for(i=0 ; i<2*r ; i++)
{
for(x=0 ; x<2*c+1 ; x++)
{
System.out.print(arr[i][x]);
}
System.out.println();
}
s=s+1;
}
else
{
j=j-1;
}
}
for(i4=0 ; i4<2*r ; i4=i4+2)
{
for(x4=1; x4<2*c+1 ; x4=x4+2)
{
if(arr[i4][x4].compareTo("A ")==0)
{
if((2*c-1 )-x4>=6)
{
if(arr[i4][x4].compareTo(arr[i4][x4+2])==0 && arr[i4][x4+2].compareTo(arr[i4][x4+4])==0 && arr[i4][x4+4].compareTo(arr[i4][x4+6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if((2*r-2) -6-i4>=0)
{
if(arr[i4][x4].compareTo(arr[i4+2][x4])==0 && arr[i4+2][x4].compareTo(arr[i4+4][x4])==0 && arr[i4+4][x4].compareTo(arr[i4+6][x4])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if( (2*r-2)-6-i4>=0 && ((2*c-1 )-x4>=6))
{
if(arr[i4][x4].compareTo(arr[i4+2][x4+2])==0 && arr[i4+2][x4+2].compareTo(arr[i4+4][x4+4])==0 && arr[i4+4][x4+4].compareTo(arr[i4+6][x4+6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			     "+g+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if(x4  >=7 && (2*r-2)-6-i4>=0)
{
if(arr[i4][x4].compareTo(arr[i4+2][x4-2])==0 && arr[i4+2][x4-2].compareTo(arr[i4+4][x4-4])==0 && arr[i4+4][x4-4].compareTo(arr[i4+6][x4-6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
}
}
}
if(u<=((r*c+1)/2)-2)
{
System.out.println();
System.out.println();
System.out.println(g2+" - Enter   A   COLUMN   Number");
System.out.println();
c2=sc.nextInt();
System.out.println();
System.out.println();
c2=2*c2-1;
while(s2==0)
{
if(arr[j2][c2].compareTo("  ")==0) 
{
arr[j2][c2]="B ";
for(i=0 ; i<2*r ; i++)
{
for(x=0 ; x<2*c+1 ; x++)
{
System.out.print(arr[i][x]);
}
System.out.println();
}
s2=s2+1;
}
else
{
j2=j2-1;
}
}
for(i4=0 ; i4<2*r ; i4=i4+2)
{
for(x4=1; x4<2*c+1 ; x4=x4+2)
{
if(arr[i4][x4].compareTo("B ")==0)
{
if((2*c-1 )-x4>=6)
{
if(arr[i4][x4].compareTo(arr[i4][x4+2])==0 && arr[i4][x4+2].compareTo(arr[i4][x4+4])==0 && arr[i4][x4+4].compareTo(arr[i4][x4+6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g2+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if((2*r-2) -6-i4>=0)
{
if(arr[i4][x4].compareTo(arr[i4+2][x4])==0 && arr[i4+2][x4].compareTo(arr[i4+4][x4])==0 && arr[i4+4][x4].compareTo(arr[i4+6][x4])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			     "+g2+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if( (2*r-2)-6-i4>=0 && ((2*c-1 )-x4>=6))
{
if(arr[i4][x4].compareTo(arr[i4+2][x4+2])==0 && arr[i4+2][x4+2].compareTo(arr[i4+4][x4+4])==0 && arr[i4+4][x4+4].compareTo(arr[i4+6][x4+6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g2+"    WINS   ");
System.out.println("                       =====================");
break abc;
}
}
if(x4>=7 && (2*r-2)-6-i4>=0)
{
if(arr[i4][x4].compareTo(arr[i4+2][x4-2])==0 && arr[i4+2][x4-2].compareTo(arr[i4+4][x4-4])==0 && arr[i4+4][x4-4].compareTo(arr[i4+6][x4-6])==0)
{
System.out.println();
System.out.println();
System.out.println("                       =====================");
System.out.println("			      "+g2+"    WINS   ");
System.out.println("                       ====================="); 	
break abc;
}
}
}
}
}
s=0;
j=2*r-2;
s2=0;
j2=2*r-2;
}
}
}
}
}
