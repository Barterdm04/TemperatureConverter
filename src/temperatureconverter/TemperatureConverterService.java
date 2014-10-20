/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temperatureconverter;

import java.text.DecimalFormat;

/**
 *
 * @author dbarter1
 */
public class TemperatureConverterService {
    DecimalFormat df = new DecimalFormat("#.00"); 
    
    public double getCelsiusFromFahrenheit(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    
    public String getCelsiusFromFahrenheit(String fahrenheit) throws NumberFormatException{
        double celsius = (Double.valueOf(fahrenheit) - 32) * 5/9;
        return String.valueOf(df.format(celsius));
    }
    public String getFahrenheitFromCelsius(String celsius) throws NumberFormatException{
        double fahrenheit = (Double.valueOf(celsius) *9/5) + 32;
        return String.valueOf(df.format(fahrenheit));
    }
}
