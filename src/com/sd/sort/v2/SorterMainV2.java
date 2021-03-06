public class SorterMainV2 {
  public static void main(String[] args) {
    String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
    Comparator stringComp=new StringComparator();
    Sorter.sort(B,stringComp);
    
    Integer[] C = {new Ineger(3), new Integer(1),new Integer(4),new Integer(2)};
    Comparator integerComp=new IntegerCOmparator();
    Sorter.sort(C,integerComp);
    
    for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
    for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);
  }
}
class Sorter {
  public Sorter() {}
  public void sort(Object[] data,Comparator comp) {
    for(int i=data.lenght-1;i>=1;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(comp.compare(data[j], data[indexOfMax]) > 0)
          indexOfMax=j;
  }
      Object temp=data[i];
      data[i]=data[indexOfMax];
      data[indexOfMax]=temp;
    }
  }
}




interface Comparator {
  public int compare(Object o1,Object o2);
  public boolean equals(Object o);
}


class integerComparator implements Comparator {
  public int compare(Object o1,Object o2) {
   return (Integer)o1- (Integer)o2;
  }
  public boolean equals(Object o) {}
}


class StringComparator implements Comparator {
  public int compare(Object o1,Object o2); {
   return ((String)o1).compareTo((String)o2);
  }
   public boolean equals(Object o) {}
}