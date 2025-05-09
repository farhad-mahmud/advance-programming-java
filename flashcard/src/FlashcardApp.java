import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicButtonUI;

public class FlashcardApp extends JFrame {
    public FlashcardApp() {
        setTitle("Flashcard App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set background color
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(135, 206, 235)); // Sky blue background
        mainPanel.setLayout(null); // Using null layout for absolute positioning

        // Create cards panel with grid
        JPanel cardsPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        cardsPanel.setBackground(new Color(135, 206, 235));
        cardsPanel.setBounds(20, 20, 540, 280);

        // Create the four subject cards
        JPanel mlCard = createCard("Machine Learning", new Color(255, 119, 99));  // Coral
        JPanel cyberCard = createCard("Cyber Security", new Color(30, 144, 255)); // Bright blue
        JPanel csCard = createCard("CS Research", new Color(50, 205, 50));        // Bright green
        JPanel compCard = createCard("Competitive Pro...", new Color(147, 112, 219)); // Purple

        // Add cards to the grid
        cardsPanel.add(mlCard);
        cardsPanel.add(cyberCard);
        cardsPanel.add(csCard);
        cardsPanel.add(compCard);

        // Create floating action button (FAB)
        JButton fabButton = new JButton("+");
        fabButton.setFont(new Font("Arial", Font.BOLD, 24));
        fabButton.setForeground(Color.WHITE);
        fabButton.setBackground(new Color(255, 69, 0)); // Orange-red
        fabButton.setBounds(20, 310, 56, 56);
        fabButton.setFocusPainted(false);
        fabButton.setBorder(new EmptyBorder(0, 0, 0, 0));

        // Make FAB round
        fabButton.setUI(new BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                AbstractButton b = (AbstractButton) c;
                ButtonModel model = b.getModel();

                if (model.isPressed()) {
                    g2.setColor(fabButton.getBackground().darker());
                } else {
                    g2.setColor(fabButton.getBackground());
                }

                g2.fillOval(0, 0, c.getWidth() - 1, c.getHeight() - 1);
                g2.setColor(Color.WHITE);
                g2.drawString("+", c.getWidth() / 2 - 6, c.getHeight() / 2 + 8);
                g2.dispose();
            }
        });

        // Add components to main panel
        mainPanel.add(cardsPanel);
        mainPanel.add(fabButton);

        // Add main panel to frame
        add(mainPanel);

        // Custom window decoration
        setUndecorated(true);
        JPanel titleBar = createTitleBar();
        mainPanel.add(titleBar);
    }

    private JPanel createCard(String title, Color bgColor) {
        JPanel card = new JPanel();
        card.setBackground(bgColor);
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        card.add(titleLabel);

        // Add hover effect
        card.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                card.setBackground(makeTransparent(bgColor, 0.9f));
            }

            public void mouseExited(MouseEvent e) {
                card.setBackground(bgColor);
            }
        });

        return card;
    }

    private JPanel createTitleBar() {
        JPanel titleBar = new JPanel(new BorderLayout());
        titleBar.setBackground(Color.WHITE);
        titleBar.setBounds(0, 0, getWidth(), 30);

        // App title and icon
        JPanel leftSection = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 3));
        leftSection.setBackground(Color.WHITE);
        JLabel iconLabel = new JLabel("□");
        JLabel titleLabel = new JLabel("Flashcard App");
        leftSection.add(iconLabel);
        leftSection.add(titleLabel);

        // Window controls
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        controls.setBackground(Color.WHITE);

        String[] buttonLabels = {"−", "□", "×"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFocusPainted(false);
            button.setBorderPainted(false);
            button.setBackground(Color.WHITE);
            button.setPreferredSize(new Dimension(45, 30));

            if (label.equals("×")) {
                button.addActionListener(e -> System.exit(0));
            }

            controls.add(button);
        }

        titleBar.add(leftSection, BorderLayout.WEST);
        titleBar.add(controls, BorderLayout.EAST);

        // Make window draggable
        MouseAdapter ma = new MouseAdapter() {
            private int initialX;
            private int initialY;

            @Override
            public void mousePressed(MouseEvent e) {
                initialX = e.getX();
                initialY = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                FlashcardApp.this.setLocation(
                        e.getXOnScreen() - initialX,
                        e.getYOnScreen() - initialY
                );
            }
        };

        titleBar.addMouseListener(ma);
        titleBar.addMouseMotionListener(ma);

        return titleBar;
    }

    private Color makeTransparent(Color color, float transparency) {
        return new Color(
                color.getRed(),
                color.getGreen(),
                color.getBlue(),
                (int) (transparency * 255)
        );
    }
}
