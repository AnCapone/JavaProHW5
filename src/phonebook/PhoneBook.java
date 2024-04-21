package phonebook;

import java.util.*;

public class PhoneBook {
    private ArrayList<Record> records;


    public void add(String name, String phoneNumber) {
        records.add(new Record(name, phoneNumber));
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                result.add(record);
            }
        }
        if (result.isEmpty())
            return null;
        return result;
    }
}
