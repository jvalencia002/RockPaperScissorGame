package rockpaperscissorgame;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RockPaperScissorGame 
{
public static void main(String[] args) 
{
    String inputStr;
    String userPlay="";    
    String compPlay="0,1,2";     
   
   Scanner input = new Scanner(System.in);
    Random generator = new Random();
            inputStr = JOptionPane.showInputDialog("Lets play Rock Paper Scissors! \nEnter 0 for rock \nEnter 1 for paper \nEnter 2 for scissors \nEnter 3 to quit");
            userPlay = input.next(inputStr);

            
            {
                }
            do
            {
                if (userPlay.equals(compPlay))  
                    JOptionPane.showMessageDialog(null, "It's a TIE! ", "Tied Game",JOptionPane.INFORMATION_MESSAGE);
                else if (userPlay.equals("0"))
                    {
                    if (compPlay.equals("2"))
                    JOptionPane.showMessageDialog(null, "Rock beats Scissors. \nYOU WIN! ", "User Wins!", JOptionPane.INFORMATION_MESSAGE);
                    else
                    JOptionPane.showMessageDialog(null, "Paper beats Rock. \nYOU LOSE! ", "User Lose!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (userPlay.equals("1"))
                    {
                    if (compPlay.equals("2"))
                    JOptionPane.showMessageDialog(null, "Scissor beats Paper. \nYOU LOSE!", "User Lose!", JOptionPane.INFORMATION_MESSAGE);
                    else
                    JOptionPane.showMessageDialog(null, "Paper beats Rock. \nYOU WIN! ", "User Win!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (userPlay.equals("2"))
                    {
                     if (compPlay.equals("0"))
                    JOptionPane.showMessageDialog(null, "Scissor beats Paper. \nYOU WIN!", "User Win!", JOptionPane.INFORMATION_MESSAGE);
                     else
                    JOptionPane.showMessageDialog(null, "Rock beats Scissors. \nYOU LOSE! ", "User Lose!", JOptionPane.INFORMATION_MESSAGE);
                    }
                else if (userPlay.equals("3"))
                    {
                    JOptionPane.showMessageDialog(null, "See Yah!", " Until Next Time!", JOptionPane.INFORMATION_MESSAGE);
                    }
            }while(true);
            }   

}
