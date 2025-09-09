package meedku;

import dataStructures.ArrayLinearList;

public class MyArrayLinearList extends ArrayLinearList {
   public int min() {
	   int m = Get(0);
	   for(int i = 1; i < size; i++) {
		   if(Get(i) < m) {
			   m = Get(i);
		   }
	   }
	   return m;
   }
   public int max() {
	   int m = Get (0);
	   for (int i = 1; i < size; i++)
		   if (Get(i) > m) {
			   m = Get(i);
		   }
	   return m;
   }
   public int sum() {
	   int s = 0;
	   for (int i = 0; i < size; i++)
	   {
		  s=s+ Get(i);
	   }
	   return s;
   }
   public float avarage() {
	  return sum ()/(float)size;
   }
   public void removeOdd() {
	   for (int i = 0; i < size; i++ )
		   if (Get(i)%2!=0) {
			   remove(i);
	   			i--;
		   } 
   }
   public void sort() {
	   MyArrayLinearList list = new MyArrayLinearList();
	   for (int i = 0; i < size; i++) {
		   int j;
		   for (j = 0; j < list.size; j++) {
			   if (Get(i) < list.Get(j)) {
				   break;
			   }
		   }
		   list.add(j, Get(i));
	   }
	   element = list.element;
   }
   public int Get(int index) {
	   return (int)element[index];
   }
   public void Push(int num) {
	   add(size, num);
   }
}