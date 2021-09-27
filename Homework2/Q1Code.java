calcInheritance(int n, int x){ //we have n children, x are illegitimate

int numOfI = x; //illegitimate children 
int numOfL = n-x; //legitimate children 
double Ix = 0.0; //amount each gets 
double Lx = 0.0;

//calc what it would be, divided equally
double ifEqual = (double)1/n;

if( n == x){
 Ix = (ifEqual)/3; 
 Lx = 0;
}

Ix =  ifEqual/3; //how much each illegit gets

//now calc legit
Lx = (1 - (Ix * numOfI))/numOfL; // we do total - (num each gets * each person) divided by number of legit people that gets some


}
