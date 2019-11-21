class Clock {
    public static void main(String[] args) {
        int hours = 1;
        int minutes = 0;

        next(hours, minutes);
    }

    public static void next(int hours, int minutes){
        while(hours <= 12){
            System.out.println(hours);
            if (hours == 12) {
                hours = 1;
            }
            System.out.println("=========--HOURS--=========");
            while(minutes <= 59){
                minutes += 1;
                System.out.println(minutes);
            }
            System.out.println("=========--MINUTES--=========");
            hours += 1;
            minutes = 0;
        }
    }
}

