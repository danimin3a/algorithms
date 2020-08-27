package com.lseg.for_ex.basic_Structures;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
* Print nr de zile pt fiecare luna
*/
public class SwitchEx {
    public static void main(String[] args) {
        pritnDaysofMonth("JAN");
    }
}

static void pritnDaysofMonth(String month){
    if(month.equals("JAN"))
    if(month.equals("JAN")) System.out.println(31);
    if(month.equals("FEB")) System.out.println(28);
    if(month.equals("MAR")) System.out.println(31);
    if(month.equals("APR")) System.out.println(30);
    if(month.equals("MAY")) System.out.println(31);
}
}
