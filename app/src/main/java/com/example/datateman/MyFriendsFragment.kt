package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(MyFriend("Denisa Mei Linda Sari", "Perempuan", "denisalinda16@gmail.com", "085888043162", "Blitar"))
        listTeman.add(MyFriend("Nanda Setyo Hermawan", "Laki-laki", "nandasetyo@gmail.com", "082257194910", "Malang"))
        listTeman.add(MyFriend("Ahmad Faisal", "Laki-laki", "ahmadfaisal@gmail.com", "085336334687", "Madura"))
        listTeman.add(MyFriend("Indah Kurniani", "Perempuan", "indah@gmail.com", "082232829301", "Malang"))
        listTeman.add(MyFriend("Faisol Lutfi", "Laki-laki", "faisol@gmail.com", "087751957523", "Kediri"))
        listTeman.add(MyFriend("Feri Efendi", "Laki-laki", "feri@gmail.com", "083857906912", "Madura"))
        listTeman.add(MyFriend("Syamsul Arifin", "Laki-laki", "syamsul@gmail.com", "081914722463", "Madura"))
        listTeman.add(MyFriend("Ahmat Baihaqi", "Laki-laki", "baihaqi@gmail.com", "082335140765", "Madura"))
    }

    private  fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iniView()
    }

    private fun iniView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}