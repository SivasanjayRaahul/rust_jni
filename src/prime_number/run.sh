cd ../..
export LD_LIBRARY_PATH="$(pwd)/target/release/"
cd src/prime_number
javac -h . PrimeNumber.java
javac PrimeNumber.java 
cd ..
java  -Djava.library.path=$LD_LIBRARY_PATH prime_number.PrimeNumber