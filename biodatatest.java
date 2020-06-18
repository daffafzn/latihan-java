abstract class biodata
{
 
    public abstract void nama();
    public abstract void alamat();
	public abstract void hobi();
	public abstract void nomorTelp();
}

class dadan extends biodata
{
    public dadan(){
    };
 
    public void nama(){
      System.out.println("Cimahi\t\t\t|");
    };	
 
    public void alamat(){
        System.out.println("Citereup\t\t|");
    };
 
    public void hobi(){
        System.out.println("Gamer\t\t\t|");
    };
	public void nomorTelp(){
        System.out.println("081xx\t\t\t|");
    };
}
class daffa extends biodata
{
    public daffa(){
    };
 
    public void nama(){
      System.out.println("Sumedang\t\t|");
    };
 
    public void alamat(){
        System.out.println("rancabuaya\t\t|");
    };
 
    public void hobi(){
        System.out.println("Membaca\t\t\t|");
    };
	public void nomorTelp(){
        System.out.println("082xx\t\t\t|");
    };
}
class nabhan extends biodata
{
    public nabhan(){
    };
 
    public void nama(){
      System.out.println("Jakarta\t\t\t|");
    };
 
    public void alamat(){
        System.out.println("Pulogadung\t\t|");
    };
 
    public void hobi(){
        System.out.println("Belajar\t\t\t|");
    };
	public void nomorTelp(){
        System.out.println("081xx\t\t\t|");
    };
}
public class biodatatest
{
    public static void main(String [] args){
        dadan dd = new dadan();
		daffa df = new daffa();
        nabhan nb = new nabhan();
        System.out.println("=========================\n"+"\tDadan\t\t|"+"\n=========================");
        dd.nama();
        dd.alamat();
		dd.hobi();
		dd.nomorTelp();
       System.out.println("=========================\n"+"\tDaffa\t\t|"+"\n=========================");
        df.nama();
        df.alamat();
		df.hobi();
		df.nomorTelp();
		System.out.println("=========================\n"+"\tNabhan\t\t|"+"\n=========================");
        nb.nama();
        nb.alamat();
		nb.hobi();
		nb.nomorTelp();
		
    }
}