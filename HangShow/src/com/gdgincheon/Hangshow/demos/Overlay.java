/*
 * Copyright (C) 2011 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gdgincheon.Hangshow.demos;

import android.os.Bundle;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Window;

public class Overlay extends SherlockActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	 setTheme(R.style.Theme_Sherlock_Light_DarkActionBar); //Used for theme switching in samples
        requestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.overlay);

        //Load partially transparent black background
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.ab_bg_black));

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (String dialog : DIALOGUE) {
                  builder.append(dialog).append("\n\n");
            }
        }

        TextView bunchOfText = (TextView)findViewById(R.id.bunch_of_text);
        bunchOfText.setText(builder.toString());
    }

    public static final String[] DIALOGUE = new String[] {
            "So shaken as we are, so wan with care," +
            "Find we a time for frighted peace to pant," +
            "And breathe short-winded accents of new broils" +
            "To be commenced in strands afar remote." +
            "No more the thirsty entrance of this soil" +
            "Shall daub her lips with her own children's blood;" +
            "Nor more shall trenching war channel her fields," +
            "Nor bruise her flowerets with the armed hoofs" +
            "Of hostile paces: those opposed eyes," +
            "Which, like the meteors of a troubled heaven," +
            "All of one nature, of one substance bred," +
            "Did lately meet in the intestine shock" +
            "And furious close of civil butchery" +
            "Shall now, in mutual well-beseeming ranks," +
            "March all one way and be no more opposed" +
            "Against acquaintance, kindred and allies:" +
            "The edge of war, like an ill-sheathed knife," +
            "No more shall cut his master. Therefore, friends," +
            "As far as to the sepulchre of Christ," +
            "Whose soldier now, under whose blessed cross" +
            "We are impressed and engaged to fight," +
            "Forthwith a power of English shall we levy;" +
            "Whose arms were moulded in their mothers' womb" +
            "To chase these pagans in those holy fields" +
            "Over whose acres walk'd those blessed feet" +
            "Which fourteen hundred years ago were nail'd" +
            "For our advantage on the bitter cross." +
            "But this our purpose now is twelve month old," +
            "And bootless 'tis to tell you we will go:" +
            "Therefore we meet not now. Then let me hear" +
            "Of you, my gentle cousin Westmoreland," +
            "What yesternight our council did decree" +
            "In forwarding this dear expedience.",

    };
}
