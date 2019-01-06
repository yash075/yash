package in.yash;

import java.util.ArrayList;

public class SearchingData {

    public boolean hashcodeSearchingData(ArrayList<String> cities,String search) {
        boolean found = false;
        for(String city : cities) {
            if(city.hashCode() == search.hashCode()) {
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean equalsSearchingData(ArrayList<String> cities,String search) {
        boolean found = false;
        for(String city : cities) {
            if(city.equals(search)) {
               found = true;
               break;
            }
        }
        return found;
    }
}
