package ru.zubrilinartem.shoppinglist.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import ru.zubrilinartem.shoppinglist.activities.MainApp
import ru.zubrilinartem.shoppinglist.activities.NewNoteActivity
import ru.zubrilinartem.shoppinglist.databinding.FragmentNoteBinding
import ru.zubrilinartem.shoppinglist.db.MainViewModel

class NoteFragment : BaseFragment() {

    private lateinit var binding: FragmentNoteBinding
    private val mainViewModel: MainViewModel by activityViewModels{
        MainViewModel.MainViewModelFactory((context?.applicationContext as MainApp).database)
    }

    override fun onClickNew() {
        startActivity(Intent(activity, NewNoteActivity::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = NoteFragment()
    }
}