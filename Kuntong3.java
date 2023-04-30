public class Kuntong3 {
    int add;//ระดับน้ำในแก้ว
    int rate=100;//ความจุแก้ว
    int lon;//ระดับน้ำที่ล้น
    String name;
    Kuntong3(String name){this.name=name;}

    void numA(int a){/*เติมน้ำ*/
        this.add =  this.add+a;
          if( this.add> this.rate){//101ขึ้นไป
             this.lon=  this.add- this.rate;//ล้น
             this.add=  this.add- this.lon;//น้ำที่ใส่ในแก้ว
            System.out.println("!!!น้ำล้นจากแก้ว"+this.name+":"+ this.lon+"!!!");
        }
    }
    
    void numB(int b){//Aเทน้ำทิ้ง
         if(b> this.add){//ถ้าเทมากกว่า น้ำที่มีอยู่
            System.out.println("น้ำแก้ว"+this.name+"เหลือน้อยกว่า ระดับที่ต้องการให้เท");
        }else if( this.add>0){//ถ้ามีน้ำ
             this.add =  this.add-b;
        }
    }
    
   public int numC(int c){//Aโอนน้ำไปB
        int e=0;
        if(c> this.add){System.out.println("น้ำแก้ว"+this.name+"เหลือน้อยกว่า ระดับที่ต้องการให้โอน");
        }else{e = c; this.add -= c ;}
        return  e; 
    }
   
     public int numD(int c){//Bคืนน้ำไปA
       int e=0;
        if(c> this.add){System.out.println("น้ำแก้ว"+this.name+"เหลือน้อยกว่า ระดับที่ต้องการให้โอน");
        }else{
            e = c; 
            this.add -= c ;
        }
        return  e; 
    }
}