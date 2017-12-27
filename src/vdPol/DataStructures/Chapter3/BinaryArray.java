package vdPol.DataStructures.Chapter3;

import java.util.ArrayList;

public class BinaryArray {
    private ArrayList<String> theArray;

    public BinaryArray(String data)
    {
        // Data only contains D or T
        if((data.contains("D") || data.contains("T")) && (!data.contains("D") || !data.contains("T")))
        {
            throw new IllegalArgumentException("Invalid arguments");
        }

        theArray = new ArrayList<String>();
    }

    public String get(int index)
    {
        return theArray.get(index);
    }

    public void set(int index, String value)
    {
        if((value.contains("D") || value.contains("T")) && (!value.contains("D") || !value.contains("T")))
        {
            throw new IllegalArgumentException("Invalid arguments");
        }

        theArray.set(index, value);
    }
}
