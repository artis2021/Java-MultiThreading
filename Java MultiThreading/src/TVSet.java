public class TVSet {
    private static volatile TVSet tvSet=null;
    public static TVSet GetInstance() {
        if(tvSet==null){
            synchronized (TVSet.class) {
                if(tvSet==null){
                    tvSet=new TVSet();
                }
            }
        }
        return tvSet;

    }

    public TVSet() {
        System.out.println("TVSet created");
    }
}
