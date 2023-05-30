/*
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. 
Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

Sınıfın Nitelikleri

name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı
Sınıfın Metotları

Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
toString() : Çalışana ait bilgileri ekrana bastıracaktır.
*/

public class Employee { //Employee adlı sınıfı oluşturduk
    String name;
    double salary;
    int workhours;
    int hireyear;
    //Bu sınıf, fabrika çalışanlarını temsil eder ve üç niteliğe (name, salary, workhours, hireyear) sahiptir
    public Employee(String name, double salary, int workhours, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }
    
    public double tax() { //çalışanın maaşına uygulanacak vergiyi hesaplar.
        double tax = 0.0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }
    
    public double bonus() { //alışanın haftalık çalışma saatlerine göre ek ücret hesaplar
        double bonus = 0.0;
        if (workhours > 40) {
            bonus = (workhours - 40) * 30;
        }
        return bonus;
    }
    
    public double raisesalary() { //çalışanın maaşına işe başlangıç yılına göre zam yapar
        int years = 2021 - hireyear;
        if (years < 10) {
            salary *= 1.05;
        } else if (years >= 10 && years < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
        return salary;
    }
    
    public String toString() { //çalışana ait tüm bilgileri bir metin olarak döndürür ve ekrana basar
        return "Name: " + name + ", Salary: " + salary + ", Workhours: " + workhours + ", Hireyear: " + hireyear;
    }
  // Employee adlı sınıf, bir fabrika çalışanının maaşını hesaplamak, vergi ve bonuslarını hesaplamak ve zam yapmak için kullanılabilir
}

