package malinatrash.Views;

import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.Y_AXIS;

public class AllActivitiesView extends View {
    JLabel data = new JLabel("");
//    String data = "";
    AllActivitiesView(int width, int height, String title) {
        super(width, height, title);
        JPanel view = new JPanel();
        add(view);
        view.add(data);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> setVisible(false));
        view.add(okButton);
    }

    public String convertToMultiline(String orig)
    {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();
        setVisible(false);
    }
    public void updateData(String newData) {
        data.setText(convertToMultiline(newData));
    }
}
