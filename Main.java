public class Main {
    public static void main(String[] args) {


        System.out.println(printDisc(3,8,5));
        String[] strArray = new String[]{"zzzz","sadasd","lsadasd","asdfsd","✅","⛔⛔"};
        System.out.println(return_Smallest_From_Array(strArray));
        Fraction obj = new Fraction(4,7);
        System.out.println(obj.getNumenator());
        obj.shekveca(2);
        obj.shekveca(7);
        obj.shekreba(2,18);
        obj.shekreba(5,3);
        obj.gamravleba(2,9);

    }
    //N1 diskriminantis povna
    public static int printDisc(int a, int b, int c){
        int disc = (b*b)-(4*a*c);
        return (disc);
    }
    //N2 abrunebs yvelaze patara strings masividan
    public static String return_Smallest_From_Array(String[] array) {

        String smallestString = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i].length()<smallestString.length()){
                smallestString = array[i];
            }
        }
        return smallestString;
    }



}