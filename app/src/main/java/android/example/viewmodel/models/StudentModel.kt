package android.example.viewmodel.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentModel : ViewModel() {

    var studentID = MutableLiveData<String>()
    var name= MutableLiveData<String>()
}