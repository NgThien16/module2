package ss2_array.exercise;

public class PrimeLessThan100 {


        public static void main(String[] args) {
            System.out.println("Các số nguyên tố nhỏ hơn 100 là:");

            for (int number = 2; number < 100; number++) {
                boolean isPrime = true;

                // Kiểm tra từ 2 đến căn bậc hai của number
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false; // Không phải số nguyên tố
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(number + " ");
                }
            }
        }
    }


