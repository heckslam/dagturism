package ru.devtron.dagturism.fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ru.devtron.dagturism.R;
import ru.devtron.dagturism.adapterSight.SightAdapter;
import ru.devtron.dagturism.pojo.Sight;

/**
 * Фрагмент который загружается в MainActivity  при нажатии на таб Популярное и загружает данные в ListView
 * @created 10.10.2015
 * @version $Revision 738 $
 * @author Эльвира Темирханова
 * since 0.0.1
 */
public class arrayFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_array;
    private View view;
    private ListView listView;


    /**
     * Возрашает фрагмент
      * @return
     */
    public static arrayFragment getInstance() {
        Bundle args = new Bundle();
        arrayFragment fragment = new arrayFragment();
        fragment.setArguments(args);
        return fragment;
    }


    /**
     * Инициализируется фрагмент Layout'ом, создается ListView и вызываются методы для заполнения и работы с ним
      * @param inflater
     * @param container
     * @param savedInstanceState
     * @return Внешний вид фрагмента
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        listView.setDivider(null);
        listView.setDividerHeight(0);
        SightAdapter  sightAdapter = new SightAdapter(view.getContext(), initData());
        listView.setAdapter(sightAdapter);
        return view;
    }

    /**
     * Инициализация ListView и заполнение данными
     * @return Список данных
     */
    private List<Sight> initData(){
        List<Sight> list = new ArrayList<>();
        list.add(new Sight(0, "", "Саракум", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Нарын-кала", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 3", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 4", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 5", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 6", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 7", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 8", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 9", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 10", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 11", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 12", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 13", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 14", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 15", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        list.add(new Sight(0, "", "Заголовок 16", "Нарын-кала - древняя, доарабская крепость в нагорной части Дербента, соединеная с Каспийским морем двойными стенами, призваннимы перекрывать т. н. Каспийские ворота в"));
        return list;
    }
}
