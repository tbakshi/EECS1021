

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.beans.binding.SetBinding;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotePlayerCalibrator {

	private NotePlayer notePlayer;
	
	private JFrame frame;
	protected final Box verticalBox = Box.createVerticalBox();
	protected final JProgressBar progressBarThumb = new JProgressBar();
	protected final JProgressBar progressBarFinger = new JProgressBar();
	protected final JPanel panel = new JPanel();
	protected final JPanel panel_1 = new JPanel();
	protected final JPanel panel_2 = new JPanel();
	protected final JLabel lblCalibrator = new JLabel("Glove Calibrator");
	protected final JPanel panel_3 = new JPanel();
	protected final Box horizontalBox = Box.createHorizontalBox();
	protected final Box horizontalBox_1 = Box.createHorizontalBox();
	protected final JLabel lblThumb = new JLabel("Thumb Value: ");
	protected final JLabel lblThumbNumber = new JLabel("350");
	protected final JLabel lblIndexNumber = new JLabel("350");
	protected final Box verticalBox_1 = Box.createVerticalBox();
	protected final Box verticalBox_2 = Box.createVerticalBox();
	protected final JLabel lblNewLabel = new JLabel("Index Value: ");
	protected final Box horizontalBox_2 = Box.createHorizontalBox();
	protected final Box horizontalBox_3 = Box.createHorizontalBox();
	protected final JLabel lblIndexMin = new JLabel("indexMin");
	protected final JLabel lblIndexMax = new JLabel("indexMax");
	protected final JLabel lblThumbMin = new JLabel("thumbMin");
	protected final JLabel lblThumbMax = new JLabel("thumbMax");
	protected final Box horizontalBox_4 = Box.createHorizontalBox();
	protected final JButton btnThumbMax = new JButton("set thumbMax");
	protected final JButton btnThumbMin = new JButton("set thumbMin");
	protected final Box horizontalBox_5 = Box.createHorizontalBox();
	protected final JButton btnIndexMin = new JButton("set indexMin");
	protected final JButton btnIndexMax = new JButton("set indexMax");
	protected final Component horizontalGlue = Box.createHorizontalGlue();
	protected final Component horizontalGlue_1 = Box.createHorizontalGlue();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePlayerCalibrator window = new NotePlayerCalibrator(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param notePlayer 
	 */
	public NotePlayerCalibrator(NotePlayer notePlayer) {
		initialize(notePlayer);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param notePlayer 
	 */
	private void initialize(NotePlayer notePlayer) {
		this.notePlayer = notePlayer;
		
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel.add(panel_2, BorderLayout.NORTH);
		
		panel_2.add(lblCalibrator);
		
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		panel_1.add(verticalBox);
		verticalBox.add(verticalBox_2);
		
		verticalBox_2.add(horizontalBox_2);
		horizontalBox_2.add(lblThumb);
		horizontalBox_2.add(lblThumbNumber);
		verticalBox_2.add(horizontalBox);
		
		horizontalBox.add(lblThumbMin);
		horizontalBox.add(progressBarThumb);
		
		horizontalBox.add(lblThumbMax);
		btnThumbMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setThumbMin(notePlayer);
			}
		});
		verticalBox.add(horizontalBox_4);
		horizontalBox_4.add(btnThumbMin);
		
		horizontalBox_4.add(horizontalGlue);
		btnThumbMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setThumbMax(notePlayer);
			}
		});
		
		horizontalBox_4.add(btnThumbMax);
		
		verticalBox.add(verticalBox_1);
		verticalBox_1.add(horizontalBox_3);
		horizontalBox_3.add(lblNewLabel);
		horizontalBox_3.add(lblIndexNumber);
		verticalBox_1.add(horizontalBox_1);
		
		horizontalBox_1.add(lblIndexMin);
		horizontalBox_1.add(progressBarFinger);
		
		horizontalBox_1.add(lblIndexMax);
		
		verticalBox_1.add(horizontalBox_5);
		btnIndexMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setIndexMin(notePlayer);
			}
		});
		
		horizontalBox_5.add(btnIndexMin);
		
		horizontalBox_5.add(horizontalGlue_1);
		btnIndexMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setIndexMax(notePlayer);
			}
		});
		
		horizontalBox_5.add(btnIndexMax);
		
		panel.add(panel_3, BorderLayout.SOUTH);

		lblThumbMin.setText(Integer.toString(notePlayer.thumbMin));
		lblThumbMax.setText(Integer.toString(notePlayer.thumbMax));
		lblIndexMin.setText(Integer.toString(notePlayer.indexMin));
		lblIndexMax.setText(Integer.toString(notePlayer.indexMax));

	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public void getThumb(double n) {
		this.lblThumbNumber.setText(Integer.toString((int) n));
		double value = (n - Double.parseDouble(lblThumbMin.getText())) / (Double.parseDouble(lblThumbMax.getText()) - Double.parseDouble(lblThumbMin.getText()));
		value = Math.max(Math.min(value, 1), 0);
		value *= 100;
		this.progressBarThumb.setValue((int) value);
		
	}
	
	public void getFinger(double n) {
		this.lblIndexNumber.setText(Integer.toString((int) n));
		double value = (n - Double.parseDouble(lblIndexMin.getText())) / (Double.parseDouble(lblIndexMax.getText()) - Double.parseDouble(lblIndexMin.getText()));
		value = Math.max(Math.min(value, 1), 0);
		value *= 100;
		this.progressBarFinger.setValue((int) value);
	}
	
	public void setThumbMax(NotePlayer notePlayer) {
		lblThumbMax.setText(lblThumbNumber.getText());
		notePlayer.thumbMax = (Integer.parseInt(lblThumbNumber.getText()));
	}	
	public void setThumbMin(NotePlayer notePlayer) {
		lblThumbMin.setText(lblThumbNumber.getText());
		notePlayer.thumbMin = (Integer.parseInt(lblThumbNumber.getText()));
	}
	public void setIndexMax(NotePlayer notePlayer) {
		lblIndexMax.setText(lblIndexNumber.getText());
		notePlayer.indexMax = (Integer.parseInt(lblIndexNumber.getText()));
	}
	public void setIndexMin(NotePlayer notePlayer) {
		lblIndexMin.setText(lblIndexNumber.getText());
		notePlayer.indexMin = (Integer.parseInt(lblIndexNumber.getText()));
	}	
	
	
}
