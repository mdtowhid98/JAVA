
package primitiveandwrapeertype;


public class PrimitiveAndWrapeerType {

   
    public static void main(String[] args) {
        
        Integer i=new Integer("25");
        System.out.println(i);
        
        Integer j=new Integer(28);
        System.out.println(j);
        
        Integer k=Integer.valueOf("21");
        System.out.println(k);
        
        Integer l=Integer.parseInt("162",16);
        System.out.println(l);
        
        Double d=Double.valueOf("25.02");
        System.out.println(d);
        
        int m=(Integer.valueOf("25")).intValue();
        System.out.println(m);
        
        double n=(Double.valueOf("14.23")).doubleValue();
        System.out.println(n);
        
        int o=(Double.valueOf("15.2")).intValue();
        System.out.println(o);
        
        String s=(Double.valueOf("24.32")).toString();
        System.out.println(s);
    }
    
}
