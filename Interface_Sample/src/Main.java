import java.util.ArrayList;
import java.util.List;

public class Main implements MainFragment.CustomCallback{
    private List<Integer> mList = new ArrayList<>();

    public Main() {
        mList.add(10);
        mList.add(20);
        mList.add(30);
        mList.add(40);
    }

    public static void main(String[] args) {
        Main main = new Main();
        MainFragment mainFragment = new MainFragment();

        mainFragment.customCallback = main;
        mainFragment.callback();
        mainFragment.getItem(2);
    }

    @Override
    public int onClick() {
        return 99;
    }

    @Override
    public int getListItems(int position) {
        return mList.get(position);
    }
}

class MainFragment{

    interface CustomCallback{
        int onClick();
        int getListItems(int position);
    }

    CustomCallback customCallback;

    void callback(){
        System.out.println("at MainFragment CallBack : " + customCallback.onClick());
    }

    void getItem(int position){
        System.out.println("get ListItem : " + customCallback.getListItems(position));
    }
}