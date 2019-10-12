class Trigonometry
{
    void Trigo()
    {
        int i;
        for(i=30; i<=90; i+=30)
        {
            if(i==90)
                System.out.println(i+"\t"+Math.round(Math.sin(Math.PI/180*i)*10000.0)/10000.0+"\t"+Math.round(Math.cos(Math.PI/180*i)*10000.0)/10000.0+"\t"+(Math.round(Math.sin(Math.PI/180*i)*10000.0)/10000.0)/(Math.round(Math.cos(Math.PI/180*i)*10000.0)/10000.0));    
            else
                System.out.println(i+"\t"+Math.round(Math.sin(Math.PI/180*i)*10000.0)/10000.0+"\t"+Math.round(Math.cos(Math.PI/180*i)*10000.0)/10000.0+"\t"+Math.round(Math.tan(Math.PI/180*i)*10000.0)/10000.0);
        }
    }
    public static void main()
    {
        System.out.println("DEGREE\tSINE\tCOSINE\tTAN");
        Trigonometry t=new Trigonometry();
        t.Trigo();
    }
}
