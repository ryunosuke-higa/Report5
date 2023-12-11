public class  report{
 public static void main(String[] args) {
     String str = "壱百満";
    try {
       
        int value = Integer.parseInt(str);
        
        System.out.println("変換後の値: " + value);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}