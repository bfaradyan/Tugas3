package Tugas3;

class Member {
    String NamaMember;
    String AlamatMember;
    int NoHP;
    int PaketPesanan;
    int IdMember;

    public Member(String Nama, String Alamat, int Nomor) {
        NamaMember = Nama;
        AlamatMember = Alamat;
        IdMember = Nomor;
    }
    public void setPaketPesanan(int Jumlah){
        this.PaketPesanan = Jumlah;
    }
    public int getPaketPesanan(){
        return this.PaketPesanan;
    }
}
class Gym {
    String NamaGym;
    String AlamatGym;
    int IdGym;
    int JamBuka;
    int HargaBulanan;

    public Gym(String Gym, String Tempat, int Id){
        NamaGym = Gym;
        AlamatGym = Tempat;
        IdGym = Id;
    }
    public void setHarga(int HargaBulanan){
        this.HargaBulanan = HargaBulanan;
    }
    public int getHarga(){
        return this.HargaBulanan;
    }
}

public class Main {
     public static void main(String[] args){
        Member member1 = new Member(
                "Bisma",
                "JL. Mawar",
                222);
        Member member2 = new Member(
                "Farhaan",
                "Jl. Panarukan",
                666);
        Member member3 = new Member(
                "Daani",
                "Jl. Kesambiyan",
                777);


        member2.setPaketPesanan(3);
        System.out.println("--- Member---");
        System.out.println("Nama Member :" + member2.NamaMember);
        System.out.println("Alamat Member :" + member2.AlamatMember);
        System.out.println("ID Member :" + member2.IdMember);
        System.out.println("Langganan :" + member2.getPaketPesanan());


        Gym HendoyGym = new Gym(
                "Hendoy Sehat",
                "Jl. Sudirman",
                1234);

        HendoyGym.setHarga(30000);
        System.out.println("Nama Gym :" + HendoyGym.NamaGym);
        System.out.println("Alamat :" + HendoyGym.AlamatGym);
        System.out.println("ID Gym :" + HendoyGym.IdGym);
        System.out.println("Harga Bulanan :" + HendoyGym.getHarga());
    }
}