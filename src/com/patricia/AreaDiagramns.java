package com.patricia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AreaDiagramns {

    private JPanel PanelTop;
    private JTextField textLength;
    private JButton calculateButton;
    private JTextField textWidth;
    private JTextField textRectArea;
    private JTextField textSide;
    private JTextField textSquareArea;
    private JButton calculateSqButton;
    private JTextField textBase;
    private JTextField textHeight;
    private JTextField textTriangleArea;
    private JButton calculateTriButton;
    private JTextField textRadius;
    private JTextField textCircleAreaWith_radius;
    private JButton calculateCircAreaWith_radiusButton;
    private JTextField textDiagonal_a;
    private JTextField textDiagonal_b;
    private JTextField textRhombusArea;
    private JButton calculateRhoButton;
    private JButton ResetRect;
    private JButton ResetSq;
    private JButton ReseTri;
    private JButton ResetCircWithRad;
    private JButton ResetRho;
    private JTextField textDiameter;
    private JTextField textCircleAreaWith_diameter;
    private JButton calculateCircleAreaWith_DiameterButton;
    private JButton ResetCircwithDiam;
    private JLabel labelRectError;
    private JLabel labelSqError;
    private JLabel labelTriError;
    private JLabel labelRhoError;
    private JLabel labelCircError;
    private JTextArea textError;
    private JLabel labelErrorMessage;

    public AreaDiagramns() {


        /**
         *
         *
        * Action listeners for buttons
        * Calculates area of shape when clicked
        * */
        //Calculate area of a rectangle
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double len = Double.parseDouble(textLength.getText());
                double wid = Double.parseDouble(textWidth.getText());

                if (len > 0 && wid > 0) {
                    Rectangle rectangle = new Rectangle(len,wid);
                    rectangle.calculateArea();

                    labelRectError.setText("");
                    textRectArea.setText(String.valueOf(rectangle.getArea()));
                }else {
                    labelRectError.setText("ERROR:Entry must be positive and greater than 0");
                }
            }
        });

        //Calculate area of a Square
        calculateSqButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double s_de = Double.parseDouble(textSide.getText());

               if (s_de > 0) {
                   Square square = new Square(s_de);
                   square.calculateSquareArea();

                   labelSqError.setText("");
                   textSquareArea.setText(String.valueOf(square.getSqArea()));
               }else {
                   labelSqError.setText("ERROR:Entry must be positive and greater than 0");
               }
            }
        });


        //Calculate area of a triangle
        calculateTriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base_ = Double.parseDouble(textBase.getText());
                double height_ = Double.parseDouble(textHeight.getText());

                if (base_ > 0 && height_ > 0) {
                    Triangle triangle = new Triangle(base_, height_);
                    triangle.calculateTriangleArea();

                    labelTriError.setText("");
                    textTriangleArea.setText(String.valueOf(triangle.getTriangleArea()));
                }else {
                    labelTriError.setText("ERROR:Entry must be positive and greater than 0");
                }
            }
        });


        //Calculate area of a circle with a Diameter
        calculateCircleAreaWith_DiameterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double diameter_ = Double.parseDouble(textDiameter.getText());

                if (diameter_ > 0) {
                    Circle circle = new Circle(diameter_);
                    circle.calculateArea();

                    labelCircError.setText("");
                    textCircleAreaWith_diameter.setText(String.valueOf(circle.getCircleArea()));
                }else {
                    labelCircError.setText("ERROR:Entry must be positive and greater than 0");
                }
            }
        });

        //Calculate of a circle using its radius
        calculateCircAreaWith_radiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radius_ = Double.parseDouble(textRadius.getText());

                if (radius_ > 0) {
                    CircleWith_radius circle1 = new CircleWith_radius(radius_);
                    circle1.calculateArea();

                    labelCircError.setText("");
                    textCircleAreaWith_radius.setText(String.valueOf(circle1.getCircleArea()));
                }else {
                    labelCircError.setText("ERROR:Entry must be positive and greater than 0");
                }
            }
        });

        //Calculate the area of a rhombus
        calculateRhoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double digonal_a_ = Double.parseDouble(textDiagonal_a.getText());
                double diagonal_b_ = Double.parseDouble(textDiagonal_b.getText());

                if (digonal_a_ > 0 && diagonal_b_ > 0) {
                    Rhombus rhombus = new Rhombus(digonal_a_, diagonal_b_);
                    rhombus.calculateRhombusArea();

                    labelRhoError.setText("");
                    textRhombusArea.setText(String.valueOf(rhombus.getRhombusArea()));
                }else {
                    labelRhoError.setText("ERROR:Entry must be positive and greater than 0");
                }
            }
        });


        /**
         *
         *
        * Action listeners for reset buttons
        * Clears the textFields when clicked
        * */

        //Reset the Rectangle textFileds
        ResetRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelRectError.setText("");
                textLength.setText("");
                textWidth.setText("");
                textRectArea.setText("");
            }
        });

        //Reset the Square's textFileds
        ResetSq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelSqError.setText("");
                textSide.setText("");
                textSquareArea.setText("");
            }
        });

        //Reset the Triangle's textFileds
        ReseTri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTriError.setText("");
                textBase.setText("");
                textHeight.setText("");
                textTriangleArea.setText("");
            }
        });

        //Reset the Circle's textFileds
        /*
        * */
        ResetCircWithRad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCircError.setText("");
                textRadius.setText("");
                textCircleAreaWith_radius.setText("");
            }
        });

        ResetCircwithDiam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelCircError.setText("");
                textDiameter.setText("");
                textCircleAreaWith_diameter.setText("");
            }
        });


        //Reset the Rhombus' textFileds
        ResetRho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelRhoError.setText("");
                textDiagonal_a.setText("");
                textDiagonal_b.setText("");
                textRhombusArea.setText("");
            }
        });
        textLength.addComponentListener(new ComponentAdapter() {
        });
    }

    public static void main(String[] args) {

        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
//        Image icon = Toolkit.getDefaultToolkit().getImage("icon-1.png");

        JFrame frame = new JFrame("Area of Diagrams");
//        frame.setIconImage(icon);
        frame.setContentPane(new AreaDiagramns().PanelTop);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void validate(String textToValidate) {
        Pattern pattern = Pattern.compile("[1-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textToValidate);
        boolean matchFound = matcher.find();

        if(!matchFound) {
            textError.setText("Wrong entry Try again");
        }
    }
}