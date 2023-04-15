
public class Sport {
    private int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public Sport(int burpee_number, int pushup_number, int situp_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squat_number = squat_number;
    }

    /**
     * @return the burpee_number
     */
    public int getBurpee_number() {
        return burpee_number;
    }

    /**
     * @param burpee_number the burpee_number to set
     */
    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    /**
     * @return the pushup_number
     */
    public int getPushup_number() {
        return pushup_number;
    }

    /**
     * @param pushup_number the pushup_number to set
     */
    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    /**
     * @return the situp_number
     */
    public int getSitup_number() {
        return situp_number;
    }

    /**
     * @param situp_number the situp_number to set
     */
    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    /**
     * @return the squat_number
     */
    public int getSquat_number() {
        return squat_number;
    }

    /**
     * @param squat_number the squat_number to set
     */
    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }
    
    public void doing_sport(String kind_sport , int amount){
        if(kind_sport.equals("Burpee")){
            doing_burpee(amount);
        }
        else if(kind_sport.equals("Pushup")){
            doing_pushup(amount);
        }
        else if(kind_sport.equals("Situp")){
            doing_situp(amount);
        }
        else if(kind_sport.equals("Squat")){
            doing_squat(amount);
        }
        else{
            System.out.println("Please enter correct kind of sport");
        }
}
    public void doing_burpee(int amount){
        if(burpee_number == 0){
            System.out.println("You finished burpee sport");
        }
        if(burpee_number - amount < 0 ){
            burpee_number = 0;
            System.out.println("You passed amount of sport...");
            System.out.println("Remaining Burpee : " + burpee_number);
        }
        else {

            burpee_number -= amount;
            System.out.println("Remaining Burpee : " + burpee_number);
        }
    }

  public void doing_pushup(int amount){
        if(pushup_number == 0){
            System.out.println("You finished pushup sport");
        }
        if(pushup_number - amount < 0) {
            pushup_number = 0;
            System.out.println("You passed amount of sport...");
                        System.out.println("Remaining Pushup : " + pushup_number);
        }
        else {
           // System.out.println("You do not finished pushup sport");
            pushup_number -= amount;
            System.out.println("Remaining Pushup : " + pushup_number);
        }
    }
  public void doing_situp(int amount){
        if(situp_number == 0){
            System.out.println("You finished situp sport");
        }
        if(situp_number - amount < 0) {
            situp_number = 0;
            System.out.println("You passed amount of sport...");
                        System.out.println("Remaining Situp : " + situp_number);
        }
        else {
           // System.out.println("You do not finished situp sport");
            situp_number -= amount;
            System.out.println("Remaining Situp : " + situp_number);
        }
    }
    public void doing_squat(int amount){
        if(squat_number == 0){
            System.out.println("You finished squat sport");
        }
        if(squat_number - amount < 0) {
            squat_number =0;
            System.out.println("You passed amount of sport...");
                        System.out.println("Remaining Squat : " + squat_number);
        }
        else {
           // System.out.println("You do not finished squat sport");
            squat_number -= amount;
            System.out.println("Remaining Squat : " + squat_number);
        }
    }
    public boolean finish_sport(){
        return (pushup_number==0 && situp_number == 0 && squat_number == 0 && burpee_number == 0);
    }
}
