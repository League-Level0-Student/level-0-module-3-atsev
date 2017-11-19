import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int x = JOptionPane.showOptionDialog(null, "Are you happy?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Yes", "No"}, null);
		if (x == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
		if (x == 1) {
			int y = JOptionPane.showOptionDialog(null, "Do you want to be happy?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[] {"Yes", "No"}, null);
			if (y == 0) {
				JOptionPane.showMessageDialog(null, "Change something.");
		}
			if (y==1) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
			}
		}
		}
		
		
//yes is 0, no is 1, cancel is 2
	

