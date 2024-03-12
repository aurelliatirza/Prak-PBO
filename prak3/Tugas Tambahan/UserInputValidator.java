//Nama: Tirza Aurellia Wijaya
//NIM: 24060122130047
public class UserInputValidator {
    public static void validateUsername(String username) {
        //TODO: buat assertion yang memenuhi persyaratan username
        assert username.length() >= 5 && username.length() <= 20 : "Panjang username harus antara 5 dan 20 karakter";
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Username harus diawali dengan huruf dan hanya boleh berisi huruf, angka, dan underscore";
    }
  
    public static void validateEmail(String email) {
        //TODO: buat assertion yang memenuhi persyaratan email
        assert email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}") : "Format email tidak valid";
    }
  
    public static void validateAge(int age) {
        //TODO: buat assertion yang memenuhi persyaratan usia
        assert age >= 17 && age <= 99 : "Usia harus di antara 17 dan 99 tahun";
    }
  }
  