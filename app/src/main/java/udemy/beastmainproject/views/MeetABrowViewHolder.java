package udemy.beastmainproject.views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import udemy.beastmainproject.R2;
import udemy.beastmainproject.entities.Brother;

/**
 * Created by augustocbx on 22/05/17.
 */

public class MeetABrowViewHolder extends RecyclerView.ViewHolder {

    @BindView(R2.id.list_meet_a_bro_ImageView)
    ImageView brotherPic;

    @BindView(R2.id.list_meet_a_bro_progressBar)
    ProgressBar brotherProgressBar;

    public MeetABrowViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void populate(Context context, Brother brother){
        Picasso.with(context)
                .load(brother.getBrotherPicture())
                .fit()
                .centerCrop()
                .into(brotherPic, new Callback() {
                    @Override
                    public void onSuccess() {
                        brotherProgressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {

                    }
                });
    }
}
