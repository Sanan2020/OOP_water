import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        Kuntong3 ga= new Kuntong3("A");
        Kuntong3 gb = new Kuntong3("B");

        while(true){
         System.out.println("***เลือกสิ***");
         System.out.println("กด1. เติมน้ำแก้วA");
         System.out.println("กด2. Aเทน้ำให้B");
         System.out.println("กด3. Bเทคืนให้A");
         System.out.println("กด4. Aเทน้ำทิ้ง");
         System.out.print("input:");
          int sl= sn.nextInt();
         switch(sl){
             case 1:
                 System.out.print("เติมน้ำแก้วAจำนวน:");
                 int a = sn.nextInt();
                 ga.numA(a);
                 break;
             case 2:
                 System.out.print("Aโอนน้ำให้Bจำนวน:");
                 int c = sn.nextInt();
                 int tg=  ga.numC(c);
                 gb.numA(tg);//รับน้ำ
                 break;
             case 3:
                 System.out.print("Bโอนน้ำกลับจำนวน:");
                 int d = sn.nextInt();
                 int tb=  gb.numD(d);
                 ga.numA(tb);//รับน้ำคืน
                 break;
             case 4:
                 System.out.print("เทน้ำแก้วAทิ้งจำนวน:");
                 int b = sn.nextInt();
                 ga.numB(b);
                 break;
         }
         System.out.println("#################");
         System.out.println("##แก้วบรรจุน้ำได้ 100 มล.#");
         System.out.println("##ระดับน้ำแก้ว"+ga.name+":"+ga.add);
         System.out.println("##ระดับน้ำแก้ว"+gb.name+":"+gb.add);
         System.out.println("#################");
          System.out.println();
        }
    }
}
