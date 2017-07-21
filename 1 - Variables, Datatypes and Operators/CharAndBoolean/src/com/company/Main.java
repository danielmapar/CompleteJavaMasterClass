package com.company;

class Dog {
    private String name;
    private String surname;
    private int age;

    public Dog(String name) {
        this(name, " Nome do meio padrao", 0);
    }
    public Dog() {
        this("Defautl", " Nome do meio padrao", 0);
    }
    public Dog(String name, String surname, int age) {
        this.setName(name);
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        if (this.surname == "Daniel") {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }
}



public class Main {

    public static int TOTAL = 10;

    public static void main(String[] args) {
	    char myChar = 'D';
	    char myCharNumber = 102;
	    // 2 bytes = 16 bits
	    char myCharUnicode = '\u006B'; // u is for unicode
        int octal = 0153;

	    System.out.println("myChar: " + myChar);
        System.out.println("myCharUnicode: " + myCharUnicode);
        System.out.println("octal: " + (char) octal);

        boolean myValue = true;
        boolean myValue2 = false;

        Integer a = 0040;

        a.toString();

        Dog test = new Dog();
        int[] test2 = new int[10];
        test2[0] = 10;
        System.out.println(test2[0]);
        soma(test2, test);
        System.out.println(test2[0]);
        System.out.println(Main.TOTAL);
    }


    public void soma(int[] test2, Dog daniel) {
        daniel.setName("Rods");
        test2[0]++;
        this.test();
    }

    public void test() {

    }
}


