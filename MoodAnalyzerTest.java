package com.BridgeLabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest  {

	@Test
	 public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Im in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
	 @Test
	    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
	        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Im in Happy Mood");
	        String mood = moodAnalyzer.analyseMood();
	        Assert.assertEquals("HAPPY",mood);
	    }
}
