use jni::JNIEnv;
use jni::objects::JClass;
pub type Jint = u32;
pub type JBool = bool;


fn is_prime<'a>(
    number :Jint
) -> JBool {
    if number < 2 {
        return false;
    }
    for divisor in 2..(number) {
        if number % divisor == 0 {
            return false;
        }
    }
    return true;
}

#[no_mangle]
pub extern "system" fn Java_prime_1number_PrimeNumber_getCount<'local>(mut env: JNIEnv<'local>,
                                                     class: JClass<'local>,
                                                     range: Jint)
                                                    -> Jint {
    let mut prime_number_count: Jint = 0;
    for number in 1..=range {
        if is_prime(number) {
            prime_number_count += 1;
        }
    }
    return prime_number_count;
}