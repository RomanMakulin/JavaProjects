package org.example.Exeptions.Phonebook.View.Exeptions;

public class NullData implements Errors{

    @Override
    public String error() {
        return "Bad data (data have nulls)";
    }
}
