package com.example.atolapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atolapp.databinding.ContactItemBinding;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    private Contact contacts[];
    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ContactItemBinding binding;
        public ContactsViewHolder(ContactItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void newData(int position){
            binding.name.setText(contacts[position].getName());
            binding.number.setText("Numero: "+ contacts[position].getNumber());
            binding.description.setText(contacts[position].getDescription());
        }
    }

    public ContactsAdapter(Contact[] contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContactItemBinding binding = ContactItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ContactsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        holder.newData(position);
    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }


}
