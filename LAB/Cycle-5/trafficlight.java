import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trafficlight extends JFrame implements ActionListener {
    private JPanel lightPanel;
    private JRadioButton redButton;
    private JRadioButton yellowButton;
    private JRadioButton greenButton;
    
    private ButtonGroup buttonGroup;

    public trafficlight() {
        setTitle("Traffic Light Simulator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        lightPanel = new JPanel();
        lightPanel.setLayout(new GridLayout(3, 1));
        JLabel redLight = new JLabel();
        redLight.setOpaque(true);
        redLight.setBackground(Color.LIGHT_GRAY);
        lightPanel.add(redLight);
        JLabel yellowLight = new JLabel();
        yellowLight.setOpaque(true);
        yellowLight.setBackground(Color.LIGHT_GRAY);
        lightPanel.add(yellowLight);
        JLabel greenLight = new JLabel();
        greenLight.setOpaque(true);
        greenLight.setBackground(Color.LIGHT_GRAY);
        lightPanel.add(greenLight);
        add(lightPanel, BorderLayout.CENTER);
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        add(buttonPanel, BorderLayout.SOUTH);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        for (Component comp : lightPanel.getComponents()) {
            ((JLabel) comp).setBackground(Color.LIGHT_GRAY);
        }
        if (redButton.isSelected()) {
            ((JLabel) lightPanel.getComponent(0)).setBackground(Color.RED);
        } else if (yellowButton.isSelected()) {
            ((JLabel) lightPanel.getComponent(1)).setBackground(Color.YELLOW);
        } else if (greenButton.isSelected()) {
            ((JLabel) lightPanel.getComponent(2)).setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            trafficlight simulator = new trafficlight();
            simulator.setVisible(true);
        });
    }
}

