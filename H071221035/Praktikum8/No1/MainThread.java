package No1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
     // Jumlah sumber data yang akan dimuat
    private static final int DATA_SOURCES = 4;
    // Jumlah thread dalam pool yang akan digunakan
    private static final int THREAD_POOLS = 3;
    // Jumlah data yang berhasil dimuat
    private static int successLoadData = 0;
     // Jumlah data yang gagal dimuat
    private static int failedLoadData = 0;
        // Status apakah semua data sudah selesai dimuat atau belum
    private static boolean isFinished = false;

    public static void main(String[] args) {
        // Menampilkan pesan memulai proses memuat data
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));

        // Membuat executor service dengan fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);
         // Melakukan iterasi untuk setiap sumber data
        for (int i = 0; i < DATA_SOURCES; i++) {
            // Menjalankan task pada executor service
            executor.execute(() -> {
                  // Mendapatkan waktu eksekusi acak
                int executionTime = TaskTimeHelper.getRandomNumber();
                // Jika waktu eksekusi melebihi batas timeout
                if (executionTime > 4) {
                    System.out.println("Request Timeout");
                    // Menambah jumlah data yang gagal dimuat
                    incrementFailedLoadData();
                    return;
                } else {
                    try {
                        // Menunggu waktu eksekusi
                        Thread.sleep(executionTime * 1000);
                        // Menambah jumlah data yang berhasil dimuat
                        incrementSuccessLoadData();
                    } catch (InterruptedException e) {
                         // Jika terjadi exception saat sleep
                        incrementFailedLoadData();
                        System.out.println("Request Timeout");
                    }
                }
                // Memeriksa status pemuat data
                checkDataLoadingStatus();
            });
        }

        // Menghentikan executor service
        executor.shutdown();

        // Variabel untuk menghitung waktu pemrosesan
        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                // Jika semua data selesai dimuat
                System.out.println("\nTask Finished.");
                 // Menampilkan waktu eksekusi
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                // Jika semua data berhasil dimuat
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                // Jika terdapat data yang gagal dimuat    
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load", successLoadData, failedLoadData));
                    break;
                }
            } else {
                // Menampilkan pesan loading
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    // Menunggu selama 1 detik
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    // Metode untuk menambah jumlah data yang berhasil dimuat
    public static synchronized void incrementSuccessLoadData() {
        successLoadData++;
    }
    // Metode untuk menambah jumlah data yang gagal dimuat
    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }
    
// Metode untuk memeriksa status pemuatan data
    public static synchronized void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
  
    }
}
