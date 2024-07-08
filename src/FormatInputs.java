

public class FormatInputs {
    
    public static String textInput(String text) {
        if ( text != null && text.length() > 0 ) {
            return text;
        }
        return null;
    }
    
    public static String seltInput(Object selt) {
        if ( selt != null ) {
            if (selt.toString().length() > 0 ) return selt.toString();
        }
        return null;
    }
    
    
    public static String areaInput(String text, int lineSize) {
        int sta = 0;
	int end = lineSize;
	String outp = "";
 	
	if ( text.length() > lineSize ) {
            while (end < text.length()+1) {
                outp = outp.concat(text.substring(sta,end))+"\n";
		sta = end;
		end = end+lineSize;
            }
            
            if ( outp.length() < text.length() ) {
                sta = outp.length();
		end = text.length();
		
                outp = outp.concat(text.substring(sta,end));	
            }
            return outp;
	}	
	return text;
    }
    
    
    public static String dateInput(String text) { 
        if ( text != null && text.length() == 10  ) {
            String[] t = text.split("/",3);
            int dd = Integer.parseInt(t[0]);
            int mm = Integer.parseInt(t[1]);
            int aa = Integer.parseInt(t[2]);
            
            if (dd < 0 | dd > 31 ) return null;
            if (mm < 0 | mm > 12 ) return null;
            if (aa < 999 | aa > 40000 ) return null;
            
  
            return text;
        }
        return null;
    }
    
    
    public static double coinInput(String text) { 
       if (text != null && text.length() > 0 ) {
           String m = text.replaceAll("[^\\d,]", "").replaceAll(",", ".");
           if (m.length() > 0 ) {
               return Double.parseDouble(m);
           }
       }
       return 0;
    }
}
