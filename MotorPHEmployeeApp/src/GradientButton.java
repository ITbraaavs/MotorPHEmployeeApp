import java.awt.*;
import javax.swing.*;

public class GradientButton extends JButton {

    public GradientButton(String text) {
        super(text);

        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);

        setForeground(new Color(40, 50, 60));
        setFont(new Font("Segoe UI", Font.PLAIN, 13));
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gp;

if (getModel().isPressed()) {

    gp = new GradientPaint(
            0, 0,
            new Color(220,225,230),
            0, getHeight(),
            new Color(200,205,210));

} else {

    gp = new GradientPaint(
            0, 0,
            new Color(252,252,252),
            0, getHeight(),
            new Color(232,236,240));
}

        g2.setPaint(gp);

        g2.fillRoundRect(
                0,
                0,
                getWidth()-1,
                getHeight()-1,
                12,
                12);

        if (getModel().isPressed()) {
    g2.translate(1, 1);
}

        g2.setColor(new Color(200,205,210));

        g2.drawRoundRect(
                0,
                0,
                getWidth()-1,
                getHeight()-1,
                12,
                12);

        g2.dispose();

        super.paintComponent(g);
    }

}