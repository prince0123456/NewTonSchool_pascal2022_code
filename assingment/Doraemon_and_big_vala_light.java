static boolean EqualOrNot(int h1, int h2, int v1,int v2){
// if(v2 >= v1){
//   return false;
// }
while(h1 >= h2){
  if(h1 == h2){
    return true;
  }
  h1 = h1+v1;
  h2 = h2+v2;
}
return false;
}