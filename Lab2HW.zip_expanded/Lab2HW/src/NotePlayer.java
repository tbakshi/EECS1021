/*
 * This exercise involves reading 2 analog inputs, and setting frequency and volume 
 * according to those inputs. The values for thumbMin, thumbMax, etc., have to be
 * determined experimentally, and will differ slightly for each glove.
 * 
 * The max values are when the two fingers are straight (not flexed), and the min 
 * values occur when the fingers are completely flexed. The unmodified file should 
 * print the analog values to the console. 
 * 
 * The students may have a hard time determining the linear interpolation in the 
 * analogInputchanged method. In order for them to finish in a timely matter, the TA's should
 * explain this part in detail, with a diagram.
 * 
 */


import c4e.media.ToneEmitter;
import c4e.phidget.Event;
import c4e.phidget.HardwareInterface;

public class NotePlayer extends HardwareInterface {

	private NotePlayerCalibrator calibratorFrame;
	private ToneEmitter emitter;
	
	protected int thumbMin;
	protected int thumbMax;
	protected int indexMin;
	protected int indexMax;
	private double frequency;
	private double volume;


	public NotePlayer(boolean debug) {
		super(debug);
		this.emitter = new ToneEmitter();
		// determined by calibration
		// values will vary from group to group
		this.thumbMin = 300;
		this.thumbMax = 400;
		this.indexMin = 300;
		this.indexMax = 400;

		this.frequency = ToneEmitter.NOTE_C;
		this.volume = 0.10;
		
		this.emitter.setVolume(volume);
		this.emitter.setFrequency(frequency);
		
		// toggle calibrator with setVisible()
		this.calibratorFrame = new NotePlayerCalibrator(this);
		calibratorFrame.getFrame().setVisible(true);
	}

	@Override
	public void analogInputChanged(Event ae) {
		// if the index is detected (ID==1), then change volume
		if (ae.getId() == 1) {
			double value = (ae.getValue() - this.thumbMin) / (this.thumbMax - this.thumbMin);
			// bounds ae.getValue to [0,1] to avoid exceptions in the ToneEmitter API
			//volume = Math.max(Math.min(value, 1), 0); // LINE 6
			volume = value; 
			if(value < 0) { 
		 		volume = 0; 
		 		} 
		 		else if(value>1) {
		 		volume = 1; 
		 		} 

			
			
			
			
		}
		// if the index is detected (ID==2), then change frequency
		else if (ae.getId() == 2) {
			// maps ae.getValue() to [0,1]
			// used to chain if-else-if intervals between NOTE_C and 2*NOTE_C
			// using every other note in the octave to make attempting to playing the song easier
			double value = (ae.getValue() - this.indexMin) / (this.indexMax - this.indexMin);
			double note = Math.max(Math.min(value, 1), 0);
			if (note < 1 / 6.0) {
				frequency = ToneEmitter.NOTE_C;
			} else if (note < (2 / 6.0)) {
				frequency = ToneEmitter.NOTE_C + ToneEmitter.NOTE_C * 1 / 6;
			} else if (note < (3 / 6.0)) {
				frequency = ToneEmitter.NOTE_C + ToneEmitter.NOTE_C * 2 / 6;
			} else if (note < (4 / 6.0)) {
				frequency = ToneEmitter.NOTE_C + ToneEmitter.NOTE_C * 3 / 6;
			} else if (note < (5 / 6.0)) {
				frequency = ToneEmitter.NOTE_C + ToneEmitter.NOTE_C * 4 / 6;
			} else {
				frequency = ToneEmitter.NOTE_C + ToneEmitter.NOTE_C * 5 / 6;
			}
		}

//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//End of student code				
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
		
		System.out.printf("Frequency/Amplitude: %.2f %.2f\n", frequency, volume);
		this.emitter.setVolume(volume);
		this.emitter.setFrequency(frequency);
		
		if (ae.getId() == 1) {
			this.calibratorFrame.getThumb(ae.getValue());
		}
		else if (ae.getId() == 2) {
			this.calibratorFrame.getFinger(ae.getValue());
		}
	}
}