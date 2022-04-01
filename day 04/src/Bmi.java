public class Bmi {
    public void BmiCalculator(){
        double height = 1.5;
        double weight = 40;

        double bmi = weight/(height*height);
        System.out.println("chỉ số bmi " + bmi);



    }


    public void bmiCalculator2(double height, double weight){
        double bmi = weight/(height*height);
        System.out.println("chỉ số bmi " + bmi);
    }

    public double bmiCalculator3(double height, double weight){
        double bmi = weight/(height*height);
        return bmi;
    }

    public double result(double bmi){
        if(bmi < 18.5){
            System.out.println("Gầy");
        }else if(bmi >= 18.5 && bmi <= 24.5){
            System.out.println("bình thường");
        }else {
            System.out.println("béo");
        }
        return bmi;
    }
}
