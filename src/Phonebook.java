import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Phonebook {
    private final Map<String, List<String>> map = new HashMap<>();



    public void add(String surName, String phoneNumber) {
        List<String> existedPhoneNumbers = map.get(surName);
        if(existedPhoneNumbers == null) {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            map.put(surName, phoneNumbers);
        } else {
            existedPhoneNumbers.add(phoneNumber);
        }
    }



    public List<String> get(String surName) {
        return map.get(surName);
    }
}