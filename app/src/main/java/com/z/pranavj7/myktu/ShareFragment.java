package com.z.pranavj7.myktu;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import butterknife.ButterKnife;

/**
 * Created by pinkzz on 3/19/2017.
 */
public final class ShareFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_share, container, false);

        ButterKnife.bind(this, rootView);
        ImageButton myButton = (ImageButton) rootView.findViewById(R.id.helloo1);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                // Add data to the intent, the receiving app will decide
                // what to do with it.
                share.putExtra(Intent.EXTRA_TEXT, "\t\t\t\t"+ "Download My KTU from playstore" + "\n\n"
                        +"♦ Get easy access to syllabus" +  "\n"
                        +"♦ Stay updated with latest Announcements from KTU" + "\n"
                        +"♦ Get push notification alerts" + "\n"
                        +"♦ Get easy access to previous year question papers and model questions papers.More study materials available soon." +"\n"
                        +"♦ Current supported devices - Android 4.4 and up."+ "\n\n"
                        +"NOTE:lower device support coming soon stay tuned!"+"\n\n" + "http://play.google.com/store/apps/details?id=com.z.pranavj7.myktu");
 //               share.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?id=com.z.pranavj7.myktu");
                startActivity(Intent.createChooser(share, "Share link!"));
            }
        });
        return rootView;
    }
}



