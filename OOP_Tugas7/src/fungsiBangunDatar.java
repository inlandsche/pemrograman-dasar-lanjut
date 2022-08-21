public class fungsiBangunDatar extends BangunDatar {
    @Override
    public void info() {
        System.out.println("++++++++++++++++ Info Bangun Datar +++++++++++++++++");

        for (int i = 0; i < BangunDatar.listBangunDatar.length; i++){
            if (BangunDatar.listBangunDatar[i] == null) break;
            System.out.println((i+1) + ". " + BangunDatar.listBangunDatar[i]);
        }
    }
    }
