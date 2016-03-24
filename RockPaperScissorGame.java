package rockpaperscissorgame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
public class RockPaperScissorGame 
{
public static void main(String[] args) 
{
    String inputStr;
    String personPlay="";    
    String computerPlay="1,2,3";     
    int computerInt;
   Scanner input = new Scanner(System.in);
    Random generator = new Random();


            inputStr = JOptionPane.showInputDialog("Lets play Rock Paper Scissors! \nEnter 1 for rock \nEnter 2 for paper \nEnter 3 for scissors \nEnter 4 to quit");
            personPlay = input.next(inputStr);

            switch (computerInt = 0)
            {
                }
            do
            {
                if (personPlay.equals(computerPlay))  
                    JOptionPane.showMessageDialog(null, "It's a TIE! ", "TIE!", JOptionPane.INFORMATION_MESSAGE);

                else if (personPlay.equals("1"))
                    {
                    if (computerPlay.equals("3"))
                    JOptionPane.showMessageDialog(null, "Rock beats Scissors. \nYOU WIN! ", "YOU WIN!", JOptionPane.INFORMATION_MESSAGE);
                    else
                    JOptionPane.showMessageDialog(null, "Paper beats Rock. \nYOU LOSE! ", "YOU LOSE!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (personPlay.equals("2"))
                    {
                    if (computerPlay.equals("3"))
                    JOptionPane.showMessageDialog(null, "Scissor beats Paper. \nYOU LOSE!", "YOU LOSE!", JOptionPane.INFORMATION_MESSAGE);
                    else
                    JOptionPane.showMessageDialog(null, "Paper beats Rock. \nYOU WIN! ", "YOU WIN!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (personPlay.equals("3"))
                    {
                     if (computerPlay.equals("1"))
                    JOptionPane.showMessageDialog(null, "Scissor beats Paper. \nYOU WIN!", "YOU WIN!", JOptionPane.INFORMATION_MESSAGE);
                     else
                    JOptionPane.showMessageDialog(null, "Rock beats Scissors. \nYOU LOSE! ", "YOU LOSE!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (personPlay.equals("4"))
                    {
                    JOptionPane.showMessageDialog(null, "GOOD BYE", " BYE!", JOptionPane.INFORMATION_MESSAGE);
                    }
            }while(true);
            }   

}
