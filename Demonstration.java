 public static void main(String[] args) {
       System.out.println("***Demonstration-11.Method overloading example***");
       Addition additionOb = new Addition();
       int sumOfIntergers = additionOb.sum(10,20);
       System.out.println(" 10 + 20 is : " + sumOfIntergers);
       double sumOfDoubles = additionOb.sum(10.5, 20.7);
       System.out.println(" 10.5 + 20.7 is : " + sumOfDoubles);
       String sumOfString = additionOb.sum("Smith", "Turner");
       System.out.println("'Smith' + 'Turner' is : " + sumOfString);
    }
}
