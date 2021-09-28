class Match {
    Fighter F1;
    Fighter F2;
    int minWeight;
    int maxWeight;

    Match(Fighter F1, Fighter F2, int minWeight, int maxWeight) {
        this.F1 = F1;
        this.F2 = F2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void runMatch(){
        if(isCheck()){
            while(this.F1.health>0 && this.F2.health>0){
                this.F2.health = this.F1.hit(this.F2);
                if(isWin()){
                    break;
                }
                //System.out.println(this.F2.health);
                this.F1.health = this.F2.hit(this.F1);
                if(isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Sporcular yarışamaz, çünkü sikletleri aynı değil.");
        }
    }
    boolean isCheck(){
        return((this.F1.weight>=minWeight && this.F1.weight<=maxWeight) && (this.F2.weight>=minWeight && this.F2.weight<=maxWeight));
    }
    boolean isWin(){
        if(this.F1.health == 0){
            System.out.println(this.F2.name+"kazandı");
            return true;
        }
        if(this.F2.health == 0){
            System.out.println(this.F1.name+" kazandı");
            return true;
        }
        return false;
    }
}
