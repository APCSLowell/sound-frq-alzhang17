import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    /* to be implemented in part (a) */
    int counter = 0;
    for(int i = 0; i < samples.length; i++){
      if(samples[i] > limit){
        samples[i] = limit;
        counter++;
      }else if(samples[i] < (-1*limit)){
        samples[i] = -1*limit;
        counter++;
      }
    }
    return counter;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
    /* to be implemented in part (b) */
    int i = 1;
    while(samples[i] == 0){
      if(samples[i] == 0){
        samples.remove(i);
        i--;
      }
      i++;
    }
  }
}
