import java.util.Scanner;

class complex{
    double real;
    double img;

    public complex(double r , double i){
        real = r;
        img = i;
    }

    public static void displayOutput(double real, double img){
        if (real > 0 && img > 0){
            System.out.println("\nThe Final Complex Number is: "+ real + "+ i" + img);
        }
        else if (real == 0 && img != 0){
            System.out.println("\nThe Final Complex Number is: "+ img + "i" );
        }
        else if (real != 0 && img == 0){
            System.out.println("\nThe Final Complex Number is: "+ real );
        }
        else if (img < 0){
            System.out.println("\nThe Final Complex Number is: "+ real + " " + img + "i" );
        }

        System.out.println("\n\n");
    }

    public static void add(complex obj1 , complex obj2){

        double realRes = obj1.real + obj2.real;
        double imgRes = obj1.img + obj2.img;
        displayOutput(realRes, imgRes);
    }

    public static void sub(complex obj1 , complex obj2){
        double realRes = obj1.real - obj2.real;
        double imgRes = obj1.img - obj2.img;
        displayOutput(realRes, imgRes);
    }
    public static void mul(complex obj1 , complex obj2){
        double realRes = ((obj1.real)*(obj2.real)) - ((obj1.img)*(obj2.img));
        double imgRes = ((obj1.real)*(obj2.img)) + ((obj1.img)*(obj2.real));
        displayOutput(realRes, imgRes);
    }
    public static void div(complex obj1 , complex obj2){
        double realRes = ((obj1.real*obj2.real) + (obj1.img*obj2.img))/((obj2.real*obj2.real) + (obj2.img*obj2.img));
        double imgRes = ((obj1.img*obj2.real) - (obj1.real*obj2.img))/((obj2.real*obj2.real) + (obj2.img*obj2.img));
        displayOutput(realRes, imgRes);
    }

    public static void display(complex obj1 , complex obj2){

        System.out.println("\nFirst Complex Number: " + obj1.real + " +i" + obj1.img );
        System.out.println("Second Complex Number: " + obj2.real + " +i" + obj2.img );
    }


}

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("COMPLEX NUMBER CALCULATOR\n");
        while(true){

            System.out.println("Enter \n 1 - Addition \n 2 - Subtraction \n 3 - Multiplication \n 4 - Division \n 5 - Exit\n");
            System.out.print("Enter Your Choice: ");
            int ope = sc.nextInt();

            if (ope == 5){
                System.out.println("Exiting The Program.. ");
                break;
            }
            else if(ope == 1){
                System.out.println("\nPerforming Addition: ");
                System.out.print("Enter Real Part of First Complex Number: ");
                double real1 = sc.nextDouble();
                System.out.print("Enter Imaginary Part of First Complex Number: ");
                double img1 = sc.nextDouble();

                System.out.print("Enter Real Part of Second Complex Number: ");
                double real2  = sc.nextDouble();
                System.out.print("Enter Imaginary Part of Second Complex Number: ");
                double img2 = sc.nextDouble();


                complex CN1 = new complex(real1, img1);
                complex CN2 = new complex(real2 , img2);
                complex.display(CN1 , CN2 );
                complex.add(CN1 , CN2);
            }
            else if(ope == 2){
                System.out.println("\nPerforming Subtraction: ");
                System.out.print("Enter Real Part of First Complex Number: ");
                double real1 = sc.nextDouble();
                System.out.print("Enter Imaginary Part of First Complex Number: ");
                double img1 = sc.nextDouble();

                System.out.print("Enter Real Part of Second Complex Number: ");
                double real2  = sc.nextDouble();
                System.out.print("Enter Imaginary Part of Second Complex Number: ");
                double img2 = sc.nextDouble();
                complex CN1 = new complex(real1, img1);
                complex CN2 = new complex(real2 , img2);
                complex.display(CN1 , CN2 );
                complex.sub(CN1 , CN2);
            }
            else if(ope == 3){
                System.out.println("\nPerforming Multiplication: ");
                System.out.print("Enter Real Part of First Complex Number: ");
                double real1 = sc.nextDouble();
                System.out.print("Enter Imaginary Part of First Complex Number: ");
                double img1 = sc.nextDouble();

                System.out.print("Enter Real Part of Second Complex Number: ");
                double real2  = sc.nextDouble();
                System.out.print("Enter Imaginary Part of Second Complex Number: ");
                double img2 = sc.nextDouble();

                complex CN1 = new complex(real1, img1);
                complex CN2 = new complex(real2 , img2);
                complex.display(CN1 , CN2 );
                complex.mul(CN1, CN2);
            }
            else if(ope == 4){
                System.out.println("\nPerforming Division: ");
                System.out.print("Enter Real Part of First Complex Number: ");
                double real1 = sc.nextDouble();
                System.out.print("Enter Imaginary Part of First Complex Number: ");
                double img1 = sc.nextDouble();

                System.out.print("Enter Real Part of Second Complex Number: ");
                double real2  = sc.nextDouble();
                System.out.print("Enter Imaginary Part of Second Complex Number: ");
                double img2 = sc.nextDouble();

                complex CN1 = new complex(real1, img1);
                complex CN2 = new complex(real2 , img2);
                complex.display(CN1 , CN2 );
                complex.div(CN1 , CN2);
            }
            else{
                System.out.println("Please Enter Valid Input..");
            }


        }

    }
}