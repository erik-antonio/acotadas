
package colasprioridad;

 class ColasAcotadas <T>{

    private Array prioridades;
    private int numPrioPridades;

    public ColasAcotadas(int numPrioPridades) {
        this.prioridades = new Array<Colas>(numPrioPridades+1);
        for (int i =0;i<=numPrioPridades+1;i++){    
        prioridades.setElemento(i, new Colas<>());
    }
        this.numPrioPridades=numPrioPridades;
    }

  
    public int length(){
        int res=0;
       Colas aux2=new Colas<>();
    for (int i =0;i<numPrioPridades-1;i++){
     aux2= (Colas) prioridades.getElemento(i);
     res=res+aux2.tamaño();
    } 
    return res;
    }
    public boolean is_empty(){
        return length()==0;
    }
    public void enqueue(int prioridad,T elemento){
         Colas aux1=new Colas<>();
        if(prioridad<=numPrioPridades){
                aux1= (Colas) prioridades.getElemento(prioridad);
                aux1.enqueue(elemento);
                
        }else{
            System.out.println("Esa prioridad no esta permitida");
        }
        
    }
    public T dequeue(){
         Colas aux3=new Colas<>();
         int prioridadActual=0;
         while (aux3.is_empty()) {
             if(prioridadActual>numPrioPridades){
              break;
             }
                aux3=(Colas) prioridades.getElemento(prioridadActual);
            if(!aux3.is_empty()){
              //  System.out.println("////***"+aux3);
                 return (T) aux3.dequeue();
            
            }
            prioridadActual++;
        }
         return(T) "";
    }

    @Override
    public String toString() {
        for (int i=0;i<prioridades.getLongitud();i++){
            
            System.out.print(prioridades.getElemento(i)); 
        }
        return "";
    }
   public void  print(){
         for (int i=0;i<prioridades.getLongitud();i++){
            
            System.out.print(prioridades.getElemento(i)); 
        }
    }

}
