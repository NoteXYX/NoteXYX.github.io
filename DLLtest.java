import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

//import com.sun.jna.Library;
//import com.sun.jna.Native;
//import com.sun.jna.Platform;
//import com.sun.jna.win32.StdCallLibrary;
//
///**
// * JNA框架DLL动态库读取调用示例类
// * @ClassName: DllCall
// * @Description: 读取调用DLL动态库文件中的方法
// * @author: LinWenLi
// * @date: 2018年7月18日 上午10:32:16
// */
public class DLLtest {
//    int a = 1;
//    int b = 2;
//    public void init()
//    {
//        this.a = 0;
//        this.b = 0;
//    }
//    public int add()
//    {
//        a = a+b;
//        return a + b;
//    }
    public static void main(String[] args){
//        DLLtest t = new DLLtest();
////        t.init();
//        int c = t.add();
//        System.out.println(t.a);
//        System.out.println(t.b);
//        System.out.println(c);
        OutputStreamWriter osw = null;
        File directory = null;
        File file = null;
        try {
            String fileName = "D:" + File.separator + "IdeaProjects"
                    + File.separator + "java_DLL_test" + File.separator + "file";
            directory = new File(fileName);
            directory.mkdirs();
            if (!directory.exists()) {
                return;
            }
            file = new File(fileName + File.separator + "push.txt");
//            file.createNewFile();
//            if (!file.isFile()) {
//                return;
//            }
            osw = new OutputStreamWriter(new FileOutputStream(file));
            osw.write("few");
            osw.flush();
        }
        catch (Exception e) {

        }
        finally {
            try {
                osw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
//
    }

//
//    public interface Dll extends Library{
//        Dll instance = (Dll)Native.load("E:\\IdeaProjects\\test1\\shuiliDLLNEW", Dll.class);
//        public void func_OnButton1(int m_nx, int m_ny, double func_m_evelation, double m_sumtem, int  m, int n, double m_evelation,
//                                   double stagelevel, double sumtem, int dt, double watertf, double m_day, double dx, double dy, double []area);//返回bz,cellh
////        public int add(int a,int b);
////        public int minus(int a,int b);
////        public int multiply(int a,int b);
////        public double divide(int a,int b);
//    }
//
//    public static void main(String[] args) {
//        //****************数据定义************************************************
//        int m=0,n=0,m1=0,m2=0,n1=0,n2=0;
//        int dt = 1;
//        double dx=0.0, dy=0.0;
//        double stagelevel=0, sumtem=0;
//        double watertf = 80000;
//        double [][]cellx = new double[200][200];
//        double [][]celly = new double[200][200];
//        double [][]bz = new double[200][200];
//        double [][]scaletf = new double[200][200];
//        double [][]cellh = new double[200][200];
//        double [][]cellz = new double[200][200];
//        double [][]cellih = new double[200][200];
//        double [][]cellT = new double[200][200];
//        double [][]celltem = new double[200][200];
//        double [][]qsource = new double[200][200];
//        double [][]cellidh = new double[200][200];
//        double [][]celleh = new double[200][200];
//        double [][]celldT = new double[200][200];
//        double [][]qn = new double[200][200];
//        double [][]qs = new double[200][200];
//        double [][]qw = new double[200][200];
//        double [][]qe = new double[200][200];
//        double [][]tfqn = new double[200][200];
//        double [][]tfqs = new double[200][200];
//        double [][]tfqw = new double[200][200];
//        double [][]tfqe = new double[200][200];
//        double [][]tfqsur = new double[200][200];
//        double PI = 3.1415926;
//        int m_nx = 50;//////////////////////////////////////////////
//        int m_ny = 50;///////////////////////////////////////////////////////
//        int func_m_evelation = 390;/////////////////////////////////////////////
//        int m_sumtem = 20;////////////////////////////////
//        double	m_evelation=0,m_Qin=0,m_Qout=0,m_Tin=0,m_T1=0,m_Tout=0,m_T2=0,m_tem=0,m_day=0;/////////////////////////////
//        double area[]={ 313.4364,744.0718,315.4526,729.1084,331.8074,711.5154,346.0696,696.1736,356.4548,675.502,
//            360.236,662.2484,360.236,640.0442,360.236,621.2326,367.9786,607.979,372.5206,600.2044,
//            372.5206,583.193,364.5412,571.3164,353.0256,567.0132,324.9396,564.4216,289.9696,564.4216,
//            245.372,560.7988,217.0638,555.4514,209.845,543.7468,206.4076,527.9114,210.7044,512.7644,
//            228.1064,491.8864,248.321,467.634,274.0938,450.5336,298.8468,434.1096,311.8214,418.3206,
//            311.8214,406.9602,311.8214,390.2642,295.1496,373.0516,258.426,342.5498,254.1148,329.2606,
//            254.1148,318.0726,260.9898,306.196,274.0934,295.5078,286.344,295.5078,310.103,300.4918,
//            331.8104,307.3858,353.5184,313.2322,374.3722,304.1102,384.4396,289.4672,384.4396,136.0262,
//            396.239,116.077,415.8944,106.955,439.693,106.955,457.2648,120.1572,520.8398,213.0738,
//            539.46,221.0228,570.8606,224.8636,589.0776,235.1858,616.0816,275.5588,624.471,278.9196,
//            636.456,278.9196,647.7218,261.876,669.8478,238.0912,686.945,238.0912,705.4018,246.9774,
//            725.3738,246.9774,752.6994,226.809,782.7452,212.257,983.4366,874.6778,918.7978,915.351,
//            881.6162,888.9994,857.019,899.311,857.019,923.944,894.7728,962.3256,894.7728,981.2302,
//            869.0316,981.2302,853.015,1002.426,856.2046,1031.6,843.7854,1045.419,777.1258,1050.754,
//            759.054,1068.853,759.054,1090.849,772.1122,1108.166,772.1122,1126.543,753.9766,1143.271,
//            699.4168,1143.271,685.1694,1151.355,676.8286,1164.441,676.8286,1177.806,673.4738,1224.369,
//            665.411,1253.604,648.0912,1284.275,629.7412,1292.628,613.3374,1292.628,593.4508,1284.549,
//            581.4954,1268.122,575.6568,1238.329,570.4796,1211.911,559.4584,1197.915,544.6598,1191.774,
//            531.5924,1191.774,522.1394,1199.013,493.759,1220.748,465.8422,1247.22,446.0294,1259.219,
//            422.953,1264.231,386.9528,1272.05,347.4638,1275.934,296.7542,1284.013,268.0152,1284.013,
//            252.8946,1275.04,238.6634,1254.998,221.407,1224.031,206.3966,1206.204,190.0686,1195.36,
//            166.4336,1187.086,142.5158,1178.714,128.5748,1170.385,117.7468,1154.894,115.6232,1044.535,
//            135.7806,1026.536,166.2506,1015.341,202.059,998.9824,238.6998,982.2434,273.7034,969.0208,
//            292.0468,956.0884,297.203,946.7936,297.203,924.7616,292.3906,886.894,290.172,859.7922,
//            290.172,840.342,296.1876,828.6376,318.1874,814.8676,339.0624,805.7244,365.0662,796.4202,
//            384.488,785.9206,393.941,778.6914,393.941,767.331,385.6912,758.5528,342.836,762.1582,
//            330.6062,763.1872,323.1868,754.927,313.4364,744.0718 };	//地形二维数组(133,2)
//        //****************数据定义************************************************
//
//        Dll.instance.func_OnButton1(m_nx, m_ny,func_m_evelation, m_sumtem, m, n, m_evelation,
//                                   stagelevel, sumtem, dt, watertf, m_day, dx, dy, area);
////        int sum = Dll.instance.add(5, 3);
////        int sub = Dll.instance.minus(5, 3);
////        int mul = Dll.instance.multiply(5, 3);
////        double divid = Dll.instance.divide(6, 3);
////        System.out.println("i ="+i);
////        System.out.println("add(5,3) = "+sum);
////        System.out.println("multiply(5,3) = "+mul);
////        System.out.println("divide(6,3) = "+divid);
//    }
//
}
