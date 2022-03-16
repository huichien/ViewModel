package android.example.viewmodel

import android.example.viewmodel.databinding.ActivityMainBinding
import android.example.viewmodel.models.StudentModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

 //       val myModel=StudentModel() //StudentModel myModel = new StudentModel()
//        val studentID:String
//        val name:String
        val myModel=ViewModelProvider(this).get(StudentModel::class.java)
        binding.myData=myModel

//        myModel.studentID.observe(this, Observer { newValue->
//            binding.tvID.text=newValue
//        })
//
//        myModel.name.observe(this, Observer { newValue->
//            binding.tvName.text=newValue
//        })

        binding.btnSet.setOnClickListener(){
            myModel.studentID.value="W1234"
            myModel.name.value="John"

            binding.invalidateAll()
        }

        binding.btnGet.setOnClickListener(){
            binding.tvID.text=myModel.studentID.value
            binding.tvName.text=myModel.name.value

        }
    }
}