package com.javabasics.exceptionhandling;

import java.net.MalformedURLException;
import java.net.URL;

public class MultipleCatchBlocks {

    public void execute(int i)
    {
        try{
            if(i==1)
            {
                getIntValue("5h");
                ;               }else{
                getUrl("www.google.com");
            }

        } catch (NumberFormatException nfe){
            System.out.println("Inside NumberFormatException... "+nfe.getMessage());
        } catch (MalformedURLException mue){
            System.out.println("Inside MalformedURLException... "+mue.getMessage());
        } catch (Exception ex){
            System.out.println("Inside Exception... "+ex.getMessage());
        }
    }

    private URL getUrl(String s) throws MalformedURLException{
        return new URL(s);
    }

    private int getIntValue(String s)   {
        return Integer.parseInt(s);
    }
    public static void main(String  args[]) {
        MultipleCatchBlocks mc = new MultipleCatchBlocks();
        mc.execute(1);
        mc.execute(2);

    }
}