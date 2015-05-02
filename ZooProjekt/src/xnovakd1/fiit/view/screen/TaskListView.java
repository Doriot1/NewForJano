package xnovakd1.fiit.view.screen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.util.Callback;
import xnovakd1.fiit.model.context.Context;
import xnovakd1.fiit.model.problem.Problem;
import xnovakd1.fiit.model.problem.Tasks;
import xnovakd1.fiit.view.BasicView;

/**
 * Created by Daniel on 26.4.2015.
 */
public class TaskListView extends BasicView{

    protected ListView<Problem> list;
    private Button outButton;
    protected int select;

    public TaskListView(Context context) {
        super(context);
    }

    @Override
    protected void initView() {
        super.initView();
        list = new ListView<>();
        outButton = new Button("Log Out");

        list.setCellFactory(new Callback<ListView<Problem>, ListCell<Problem>>() {

            @Override
            public ListCell<Problem> call(ListView<Problem> param) {
                return new ListCell<Problem>() {
                    @Override
                    protected void updateItem(Problem item, boolean empty) {
                        super.updateItem(item, empty);
                        if (item != null) setText(item.toString());
                        else
                            setText("");
                    }
                };
            }
        });

        setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.BACK_SPACE) {
                getContext().switchScene(new MainScreen(getContext()));
            }
        });

        outButton.setOnAction(e -> {
            getContext().switchScene(new MainScreen(getContext()));
        });
    }

    @Override
    protected void addViews() {
        super.addViews();
        add(outButton, 0, 4);
    }
}
