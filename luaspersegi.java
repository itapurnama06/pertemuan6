package pertemuann6;

/**
 *
 * @author LAB F
 *  tgl: 2024-04-29
 */
public class luaspersegi {
private float sisi1, sisi, luas;
    
    public luaspersegi(float s1,float s2){
        sisi1 = s1;
        sisi = s2;
    }
    
    public void setSISI1(float nVal){
        sisi1 = nVal;
    }
    public float getSISI1(){
        return sisi1;
    }
     public void setSISI(float nVal){
        sisi = nVal;
    }
    public float getSISI(){
        return sisi;
    }
     public void HLuasPersegi(){
        luas = (this.sisi1*this.sisi);
    }
    public float getLUAS(){
        return luas;
    }
}
