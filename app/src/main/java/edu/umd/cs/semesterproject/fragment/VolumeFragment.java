package edu.umd.cs.semesterproject.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.umd.cs.semesterproject.R;
import edu.umd.cs.semesterproject.dialog.RuleTypeDialogFragment;

public class VolumeFragment extends Fragment implements View.OnClickListener {

    private static final String TITLE = "Volume";

    private RecyclerView mRuleRecyclerView;
    private FloatingActionButton mFloatingActionButton;

    public VolumeFragment() {}

    public static VolumeFragment newInstance() {

        VolumeFragment actionsFragment = new VolumeFragment();

        return actionsFragment;
    }

    public static String getTitle() {
        return TITLE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.fragment_rule, container, false);

        mRuleRecyclerView = (RecyclerView) view.findViewById(R.id.ruleRecyclerView);
        mRuleRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mFloatingActionButton = (FloatingActionButton) view.findViewById(R.id.fab);
        mFloatingActionButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.fab:
                RuleTypeDialogFragment.newInstance().show(getActivity().getSupportFragmentManager(), "RULE_TYPE_DIALOG");
                break;
        }
    }
}
