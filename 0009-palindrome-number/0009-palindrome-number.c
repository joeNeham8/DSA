bool isPalindrome(int x) {

    long long int rev = 0;
    int temp = x;
    if(temp < 0 || temp == 10){
        return false;
    }
    else{
        while(temp != 0){
        rev = (rev * 10) + (temp % 10);
        temp = temp / 10;
        }
    return(rev == x);
}
}


    
