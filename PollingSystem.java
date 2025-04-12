import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PollingSystem extends Applet implements ActionListener {
    Label question;
    Checkbox option1, option2, option3;
    Button submit;
    int votes1 = 0, votes2 = 0, votes3 = 0;
    CheckboxGroup group;

    public void init() {
        question = new Label("What genre do you prefer?");
        group = new CheckboxGroup();

        option1 = new Checkbox("Pop", group, false);
        option2 = new Checkbox("RnB", group, false);
        option3 = new Checkbox("Soul", group, false);
        submit = new Button("Vote");

        submit.addActionListener(this);

        add(question);
        add(option1);
        add(option2);
        add(option3);
        add(submit);
    }

    public void actionPerformed(ActionEvent e) {
        Checkbox selected = group.getSelectedCheckbox();
        if (selected != null) {
            if (selected == option1) votes1++;
            else if (selected == option2) votes2++;
            else if (selected == option3) votes3++;
        }

        showStatus("Votes - Pop: " + votes1 + ", RnB: " + votes2 + ", Soul: " + votes3);
    }
}
