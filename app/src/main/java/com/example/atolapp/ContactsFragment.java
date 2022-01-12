package com.example.atolapp;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atolapp.databinding.ContactsFragmentBinding;

public class ContactsFragment extends Fragment {

    private ContactsViewModel mViewModel;
    private ContactsFragmentBinding binding;
    private ContactsAdapter adapter;

    public static ContactsFragment newInstance() {
        return new ContactsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = ContactsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ContactsViewModel.class);
        Contact contacts[] = {new Contact("Aurora", "0000000000", "1 She prefers coco and mandarina atole"),
                                new Contact("Pablo", "0000000000", "2 He prefers cacao atole"),
                                new Contact("Ana", "0000000000", "3 She prefers white atole"),
                                new Contact("Juan", "0000000000", "4 He prefers cacao atole"),
                                new Contact("Jose", "0000000000", "5 He prefers cacao atole"),
                                new Contact("Beto", "0000000000", "6 She prefers white atole"),
                                new Contact("Lalo", "0000000000", "7 He prefers cacao atole")};
        adapter = new ContactsAdapter(contacts);
        binding.rvContacts.setAdapter(adapter);
        binding.rvContacts.setLayoutManager(new LinearLayoutManager((getActivity())));
    }

}