cd ../..
export LD_LIBRARY_PATH="$(pwd)/target/release/"
cd src/multiply
javac -h . Main.java
javac Main.java
cd ..
java  -Djava.library.path=$LD_LIBRARY_PATH multiply.Main