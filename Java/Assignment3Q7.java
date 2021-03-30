import java.util.HashMap;

class Parked_CarOwnerList {
    int levels = 3;
    int sections = 4;
    int slots = 20;
    int token = 1;

    int presentLevel = 1;
    int presentSection = 1;
    int presentSlot = 1;

    HashMap<Integer,ParkingSlot> parkedMap = new HashMap<>();


    public void add_new_car(Assignment3Q7 car){
        ParkingSlot parkingSlot = new ParkingSlot(car.getName(),car.getCarNo(),this.token,presentLevel,presentSection,presentSlot);

        parkedMap.put(this.token,parkingSlot);

        this.token += 1;
        if(presentSlot < 20){
            presentSlot +=1;
        }else{
            presentSlot = 1;
            if(presentSection <4){
                presentSection +=1;
            }else{
                presentLevel +=1;
                presentSection = 1;
            }
        }

    }


    public void remove_car(String name,int carNo){}

    public String get_parked_car_location(int token){
        System.out.println(this.token);
        if(token<this.token){
            int tempLevel = parkedMap.get(token).getLevel();
            int tempSection = parkedMap.get(token).getSection();
            int tempSlot = parkedMap.get(token).getSlot();

            return "level : "+tempLevel+",section : "+tempSection+",slot: "+tempSlot+".";
        }
        return "not found";

    }
}

class Parked_CarOwner_Details {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public Parked_CarOwner_Details(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class ParkingSlot {
    private String ownerName;
    private int carNumber;
    private int token;
    private int level;
    private int section;
    private int slot;

    public ParkingSlot(String ownerName, int carNumber, int token, int level, int section, int slot) {
        this.ownerName = ownerName;
        this.carNumber = carNumber;
        this.token = token;
        this.level = level;
        this.section = section;
        this.slot = slot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}


public class Assignment3Q7 {
    private String name;
    private String carModel;
    private int carNo;
    private int mobileNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Assignment3Q7(String name, String carModel, int carNo, int mobileNumber, String address) {
        this.name = name;
        this.carModel = carModel;
        this.carNo = carNo;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public static void main(String[] args) {
        Assignment3Q7 car1 = new Assignment3Q7("amit","sports",5253,9876,"xyz street");
        Parked_CarOwnerList list = new Parked_CarOwnerList();
        list.add_new_car(car1);
        System.out.println(list.get_parked_car_location(2));
        System.out.println(23%10);


    }
}