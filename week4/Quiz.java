package week4;

public class Quiz {
    private String[] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "Apa Burung dari Papua?",
        "Tanggal kemerdekaan Indonesia?",
        "Ada berapa benua di dunia?",
        "Hewan yang termasuk omnivora?",
        "Berapa provinsi di Indonesia?",
        "Pulau paling besar di Indonesia?",
        "Siapa Bapak pendidikan Indonesia?"
    };
    
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Harimau", "2. Semute", "3. Gajah", "4. Kucing"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"},
        {"1. Kakaktua", "2. Gereja", "3. Cendrawasih", "4. Lovebird"},
        {"1. 17", "2. 23", "3. 01", "4. 14"},
        {"1. 2", "2. 4", "3. 5", "4. 7"},
        {"1. Paus", "2. Singa", "3. Babi", "4. Kucing"},
        {"1. 34", "2. 38", "3. 37", "4. 36"},
        {"1. Kalimantan", "2. Jawa", "3. Sumatra", "4. Papua"},
        {"1. Ki Hajar Dewantara", "2. Ir. Soekarno", "3. Sayuti Melik", "4. B.J Habibie"},
    };
    
    private int[] correctAnswers = {1, 2, 3, 3, 1, 4, 3, 2, 4, 1}; // Jawaban benar berdasarkan indeks
    private int score = 0;
    
    // Method untuk mendapatkan jumlah pertanyaan
    public int getQuestionCount() {
        return questions.length;
    }
    
    // Method untuk menampilkan pertanyaan dan opsi
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    // Method untuk memeriksa jawaban
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}