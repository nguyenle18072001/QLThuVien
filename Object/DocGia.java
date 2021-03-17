/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author nguye
 */
public class DocGia{
    private String sMaDG;
    private String sTenDG;
    private String sMaThe;
    private String UserName;
    private String passWord;
    private String sDiaChi;
    private String sSDT;
    public DocGia( String sTenDG, String sMaThe, String sDiaChi,String UserName, String passWord, String sSDT )
    {
        this.sTenDG = sTenDG;
        this.sMaThe = sMaThe;
        this.sDiaChi = sDiaChi;
        this.UserName = UserName;
        this.passWord = passWord;
        this.sSDT = sSDT;
        
    }
    public DocGia(String sMaDG, String sTenDG, String sMaThe, String sDiaChi,String UserName, String passWord, String sSDT )
    {
        this.sMaDG = sMaDG;
        this.sTenDG = sTenDG;
        this.sMaThe = sMaThe;
        this.sDiaChi = sDiaChi;
        this.UserName = UserName;
        this.passWord = passWord;
        this.sSDT = sSDT;
        
    }

    public DocGia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getsMaDG()
    {
        return sMaDG;
    }
    public void setsMaDG(String sMaDG)
    {
        this.sMaDG = sMaDG;
    }
    public String getsTenDG()
    {
        return sTenDG;
    }
    public void setsTenDG(String sTenDG)
    {
        this.sTenDG = sTenDG;
    }
    public String getsMaThe()
    {
        return sMaThe;
    }
    public void setsMaThe(String sMaThe)
    {
        this.sMaThe = sMaThe;
    }
    public String getsDiaChi()
    {
        return sDiaChi;
    }
    public void setsDiaChi(String sDiaChi)
    {
        this.sDiaChi = sDiaChi;
    }
    public String getUserName(){
        return UserName;
    }
    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getsSDT()
    {
        return sSDT;
    }
    public void setsSDT(String sSDT)
    {
        this.sSDT = sSDT;
    }
}
