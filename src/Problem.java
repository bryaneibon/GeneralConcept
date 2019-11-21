public class Problem {
    public static void main(String[] args) {
        commandLineMethod(args);
    }

    private static void commandLineMethod(String [] array){
        int maxValue = 0;
        int minValue = 1000000000;
        int sumOfValues = 0;

        boolean verifMax = false;
        boolean verifMin = false;
        boolean verifSum = false;

        for (int i = 1; i < array.length; i++) {
            if (array[0].equals("MAX")){
                if (Integer.parseInt(array[i]) > maxValue){
                    maxValue = Integer.parseInt(array[i]);
                    verifMax = true;
                }
            } else if(array[0].equals("MIN")){
                if (Integer.parseInt(array[i]) < minValue){
                    minValue = Integer.parseInt(array[i]);
                    verifMin = true;
                }
            }else if(array[0].equals("SUM")){
                sumOfValues = sumOfValues + Integer.parseInt(array[i]);
                verifSum = true;
            }else{
                System.out.println("-- Unknown Input --");
                break;
            }
        }

        if(verifMax){
            System.out.println(maxValue);
        }else if(verifMin){
            System.out.println(minValue);
        }else if(verifSum){
            System.out.println(sumOfValues);
        }
    }
}
