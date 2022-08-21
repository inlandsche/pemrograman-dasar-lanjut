import java.util.ArrayList;

public class base {
    public static void main(String[] args) {

        String enc = "UGFzc3dvcmQ= OVXHI5LL 66696C65 aW5p OJSW4Y3BNZQW46LB 6164616C6168 ZmxhZ3tpTmlfcjNuQ2FONF91TnRVa19wYXM1V29SZH0= NZQW25LO 70617373776F72646E7961 dGVybnlhdGE= NJSWYZLL 62616E676574 ZGFu ONSXIZLMMFUA==== 616461 YmViZXJhcGE= OBSXE5DJNVRGC3THMFXA==== 6A6164696E7961 bXVuZ2tpbg== M52WC=== 62616B616C Z2FudGk= MFVGC=== 646568 cGFzc3dvcmRueWE= NNSQ==== 70617373776F7264 aW5p ONSW233HME====== 6C65626968 YW1hbg== MRSWQ=== 6461726970616461 c2ViZWx1bW55YQ== MZWGCZ33PEYHKX3GJ52U4ZC7OREDGX3SIU2EYX2QGRZTK5ZQOJCH2=== 616C68616D64756C696C6C6168 c2VtZW5qYWs= OBQXG43XN5ZGI3TZME====== 70616B65 aXR1 NJQWI2I= 70726F6772616D6E7961 YW1hbg== ORQXA2I= 74616B75746E7961 cHJvZ3JhbW55YQ== ON2XGYLI 6469 YWtzZXM= NNQWY3Y= 6C757061 cGFzc3dvcmQ= N5UXSYI= 6D656E64696E67 YmlraW4= OJSW22LOMRSXE=== 616A61 eWE= OBUW45DFOI====== 6A756761 Z3Vh";

        String encArr[] = enc.split(" ");

        ArrayList<String> bs16 = new ArrayList<>();
        ArrayList<String> bs32 = new ArrayList<>();
        ArrayList<String> bs64 = new ArrayList<>();

        for (int i = 0; i < encArr.length; i++){
            if (i % 3 == 0 ) bs64.add(encArr[i]);
            else if (i % 3 == 1 ) bs32.add(encArr[i]);
            else if (i % 3 == 2 ) bs16.add(encArr[i]);
        }

        System.out.println("base 16");
        for (int i = 0; i < bs16.size(); i++){
            System.out.print(bs16.get(i) + " ");
        }
        System.out.println();
        System.out.println("base 32");

        for (int i = 0; i < bs32.size(); i++){
            System.out.print(bs32.get(i) + " ");
        }
        System.out.println();
        System.out.println("base 64");
        for (int i = 0; i < bs64.size(); i++){
            System.out.print(bs64.get(i) + " ");
        }
    }
}
