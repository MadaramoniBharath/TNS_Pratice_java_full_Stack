package coreJava;

public class AcessMod {
public int a=10;
private int b=20;
protected int c=30;

public static void main(String[] args) {
	AcessMod obj=new AcessMod();
	System.out.println(obj.a);
}

}
