package pertemuann6;

/**
 *
 * @author LAB F
 *  tgl: 2024-04-29
 */
public class Hitungluassegi3 {
  private float alas, tinggi, luas;

    Hitungluassegi3(float nAlas, float nTinggi) {
     
    }
  
  public void Hitungluassegi3(float Al,float Tg){
      alas = Al;
      tinggi = Tg;
      
  }
    public void setALAS(float nVAL) {
        this.alas = nVAL;
        
    }
    public float getALAS() {
        return alas;
    }
    public float setTINGGI(float nVAL) {
       return tinggi = nVAL;
    }
    public float getTINGGI() {
        return tinggi;
    }
     public void HLuasSegi3(){
         luas = (this.alas*this.tinggi)/2;
     }
     public float getLUAS(){
         return luas;
     }
}


