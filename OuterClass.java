class OuterClass{
    int y = 35;
        private class Inner1{
        int y = 40;
    
        void display1(){
        System.out.println(OuterClass.this.y);
        System.out.println(this.y);
        }
        }
        
        public static void main(String args[]){
        // create object of outer class.
        OuterClass o = new OuterClass();
        Inner1 i = o.new Inner1();
        i.display1();
        
        }
    }