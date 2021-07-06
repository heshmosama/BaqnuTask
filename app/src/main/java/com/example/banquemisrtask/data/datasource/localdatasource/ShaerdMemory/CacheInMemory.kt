package com.example.banquemisrtask.data.datasource.localdatasource.ShaerdMemory

class CacheInMemory {

    companion object Singleton {

        private val hashMap: HashMap<String, Any> = hashMapOf()

        fun addData(key:String,value:Any) : HashMap<String, Any>{
            hashMap.put(key,value)
            return hashMap
        }

        fun getData(key: String) : Any?{
            return hashMap.get(key)
        }

        fun clearData() {
            hashMap.clear()
        }


    }

}