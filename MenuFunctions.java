//example ideas for menu


import java.util.Scanner;

//Statistics/Diagnostics

	public class Statistics extends MainActivity{
		//label for Statistics

		//can there be graphics to show the information
		//change over time
        Statistics statistics = new Statistics(){
            public int statsTemp(int temperature, int time) {//change values
                
                //show graph display and numbers, one line graph


                return tempStats;
            }

            public int statsWeight(int weight, int time){

            	//show graph display and numbers, one line graph

            	return weightStats;
            }
        };


        //System.out.println(statistics.stats(10, 20));
        System.out.println(statistics.statsTemp(temperature, time));
        System.out.println(statistics.statsWeight(weight, time));

	}

//Callback functions for MainActivity.java
	//under settings
    public class CBFunction extends MainActivity{
        //int doAction(int a, int b);//example
        int registerWeight(int weightInput, int objectName)
        int registerID(int idNumber)

        //label for Weight Settings
        CBFunction weightRegister = new CBFunction(){
            public int registerWeight(int weightInput, int objectName) {
                
            	Scanner scan = new Scanner(System.in); //handles taking in the user input
            	//String s = scan.next();
            	//int i = scan.nextInt(); //weightInput

            	Scanner scan = new Scanner(System.in); //handles taking in the user input
            	//String s = scan.next();
            	//int i = scan.nextInt(); //objectName

                return currentWeight;
            }
        };

        //label for Register ID
        CBFunction idRegister= new CBFunction(){
            public int registerID(int idNumber, String carType, String carColor, int carLPNumber) {
            	//carType can be an enum, 
                
            	Scanner scan = new Scanner(System.in);//handles taking in the user input for each argument
            	//String s = scan.next();
            	//int i = scan.nextInt();  //idNumber

            	Scanner scan = new Scanner(System.in);//handles taking in the user input for each argument
            	//String s = scan.next();
            	//int i = scan.nextInt(); //carType

            	Scanner scan = new Scanner(System.in);//handles taking in the user input for each argument
            	//String s = scan.next();
            	//int i = scan.nextInt(); //carColor

            	Scanner scan = new Scanner(System.in);//handles taking in the user input for each argument
            	//String s = scan.next();
            	//int i = scan.nextInt(); //carLPNumber

                return currentID;
            }
        };
/*
        CBFunction  = new CBFunction(){
            public int doAction(int a, int b) {
                return a*b;
            }
        };
*/
        //System.out.println(statistics.stats(10, 20));
        System.out.println(idRegister.registerID(weightInput, objectName));
        System.out.println(weightRegister.registerWeight(idNumber, carType, carColor, carLPNumber));
        
}
