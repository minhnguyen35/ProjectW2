package com.example.mygridview

data class Books(
        var name: String,
        var price: Int,
        var author: String,
        var img: String
) {
    companion object{
        fun create(): List<Books>{
            val books = mutableListOf<Books>(
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                    "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                Books("Black Jack", 30000, "Osamu Tezuka",
                    "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Little Prince", 70000, "French Author"
                            ,"https://upload.wikimedia.org/wikipedia/en/0/05/Littleprince.JPG"),
                    Books("Doraemon", 30000, "Fujiko",
                            "https://www.google.com/search?q=doraemon&tbm=isch&source=lnms&sa=X&ved=2ahUKEwiT7LvY_JTxAhXT7WEKHSf-DxoQ_AUoAnoECAEQBA&biw=1280&bih=675&dpr=1.5#imgrc=ZFPQ_GXGHrjO0M"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg"),
                    Books("Black Jack", 30000, "Osamu Tezuka",
                            "https://upload.wikimedia.org/wikipedia/vi/5/57/Hinh_bia_Black_Jack_vol_1.jpg")
            )
            return books
        }
    }
}